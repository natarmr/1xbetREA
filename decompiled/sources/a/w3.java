package a;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class w3 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38474a;

    public w3(ByteArrayInputStream byteArrayInputStream, int i) {
        super(byteArrayInputStream);
        this.f38474a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f38474a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f38474a;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.f38474a -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(Math.min(j, this.f38474a));
        if (jSkip >= 0) {
            this.f38474a = (int) (((long) this.f38474a) - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f38474a <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.f38474a--;
        }
        return i;
    }
}
