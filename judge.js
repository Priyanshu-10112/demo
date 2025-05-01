// DOM Elements
const caseList = document.querySelector('.case-list');
const caseDetailsView = document.querySelector('.case-details-view');
const statusFilter = document.getElementById('status-filter');
const dateFilter = document.getElementById('date-filter');
const logoutBtn = document.getElementById('logout-btn');

// Mock data for judge's cases
const judgeCases = [
  {
    id: 'CASE123',
    title: 'Property Dispute - Sharma vs. Gupta',
    status: 'pending',
    nextHearing: '2023-12-15',
    parties: 'Rajesh Sharma vs. Amit Gupta',
    notes: 'Waiting for property documents'
  },
  {
    id: 'CASE456',
    title: 'Contract Breach - ABC Corp vs. XYZ Ltd',
    status: 'hearing',
    nextHearing: '2023-12-05',
    parties: 'ABC Corporation vs. XYZ Limited',
    notes: 'Defendant requested extension'
  },
  {
    id: 'CASE789',
    title: 'Divorce Case - Mehta',
    status: 'completed',
    nextHearing: '',
    parties: 'Priya Mehta vs. Rohan Mehta',
    notes: 'Case settled out of court'
  }
];

// Initialize the judge portal
document.addEventListener('DOMContentLoaded', () => {
  renderCaseList(judgeCases);
  
  // Event listeners
  statusFilter.addEventListener('change', filterCases);
  dateFilter.addEventListener('change', filterCases);
  logoutBtn.addEventListener('click', () => {
    window.location.href = 'index.html';
  });
});

function renderCaseList(cases) {
  caseList.innerHTML = '';
  
  cases.forEach(caseItem => {
    const caseElement = document.createElement('div');
    caseElement.className = 'case-item';
    caseElement.innerHTML = `
      <h4>${caseItem.title}</h4>
      <p><strong>Status:</strong> ${formatStatus(caseItem.status)}</p>
      ${caseItem.nextHearing ? `<p><strong>Next Hearing:</strong> ${caseItem.nextHearing}</p>` : ''}
      <button class="btn view-details-btn" data-caseid="${caseItem.id}">View Details</button>
    `;
    caseList.appendChild(caseElement);
  });
  
  // Add event listeners to all view buttons
  document.querySelectorAll('.view-details-btn').forEach(btn => {
    btn.addEventListener('click', (e) => {
      const caseId = e.target.getAttribute('data-caseid');
      showCaseDetails(caseId);
    });
  });
}

function showCaseDetails(caseId) {
  const caseItem = judgeCases.find(c => c.id === caseId);
  if (!caseItem) return;
  
  document.getElementById('detail-case-title').textContent = caseItem.title;
  document.getElementById('detail-case-number').textContent = caseItem.id;
  document.getElementById('detail-status').textContent = formatStatus(caseItem.status);
  document.getElementById('detail-next-hearing').textContent = caseItem.nextHearing || 'Not scheduled';
  document.getElementById('detail-parties').textContent = caseItem.parties;
  
  caseList.classList.add('hidden');
  caseDetailsView.classList.remove('hidden');
  
  // Set up update case button
  const updateBtn = document.getElementById('update-case-btn');
  updateBtn.onclick = () => updateCase(caseId);
}

function updateCase(caseId) {
  const caseItem = judgeCases.find(c => c.id === caseId);
  if (!caseItem) return;
  
  const newStatus = document.getElementById('update-status').value;
  const newDate = document.getElementById('hearing-date').value;
  const notes = document.getElementById('case-notes').value;
  
  // Update the case (in real app, this would be an API call)
  caseItem.status = newStatus;
  if (newDate) caseItem.nextHearing = newDate;
  if (notes) caseItem.notes = notes;
  
  alert('Case updated successfully!');
  caseDetailsView.classList.add('hidden');
  caseList.classList.remove('hidden');
  renderCaseList(judgeCases);
}

function filterCases() {
  const status = statusFilter.value;
  const date = dateFilter.value;
  
  let filteredCases = judgeCases;
  
  if (status !== 'all') {
    filteredCases = filteredCases.filter(c => c.status === status);
  }
  
  if (date) {
    filteredCases = filteredCases.filter(c => c.nextHearing === date);
  }
  
  renderCaseList(filteredCases);
}

function formatStatus(status) {
  const statusMap = {
    pending: 'Pending',
    hearing: 'Hearing Scheduled',
    adjourned: 'Adjourned',
    completed: 'Completed'
  };
  return statusMap[status] || status;
}