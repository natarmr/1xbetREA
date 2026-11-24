package a;

/* JADX INFO: loaded from: classes.dex */
public final class xjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wjt f41003a;
    public final int[] b;

    public xjt(wjt wjtVar, int[] iArr) {
        if (iArr.length == 0) {
            e9d0.o();
            throw null;
        }
        this.f41003a = wjtVar;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public final xjt a(xjt xjtVar) {
        wjt wjtVar = xjtVar.f41003a;
        wjt wjtVar2 = this.f41003a;
        if (!wjtVar2.equals(wjtVar)) {
            jf4.o("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (e()) {
            return xjtVar;
        }
        if (xjtVar.e()) {
            return this;
        }
        int[] iArr = xjtVar.b;
        int[] iArr2 = this.b;
        if (iArr2.length > iArr.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new xjt(wjtVar2, iArr3);
    }

    public final int b(int i) {
        if (i == 0) {
            return c(0);
        }
        int[] iArr = this.b;
        if (i != 1) {
            int iC = iArr[0];
            int length = iArr.length;
            for (int i2 = 1; i2 < length; i2++) {
                iC = this.f41003a.c(i, iC) ^ iArr[i2];
            }
            return iC;
        }
        int i3 = 0;
        for (int i4 : iArr) {
            wjt wjtVar = wjt.h;
            i3 ^= i4;
        }
        return i3;
    }

    public final int c(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public final int d() {
        return this.b.length - 1;
    }

    public final boolean e() {
        return this.b[0] == 0;
    }

    public final xjt f(int i) {
        wjt wjtVar = this.f41003a;
        if (i == 0) {
            return wjtVar.c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = wjtVar.c(iArr[i2], i);
        }
        return new xjt(wjtVar, iArr2);
    }

    public final xjt g(xjt xjtVar) {
        wjt wjtVar = xjtVar.f41003a;
        wjt wjtVar2 = this.f41003a;
        if (!wjtVar2.equals(wjtVar)) {
            jf4.o("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (e() || xjtVar.e()) {
            return wjtVar2.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = xjtVar.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = iArr3[i4] ^ wjtVar2.c(i2, iArr2[i3]);
            }
        }
        return new xjt(wjtVar2, iArr3);
    }

    public final xjt h(int i, int i2) {
        if (i < 0) {
            e9d0.o();
            return null;
        }
        wjt wjtVar = this.f41003a;
        if (i2 == 0) {
            return wjtVar.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = wjtVar.c(iArr[i3], i2);
        }
        return new xjt(wjtVar, iArr2);
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    if (iD == d()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    iC = -iC;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    wjt wjtVar = this.f41003a;
                    if (iC == 0) {
                        wjtVar.getClass();
                        e9d0.o();
                        return null;
                    }
                    int i = wjtVar.b[iC];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (iD != 0) {
                    if (iD == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iD);
                    }
                }
            }
        }
        return sb.toString();
    }
}
