package a;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class seg0 extends pg9 {
    public static final int[] h;
    public final int b;
    public final pg9 c;
    public final pg9 d;
    public final int e;
    public final int f;
    public int g = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            int iC = w6x.c(i, i2, i, arrayList);
            i2 = i;
            i = iC;
        }
        arrayList.add(Integer.MAX_VALUE);
        h = new int[arrayList.size()];
        int i3 = 0;
        while (true) {
            int[] iArr = h;
            if (i3 >= iArr.length) {
                return;
            }
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
            i3++;
        }
    }

    public seg0(pg9 pg9Var, pg9 pg9Var2) {
        this.c = pg9Var;
        this.d = pg9Var2;
        int size = pg9Var.size();
        this.e = size;
        this.b = pg9Var2.size() + size;
        this.f = Math.max(pg9Var.g(), pg9Var2.g()) + 1;
    }

    public final boolean equals(Object obj) {
        int iM;
        if (obj == this) {
            return true;
        }
        if (obj instanceof pg9) {
            pg9 pg9Var = (pg9) obj;
            int size = pg9Var.size();
            int i = this.b;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.g == 0 || (iM = pg9Var.m()) == 0 || this.g == iM) {
                    qeg0 qeg0Var = new qeg0(this);
                    nh00 nh00VarA = qeg0Var.next();
                    qeg0 qeg0Var2 = new qeg0(pg9Var);
                    nh00 nh00VarA2 = qeg0Var2.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = nh00VarA.b.length - i2;
                        int length2 = nh00VarA2.b.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? nh00VarA.s(nh00VarA2, i3, iMin) : nh00VarA2.s(nh00VarA, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            v4i0.e();
                            return false;
                        }
                        if (iMin == length) {
                            nh00VarA = qeg0Var.next();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            nh00VarA2 = qeg0Var2.next();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // a.pg9
    public final void f(int i, byte[] bArr, int i2, int i3) {
        int i4 = i + i3;
        pg9 pg9Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            pg9Var.f(i, bArr, i2, i3);
            return;
        }
        pg9 pg9Var2 = this.d;
        if (i >= i5) {
            pg9Var2.f(i - i5, bArr, i2, i3);
            return;
        }
        int i6 = i5 - i;
        pg9Var.f(i, bArr, i2, i6);
        pg9Var2.f(0, bArr, i2 + i6, i3 - i6);
    }

    @Override // a.pg9
    public final int g() {
        return this.f;
    }

    @Override // a.pg9
    public final boolean h() {
        return this.b >= h[this.f];
    }

    public final int hashCode() {
        int iK = this.g;
        if (iK == 0) {
            int i = this.b;
            iK = k(i, 0, i);
            if (iK == 0) {
                iK = 1;
            }
            this.g = iK;
        }
        return iK;
    }

    @Override // a.pg9
    public final boolean i() {
        int iL = this.c.l(0, 0, this.e);
        pg9 pg9Var = this.d;
        return pg9Var.l(iL, 0, pg9Var.size()) == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new reg0(this);
    }

    @Override // a.pg9
    public final int k(int i, int i2, int i3) {
        int i4 = i2 + i3;
        pg9 pg9Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return pg9Var.k(i, i2, i3);
        }
        pg9 pg9Var2 = this.d;
        if (i2 >= i5) {
            return pg9Var2.k(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return pg9Var2.k(pg9Var.k(i, i2, i6), 0, i3 - i6);
    }

    @Override // a.pg9
    public final int l(int i, int i2, int i3) {
        int i4 = i2 + i3;
        pg9 pg9Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return pg9Var.l(i, i2, i3);
        }
        pg9 pg9Var2 = this.d;
        if (i2 >= i5) {
            return pg9Var2.l(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return pg9Var2.l(pg9Var.l(i, i2, i6), 0, i3 - i6);
    }

    @Override // a.pg9
    public final int m() {
        return this.g;
    }

    @Override // a.pg9
    public final void r(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        pg9 pg9Var = this.c;
        int i4 = this.e;
        if (i3 <= i4) {
            pg9Var.r(outputStream, i, i2);
            return;
        }
        pg9 pg9Var2 = this.d;
        if (i >= i4) {
            pg9Var2.r(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        pg9Var.r(outputStream, i, i5);
        pg9Var2.r(outputStream, 0, i2 - i5);
    }

    @Override // a.pg9
    public final int size() {
        return this.b;
    }
}
