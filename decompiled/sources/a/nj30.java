package a;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class nj30 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23615a;
    public final byte[] b;
    public final int c;
    public final int d;

    public nj30(String str, byte[] bArr, int i, int i2) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                x0x.A(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                x0x.A(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                x0x.A(z);
                break;
            case "auxiliary.tracks.map":
                x0x.A(i2 == 0);
                break;
        }
        this.f23615a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList d() {
        x0x.J("Metadata is not an auxiliary tracks map", this.f23615a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int iC = 0; iC < b; iC = w6x.c(bArr[iC + 2] & 255, iC, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nj30.class != obj.getClass()) {
            return false;
        }
        nj30 nj30Var = (nj30) obj;
        return this.f23615a.equals(nj30Var.f23615a) && Arrays.equals(this.b, nj30Var.b) && this.c == nj30Var.c && this.d == nj30Var.d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + ua80.b(527, 31, this.f23615a)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0170 A[EDGE_INSN: B:73:0x0170->B:75:0x0176 BREAK  A[LOOP:0: B:33:0x00c7->B:74:0x0172]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0172 A[LOOP:0: B:33:0x00c7->B:74:0x0172, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00c1, please report this as an issue */
    public final String toString() {
        String string;
        tx5 tx5Var;
        vx5 tx5Var2;
        sx5 sx5Var;
        char[] cArr;
        int i;
        int length;
        int i2;
        boolean z;
        char[] cArr2;
        int i3;
        sx5 sx5Var2;
        byte[] bArr;
        byte[] bArrCopyOf;
        int i4;
        int i5;
        byte b;
        byte b2;
        boolean z2;
        char c;
        char c2;
        char c3;
        char c4;
        int i6 = this.d;
        if (i6 != 0) {
            if (i6 == 1) {
                byte[] bArr2 = this.b;
                String str = vtt0.f38024a;
                string = new String(bArr2, StandardCharsets.UTF_8);
            } else if (i6 == 23) {
                byte[] bArr3 = this.b;
                x0x.v(bArr3.length, 4, "array too small: %s < %s", bArr3.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(n6x.A(bArr3[0], bArr3[1], bArr3[2], bArr3[3])));
            } else if (i6 == 67) {
                byte[] bArr4 = this.b;
                x0x.v(bArr4.length, 4, "array too small: %s < %s", bArr4.length >= 4);
                string = String.valueOf(n6x.A(bArr4[0], bArr4[1], bArr4[2], bArr4[3]));
            } else if (i6 == 75) {
                string = String.valueOf(this.b[0] & 255);
            } else if (i6 != 78) {
                byte[] bArr5 = this.b;
                String str2 = vtt0.f38024a;
                int length2 = bArr5.length;
                tx5Var = vx5.e;
                tx5Var2 = tx5Var.c;
                if (tx5Var2 == null) {
                    sx5Var = tx5Var.f38184a;
                    cArr = sx5Var.b;
                    for (char c5 : cArr) {
                        if (j47.A0(c5)) {
                            length = cArr.length;
                            i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    z = false;
                                    break;
                                }
                                c4 = cArr[i2];
                                if (c4 < 'a' && c4 <= 'z') {
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                            x0x.J("Cannot call lowerCase() on a mixed-case alphabet", !z);
                            cArr2 = new char[cArr.length];
                            for (i3 = 0; i3 < cArr.length; i3++) {
                                c3 = cArr[i3];
                                if (j47.A0(c3)) {
                                    c3 = (char) (c3 ^ ' ');
                                }
                                cArr2[i3] = c3;
                            }
                            sx5Var2 = new sx5(axq.n(new StringBuilder(), sx5Var.f32957a, ".lowerCase()"), cArr2);
                            if (sx5Var.h) {
                                sx5Var = sx5Var2;
                                break;
                            }
                            bArr = sx5Var2.g;
                            if (sx5Var2.h) {
                                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i4 = 65; i4 <= 90; i4++) {
                                    i5 = i4 | 32;
                                    b = bArr[i4];
                                    b2 = bArr[i5];
                                    if (b == -1) {
                                        bArrCopyOf[i4] = b2;
                                    } else {
                                        if (b2 == -1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        c = (char) i4;
                                        c2 = (char) i5;
                                        if (z2) {
                                            jf4.n(jtm0.p("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                            return null;
                                        }
                                        bArrCopyOf[i5] = b;
                                    }
                                }
                                sx5Var = new sx5(axq.n(new StringBuilder(), sx5Var2.f32957a, ".ignoreCase()"), sx5Var2.b, bArrCopyOf, true);
                                break;
                            }
                            sx5Var = sx5Var2;
                            break;
                        }
                    }
                    if (sx5Var == tx5Var.f38184a) {
                        tx5Var2 = tx5Var;
                    } else {
                        tx5Var2 = new tx5(sx5Var);
                    }
                    tx5Var.c = tx5Var2;
                }
                string = tx5Var2.a(bArr5, length2);
            } else {
                string = String.valueOf(new fq80(this.b).F());
            }
        } else if (this.f23615a.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sbR = brm0.r("track types = ");
            new pfw(String.valueOf(',')).a(sbR, arrayListD.iterator());
            string = sbR.toString();
        } else {
            byte[] bArr6 = this.b;
            String str3 = vtt0.f38024a;
            int length3 = bArr6.length;
            tx5Var = vx5.e;
            tx5Var2 = tx5Var.c;
            if (tx5Var2 == null) {
                sx5Var = tx5Var.f38184a;
                cArr = sx5Var.b;
                while (i < r7) {
                    if (j47.A0(c5)) {
                        length = cArr.length;
                        i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z = false;
                                break;
                            }
                            c4 = cArr[i2];
                            if (c4 < 'a') {
                            }
                            i2++;
                        }
                        x0x.J("Cannot call lowerCase() on a mixed-case alphabet", !z);
                        cArr2 = new char[cArr.length];
                        while (i3 < cArr.length) {
                            c3 = cArr[i3];
                            if (j47.A0(c3)) {
                                c3 = (char) (c3 ^ ' ');
                            }
                            cArr2[i3] = c3;
                        }
                        sx5Var2 = new sx5(axq.n(new StringBuilder(), sx5Var.f32957a, ".lowerCase()"), cArr2);
                        if (sx5Var.h) {
                            sx5Var = sx5Var2;
                            break;
                        }
                        bArr = sx5Var2.g;
                        if (sx5Var2.h) {
                            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            while (i4 <= 90) {
                                i5 = i4 | 32;
                                b = bArr[i4];
                                b2 = bArr[i5];
                                if (b == -1) {
                                    bArrCopyOf[i4] = b2;
                                } else {
                                    if (b2 == -1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c = (char) i4;
                                    c2 = (char) i5;
                                    if (z2) {
                                        jf4.n(jtm0.p("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                        return null;
                                    }
                                    bArrCopyOf[i5] = b;
                                }
                            }
                            sx5Var = new sx5(axq.n(new StringBuilder(), sx5Var2.f32957a, ".ignoreCase()"), sx5Var2.b, bArrCopyOf, true);
                            break;
                        }
                        sx5Var = sx5Var2;
                        break;
                    }
                }
                if (sx5Var == tx5Var.f38184a) {
                    tx5Var2 = tx5Var;
                } else {
                    tx5Var2 = new tx5(sx5Var);
                }
                tx5Var.c = tx5Var2;
            }
            string = tx5Var2.a(bArr6, length3);
        }
        return rw2.o(new StringBuilder("mdta: key="), this.f23615a, ", value=", string);
    }
}
