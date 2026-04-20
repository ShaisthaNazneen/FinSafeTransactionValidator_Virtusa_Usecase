# FinSafeTransactionValidator_Virtusa_Usecase
# FinSafe Transaction Processor
## Overview
It is a console-based Java application that simulates a digital wallet system.
It validates every transaction before processing to prevent overdraft errors and logs all activities for auditing.

---

##  Problem Statement

Digital wallet applications may allow users to spend more than their balance due to delayed validations.

This project solves that by:

* Validating every transaction before execution
* Preventing insufficient balance withdrawals
* Logging all actions for auditing purposes

---

## Features

* Deposit Money
* Withdraw Money (Spend)
* Check Balance
* View Last 5 Transactions
* Custom Exception Handling
* Input Validation
* Audit Logging (`audit_log.txt`)

---
##  Technologies Used

* Java (Core Java)
* OOP Concepts
* ArrayList
* File Handling

---

## Project Structure

```
FinSafe/
│
├── main/
│   └── FinSafeSpend.java
├── model/
│   └── FinSafeAccount.java
├── exception/
│   └── InsufficientFundsException.java
├── logging/
│   └── FileUtil.java
└── audit_log.txt
```

---

##  How to Run

```
javac main/FinSafeSpend.java
java main.FinSafeSpend
```

---

##  Sample Execution

```
Enter account holder name: shaistha
Enter initial balance:2000
Account created successfully!!

Enter your choice

1.Deposit 2.Withdraw 3.Balance 4. Transaction History 5.Exit
1
Enter amount to deposit: 2000
Deposit successful!!

Enter your choice

1.Deposit 2.Withdraw 3.Balance 4. Transaction History 5.Exit
1
Enter amount to deposit: 2000
Deposit successful!!

Enter your choice

1.Deposit 2.Withdraw 3.Balance 4. Transaction History 5.Exit
2
Enter amount to withdraw: 4000
Withdrawal successful!!

Enter your choice

1.Deposit 2.Withdraw 3.Balance 4. Transaction History 5.Exit
3
Account Holder: shaistha
Current Balance: 2000.00

Enter your choice

1.Deposit 2.Withdraw 3.Balance 4. Transaction History 5.Exit
2
Enter amount to withdraw: 3000
Error: Insufficient balance!

Enter your choice

1.Deposit 2.Withdraw 3.Balance 4. Transaction History 5.Exit
3
Account Holder: shaistha
Current Balance: 2000.00

Enter your choice

1.Deposit 2.Withdraw 3.Balance 4. Transaction History 5.Exit
4

Last 5 Transactions:
1.Deposited: 2000.0
2.Deposited: 2000.0
3.Withdrawn: 4000.0

Enter your choice

1.Deposit 2.Withdraw 3.Balance 4. Transaction History 5.Exit
2
Enter amount to withdraw: 1000
Withdrawal successful!!

Enter your choice

1.Deposit 2.Withdraw 3.Balance 4. Transaction History 5.Exit
1
Enter amount to deposit: 4000
Deposit successful!!

Enter your choice

1.Deposit 2.Withdraw 3.Balance 4. Transaction History 5.Exit
4

Last 5 Transactions:
1.Deposited: 2000.0
2.Deposited: 2000.0
3.Withdrawn: 4000.0
4.Withdrawn: 1000.0
5.Deposited: 4000.0
```

---

## Error Handling

* Prevents invalid amounts (≤ 0)
* Prevents withdrawal beyond balance
* Uses custom exception handling
* Ensures application does not crash

---

## 👩‍💻 Author

Shaistha Nazneen

---

## Conclusion

This project demonstrates:

* Java fundamentals
* OOP concepts
* Exception handling
* Real-world problem solving

