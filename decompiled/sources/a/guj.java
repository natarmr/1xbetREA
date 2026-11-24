package a;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class guj implements guo {
    public final bbj b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f11931a = new byte[4096];

    static {
        hn30.a("media3.extractor");
    }

    public guj(bbj bbjVar, long j, long j2) {
        this.b = bbjVar;
        this.d = j;
        this.c = j2;
    }

    @Override // a.guo
    public final boolean a(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        q(iMin);
        int iP = iMin;
        while (iP < i && iP != -1) {
            byte[] bArr = this.f11931a;
            iP = p(bArr, -iP, Math.min(i, bArr.length + iP), iP, z);
        }
        if (iP != -1) {
            this.d += (long) iP;
        }
        return iP != -1;
    }

    @Override // a.guo
    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        if (!f(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public final boolean f(int i, boolean z) throws EOFException, InterruptedIOException {
        o(i);
        int iP = this.g - this.f;
        while (iP < i) {
            guj gujVar = this;
            int i2 = i;
            boolean z2 = z;
            iP = gujVar.p(this.e, this.f, i2, iP, z2);
            if (iP == -1) {
                return false;
            }
            gujVar.g = gujVar.f + iP;
            this = gujVar;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    @Override // a.guo
    public final void g() {
        this.f = 0;
    }

    @Override // a.guo
    public final long getLength() {
        return this.c;
    }

    @Override // a.guo
    public final long getPosition() {
        return this.d;
    }

    @Override // a.guo
    public final boolean h(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            q(iMin);
        }
        int iP = iMin;
        while (iP < i2 && iP != -1) {
            iP = p(bArr, i, i2, iP, z);
        }
        if (iP != -1) {
            this.d += (long) iP;
        }
        return iP != -1;
    }

    @Override // a.guo
    public final long i() {
        return this.d + ((long) this.f);
    }

    @Override // a.guo
    public final void j(int i) throws EOFException, InterruptedIOException {
        f(i, false);
    }

    @Override // a.guo
    public final int k(int i) throws EOFException, InterruptedIOException {
        guj gujVar;
        int iMin = Math.min(this.g, i);
        q(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f11931a;
            gujVar = this;
            iMin = gujVar.p(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            gujVar = this;
        }
        if (iMin != -1) {
            gujVar.d += (long) iMin;
        }
        return iMin;
    }

    @Override // a.guo
    public final int l(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        guj gujVar;
        int iMin;
        o(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            gujVar = this;
            iMin = gujVar.p(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            gujVar.g += iMin;
        } else {
            gujVar = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(gujVar.e, gujVar.f, bArr, i, iMin);
        gujVar.f += iMin;
        return iMin;
    }

    @Override // a.guo
    public final void m(int i) throws EOFException, InterruptedIOException {
        a(i, false);
    }

    @Override // a.guo
    public final void n(byte[] bArr, int i, int i2) {
        b(bArr, i, i2, false);
    }

    public final void o(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, vtt0.i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int p(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        c99.f();
        return 0;
    }

    public final void q(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // a.bbj
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        guj gujVar;
        int i3 = this.g;
        int iP = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            q(iMin);
            iP = iMin;
        }
        if (iP == 0) {
            gujVar = this;
            iP = gujVar.p(bArr, i, i2, 0, true);
        } else {
            gujVar = this;
        }
        if (iP != -1) {
            gujVar.d += (long) iP;
        }
        return iP;
    }

    @Override // a.guo
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        h(bArr, i, i2, false);
    }
}
