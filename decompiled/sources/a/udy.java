package a;

import android.gov.nist.core.Separators;
import java.io.EOFException;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public final class udy extends ndy {
    public static final qg9 l;
    public static final qg9 m;
    public static final qg9 n;
    public final zae0 f;
    public final f99 g;
    public int h;
    public long i;
    public int j;
    public String k;

    static {
        qg9 qg9Var = qg9.d;
        l = gl5.i("'\\");
        m = gl5.i("\"\\");
        n = gl5.i("{}[]:, \n\t\r\f/\\;#=");
        gl5.i("\n\r");
        gl5.i("*/");
    }

    public udy(zae0 zae0Var) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.h = 0;
        this.f = zae0Var;
        this.g = zae0Var.b;
        x(6);
    }

    @Override // a.ndy
    public final void F() throws l52, EOFException {
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 14) {
            long jC = this.f.c(n);
            f99 f99Var = this.g;
            if (jC == -1) {
                jC = f99Var.b;
            }
            f99Var.skip(jC);
        } else if (iL == 13) {
            W(m);
        } else if (iL == 12) {
            W(l);
        } else if (iL != 15) {
            ohq.j(w6x.B(w()), k(), "Expected a name but was ");
            return;
        }
        this.h = 0;
        this.c[this.f23356a - 1] = "null";
    }

    @Override // a.ndy
    public final void H() throws l52, EOFException {
        int i = 0;
        do {
            int iL = this.h;
            if (iL == 0) {
                iL = L();
            }
            if (iL == 3) {
                x(1);
            } else {
                if (iL == 1) {
                    x(3);
                } else if (iL == 4) {
                    i--;
                    if (i < 0) {
                        ohq.j(w6x.B(w()), k(), "Expected a value but was ");
                        return;
                    }
                    this.f23356a--;
                } else if (iL == 2) {
                    i--;
                    if (i < 0) {
                        ohq.j(w6x.B(w()), k(), "Expected a value but was ");
                        return;
                    }
                    this.f23356a--;
                } else {
                    f99 f99Var = this.g;
                    if (iL == 14 || iL == 10) {
                        long jC = this.f.c(n);
                        if (jC == -1) {
                            jC = f99Var.b;
                        }
                        f99Var.skip(jC);
                    } else if (iL == 9 || iL == 13) {
                        W(m);
                    } else if (iL == 8 || iL == 12) {
                        W(l);
                    } else if (iL == 17) {
                        f99Var.skip(this.j);
                    } else if (iL == 18) {
                        ohq.j(w6x.B(w()), k(), "Expected a value but was ");
                        return;
                    }
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.f23356a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.c[i2] = "null";
    }

    public final void J() throws l52 {
        I("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:172:0x01fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x0207  */
    /* JADX WARN: Code duplicated, block: B:177:0x020d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    public final int L() throws l52, EOFException {
        int i;
        String str;
        String str2;
        long j;
        char cN;
        int i2;
        int i3;
        int i4;
        int i5;
        byte bN;
        int i6;
        int[] iArr = this.b;
        int i7 = this.f23356a - 1;
        int i8 = iArr[i7];
        int i9 = 0;
        f99 f99Var = this.g;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iS = S(true);
            f99Var.readByte();
            if (iS != 44) {
                if (iS == 59) {
                    J();
                    throw null;
                }
                if (iS == 93) {
                    this.h = 4;
                    return 4;
                }
                I("Unterminated array");
                throw null;
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5) {
                    int iS2 = S(true);
                    f99Var.readByte();
                    if (iS2 != 44) {
                        if (iS2 == 59) {
                            J();
                            throw null;
                        }
                        if (iS2 == 125) {
                            this.h = 2;
                            return 2;
                        }
                        I("Unterminated object");
                        throw null;
                    }
                }
                int iS3 = S(true);
                if (iS3 == 34) {
                    f99Var.readByte();
                    this.h = 13;
                    return 13;
                }
                if (iS3 == 39) {
                    f99Var.readByte();
                    J();
                    throw null;
                }
                if (iS3 != 125) {
                    J();
                    throw null;
                }
                if (i8 == 5) {
                    I("Expected name");
                    throw null;
                }
                f99Var.readByte();
                this.h = 2;
                return 2;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iS4 = S(true);
                f99Var.readByte();
                if (iS4 != 58) {
                    if (iS4 != 61) {
                        I("Expected ':'");
                        throw null;
                    }
                    J();
                    throw null;
                }
            } else if (i8 == 6) {
                iArr[i7] = 7;
            } else {
                if (i8 == 7) {
                    if (S(false) == -1) {
                        this.h = 18;
                        return 18;
                    }
                    J();
                    throw null;
                }
                if (i8 == 8) {
                    jf4.n("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iS5 = S(true);
        if (iS5 == 34) {
            f99Var.readByte();
            this.h = 9;
            return 9;
        }
        if (iS5 == 39) {
            J();
            throw null;
        }
        if (iS5 != 44 && iS5 != 59) {
            if (iS5 == 91) {
                f99Var.readByte();
                this.h = 3;
                return 3;
            }
            if (iS5 != 93) {
                if (iS5 == 123) {
                    f99Var.readByte();
                    this.h = 1;
                    return 1;
                }
                byte bN2 = f99Var.n(0L);
                zae0 zae0Var = this.f;
                if (bN2 == 116 || bN2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bN2 != 102 && bN2 != 70) {
                        if (bN2 == 110 || bN2 == 78) {
                            i = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j = 0;
                            i = 0;
                            i9 = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        int i10 = 1;
                        i2 = i9;
                        i3 = i2;
                        int i11 = i3;
                        long j2 = j;
                        while (true) {
                            i4 = i3 + 1;
                            if (zae0Var.G(i4)) {
                                bN = f99Var.n(i3);
                                if (bN != 43) {
                                    if (bN != 69 || bN == 101) {
                                        i6 = 6;
                                        if (i2 != 2 || i2 == 4) {
                                            i2 = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    } else if (bN == 45) {
                                        i6 = 6;
                                        if (i2 == 0) {
                                            i2 = 1;
                                            i11 = 1;
                                        } else {
                                            if (i2 != 5) {
                                                i5 = i9;
                                            }
                                            i2 = i6;
                                        }
                                        i3 = i4;
                                    } else if (bN != 46) {
                                        if (bN >= 48 && bN <= 57) {
                                            if (i2 == 1 || i2 == 0) {
                                                i6 = 6;
                                                j2 = -(bN - 48);
                                                i2 = 2;
                                            } else {
                                                if (i2 == 2) {
                                                    if (j2 != j) {
                                                        long j3 = (10 * j2) - ((long) (bN - 48));
                                                        i10 &= (j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2)) ? 1 : i9;
                                                        j2 = j3;
                                                    }
                                                } else if (i2 == 3) {
                                                    i2 = 4;
                                                } else {
                                                    i6 = 6;
                                                    if (i2 == 5 || i2 == 6) {
                                                        i2 = 7;
                                                    }
                                                }
                                                i6 = 6;
                                                i3 = i4;
                                            }
                                            i3 = i4;
                                        } else if (!Q(bN)) {
                                        }
                                        i5 = i9;
                                    } else {
                                        i6 = 6;
                                        if (i2 == 2) {
                                            i2 = 3;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (Q(f99Var.n(j))) {
                                        J();
                                        throw null;
                                    }
                                    I("Expected value");
                                    throw null;
                                }
                                i6 = 6;
                                if (i2 != 5) {
                                    i5 = i9;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (Q(f99Var.n(j))) {
                                        I("Expected value");
                                        throw null;
                                    }
                                    J();
                                    throw null;
                                }
                                i2 = i6;
                                i3 = i4;
                            }
                            if (i2 != 2 && i10 != 0 && ((j2 != Long.MIN_VALUE || i11 != 0) && (j2 != j || i11 == 0))) {
                                if (i11 == 0) {
                                    j2 = -j2;
                                }
                                this.i = j2;
                                f99Var.skip(i3);
                                i5 = 16;
                                this.h = 16;
                            } else if (i2 != 2 || i2 == 4 || i2 == 7) {
                                this.j = i3;
                                i5 = 17;
                                this.h = 17;
                            } else {
                                i5 = i9;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (Q(f99Var.n(j))) {
                                I("Expected value");
                                throw null;
                            }
                            J();
                            throw null;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j = 0;
                int i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (!zae0Var.G(length + 1) || !Q(f99Var.n(length))) {
                            f99Var.skip(length);
                            this.h = i;
                            break;
                        }
                    } else {
                        int i13 = i12 + 1;
                        if (zae0Var.G(i13) && ((cN = f99Var.n(i12)) == str2.charAt(i12) || cN == str.charAt(i12))) {
                            i12 = i13;
                        }
                    }
                    i = i9;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                int i14 = 1;
                i2 = i9;
                i3 = i2;
                int i15 = i3;
                long j4 = j;
                while (true) {
                    i4 = i3 + 1;
                    if (zae0Var.G(i4)) {
                        bN = f99Var.n(i3);
                        if (bN != 43) {
                            if (bN != 69) {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            } else {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (Q(f99Var.n(j))) {
                                I("Expected value");
                                throw null;
                            }
                            J();
                            throw null;
                        }
                        i6 = 6;
                        if (i2 != 5) {
                            i5 = i9;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (Q(f99Var.n(j))) {
                                I("Expected value");
                                throw null;
                            }
                            J();
                            throw null;
                        }
                        i2 = i6;
                        i3 = i4;
                    }
                    if (i2 != 2) {
                        if (i2 != 2) {
                        }
                        this.j = i3;
                        i5 = 17;
                        this.h = 17;
                    } else {
                        if (i2 != 2) {
                        }
                        this.j = i3;
                        i5 = 17;
                        this.h = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (Q(f99Var.n(j))) {
                        I("Expected value");
                        throw null;
                    }
                    J();
                    throw null;
                }
            }
            if (i8 == 1) {
                f99Var.readByte();
                this.h = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            J();
            throw null;
        }
        I("Unexpected value");
        throw null;
    }

    public final int O(String str, edu eduVar) {
        int length = ((String[]) eduVar.c).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) eduVar.c)[i])) {
                this.h = 0;
                this.c[this.f23356a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean Q(int i) throws l52 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        J();
        throw null;
    }

    public final String R() throws l52, EOFException {
        String strT;
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 14) {
            strT = U();
        } else if (iL == 13) {
            strT = T(m);
        } else if (iL == 12) {
            strT = T(l);
        } else {
            if (iL != 15) {
                ohq.j(w6x.B(w()), k(), "Expected a name but was ");
                return null;
            }
            strT = this.k;
        }
        this.h = 0;
        this.c[this.f23356a - 1] = strT;
        return strT;
    }

    public final int S(boolean z) throws l52, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            zae0 zae0Var = this.f;
            if (!zae0Var.G(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            f99 f99Var = this.g;
            byte bN = f99Var.n(j);
            if (bN != 10 && bN != 32 && bN != 13 && bN != 9) {
                f99Var.skip(j);
                if (bN == 47) {
                    if (zae0Var.G(2L)) {
                        J();
                        throw null;
                    }
                } else if (bN == 35) {
                    J();
                    throw null;
                }
                return bN;
            }
            i = i2;
        }
    }

    public final String T(qg9 qg9Var) throws l52, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jC = this.f.c(qg9Var);
            if (jC == -1) {
                I("Unterminated string");
                throw null;
            }
            f99 f99Var = this.g;
            if (f99Var.n(jC) != 92) {
                if (sb == null) {
                    String strL = f99Var.L(jC, Charsets.UTF_8);
                    f99Var.readByte();
                    return strL;
                }
                sb.append(f99Var.L(jC, Charsets.UTF_8));
                f99Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(f99Var.L(jC, Charsets.UTF_8));
            f99Var.readByte();
            sb.append(V());
        }
    }

    public final String U() {
        long jC = this.f.c(n);
        f99 f99Var = this.g;
        if (jC == -1) {
            return f99Var.O();
        }
        f99Var.getClass();
        return f99Var.L(jC, Charsets.UTF_8);
    }

    public final char V() throws l52, EOFException {
        int i;
        zae0 zae0Var = this.f;
        if (!zae0Var.G(1L)) {
            I("Unterminated escape sequence");
            throw null;
        }
        f99 f99Var = this.g;
        byte b = f99Var.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            I("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!zae0Var.G(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(k()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bN = f99Var.n(i2);
            char c2 = (char) (c << 4);
            if (bN >= 48 && bN <= 57) {
                i = bN - 48;
            } else if (bN >= 97 && bN <= 102) {
                i = bN - 87;
            } else {
                if (bN < 65 || bN > 70) {
                    I("\\u".concat(f99Var.L(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = bN - 55;
            }
            c = (char) (i + c2);
        }
        f99Var.skip(4L);
        return c;
    }

    public final void W(qg9 qg9Var) throws l52, EOFException {
        while (true) {
            long jC = this.f.c(qg9Var);
            if (jC == -1) {
                I("Unterminated string");
                throw null;
            }
            f99 f99Var = this.g;
            if (f99Var.n(jC) != 92) {
                f99Var.skip(jC + 1);
                return;
            } else {
                f99Var.skip(jC + 1);
                V();
            }
        }
    }

    @Override // a.ndy
    public final void a() throws l52, EOFException {
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        if (iL != 3) {
            ohq.j(w6x.B(w()), k(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        x(1);
        this.d[this.f23356a - 1] = 0;
        this.h = 0;
    }

    @Override // a.ndy
    public final void c() throws l52, EOFException {
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        if (iL != 1) {
            ohq.j(w6x.B(w()), k(), "Expected BEGIN_OBJECT but was ");
        } else {
            x(3);
            this.h = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.h = 0;
        this.b[0] = 8;
        this.f23356a = 1;
        this.g.a();
        this.f.close();
    }

    @Override // a.ndy
    public final void d() throws l52, EOFException {
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        if (iL != 4) {
            ohq.j(w6x.B(w()), k(), "Expected END_ARRAY but was ");
            return;
        }
        int i = this.f23356a;
        this.f23356a = i - 1;
        int[] iArr = this.d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.h = 0;
    }

    @Override // a.ndy
    public final void e() throws l52, EOFException {
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        if (iL != 2) {
            ohq.j(w6x.B(w()), k(), "Expected END_OBJECT but was ");
            return;
        }
        int i = this.f23356a;
        int i2 = i - 1;
        this.f23356a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    @Override // a.ndy
    public final boolean l() throws l52, EOFException {
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        return (iL == 2 || iL == 4 || iL == 18) ? false : true;
    }

    @Override // a.ndy
    public final boolean n() throws l52, EOFException {
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 5) {
            this.h = 0;
            int[] iArr = this.d;
            int i = this.f23356a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iL != 6) {
            ohq.j(w6x.B(w()), k(), "Expected a boolean but was ");
            return false;
        }
        this.h = 0;
        int[] iArr2 = this.d;
        int i2 = this.f23356a - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    @Override // a.ndy
    public final double q() throws l52, EOFException {
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 16) {
            this.h = 0;
            int[] iArr = this.d;
            int i = this.f23356a - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iL == 17) {
            long j = this.j;
            f99 f99Var = this.g;
            f99Var.getClass();
            this.k = f99Var.L(j, Charsets.UTF_8);
        } else if (iL == 9) {
            this.k = T(m);
        } else if (iL == 8) {
            this.k = T(l);
        } else if (iL == 10) {
            this.k = U();
        } else if (iL != 11) {
            ohq.j(w6x.B(w()), k(), "Expected a double but was ");
            return 0.0d;
        }
        this.h = 11;
        try {
            double d = Double.parseDouble(this.k);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                StringBuilder sbP = brm0.p(d, "JSON forbids NaN and infinities: ", " at path ");
                sbP.append(k());
                throw new l52(sbP.toString());
            }
            this.k = null;
            this.h = 0;
            int[] iArr2 = this.d;
            int i2 = this.f23356a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            ohq.j(this.k, k(), "Expected a double but was ");
            return 0.0d;
        }
    }

    @Override // a.ndy
    public final int r() throws l52, EOFException {
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 16) {
            long j = this.i;
            int i = (int) j;
            if (j == i) {
                this.h = 0;
                int[] iArr = this.d;
                int i2 = this.f23356a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new ss3("Expected an int but was " + this.i + " at path " + k());
        }
        if (iL == 17) {
            long j2 = this.j;
            f99 f99Var = this.g;
            f99Var.getClass();
            this.k = f99Var.L(j2, Charsets.UTF_8);
        } else if (iL == 9 || iL == 8) {
            String strT = iL == 9 ? T(m) : T(l);
            this.k = strT;
            try {
                int i3 = Integer.parseInt(strT);
                this.h = 0;
                int[] iArr2 = this.d;
                int i4 = this.f23356a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iL != 11) {
            ohq.j(w6x.B(w()), k(), "Expected an int but was ");
            return 0;
        }
        this.h = 11;
        try {
            double d = Double.parseDouble(this.k);
            int i5 = (int) d;
            if (i5 != d) {
                ohq.j(this.k, k(), "Expected an int but was ");
                return 0;
            }
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.d;
            int i6 = this.f23356a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            ohq.j(this.k, k(), "Expected an int but was ");
            return 0;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f + Separators.RPAREN;
    }

    @Override // a.ndy
    public final String v() throws l52, EOFException {
        String strL;
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 10) {
            strL = U();
        } else if (iL == 9) {
            strL = T(m);
        } else if (iL == 8) {
            strL = T(l);
        } else if (iL == 11) {
            strL = this.k;
            this.k = null;
        } else if (iL == 16) {
            strL = Long.toString(this.i);
        } else {
            if (iL != 17) {
                ohq.j(w6x.B(w()), k(), "Expected a string but was ");
                return null;
            }
            long j = this.j;
            f99 f99Var = this.g;
            f99Var.getClass();
            strL = f99Var.L(j, Charsets.UTF_8);
        }
        this.h = 0;
        int[] iArr = this.d;
        int i = this.f23356a - 1;
        iArr[i] = iArr[i] + 1;
        return strL;
    }

    @Override // a.ndy
    public final int w() throws l52, EOFException {
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        switch (iL) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // a.ndy
    public final int y(edu eduVar) throws l52, EOFException {
        int iL = this.h;
        if (iL == 0) {
            iL = L();
        }
        if (iL < 12 || iL > 15) {
            return -1;
        }
        if (iL == 15) {
            return O(this.k, eduVar);
        }
        int iO0 = this.f.o0((z680) eduVar.b);
        if (iO0 != -1) {
            this.h = 0;
            this.c[this.f23356a - 1] = ((String[]) eduVar.c)[iO0];
            return iO0;
        }
        String str = this.c[this.f23356a - 1];
        String strR = R();
        int iO = O(strR, eduVar);
        if (iO == -1) {
            this.h = 15;
            this.k = strR;
            this.c[this.f23356a - 1] = str;
        }
        return iO;
    }
}
