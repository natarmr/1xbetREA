package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class kg9 extends og9 {
    public final byte[] d;

    public kg9(byte[] bArr) {
        this.f25206a = 0;
        bArr.getClass();
        this.d = bArr;
    }

    @Override // a.og9
    public byte b(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof og9) && size() == ((og9) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof kg9)) {
                return obj.equals(this);
            }
            kg9 kg9Var = (kg9) obj;
            int i = this.f25206a;
            int i2 = kg9Var.f25206a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > kg9Var.size()) {
                    itt0.w(size, size());
                    return false;
                }
                if (size > kg9Var.size()) {
                    StringBuilder sbM = b1j.m(size, "Ran off end of other: 0, ", ", ");
                    sbM.append(kg9Var.size());
                    throw new IllegalArgumentException(sbM.toString());
                }
                byte[] bArr = kg9Var.d;
                int i3 = i() + size;
                int i4 = i();
                int i5 = kg9Var.i();
                while (i4 < i3) {
                    if (this.d[i4] == bArr[i5]) {
                        i4++;
                        i5++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // a.og9
    public void g(byte[] bArr, int i) {
        System.arraycopy(this.d, 0, bArr, 0, i);
    }

    public int i() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new eg9(this);
    }

    public byte j(int i) {
        return this.d[i];
    }

    @Override // a.og9
    public int size() {
        return this.d.length;
    }
}
