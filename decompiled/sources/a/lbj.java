package a;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class lbj extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbj f19757a;
    public final mbj b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public lbj(jbj jbjVar, mbj mbjVar) {
        this.f19757a = jbjVar;
        this.b = mbjVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.f19757a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        x0x.K(!this.e);
        boolean z = this.d;
        jbj jbjVar = this.f19757a;
        if (!z) {
            jbjVar.d(this.b);
            this.d = true;
        }
        int i3 = jbjVar.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
