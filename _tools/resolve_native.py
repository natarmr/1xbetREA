import sys, re
from elftools.elf.elffile import ELFFile

path = sys.argv[1]
data = open(path, "rb").read()
elf = ELFFile(open(path, "rb"))

sections = {}
for s in elf.iter_sections():
    sections[s.name] = s

def vaddr_to_off(va):
    for s in elf.iter_sections():
        if s["sh_type"] == "SHT_NOBITS":
            continue
        a, sz = s["sh_addr"], s["sh_size"]
        if a <= va < a + sz:
            return s["sh_offset"] + (va - a)
    return None

print("== R_AARCH64_RELATIVE RELOCATIONS (GOT + .data) ==")
rels = []
for s in elf.iter_sections():
    if s.header["sh_type"] in ("SHT_RELA",):
        for r in s.iter_relocations():
            t = r["r_info_type"]
            if t == 0x403:  # R_AARCH64_RELATIVE
                off, add = r["r_offset"], r["r_addend"]
                if 0xad00 <= off <= 0x7000 + 0x700 or 0xf000 <= off <= 0xf6a0:
                    rels.append((off, add))
for off, add in sorted(rels):
    # try read string at addend
    sv = ""
    o = vaddr_to_off(add)
    if o is not None:
        raw = data[o:o+80].split(b"\x00")[0]
        if all(32 <= c < 127 for c in raw) and len(raw) >= 3:
            sv = raw.decode("ascii", "replace")
    print(f"reloc 0x{off:06x} -> 0x{add:06x}  {sv}")

print("\n== .rodata STRINGS ==")
s = sections[".rodata"]
ro = data[s["sh_offset"]:s["sh_offset"]+s["sh_size"]]
for m in re.finditer(rb"[\x20-\x7e]{4,}", ro):
    off = s["sh_offset"] + m.start()
    va = s["sh_addr"] + m.start()
    print(f"va=0x{va:06x} off=0x{off:06x}: {m.group().decode('ascii','replace')}")
