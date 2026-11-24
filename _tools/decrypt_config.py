import json, sys
from Crypto.Cipher import AES
from Crypto.Util.Padding import unpad

p = r"D:\1xbetrea\apktool_out\assets\remote-config\remote-config.json"
j = json.load(open(p, encoding="utf-8"))
data = bytes.fromhex(j["dataHex"])
iv = bytes.fromhex(j["ivHex"])
print("data bytes:", len(data), "iv bytes:", len(iv))

keys = {
    "main": b"ZgudVs2IhRqaWqj7owMwNWc1Mvkj6GuH",
    "stage": b"asuperstrong32bitpasswordgohere0",
}
for name, key in keys.items():
    try:
        pt = unpad(AES.new(key, AES.MODE_CBC, iv).decrypt(data), AES.block_size)
        txt = pt.decode("utf-8", "replace")
        out = rf"D:\1xbetrea\reports\remote_config_decrypted_{name}.txt"
        open(out, "w", encoding="utf-8").write(txt)
        print(f"\n=== SUCCESS with {name} key === saved {out}")
        print(txt[:6000])
    except Exception as e:
        print(f"\n=== FAILED with {name} key: {e}")
