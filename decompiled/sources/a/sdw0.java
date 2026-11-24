package a;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class sdw0 extends tdw0 {
    public final InputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public /* synthetic */ sdw0(InputStream inputStream, int i) {
        this.d = inputStream;
        this.e = new byte[i < 8 ? 8 : i];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    @Override // a.tdw0
    public final long B() {
        return e0();
    }

    @Override // a.tdw0
    public final long D() {
        return e0();
    }

    @Override // a.tdw0
    public final int E() {
        return c0();
    }

    @Override // a.tdw0
    public final long G() {
        return n0();
    }

    @Override // a.tdw0
    public final int H() {
        return m0();
    }

    @Override // a.tdw0
    public final boolean J() {
        return e0() != 0;
    }

    @Override // a.tdw0
    public final String L() throws zew0 {
        int iC0 = c0();
        byte[] bArr = this.e;
        if (iC0 > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iC0 <= i - i2) {
                String str = new String(bArr, i2, iC0, StandardCharsets.UTF_8);
                this.h += iC0;
                return str;
            }
        }
        if (iC0 == 0) {
            return "";
        }
        if (iC0 < 0) {
            itt0.x("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (iC0 > this.f) {
            return new String(i0(iC0), StandardCharsets.UTF_8);
        }
        g0(iC0);
        String str2 = new String(bArr, this.h, iC0, StandardCharsets.UTF_8);
        this.h += iC0;
        return str2;
    }

    @Override // a.tdw0
    public final String M() throws IOException {
        int iC0 = c0();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrI0 = this.e;
        if (iC0 <= i3 && iC0 > 0) {
            this.h = i + iC0;
        } else {
            if (iC0 == 0) {
                return "";
            }
            if (iC0 < 0) {
                itt0.x("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (iC0 <= i2) {
                g0(iC0);
                this.h = iC0;
            } else {
                bArrI0 = i0(iC0);
            }
        }
        return sgw0.d(bArrI0, i, iC0);
    }

    @Override // a.tdw0
    public final pdw0 O() throws IOException {
        int iC0 = c0();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iC0 <= i3 && iC0 > 0) {
            pdw0 pdw0VarL = qdw0.l(bArr, i2, iC0);
            this.h += iC0;
            return pdw0VarL;
        }
        if (iC0 == 0) {
            return qdw0.b;
        }
        if (iC0 < 0) {
            itt0.x("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] bArrJ0 = j0(iC0);
        if (bArrJ0 != null) {
            return qdw0.l(bArrJ0, 0, bArrJ0.length);
        }
        int i4 = this.h;
        int i5 = this.f;
        int i6 = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListK0 = k0(iC0 - i6);
        byte[] bArr2 = new byte[iC0];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        for (byte[] bArr3 : arrayListK0) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        try {
            pdw0 pdw0Var = qdw0.b;
            return iC0 == 0 ? qdw0.b : new pdw0(bArr2);
        } catch (zew0 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // a.tdw0
    public final byte[] Q() throws zew0 {
        int iC0 = c0();
        int i = this.f;
        int i2 = this.h;
        if (iC0 <= i - i2 && iC0 > 0) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.e, i2, i2 + iC0);
            this.h += iC0;
            return bArrCopyOfRange;
        }
        if (iC0 >= 0) {
            return i0(iC0);
        }
        itt0.x("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // a.tdw0
    public final int R() {
        return c0();
    }

    @Override // a.tdw0
    public final int T() {
        return c0();
    }

    @Override // a.tdw0
    public final int V() {
        return m0();
    }

    @Override // a.tdw0
    public final long X() {
        return n0();
    }

    @Override // a.tdw0
    public final int Z() {
        return tdw0.j(c0());
    }

    @Override // a.tdw0
    public final int a(int i) throws zew0 {
        if (i < 0) {
            itt0.x("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            itt0.x("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.k;
        if (i2 > i3) {
            itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.k = i2;
        f0();
        return i3;
    }

    @Override // a.tdw0
    public final long a0() {
        return tdw0.k(e0());
    }

    @Override // a.tdw0
    public final void b(int i) {
        this.k = i;
        f0();
    }

    @Override // a.tdw0
    public final int c() {
        int i = this.k;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.j + this.h);
    }

    @Override // a.tdw0
    public final int c0() {
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
        return (int) l0();
    }

    @Override // a.tdw0
    public final boolean d() {
        return this.h == this.f && !h0(1);
    }

    @Override // a.tdw0
    public final int e() {
        return this.j + this.h;
    }

    @Override // a.tdw0
    public final long e0() {
        long j;
        long j2;
        long j3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i8]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (((long) bArr[i6]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (((long) bArr[i6]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (((long) bArr[i6]) << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.h = i4;
                return j;
            }
        }
        return l0();
    }

    @Override // a.tdw0
    public final int f(byte[] bArr, int i, int i2) throws IOException {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f;
        int i4 = this.h;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int iMin = Math.min(i2, i5);
            System.arraycopy(this.e, this.h, bArr, i, iMin);
            this.h += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i2, (this.k - this.j) - i4);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i6 = this.d.read(bArr, i, iMin2);
            if (i6 != -1) {
                this.j += i6;
            }
            return i6;
        } catch (zew0 e) {
            e.f44274a = true;
            throw e;
        }
    }

    public final void f0() {
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
    public final void g(int i) throws zew0 {
        InputStream inputStream = this.d;
        int i2 = this.f;
        int i3 = this.h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        if (i < 0) {
            itt0.x("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.j;
        int i6 = i5 + i3;
        int i7 = this.k;
        if (i6 + i > i7) {
            g((i7 - i5) - i3);
            itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.j = i6;
        this.f = 0;
        this.h = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (zew0 e) {
                    e.f44274a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i4;
                f0();
                throw th;
            }
        }
        this.j += i4;
        f0();
        if (i4 >= i) {
            return;
        }
        int i8 = this.f;
        int i9 = i8 - this.h;
        this.h = i8;
        g0(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f;
            if (i10 <= i11) {
                this.h = i10;
                return;
            } else {
                i9 += i11;
                this.h = i11;
                g0(1);
            }
        }
    }

    public final void g0(int i) throws zew0 {
        if (h0(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.j) - this.h) {
            itt0.x("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean h0(int i) throws IOException {
        InputStream inputStream = this.d;
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 <= i4) {
            jf4.n(vqd.p(new StringBuilder(String.valueOf(i).length() + 66), "refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.j;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.k) {
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.j + i2;
                this.j = i5;
                i4 = this.f - i2;
                this.f = i4;
                this.h = 0;
            }
            try {
                int i6 = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    String strValueOf = String.valueOf(inputStream.getClass());
                    jf4.n(brm0.j(i6, strValueOf, "#read(byte[]) returned invalid result: ", "\nThe InputStream implementation is buggy.", new StringBuilder(String.valueOf(i6).length() + strValueOf.length() + 39 + 41)));
                    return false;
                }
                if (i6 > 0) {
                    this.f += i6;
                    f0();
                    if (this.f >= i || h0(i)) {
                        return true;
                    }
                }
            } catch (zew0 e) {
                e.f44274a = true;
                throw e;
            }
        }
        return false;
    }

    public final byte[] i0(int i) throws IOException {
        byte[] bArrJ0 = j0(i);
        if (bArrJ0 != null) {
            return bArrJ0;
        }
        int i2 = this.h;
        int i3 = this.f;
        int i4 = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListK0 = k0(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, i4);
        for (byte[] bArr2 : arrayListK0) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] j0(int i) throws IOException {
        if (i == 0) {
            return vew0.f37305a;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            itt0.x("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.k;
        if (i4 > i5) {
            g((i5 - i2) - i3);
            itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        InputStream inputStream = this.d;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (zew0 e) {
                e.f44274a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i6);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.j += i8;
                i6 += i8;
            } catch (zew0 e2) {
                e2.f44274a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList k0(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.j += i3;
                    i2 += i3;
                } catch (zew0 e) {
                    e.f44274a = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final long l0() throws zew0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                g0(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            byte b = this.e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        itt0.x("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // a.tdw0
    public final int m() throws zew0 {
        if (d()) {
            this.i = 0;
            return 0;
        }
        int iC0 = c0();
        this.i = iC0;
        if ((iC0 >>> 3) != 0) {
            return iC0;
        }
        itt0.x("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public final int m0() throws zew0 {
        int i = this.h;
        if (this.f - i < 4) {
            g0(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long n0() throws zew0 {
        int i = this.h;
        if (this.f - i < 8) {
            g0(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // a.tdw0
    public final void r(int i) throws zew0 {
        if (this.i == i) {
            return;
        }
        itt0.x("Protocol message end-group tag did not match expected tag.");
    }

    @Override // a.tdw0
    public final boolean u(int i) throws zew0 {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                g(8);
                return true;
            }
            if (i2 == 2) {
                g(c0());
                return true;
            }
            if (i2 == 3) {
                i();
                r(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    r(0);
                }
                return false;
            }
            if (i2 == 5) {
                g(4);
                return true;
            }
            itt0.p();
            return false;
        }
        int i3 = this.f - this.h;
        byte[] bArr = this.e;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            itt0.x("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.h == this.f) {
                g0(1);
            }
            int i7 = this.h;
            this.h = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        itt0.x("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // a.tdw0
    public final double v() {
        return Double.longBitsToDouble(n0());
    }

    @Override // a.tdw0
    public final float y() {
        return Float.intBitsToFloat(m0());
    }
}
