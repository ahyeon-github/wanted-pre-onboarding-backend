# wanted-pre-onboarding-backend
## 서비스 개요

- 본 서비스는 기업의 채용을 위한 웹 서비스 입니다.
- 회사는 채용공고를 생성하고, 이에 사용자는 지원합니다.

## Accessing the database
The state of the database can be checked as follows:

   * run the django backend as specified above
   
   * navigate to `jdbc:mysql://localhost:3306/wanted`
   
   * login with the following credentials (will be updated for the future)
   
     ```
         username: wanted_admin
         password: admin_1234
     ```
        

## API endpoints
The API endpoints for the backend are as follows.

### 채용공고 등록 API
   * `/api/recruitments`
      - method: POST

   ```json
   request json
      {
  "id": 0,
  "companyId": 0,
  "position": "string",
  "reward": 0,
  "description": "string",
  "skills": "string"
}

   response json
   {
  "id": 6,
  "companyId": 0,
  "position": "string",
  "reward": 0,
  "description": "string",
  "skills": "string"
}
   ``` 
<img width="1512" alt="스크린샷 2024-08-14 오전 12 05 40" src="https://github.com/user-attachments/assets/583dbac9-5853-474a-941d-4fff4c3732e8">





### 채용공고 수정 API
   * `/api/recruitments/{id}`
      - method: PUT

   ```json
   request json
      {
  "id": 0,
  "companyId": 0,
  "position": "string",
  "reward": 0,
  "description": "string",
  "skills": "string"
}

   response json
   {
  "id": 5,
  "companyId": 0,
  "position": "string",
  "reward": 0,
  "description": "string",
  "skills": "string"
}
   ```
<img width="1512" alt="스크린샷 2024-08-14 오전 12 06 22" src="https://github.com/user-attachments/assets/2e0c34ee-67d3-4fa0-8760-ed306704c283">



### 채용공고 삭제 API
   * `/api/recruitments/{id}`
      - method: DELETE

   ```json
   ```
<img width="1512" alt="스크린샷 2024-08-14 오전 12 07 44" src="https://github.com/user-attachments/assets/2549bdcb-e49a-40a8-8197-f38a914bd0a8">

<img width="1354" alt="스크린샷 2024-08-14 오전 12 08 16" src="https://github.com/user-attachments/assets/00f2c661-445d-4967-8795-f49e9836722f">



### 채용공고 목록 가져오기 API
   * `/api/recruitments`
      - method: GET

   ```json


   response json
   [
  {
    "id": 1,
    "companyId": 0,
    "position": "string",
    "reward": 0,
    "description": "string",
    "skills": "string"
  },
  {
    "id": 2,
    "companyId": 0,
    "position": "string",
    "reward": 0,
    "description": "string",
    "skills": "string"
  },
  {
    "id": 6,
    "companyId": 0,
    "position": "string",
    "reward": 0,
    "description": "string",
    "skills": "string"
  }
]
   ```
