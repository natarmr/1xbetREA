package a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class r89 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f30014a;
    public int b;
    public int c;
    public final k7m0 d;

    public r89(InputStream inputStream) throws IOException {
        k7m0 k7m0Var = new k7m0();
        this.d = k7m0Var;
        if (inputStream == null) {
            jf4.o("source is null");
            throw null;
        }
        this.f30014a = new byte[16384];
        this.b = 0;
        this.c = 0;
        try {
            k7m0.a(k7m0Var, inputStream);
        } catch (s89 e) {
            csj.c("Brotli decoder initialization failed", e);
            throw null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        k7m0 k7m0Var = this.d;
        int i = k7m0Var.f17830a;
        if (i == 0) {
            jf4.n("State MUST be initialized");
            return;
        }
        if (i == 11) {
            return;
        }
        k7m0Var.f17830a = 11;
        s68 s68Var = k7m0Var.c;
        InputStream inputStream = s68Var.d;
        s68Var.d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        k7m0 k7m0Var = this.d;
        if (i < 0) {
            jf4.o(twn.m(i, "Bad offset: "));
            return 0;
        }
        if (i2 < 0) {
            jf4.o(twn.m(i2, "Bad length: "));
            return 0;
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            StringBuilder sbM = b1j.m(i3, "Buffer overflow: ", " > ");
            sbM.append(bArr.length);
            throw new IllegalArgumentException(sbM.toString());
        }
        if (i2 == 0) {
            return 0;
        }
        int iMax = Math.max(this.b - this.c, 0);
        if (iMax != 0) {
            iMax = Math.min(iMax, i2);
            System.arraycopy(this.f30014a, this.c, bArr, i, iMax);
            this.c += iMax;
            i += iMax;
            i2 -= iMax;
            if (i2 == 0) {
                return iMax;
            }
        }
        try {
            k7m0Var.Y = bArr;
            k7m0Var.T = i;
            k7m0Var.U = i2;
            k7m0Var.V = 0;
            epv0.T(k7m0Var);
            int i4 = k7m0Var.V;
            if (i4 == 0) {
                return -1;
            }
            return i4 + iMax;
        } catch (s89 e) {
            csj.c("Brotli stream decoding failed", e);
            return 0;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.c;
        int i2 = this.b;
        byte[] bArr = this.f30014a;
        if (i >= i2) {
            int i3 = read(bArr, 0, bArr.length);
            this.b = i3;
            this.c = 0;
            if (i3 == -1) {
                return -1;
            }
            i = 0;
        }
        this.c = i + 1;
        return bArr[i] & 255;
    }
}
