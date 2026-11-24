import sys, struct
from elftools.elf.elffile import ELFFile
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN

path = sys.argv[1]
data = open(path, "rb").read()
elf = ELFFile(open(path, "rb"))

def vaddr_to_off(va):
    for s in elf.iter_sections():
        if s["sh_type"] == "SHT_NOBITS":
            continue
        a, sz = s["sh_addr"], s["sh_size"]
        if a <= va < a + sz:
            return s["sh_offset"] + (va - a)
    return None

def dump(va, n):
    off = vaddr_to_off(va)
    b = data[off:off+n]
    print(f"-- dump 0x{va:x} fileoff=0x{off:x} --")
    for i in range(0, len(b), 16):
        chunk = b[i:i+16]
        hx = " ".join(f"{x:02x}" for x in chunk)
        asc = "".join(chr(x) if 32 <= x < 127 else "." for x in chunk)
        print(f"0x{va+i:08x}  {hx:<47s}  {asc}")

def dis(va, size):
    off = vaddr_to_off(va)
    code = data[off:off+size]
    md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
    print(f"-- disasm 0x{va:x} size={size} --")
    for ins in md.disasm(code, va):
        print(f"0x{ins.address:08x}:  {ins.bytes.hex():<16s} {ins.mnemonic:<10s} {ins.op_str}")

dump(0xf280, 0x40)
dis(0x6168, 56)
print()
dis(0x65cc, 28)   # getFirstKLib
dis(0x6604, 28)   # getSecondKLib
dis(0x65e8, 28)   # getFirstVLib
dis(0x6620, 28)   # getSecondVLib
dis(0x663c, 28)   # getVersLib
dis(0x6658, 28)   # getAlphabetLib
print()
dis(0x6868, 252)  # getConfig
