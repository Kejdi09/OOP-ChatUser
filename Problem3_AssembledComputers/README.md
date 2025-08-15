# Problem 3 – Assembled Computers
## Project Overview

This project models a system for managing assembled computers for a company that builds and sells them. The program uses Java classes to represent different components of a computer — CPU, RAM, Hard Disk, and Motherboard — and combines them to create complete computer objects. It also includes a tester class to create and display sample computer objects.

## Features
### Computer Class

Composed of several components:

- CPU with attributes: clock frequency (GHz), instruction set architecture (CISC or RISC), type (32 or 64 bit), number of registers, manufacturer (AMD or INTEL).

- RAM with attributes: size (GB), type (DDR, DDR2, DDR3), manufacturer.

- Hard Disk with attributes: size (GB), rotations per minute (RPM), manufacturer.

- Motherboard with attributes: chipset version, number of USB ports, maximum RAM capacity, manufacturer.

- Additional attributes:

- Year assembled

- Price

### Component Classes

- Each component is implemented as its own class with appropriate attributes and methods.

- The computer class uses composition/aggregation to include these components.

### Tester Class

- Constructs two sample computer objects with predefined attributes:

######  computer1:

CPU: 3 GHz CISC, 32 bit, 64 registers, AMD

RAM: 4 GB, DDR2, Kingston

Hard Disk: 500 GB, 7200 RPM, Maxtor

Motherboard: Chipset AMD970, 6 USB ports, max 16 GB RAM, AMD

Year: 2021

Price: 482.5

###### computer2:

CPU: 4 GHz, CISC, 32 bit, 32 registers, INTEL

RAM: 8 GB, DDR3, Kingston

Hard Disk: 1000 GB, 7200 RPM, Seagate

Motherboard: Chipset IntelZ77, 6 USB ports, max 64 GB RAM, MSI

Year: 2022

Price: 560.75

## Usage

Create CPU, RAM, Hard Disk, and Motherboard objects with desired attributes, then compose them into Computer objects. Use the tester class to instantiate and display computer details.

## Example:
````
CPU cpu = new CPU(3, "CISC", 32, 64, "AMD");
RAM ram = new RAM(4, "DDR2", "Kingston");
HardDisk hd = new HardDisk(500, 7200, "Maxtor");
Motherboard mb = new Motherboard("AMD970", 6, 16, "AMD");

Computer computer1 = new Computer(cpu, ram, hd, mb, 2021, 482.5);

System.out.println(computer1);
````
## Sample Output:
````
Computer assembled in 2021, priced at $482.5
CPU: 3 GHz, CISC, 32 bit, 64 registers, AMD
RAM: 4 GB, DDR2, Kingston
Hard Disk: 500 GB, 7200 RPM, Maxtor
Motherboard: Chipset AMD970, 6 USB ports, max 16 GB RAM, AMD
````