# App security based in the OWASP Top 10 2021
Based on the characteristics of the applications of the solar panel startup, the critical security points to be taken into account will be presented, as the idea is that these points are based on the OWASP Top 10 2021, a compilation of critical points will be made for each point of the OWASP to cover all aspects.

Getting started with Kubernetes and AWS it is essential to consider a series of measures for the app security. With AWS Identity and Access Management (IAM) we can manage permissions granularly and restrict access to only necessary accounts and roles. Likewise, access control must be established in Kubernetes, using roles and role bindings to limit access to specific resources and specific actions. The implementation of Virtual Private Cloud will allow resources to be isolated and segmented, while the use of security groups controls network traffic in and out of the Kubernetes cluster. Strong configuration management will ensure that the Kubernetes cluster configuration is well controlled and documented.

##  A01:2021 – Broken Access Control
As there are three well-differentiated positions (in addition to users) within the startup (software engineers, customer service agents and sales employees), it is necessary to ensure that each role has well-defined privileges to which it has access. both in the web app and in the mobile app.

Use secure authentication mechanisms, such as JWT tokens, to authenticate users and verify their roles and permissions and override them on logout.

### Points to take into account in the Backend
It is necessary to add access controls for the POST, PUT and DELETE methods mainly and establish limits on the rate of access allowed in order to mitigate the effects of a possible automated attack. Of course Implement access controls in the Python backend implemented in FastAPI verify that API routes are only accessible to the appropriate user roles.

##  A02:2021 – Cryptographic Failures
It is essential to follow security practices in design to minimize accidental exposure of sensitive data. Use encryption at rest and in transit to protect data stored in the MySQL database and data transmitted between infrastructure components.

Store customer data securely using secure hashing techniques, such as bcrypt, and do not store it in clear text in the database also implement strong password policies to ensure passwords are strong and difficult to guess.

## A03:2021 – Injection
Implement strict validation and input filtering in all layers of your application, especially in the web interface and backend, and perform additional validation on the server side to ensure that the data received is secure in order to avoid SQL injection.

## A04:2021 – Insecure Design
Establish a secure development cycle in collaboration with application security professionals, use a catalog of secure design patterns, employ threat modeling for critical flows, integrate security controls into user stories, perform feasibility checks on all layers (backend and frontend), write unit and integration tests to validate threat resistance, separate layers and tenants robustly, and limit resource consumption per user or service. These practices will ensure that the application and customer data are protected from security vulnerabilities and threats.

## A05:2021 – Security Misconfiguration
At this point it is necessary to implement an automatable security process in all development steps and keep all components, operating systems, libraries and frameworks updated with the latest security patches and updates to avoid known vulnerabilities. It is also important to eliminate all unnecessary or unused components to avoid information breaches or obtaining unwanted privileges.

## A06:2021 – Vulnerable and Outdated Components
This point is strongly related to the previous one. For this reason I only add the need to carry out a continuous inventory of component versions and dependencies.

## A07:2021 – Identification and Authentication Failures
Some points related to this section have already been mentioned in the previous ones, apart from those already mentioned, it is important to implement a two-factor system through FastAPI and also make sure not to include session identifiers within the URL.

## A08:2021 – Software and Data Integrity Failures
Include within the security and devops (CI/CD) processes the verification of downloading updates from the different dependencies through access controls, digital signatures within the software and configurations that ensure the integrity of the incoming code.

## A09:2021 – Security Logging and Monitoring Failures
Save data on failed login attempts and validation entries to identify suspicious accounts.

## A10:2021 – Server-Side Request Forgery (SSRF)
Disable HTTP redirects to prevent an attacker from causing the application to send a false request to an unexpected destination

_The exercise was developed based on what was researched, carrying out this activity was really challenging and beneficial. I tried my best!_