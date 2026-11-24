package a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class xjw0 extends tdw0 {
    public final ByteArrayInputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public xjw0(ByteArrayInputStream byteArrayInputStream) {
        byte[] bArr = lkw0.f20222a;
        this.d = byteArrayInputStream;
        this.e = new byte[4096];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    public static boolean f0(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    @Override // a.tdw0
    public final int A() {
        return h0();
    }

    @Override // a.tdw0
    public final int C() {
        return r0();
    }

    @Override // a.tdw0
    public final int E() {
        int iH0 = h0();
        return (-(iH0 & 1)) ^ (iH0 >>> 1);
    }

    @Override // a.tdw0
    public final int F() throws qkw0 {
        if (b0()) {
            this.i = 0;
            return 0;
        }
        int iH0 = h0();
        this.i = iH0;
        if ((iH0 >>> 3) != 0) {
            return iH0;
        }
        throw qkw0.b();
    }

    @Override // a.tdw0
    public final int H() {
        return h0();
    }

    @Override // a.tdw0
    public final long I() {
        return i0();
    }

    @Override // a.tdw0
    public final long K() {
        return j0();
    }

    @Override // a.tdw0
    public final long N() {
        return i0();
    }

    @Override // a.tdw0
    public final long P() {
        return tdw0.n(j0());
    }

    @Override // a.tdw0
    public final long S() {
        return j0();
    }

    @Override // a.tdw0
    public final vjw0 U() throws IOException {
        int iH0 = h0();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iH0 <= i3 && iH0 > 0) {
            vjw0 vjw0VarL = sjw0.l(bArr, i2, iH0);
            this.h += iH0;
            return vjw0VarL;
        }
        if (iH0 == 0) {
            return sjw0.b;
        }
        if (iH0 < 0) {
            throw qkw0.f();
        }
        byte[] bArrP0 = p0(iH0);
        if (bArrP0 != null) {
            return sjw0.l(bArrP0, 0, bArrP0.length);
        }
        int i4 = this.h;
        int i5 = this.f;
        int length = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListL0 = l0(iH0 - length);
        byte[] bArr2 = new byte[iH0];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListL0) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        try {
            vjw0 vjw0Var = sjw0.b;
            return iH0 == 0 ? sjw0.b : new vjw0(bArr2);
        } catch (qkw0 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // a.tdw0
    public final String W() throws qkw0 {
        int iH0 = h0();
        byte[] bArr = this.e;
        if (iH0 > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iH0 <= i - i2) {
                String str = new String(bArr, i2, iH0, StandardCharsets.UTF_8);
                this.h += iH0;
                return str;
            }
        }
        if (iH0 == 0) {
            return "";
        }
        if (iH0 < 0) {
            throw qkw0.f();
        }
        if (iH0 > this.f) {
            return new String(g0(iH0), StandardCharsets.UTF_8);
        }
        m0(iH0);
        String str2 = new String(bArr, this.h, iH0, StandardCharsets.UTF_8);
        this.h += iH0;
        return str2;
    }

    @Override // a.tdw0
    public final String Y() throws IOException {
        int iH0 = h0();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrG0 = this.e;
        if (iH0 <= i3 && iH0 > 0) {
            this.h = i + iH0;
        } else {
            if (iH0 == 0) {
                return "";
            }
            if (iH0 < 0) {
                throw qkw0.f();
            }
            i = 0;
            if (iH0 <= i2) {
                m0(iH0);
                this.h = iH0;
            } else {
                bArrG0 = g0(iH0);
            }
        }
        return dqm0.J(bArrG0, i, iH0);
    }

    @Override // a.tdw0
    public final boolean b0() {
        return this.h == this.f && !o0(1);
    }

    @Override // a.tdw0
    public final boolean d0() {
        return j0() != 0;
    }

    public final byte[] g0(int i) throws IOException {
        byte[] bArrP0 = p0(i);
        if (bArrP0 != null) {
            return bArrP0;
        }
        int i2 = this.h;
        int i3 = this.f;
        int length = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListL0 = l0(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListL0) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final int h0() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.h = i5;
                return i;
            }
        }
        return (int) q0();
    }

    public final long i0() throws qkw0 {
        int i = this.h;
        if (this.f - i < 8) {
            m0(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final long j0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j2 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            j6 = j7 ^ (((long) bArr[i8]) << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i10 = i + 10;
                                                long j8 = (((long) bArr[i4]) << 63) ^ j6;
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                    i4 = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j4 = j3 ^ j7;
                            }
                            j = j2 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.h = i4;
                return j;
            }
        }
        return q0();
    }

    public final void k0() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    @Override // a.tdw0
    public final double l() {
        return Double.longBitsToDouble(i0());
    }

    public final ArrayList l0(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw qkw0.h();
                    }
                    this.j += i3;
                    i2 += i3;
                } catch (qkw0 e) {
                    e.f28907a = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void m0(int i) throws qkw0 {
        if (o0(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.j) - this.h) {
            throw qkw0.h();
        }
        throw new qkw0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void n0(int i) throws qkw0 {
        ByteArrayInputStream byteArrayInputStream = this.d;
        int i2 = this.f;
        int i3 = this.h;
        if (i <= i2 - i3 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        if (i < 0) {
            throw qkw0.f();
        }
        int i4 = this.j + i3;
        if (f0(i4, i, Integer.MAX_VALUE)) {
            throw new qkw0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        if (f0(i4, i, this.k)) {
            int i5 = this.k;
            if (i5 >= i4) {
                n0(i5 - i4);
            }
            throw qkw0.h();
        }
        int i6 = this.j;
        int i7 = this.h;
        this.j = i6 + i7;
        int i8 = this.f - i7;
        this.f = 0;
        this.h = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i8 += (int) jSkip;
                        }
                    } else {
                        throw new IllegalStateException(String.valueOf(byteArrayInputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (qkw0 e) {
                    e.f28907a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i8;
                k0();
                throw th;
            }
        }
        this.j += i8;
        k0();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f;
        int i10 = i9 - this.h;
        this.h = i9;
        m0(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f;
            if (i11 <= i12) {
                this.h = i11;
                return;
            } else {
                i10 += i12;
                this.h = i12;
                m0(1);
            }
        }
    }

    public final boolean o0(int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.d;
        int i2 = this.h;
        if (i2 + i <= this.f) {
            jf4.n(ua80.e(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i3 = this.j + i2;
        if (!f0(i3, i, Integer.MAX_VALUE) && !f0(i3, i, this.k)) {
            int i4 = this.h;
            byte[] bArr = this.e;
            if (i4 > 0) {
                int i5 = this.f;
                if (i5 > i4) {
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.j += i4;
                this.f -= i4;
                this.h = 0;
            }
            int i6 = this.f;
            try {
                int i7 = byteArrayInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.j) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(String.valueOf(byteArrayInputStream.getClass()) + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f += i7;
                    k0();
                    if (this.f >= i || o0(i)) {
                        return true;
                    }
                }
            } catch (qkw0 e) {
                e.f28907a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // a.tdw0
    public final float p() {
        return Float.intBitsToFloat(r0());
    }

    public final byte[] p0(int i) throws IOException {
        if (i == 0) {
            return lkw0.f20222a;
        }
        if (i < 0) {
            throw qkw0.f();
        }
        int i2 = this.j + this.h;
        if (f0(i2, i, Integer.MAX_VALUE)) {
            throw new qkw0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        if (f0(i2, i, this.k)) {
            int i3 = this.k;
            if (i3 >= i2) {
                n0(i3 - i2);
            }
            throw qkw0.h();
        }
        int i4 = this.f - this.h;
        int i5 = i - i4;
        ByteArrayInputStream byteArrayInputStream = this.d;
        if (i5 >= 4096) {
            try {
                if (i5 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (qkw0 e) {
                e.f28907a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i4);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i4 < i) {
            try {
                int i6 = byteArrayInputStream.read(bArr, i4, i - i4);
                if (i6 == -1) {
                    throw qkw0.h();
                }
                this.j += i6;
                i4 += i6;
            } catch (qkw0 e2) {
                e2.f28907a = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // a.tdw0
    public final int q(int i) throws qkw0 {
        if (i < 0) {
            throw qkw0.f();
        }
        int i2 = this.j + this.h;
        if (i > Integer.MAX_VALUE - i2) {
            throw new qkw0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        if (f0(i2, i, this.k)) {
            throw qkw0.h();
        }
        int i3 = this.k;
        this.k = i2 + i;
        k0();
        return i3;
    }

    public final long q0() throws qkw0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                m0(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            byte b = this.e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw qkw0.e();
    }

    public final int r0() throws qkw0 {
        int i = this.h;
        if (this.f - i < 4) {
            m0(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // a.tdw0
    public final int s() {
        return this.j + this.h;
    }

    @Override // a.tdw0
    public final void t(int i) throws qkw0 {
        if (this.i != i) {
            throw new qkw0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // a.tdw0
    public final int w() {
        return h0();
    }

    @Override // a.tdw0
    public final void x(int i) {
        this.k = i;
        k0();
    }

    @Override // a.tdw0
    public final int z() {
        return r0();
    }
}
