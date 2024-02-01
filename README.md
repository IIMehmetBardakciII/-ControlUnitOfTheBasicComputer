# ControlUnitOfTheBasicComputer

The purpose of this project is to analyze the structure created by a section of the control unit in a basic computer. The goal is to dissect 16-bit data in words retrieved from a text file (RAM.txt), and based on the values of I and OPCode, print the corresponding instruction structure.







## EXAMPLE SCREEN
**RAM FİLE**
- 0001111111111111
- 1111100000000000
- 0111100000000000
- 1111001000000000
- 1111010000000000
- 1000111111000000
- 0110101010101010
- 0011111111111111
- 1010000000111111
- 0011111111111110
- 0001111111111111
- 1111100000000000
- 0111100000000000
- 1111001000000000
- 1111010000000000
- 1000111111000000
- **----------------------**
- OUTPUT:
- RAM.txt dosyası okundu. 
- T0 I=0 D1 aktif IR(11-0) = 111111111111 buyruk = ADD
- T1 I=1 D7 aktif IR(11-0) = 100000000000 buyruk = INP
- T2 I=0 D7 aktif IR(11-0) = 100000000000 buyruk = CLA
- T3 I=1 D7 aktif IR(11-0) = 001000000000 buyruk = SKI
- T4 I=1 D7 aktif IR(11-0) = 010000000000 buyruk = OUT
- T5 I=1 D0 aktif IR(11-0) = 111111000000 buyruk = AND
- T6 I=0 D6 aktif IR(11-0) = 101010101010 buyruk = ISZ
- T7 I=0 D3 aktif IR(11-0) = 111111111111 buyruk = STA
- T8 I=1 D2 aktif IR(11-0) = 000000111111 buyruk = LDA
- T9 I=0 D3 aktif IR(11-0) = 111111111110 buyruk = STA
- T10 I=0 D1 aktif IR(11-0) = 111111111111 buyruk = ADD
- T11 I=1 D7 aktif IR(11-0) = 100000000000 buyruk = INP
- T12 I=0 D7 aktif IR(11-0) = 100000000000 buyruk = CLA
- T13 I=1 D7 aktif IR(11-0) = 001000000000 buyruk = SKI
- T14 I=1 D7 aktif IR(11-0) = 010000000000 buyruk = OUT
- T15 I=1 D0 aktif IR(11-0) = 111111000000 buyruk = AND


