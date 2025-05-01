// DOM Elements
const caseNumberInput = document.getElementById('case-number');
const searchBtn = document.getElementById('search-btn');
const caseResult = document.getElementById('case-result');
const caseStatus = document.getElementById('case-status');
const nextHearing = document.getElementById('next-hearing');
const lastUpdated = document.getElementById('last-updated');
const smsCheckbox = document.getElementById('sms-checkbox');
const phoneNumber = document.getElementById('phone-number');
const subscribeBtn = document.getElementById('subscribe-btn');

// Mock data - Replace with actual API calls in real implementation
const mockCaseData = {
  'CASE123': {
    status: 'Under Review',
    nextHearing: '2023-12-15',
    lastUpdated: '2023-11-20',
    title: 'Property Dispute - Sharma vs. Gupta'
  },
  'CASE456': {
    status: 'Hearing Scheduled',
    nextHearing: '2023-12-05',
    lastUpdated: '2023-11-18',
    title: 'Contract Breach - ABC Corp vs. XYZ Ltd'
  }
};

// Event Listeners
searchBtn.addEventListener('click', searchCase);
smsCheckbox.addEventListener('change', toggleSmsInput);
subscribeBtn.addEventListener('click', subscribeToSms);

// Functions
function searchCase() {
  const caseNumber = caseNumberInput.value.trim();
  
  if (!caseNumber) {
    alert('Please enter a case number');
    return;
  }
  
  // In real implementation, this would be an API call
  // fetch(`/api/cases/${caseNumber}`)
  //   .then(response => response.json())
  //   .then(data => displayCase(data));
  
  // Mock implementation for hackathon
  if (mockCaseData[caseNumber]) {
    displayCase(mockCaseData[caseNumber]);
  } else {
    alert('Case not found. Please check the case number and try again.');
  }
}

function displayCase(caseData) {
  caseStatus.textContent = caseData.status;
  nextHearing.textContent = caseData.nextHearing;
  lastUpdated.textContent = caseData.lastUpdated;
  caseResult.classList.remove('hidden');
}

function toggleSmsInput() {
  if (smsCheckbox.checked) {
    phoneNumber.classList.remove('hidden');
    subscribeBtn.classList.remove('hidden');
  } else {
    phoneNumber.classList.add('hidden');
    subscribeBtn.classList.add('hidden');
  }
}

function subscribeToSms() {
  const phone = phoneNumber.value.trim();
  
  if (!phone || phone.length !== 10) {
    alert('Please enter a valid 10-digit mobile number');
    return;
  }
  
  // In real implementation, this would call your backend SMS service
  // fetch('/api/sms/subscribe', {
  //   method: 'POST',
  //   headers: { 'Content-Type': 'application/json' },
  //   body: JSON.stringify({ caseNumber: caseNumberInput.value, phone })
  // });
  
  // Mock implementation for hackathon
  alert(`SMS notifications activated for case ${caseNumberInput.value}. You will receive updates at ${phone}`);
  phoneNumber.value = '';
  smsCheckbox.checked = false;
  toggleSmsInput();
}

// Utility function to simulate API calls (for demo purposes)
function simulateApiCall(url, data) {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve({ success: true, data });
    }, 500);
  });
}