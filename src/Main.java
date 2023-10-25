
public class Main {
    public static void main(String[] args) {

        CPU cpu = new CPU();

        CPU.Processor CPU = cpu.new Processor();         CPU.getProcessor();
        CPU.RAM RAM = cpu.new RAM();                     RAM.getRAM();

        MotherBoard motherBoard = new MotherBoard();     motherBoard.getMotherBoard();
        MotherBoard.USB usb = new MotherBoard.USB();     usb.getUSB();
        }
    }
//        1.	Creați o clasă numită CPU  care va avea în ea o clasele Inner Processor și RAM
//        2.	Creați cîte un obiect de tip CPU, Processor, RAM
//        3.	Creați o clasă MotherBoard care va conține în ea o clasa static USB
//        4.	Creați cîte un obiect de tip MotherBoard, USB
