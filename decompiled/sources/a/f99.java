package a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public final class f99 implements u99, t99, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uvh0 f9145a;
    public long b;

    @Override // a.u99
    public final String A(long j) throws EOFException {
        if (j < 0) {
            c99.s(h97.h(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jR = r((byte) 10, 0L, j2);
        if (jR != -1) {
            return b.c(this, jR);
        }
        if (j2 < this.b && n(j2 - 1) == 13 && n(j2) == 10) {
            return b.c(this, j2);
        }
        f99 f99Var = new f99();
        e(f99Var, 0L, Math.min(32L, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + f99Var.q0(f99Var.b).f() + (char) 8230);
    }

    @Override // a.u99
    public final void A0(f99 f99Var, long j) throws EOFException {
        long j2 = this.b;
        if (j2 >= j) {
            f99Var.F0(this, j);
        } else {
            f99Var.F0(this, j2);
            c99.f();
        }
    }

    @Override // a.t99
    public final /* bridge */ /* synthetic */ t99 B(byte[] bArr, int i) {
        U(bArr, i);
        return this;
    }

    @Override // a.t99
    public final /* bridge */ /* synthetic */ t99 D(String str) {
        c0(str);
        return this;
    }

    public final boolean F(int i, long j, qg9 qg9Var) {
        qg9Var.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.b && i <= qg9Var.e()) {
            return i == 0 || b.a(this, qg9Var, j, j + 1, i) != -1;
        }
        return false;
    }

    @Override // a.s5k0
    public final void F0(f99 f99Var, long j) {
        uvh0 uvh0VarB;
        f99Var.getClass();
        if (f99Var == this) {
            jf4.o("source == this");
            return;
        }
        cy2.x(f99Var.b, 0L, j);
        while (j > 0) {
            uvh0 uvh0Var = f99Var.f9145a;
            uvh0Var.getClass();
            int i = uvh0Var.c;
            uvh0 uvh0Var2 = f99Var.f9145a;
            uvh0Var2.getClass();
            long j2 = i - uvh0Var2.b;
            int i2 = 0;
            if (j < j2) {
                uvh0 uvh0Var3 = this.f9145a;
                uvh0 uvh0Var4 = uvh0Var3 != null ? uvh0Var3.g : null;
                if (uvh0Var4 != null && uvh0Var4.e) {
                    if ((((long) uvh0Var4.c) + j) - ((long) (uvh0Var4.d ? 0 : uvh0Var4.b)) <= 8192) {
                        uvh0 uvh0Var5 = f99Var.f9145a;
                        uvh0Var5.getClass();
                        uvh0Var5.d(uvh0Var4, (int) j);
                        f99Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                uvh0 uvh0Var6 = f99Var.f9145a;
                uvh0Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > uvh0Var6.c - uvh0Var6.b) {
                    jf4.o("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    uvh0VarB = uvh0Var6.c();
                } else {
                    uvh0VarB = mwh0.b();
                    byte[] bArr = uvh0Var6.f36348a;
                    byte[] bArr2 = uvh0VarB.f36348a;
                    int i4 = uvh0Var6.b;
                    qx3.f(bArr, 0, bArr2, i4, i4 + i3);
                }
                uvh0VarB.c = uvh0VarB.b + i3;
                uvh0Var6.b += i3;
                uvh0 uvh0Var7 = uvh0Var6.g;
                uvh0Var7.getClass();
                uvh0Var7.b(uvh0VarB);
                f99Var.f9145a = uvh0VarB;
            }
            uvh0 uvh0Var8 = f99Var.f9145a;
            uvh0Var8.getClass();
            long j3 = uvh0Var8.c - uvh0Var8.b;
            f99Var.f9145a = uvh0Var8.a();
            uvh0 uvh0Var9 = this.f9145a;
            if (uvh0Var9 == null) {
                this.f9145a = uvh0Var8;
                uvh0Var8.g = uvh0Var8;
                uvh0Var8.f = uvh0Var8;
            } else {
                uvh0 uvh0Var10 = uvh0Var9.g;
                uvh0Var10.getClass();
                uvh0Var10.b(uvh0Var8);
                uvh0 uvh0Var11 = uvh0Var8.g;
                if (uvh0Var11 == uvh0Var8) {
                    jf4.n("cannot compact");
                    return;
                }
                uvh0Var11.getClass();
                if (uvh0Var11.e) {
                    int i5 = uvh0Var8.c - uvh0Var8.b;
                    uvh0 uvh0Var12 = uvh0Var8.g;
                    uvh0Var12.getClass();
                    int i6 = 8192 - uvh0Var12.c;
                    uvh0 uvh0Var13 = uvh0Var8.g;
                    uvh0Var13.getClass();
                    if (!uvh0Var13.d) {
                        uvh0 uvh0Var14 = uvh0Var8.g;
                        uvh0Var14.getClass();
                        i2 = uvh0Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        uvh0 uvh0Var15 = uvh0Var8.g;
                        uvh0Var15.getClass();
                        uvh0Var8.d(uvh0Var15, i5);
                        uvh0Var8.a();
                        mwh0.a(uvh0Var8);
                    }
                }
            }
            f99Var.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    @Override // a.u99
    public final boolean G(long j) {
        return this.b >= j;
    }

    public final void H(d99 d99Var) {
        d99Var.getClass();
        byte[] bArr = b.f1743a;
        if (d99Var.f5689a != null) {
            jf4.n("already attached to a buffer");
        } else {
            d99Var.f5689a = this;
            d99Var.b = true;
        }
    }

    @Override // a.u99
    public final String H0(Charset charset) {
        charset.getClass();
        return L(this.b, charset);
    }

    public final long I() throws EOFException {
        long j;
        byte b;
        long j2 = 0;
        if (this.b == 0) {
            c99.f();
            return 0L;
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            uvh0 uvh0Var = this.f9145a;
            uvh0Var.getClass();
            byte[] bArr = uvh0Var.f36348a;
            int i2 = uvh0Var.b;
            int i3 = uvh0Var.c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.f9145a = uvh0Var.a();
                mwh0.a(uvh0Var);
            } else {
                uvh0Var.b = i2;
            }
            if (z2 || this.f9145a == null) {
                long j5 = this.b - ((long) i);
                this.b = j5;
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (j5 != j) {
                    StringBuilder sbT = brm0.t(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                    sbT.append(cy2.J(n(j)));
                    throw new NumberFormatException(sbT.toString());
                }
                long j6 = j;
                c99.f();
                return j6;
            }
            j2 = j;
        }
        f99 f99Var = new f99();
        f99Var.W(j3);
        f99Var.V(b);
        if (!z) {
            f99Var.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(f99Var.O()));
    }

    @Override // a.t99
    public final /* bridge */ /* synthetic */ t99 I0(long j) {
        X(j);
        return this;
    }

    public final short J() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public final String L(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            c99.s(h97.h(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            c99.f();
            return null;
        }
        if (j == 0) {
            return "";
        }
        uvh0 uvh0Var = this.f9145a;
        uvh0Var.getClass();
        int i = uvh0Var.b;
        if (((long) i) + j > uvh0Var.c) {
            return new String(N(j), charset);
        }
        int i2 = (int) j;
        String str = new String(uvh0Var.f36348a, i, i2, charset);
        int i3 = uvh0Var.b + i2;
        uvh0Var.b = i3;
        this.b -= j;
        if (i3 == uvh0Var.c) {
            this.f9145a = uvh0Var.a();
            mwh0.a(uvh0Var);
        }
        return str;
    }

    @Override // a.u99
    public final String M() {
        return A(Long.MAX_VALUE);
    }

    @Override // a.u99
    public final byte[] N(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            c99.s(h97.h(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            c99.f();
            return null;
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // a.t99
    public final /* bridge */ /* synthetic */ t99 N0(qg9 qg9Var) {
        T(qg9Var);
        return this;
    }

    public final String O() {
        return L(this.b, Charsets.UTF_8);
    }

    @Override // a.t99
    public final long P(emk0 emk0Var) {
        emk0Var.getClass();
        long j = 0;
        while (true) {
            long jY = emk0Var.Y(this, 8192L);
            if (jY == -1) {
                return j;
            }
            j += jY;
        }
    }

    public final int Q() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.b == 0) {
            c99.f();
            return 0;
        }
        byte bN = n(0L);
        if ((bN & 128) == 0) {
            i = bN & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bN & 224) == 192) {
            i = bN & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bN & 240) == 224) {
            i = bN & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bN & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bN & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.b < j) {
            StringBuilder sbM = b1j.m(i2, "size < ", ": ");
            sbM.append(this.b);
            sbM.append(" (to read code point prefixed 0x");
            sbM.append(cy2.J(bN));
            sbM.append(')');
            throw new EOFException(sbM.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bN2 = n(j2);
            if ((bN2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bN2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public final qg9 R(int i) {
        if (i == 0) {
            return qg9.d;
        }
        cy2.x(this.b, 0L, i);
        uvh0 uvh0Var = this.f9145a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            uvh0Var.getClass();
            int i5 = uvh0Var.c;
            int i6 = uvh0Var.b;
            if (i5 == i6) {
                c99.l("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            uvh0Var = uvh0Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        uvh0 uvh0Var2 = this.f9145a;
        int i7 = 0;
        while (i2 < i) {
            uvh0Var2.getClass();
            bArr[i7] = uvh0Var2.f36348a;
            i2 += uvh0Var2.c - uvh0Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = uvh0Var2.b;
            uvh0Var2.d = true;
            i7++;
            uvh0Var2 = uvh0Var2.f;
        }
        return new xwh0(bArr, iArr);
    }

    public final uvh0 S(int i) {
        if (i < 1 || i > 8192) {
            jf4.o("unexpected capacity");
            return null;
        }
        uvh0 uvh0Var = this.f9145a;
        if (uvh0Var == null) {
            uvh0 uvh0VarB = mwh0.b();
            this.f9145a = uvh0VarB;
            uvh0VarB.g = uvh0VarB;
            uvh0VarB.f = uvh0VarB;
            return uvh0VarB;
        }
        uvh0 uvh0Var2 = uvh0Var.g;
        uvh0Var2.getClass();
        if (uvh0Var2.c + i <= 8192 && uvh0Var2.e) {
            return uvh0Var2;
        }
        uvh0 uvh0VarB2 = mwh0.b();
        uvh0Var2.b(uvh0VarB2);
        return uvh0VarB2;
    }

    public final void T(qg9 qg9Var) {
        qg9Var.getClass();
        qg9Var.y(this, qg9Var.e());
    }

    public final void U(byte[] bArr, int i) {
        bArr.getClass();
        long j = i;
        cy2.x(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            uvh0 uvh0VarS = S(1);
            int iMin = Math.min(i - i2, 8192 - uvh0VarS.c);
            int i3 = i2 + iMin;
            qx3.f(bArr, uvh0VarS.c, uvh0VarS.f36348a, i2, i3);
            uvh0VarS.c += iMin;
            i2 = i3;
        }
        this.b += j;
    }

    public final void V(int i) {
        uvh0 uvh0VarS = S(1);
        byte[] bArr = uvh0VarS.f36348a;
        int i2 = uvh0VarS.c;
        uvh0VarS.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void W(long j) {
        boolean z;
        if (j == 0) {
            V(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                c0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.f1743a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > b.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        uvh0 uvh0VarS = S(i);
        byte[] bArr2 = uvh0VarS.f36348a;
        int i2 = uvh0VarS.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = b.f1743a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        uvh0VarS.c += i;
        this.b += (long) i;
    }

    public final void X(long j) {
        if (j == 0) {
            V(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        uvh0 uvh0VarS = S(i);
        byte[] bArr = uvh0VarS.f36348a;
        int i2 = uvh0VarS.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.f1743a[(int) (15 & j)];
            j >>>= 4;
        }
        uvh0VarS.c += i;
        this.b += (long) i;
    }

    @Override // a.emk0
    public final long Y(f99 f99Var, long j) {
        f99Var.getClass();
        if (j < 0) {
            c99.s(h97.h(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        f99Var.F0(this, j);
        return j;
    }

    @Override // a.u99
    public final long Y0() throws EOFException {
        int i;
        if (this.b == 0) {
            c99.f();
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            uvh0 uvh0Var = this.f9145a;
            uvh0Var.getClass();
            byte[] bArr = uvh0Var.f36348a;
            int i3 = uvh0Var.b;
            int i4 = uvh0Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(cy2.J(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    f99 f99Var = new f99();
                    f99Var.X(j);
                    f99Var.V(b);
                    throw new NumberFormatException("Number too large: ".concat(f99Var.O()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f9145a = uvh0Var.a();
                mwh0.a(uvh0Var);
            } else {
                uvh0Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.f9145a != null);
        this.b -= (long) i2;
        return j;
    }

    public final void Z(int i) {
        uvh0 uvh0VarS = S(4);
        byte[] bArr = uvh0VarS.f36348a;
        int i2 = uvh0VarS.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        uvh0VarS.c = i2 + 4;
        this.b += 4;
    }

    public final void a() throws EOFException {
        skip(this.b);
    }

    public final void a0(int i) {
        uvh0 uvh0VarS = S(2);
        byte[] bArr = uvh0VarS.f36348a;
        int i2 = uvh0VarS.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        uvh0VarS.c = i2 + 2;
        this.b += 2;
    }

    @Override // a.u99
    public final InputStream a1() {
        return new e99((Closeable) this, (byte) 0);
    }

    public final void b0(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            c99.s(twn.m(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            c99.s(f140.j(i2, "endIndex < beginIndex: ", i, " < "));
            return;
        }
        if (i2 > str.length()) {
            jf4.h(str.length(), b1j.m(i2, "endIndex > string.length: ", " > "));
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                uvh0 uvh0VarS = S(1);
                byte[] bArr = uvh0VarS.f36348a;
                int i3 = uvh0VarS.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = uvh0VarS.c;
                int i6 = (i3 + i) - i5;
                uvh0VarS.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    uvh0 uvh0VarS2 = S(2);
                    byte[] bArr2 = uvh0VarS2.f36348a;
                    int i7 = uvh0VarS2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    uvh0VarS2.c = i7 + 2;
                    this.b += 2;
                } else if (55296 <= cCharAt2 && cCharAt2 < 56320) {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (56320 > cCharAt3 || cCharAt3 >= 57344) {
                        V(63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        uvh0 uvh0VarS3 = S(4);
                        byte[] bArr3 = uvh0VarS3.f36348a;
                        int i10 = uvh0VarS3.c;
                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                        uvh0VarS3.c = i10 + 4;
                        this.b += 4;
                        i += 2;
                    }
                } else if (56320 > cCharAt2 || cCharAt2 >= 57344) {
                    uvh0 uvh0VarS4 = S(3);
                    byte[] bArr4 = uvh0VarS4.f36348a;
                    int i11 = uvh0VarS4.c;
                    bArr4[i11] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr4[i11 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr4[i11 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    uvh0VarS4.c = i11 + 3;
                    this.b += 3;
                } else {
                    V(63);
                }
                i++;
            }
        }
    }

    public final long c() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        uvh0 uvh0Var = this.f9145a;
        uvh0Var.getClass();
        uvh0 uvh0Var2 = uvh0Var.g;
        uvh0Var2.getClass();
        int i = uvh0Var2.c;
        return (i >= 8192 || !uvh0Var2.e) ? j : j - ((long) (i - uvh0Var2.b));
    }

    public final void c0(String str) {
        str.getClass();
        b0(0, str.length(), str);
    }

    public final Object clone() {
        return d();
    }

    public final f99 d() {
        f99 f99Var = new f99();
        if (this.b == 0) {
            return f99Var;
        }
        uvh0 uvh0Var = this.f9145a;
        uvh0Var.getClass();
        uvh0 uvh0VarC = uvh0Var.c();
        f99Var.f9145a = uvh0VarC;
        uvh0VarC.g = uvh0VarC;
        uvh0VarC.f = uvh0VarC;
        for (uvh0 uvh0Var2 = uvh0Var.f; uvh0Var2 != uvh0Var; uvh0Var2 = uvh0Var2.f) {
            uvh0 uvh0Var3 = uvh0VarC.g;
            uvh0Var3.getClass();
            uvh0Var2.getClass();
            uvh0Var3.b(uvh0Var2.c());
        }
        f99Var.b = this.b;
        return f99Var;
    }

    public final void e(f99 f99Var, long j, long j2) {
        f99Var.getClass();
        long j3 = j;
        cy2.x(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        f99Var.b += j2;
        uvh0 uvh0Var = this.f9145a;
        while (true) {
            uvh0Var.getClass();
            long j4 = uvh0Var.c - uvh0Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            uvh0Var = uvh0Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            uvh0Var.getClass();
            uvh0 uvh0VarC = uvh0Var.c();
            int i = uvh0VarC.b + ((int) j3);
            uvh0VarC.b = i;
            uvh0VarC.c = Math.min(i + ((int) j5), uvh0VarC.c);
            uvh0 uvh0Var2 = f99Var.f9145a;
            if (uvh0Var2 == null) {
                uvh0VarC.g = uvh0VarC;
                uvh0VarC.f = uvh0VarC;
                f99Var.f9145a = uvh0VarC;
            } else {
                uvh0 uvh0Var3 = uvh0Var2.g;
                uvh0Var3.getClass();
                uvh0Var3.b(uvh0VarC);
            }
            j5 -= (long) (uvh0VarC.c - uvh0VarC.b);
            uvh0Var = uvh0Var.f;
            j3 = 0;
        }
    }

    public final void e0(int i) {
        if (i < 128) {
            V(i);
            return;
        }
        if (i < 2048) {
            uvh0 uvh0VarS = S(2);
            byte[] bArr = uvh0VarS.f36348a;
            int i2 = uvh0VarS.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            uvh0VarS.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            V(63);
            return;
        }
        if (i < 65536) {
            uvh0 uvh0VarS2 = S(3);
            byte[] bArr2 = uvh0VarS2.f36348a;
            int i3 = uvh0VarS2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            uvh0VarS2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            jf4.o("Unexpected code point: 0x".concat(cy2.K(i)));
            return;
        }
        uvh0 uvh0VarS3 = S(4);
        byte[] bArr3 = uvh0VarS3.f36348a;
        int i4 = uvh0VarS3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        uvh0VarS3.c = i4 + 4;
        this.b += 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f99)) {
            return false;
        }
        long j = this.b;
        f99 f99Var = (f99) obj;
        if (j != f99Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        uvh0 uvh0Var = this.f9145a;
        uvh0Var.getClass();
        uvh0 uvh0Var2 = f99Var.f9145a;
        uvh0Var2.getClass();
        int i = uvh0Var.b;
        int i2 = uvh0Var2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(uvh0Var.c - i, uvh0Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (uvh0Var.f36348a[i] != uvh0Var2.f36348a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == uvh0Var.c) {
                uvh0Var = uvh0Var.f;
                uvh0Var.getClass();
                i = uvh0Var.b;
            }
            if (i2 == uvh0Var2.c) {
                uvh0Var2 = uvh0Var2.f;
                uvh0Var2.getClass();
                i2 = uvh0Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // a.emk0
    public final fmq0 h() {
        return fmq0.d;
    }

    @Override // a.u99
    public final void h0(long j) throws EOFException {
        if (this.b >= j) {
            return;
        }
        c99.f();
    }

    public final int hashCode() {
        uvh0 uvh0Var = this.f9145a;
        if (uvh0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = uvh0Var.c;
            for (int i3 = uvh0Var.b; i3 < i2; i3++) {
                i = (i * 31) + uvh0Var.f36348a[i3];
            }
            uvh0Var = uvh0Var.f;
            uvh0Var.getClass();
        } while (uvh0Var != this.f9145a);
        return i;
    }

    @Override // a.t99
    public final /* bridge */ /* synthetic */ t99 i0(long j) {
        W(j);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // a.u99
    public final boolean m0(long j, qg9 qg9Var) {
        qg9Var.getClass();
        return F(qg9Var.e(), j, qg9Var);
    }

    public final byte n(long j) {
        cy2.x(this.b, j, 1L);
        uvh0 uvh0Var = this.f9145a;
        uvh0Var.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                uvh0Var = uvh0Var.g;
                uvh0Var.getClass();
                j2 -= (long) (uvh0Var.c - uvh0Var.b);
            }
            return uvh0Var.f36348a[(int) ((((long) uvh0Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = uvh0Var.c;
            int i2 = uvh0Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return uvh0Var.f36348a[(int) ((((long) i2) + j) - j3)];
            }
            uvh0Var = uvh0Var.f;
            uvh0Var.getClass();
            j3 = j4;
        }
    }

    @Override // a.u99
    public final int o0(z680 z680Var) throws EOFException {
        z680Var.getClass();
        int iD = b.d(this, z680Var, false);
        if (iD == -1) {
            return -1;
        }
        skip(z680Var.b[iD].e());
        return iD;
    }

    @Override // a.u99
    public final qg9 q0(long j) {
        if (j < 0 || j > 2147483647L) {
            c99.s(h97.h(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            c99.f();
            return null;
        }
        if (j < 4096) {
            return new qg9(N(j));
        }
        qg9 qg9VarR = R((int) j);
        skip(j);
        return qg9VarR;
    }

    public final long r(byte b, long j, long j2) {
        uvh0 uvh0Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.b);
            kng0.A(sb, " fromIndex=", j, " toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j4 = this.b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (uvh0Var = this.f9145a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                uvh0Var = uvh0Var.g;
                uvh0Var.getClass();
                j4 -= (long) (uvh0Var.c - uvh0Var.b);
            }
            while (j4 < j2) {
                byte[] bArr = uvh0Var.f36348a;
                int iMin = (int) Math.min(uvh0Var.c, (((long) uvh0Var.b) + j2) - j4);
                for (int i = (int) ((((long) uvh0Var.b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - uvh0Var.b)) + j4;
                    }
                }
                j4 += (long) (uvh0Var.c - uvh0Var.b);
                uvh0Var = uvh0Var.f;
                uvh0Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (uvh0Var.c - uvh0Var.b)) + j3;
            if (j5 > j) {
                break;
            }
            uvh0Var = uvh0Var.f;
            uvh0Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = uvh0Var.f36348a;
            int iMin2 = (int) Math.min(uvh0Var.c, (((long) uvh0Var.b) + j2) - j3);
            for (int i2 = (int) ((((long) uvh0Var.b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - uvh0Var.b)) + j3;
                }
            }
            j3 += (long) (uvh0Var.c - uvh0Var.b);
            uvh0Var = uvh0Var.f;
            uvh0Var.getClass();
            j = j3;
        }
        return -1L;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        cy2.x(bArr.length, i, i2);
        uvh0 uvh0Var = this.f9145a;
        if (uvh0Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, uvh0Var.c - uvh0Var.b);
        byte[] bArr2 = uvh0Var.f36348a;
        int i3 = uvh0Var.b;
        qx3.f(bArr2, i, bArr, i3, i3 + iMin);
        int i4 = uvh0Var.b + iMin;
        uvh0Var.b = i4;
        this.b -= (long) iMin;
        if (i4 == uvh0Var.c) {
            this.f9145a = uvh0Var.a();
            mwh0.a(uvh0Var);
        }
        return iMin;
    }

    @Override // a.u99
    public final byte readByte() {
        if (this.b == 0) {
            c99.f();
            return (byte) 0;
        }
        uvh0 uvh0Var = this.f9145a;
        uvh0Var.getClass();
        int i = uvh0Var.b;
        int i2 = uvh0Var.c;
        int i3 = i + 1;
        byte b = uvh0Var.f36348a[i];
        this.b--;
        if (i3 != i2) {
            uvh0Var.b = i3;
            return b;
        }
        this.f9145a = uvh0Var.a();
        mwh0.a(uvh0Var);
        return b;
    }

    @Override // a.u99
    public final void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                c99.f();
                return;
            }
            i += i2;
        }
    }

    @Override // a.u99
    public final int readInt() throws EOFException {
        if (this.b < 4) {
            c99.f();
            return 0;
        }
        uvh0 uvh0Var = this.f9145a;
        uvh0Var.getClass();
        int i = uvh0Var.b;
        int i2 = uvh0Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = uvh0Var.f36348a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 != i2) {
            uvh0Var.b = i5;
            return i6;
        }
        this.f9145a = uvh0Var.a();
        mwh0.a(uvh0Var);
        return i6;
    }

    @Override // a.u99
    public final long readLong() throws EOFException {
        if (this.b < 8) {
            c99.f();
            return 0L;
        }
        uvh0 uvh0Var = this.f9145a;
        uvh0Var.getClass();
        int i = uvh0Var.b;
        int i2 = uvh0Var.c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = uvh0Var.f36348a;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.b -= 8;
        if (i4 != i2) {
            uvh0Var.b = i4;
            return j2;
        }
        this.f9145a = uvh0Var.a();
        mwh0.a(uvh0Var);
        return j2;
    }

    @Override // a.u99
    public final short readShort() throws EOFException {
        if (this.b < 2) {
            c99.f();
            return (short) 0;
        }
        uvh0 uvh0Var = this.f9145a;
        uvh0Var.getClass();
        int i = uvh0Var.b;
        int i2 = uvh0Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = uvh0Var.f36348a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.f9145a = uvh0Var.a();
            mwh0.a(uvh0Var);
        } else {
            uvh0Var.b = i5;
        }
        return (short) i6;
    }

    @Override // a.u99
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            uvh0 uvh0Var = this.f9145a;
            if (uvh0Var == null) {
                c99.f();
                return;
            }
            int iMin = (int) Math.min(j, uvh0Var.c - uvh0Var.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = uvh0Var.b + iMin;
            uvh0Var.b = i;
            if (i == uvh0Var.c) {
                this.f9145a = uvh0Var.a();
                mwh0.a(uvh0Var);
            }
        }
    }

    @Override // a.u99
    public final byte[] t0() {
        return N(this.b);
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return R((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    @Override // a.u99
    public final long u(t99 t99Var) {
        long j = this.b;
        if (j > 0) {
            t99Var.F0(this, j);
        }
        return j;
    }

    public final long v(long j, qg9 qg9Var) {
        qg9Var.getClass();
        long j2 = 0;
        if (j < 0) {
            c99.s(h97.h(j, "fromIndex < 0: "));
            return 0L;
        }
        uvh0 uvh0Var = this.f9145a;
        if (uvh0Var == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                uvh0Var = uvh0Var.g;
                uvh0Var.getClass();
                j3 -= (long) (uvh0Var.c - uvh0Var.b);
            }
            if (qg9Var.e() == 2) {
                byte bL = qg9Var.l(0);
                byte bL2 = qg9Var.l(1);
                while (j3 < this.b) {
                    byte[] bArr = uvh0Var.f36348a;
                    int i = uvh0Var.c;
                    for (int i2 = (int) ((((long) uvh0Var.b) + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bL || b == bL2) {
                            return ((long) (i2 - uvh0Var.b)) + j3;
                        }
                    }
                    j3 += (long) (uvh0Var.c - uvh0Var.b);
                    uvh0Var = uvh0Var.f;
                    uvh0Var.getClass();
                    j = j3;
                }
            } else {
                byte[] bArrK = qg9Var.k();
                while (j3 < this.b) {
                    byte[] bArr2 = uvh0Var.f36348a;
                    int i3 = uvh0Var.c;
                    for (int i4 = (int) ((((long) uvh0Var.b) + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrK) {
                            if (b2 == b3) {
                                return ((long) (i4 - uvh0Var.b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (uvh0Var.c - uvh0Var.b);
                    uvh0Var = uvh0Var.f;
                    uvh0Var.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (uvh0Var.c - uvh0Var.b)) + j2;
            if (j4 > j) {
                break;
            }
            uvh0Var = uvh0Var.f;
            uvh0Var.getClass();
            j2 = j4;
        }
        if (qg9Var.e() == 2) {
            byte bL3 = qg9Var.l(0);
            byte bL4 = qg9Var.l(1);
            while (j2 < this.b) {
                byte[] bArr3 = uvh0Var.f36348a;
                int i5 = uvh0Var.c;
                for (int i6 = (int) ((((long) uvh0Var.b) + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bL3 || b4 == bL4) {
                        return ((long) (i6 - uvh0Var.b)) + j2;
                    }
                }
                j2 += (long) (uvh0Var.c - uvh0Var.b);
                uvh0Var = uvh0Var.f;
                uvh0Var.getClass();
                j = j2;
            }
        } else {
            byte[] bArrK2 = qg9Var.k();
            while (j2 < this.b) {
                byte[] bArr4 = uvh0Var.f36348a;
                int i7 = uvh0Var.c;
                for (int i8 = (int) ((((long) uvh0Var.b) + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrK2) {
                        if (b5 == b6) {
                            return ((long) (i8 - uvh0Var.b)) + j2;
                        }
                    }
                }
                j2 += (long) (uvh0Var.c - uvh0Var.b);
                uvh0Var = uvh0Var.f;
                uvh0Var.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    @Override // a.u99
    public final boolean v0() {
        return this.b == 0;
    }

    public final long w(qg9 qg9Var) {
        qg9Var.getClass();
        return v(0L, qg9Var);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            uvh0 uvh0VarS = S(1);
            int iMin = Math.min(i, 8192 - uvh0VarS.c);
            byteBuffer.get(uvh0VarS.f36348a, uvh0VarS.c, iMin);
            i -= iMin;
            uvh0VarS.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // a.t99
    public final /* bridge */ /* synthetic */ t99 writeByte(int i) {
        V(i);
        return this;
    }

    @Override // a.t99
    public final /* bridge */ /* synthetic */ t99 writeInt(int i) {
        Z(i);
        return this;
    }

    @Override // a.t99
    public final /* bridge */ /* synthetic */ t99 writeShort(int i) {
        a0(i);
        return this;
    }

    public final zae0 x() {
        return new zae0(new sb90(this));
    }

    @Override // a.u99
    public final long y0(long j, qg9 qg9Var) {
        qg9Var.getClass();
        byte[] bArr = b.f1743a;
        return b.a(this, qg9Var, 0L, j, qg9Var.e());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, a.s5k0
    public final void close() {
    }

    @Override // a.t99, a.s5k0, java.io.Flushable
    public final void flush() {
    }

    @Override // a.u99, a.t99
    public final f99 g() {
        return this;
    }

    @Override // a.t99
    public final /* bridge */ /* synthetic */ t99 write(byte[] bArr) {
        m1write(bArr);
        return this;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m1write(byte[] bArr) {
        bArr.getClass();
        U(bArr, bArr.length);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        uvh0 uvh0Var = this.f9145a;
        if (uvh0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), uvh0Var.c - uvh0Var.b);
        byteBuffer.put(uvh0Var.f36348a, uvh0Var.b, iMin);
        int i = uvh0Var.b + iMin;
        uvh0Var.b = i;
        this.b -= (long) iMin;
        if (i == uvh0Var.c) {
            this.f9145a = uvh0Var.a();
            mwh0.a(uvh0Var);
        }
        return iMin;
    }
}
