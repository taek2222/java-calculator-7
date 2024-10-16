# 문자열 덧셈 계산기 🚀

---
## 기능 구현 목록 ⚙️

### 커스텀 구분자 추출
- [x] 입력 문자열에 `//`, `\n` 포함 여부로 커스텀 구분자 확인 ex) `//;\n1;2;3`
- [x] 커스텀 문자 사이의 구분자 반환
  - _구분자는 예시 처럼 1개가 아닐 수 있다._
  - _구분자는 예시 처럼 가장 앞에 나오지 않을 수 있다._

### 양수 문자열 추출
- [x] 커스텀 구분자가 존재할 경우
  - `// + 커스텀 구분자 + \n` 문자열외 반환 기능
- [x] 커스텀 구분자가 존재하지 않을 경우
  - 입력 문자열 반환 기능

### 입력 문자열 분할
- [x] 지정된 구분자와 일치하는 문자열 또다른 기본 구분자로 `:` 변환
- [x] 구분자 `:` 로 문자열 분할 후 배열 반환

### 문자 배열을 숫자 배열로 변환
- [x] 배열안에 담긴 문자를 숫자로 변환 후 반환
- [x] 숫자인지 검증 예외 처리 `IllegalArgumentException`

### 계산
- [x] 숫자 배열로 합산 결과를 반환
- [x] 양수인지 검증 예외 처리 `IllegalArgumentException`

### 입력
- [x] 사용자 입력 기능 ex) `//;\n1;2;3`, `1,2:3`

### 출력
- [x] 계산기 시작 문구 출력 기능 ex) "덧셈할 문자열을 입력해 주세요."
- [x] 계산기 결과 값 출력 기능 ex) "결과 : 6" 