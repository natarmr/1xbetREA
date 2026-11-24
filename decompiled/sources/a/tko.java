package a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class tko extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f34105a;
    public int b = 1073741824;

    public tko(InputStream inputStream) {
        this.f34105a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34105a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f34105a.read();
        if (i == -1) {
            this.b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f34105a.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.f34105a.read(bArr);
        if (i == -1) {
            this.b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f34105a.read(bArr, i, i2);
        if (i3 == -1) {
            this.b = 0;
        }
        return i3;
    }
}
