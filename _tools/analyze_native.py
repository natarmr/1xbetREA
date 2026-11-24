import sys, re, struct
from elftools.elf.elffile import ELFFile

path = sys.argv[1]
mode = sys.argv[2] if len(sys.argv) > 2 else "overview"

with open(path, "rb") as f:
    elf = ELFFile(f)
    print("== ELF ==")
    print("class:", elf.elfclass, "machine:", elf.header["e_machine"], "type:", elf.header["e_type"])

    if mode in ("overview", "symbols"):
        print("\n== SECTIONS ==")
        for s in elf.iter_sections():
            print(f"{s.name:24s} {s['sh_type']:16s} addr=0x{s['sh_addr']:x} off=0x{s['sh_offset']:x} size=0x{s['sh_size']:x}")

        print("\n== DYNAMIC SYMBOLS ==")
        for sec in elf.iter_sections():
            if sec.header["sh_type"] in ("SHT_DYNSYM", "SHT_SYMTAB"):
                print("--", sec.name, "--")
                for sym in sec.iter_symbols():
                    if sym.name:
                        print(f"0x{sym['st_value']:x} size={sym['st_size']:5d} {sym['st_info']['type']:8s} {sym.name}")

    if mode in ("overview", "strings"):
        print("\n== STRINGS (len>=6, printable) ==")
        data = open(path, "rb").read()
        for m in re.finditer(rb"[\x20-\x7e]{6,}", data):
            s = m.group().decode("ascii", "replace")
            print(f"0x{m.start():x}: {s}")
