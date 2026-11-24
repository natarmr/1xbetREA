package a;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public final class fld0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9732a;
    public int b;
    public final /* synthetic */ hld0 c;

    public fld0(hld0 hld0Var, eld0 eld0Var) {
        this.c = hld0Var;
        this.f9732a = hld0Var.w(eld0Var.b + 4);
        this.b = eld0Var.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            hny.u("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.f9732a;
        hld0 hld0Var = this.c;
        hld0Var.q(i4, bArr, i, i2);
        this.f9732a = hld0Var.w(this.f9732a + i2);
        this.b -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        hld0 hld0Var = this.c;
        RandomAccessFile randomAccessFile = hld0Var.f13254a;
        if (this.b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.f9732a);
        int i = randomAccessFile.read();
        this.f9732a = hld0Var.w(this.f9732a + 1);
        this.b--;
        return i;
    }
}
