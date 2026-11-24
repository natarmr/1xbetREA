package a;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class hld0 implements Closeable {
    public static final Logger g = Logger.getLogger(hld0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f13254a;
    public int b;
    public int c;
    public eld0 d;
    public eld0 e;
    public final byte[] f;

    public hld0(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    y(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    ohq.l("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f13254a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iL = l(bArr, 0);
        this.b = iL;
        if (iL <= randomAccessFile2.length()) {
            this.c = l(bArr, 4);
            int iL2 = l(bArr, 8);
            int iL3 = l(bArr, 12);
            this.d = k(iL2);
            this.e = k(iL3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int l(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void y(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final void a(byte[] bArr) {
        int iW;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    c(length);
                    boolean zE = e();
                    if (zE) {
                        iW = 16;
                    } else {
                        eld0 eld0Var = this.e;
                        iW = w(eld0Var.b + 4 + eld0Var.c);
                    }
                    eld0 eld0Var2 = new eld0(iW, length, (byte) 0);
                    y(this.f, 0, length);
                    r(this.f, iW, 4);
                    r(bArr, iW + 4, length);
                    x(this.b, this.c + 1, zE ? iW : this.d.b, iW);
                    this.e = eld0Var2;
                    this.c++;
                    if (zE) {
                        this.d = eld0Var2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void c(int i) throws IOException {
        int i2 = i + 4;
        int iV = this.b - v();
        if (iV >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            iV += i3;
            i3 <<= 1;
        } while (iV < i2);
        RandomAccessFile randomAccessFile = this.f13254a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        eld0 eld0Var = this.e;
        int iW = w(eld0Var.b + 4 + eld0Var.c);
        if (iW < this.d.b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = iW - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                c99.l("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.e.b;
        int i5 = this.d.b;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            x(i3, this.c, i5, i6);
            this.e = new eld0(i6, this.e.c, (byte) 0);
        } else {
            x(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f13254a.close();
    }

    public final synchronized void d(gld0 gld0Var) {
        int iW = this.d.b;
        for (int i = 0; i < this.c; i++) {
            eld0 eld0VarK = k(iW);
            gld0Var.a(new fld0(this, eld0VarK), eld0VarK.c);
            iW = w(eld0VarK.b + 4 + eld0VarK.c);
        }
    }

    public final synchronized boolean e() {
        return this.c == 0;
    }

    public final eld0 k(int i) throws IOException {
        if (i == 0) {
            return eld0.d;
        }
        RandomAccessFile randomAccessFile = this.f13254a;
        randomAccessFile.seek(i);
        return new eld0(i, randomAccessFile.readInt(), (byte) 0);
    }

    public final synchronized void n() {
        if (e()) {
            throw new NoSuchElementException();
        }
        byte b = 0;
        if (this.c == 1) {
            synchronized (this) {
                x(4096, 0, 0, 0);
                this.c = 0;
                eld0 eld0Var = eld0.d;
                this.d = eld0Var;
                this.e = eld0Var;
                if (this.b > 4096) {
                    RandomAccessFile randomAccessFile = this.f13254a;
                    randomAccessFile.setLength(4096L);
                    randomAccessFile.getChannel().force(true);
                }
                this.b = 4096;
            }
        } else {
            eld0 eld0Var2 = this.d;
            int iW = w(eld0Var2.b + 4 + eld0Var2.c);
            q(iW, this.f, 0, 4);
            int iL = l(this.f, 0);
            x(this.b, this.c - 1, iW, this.e.b);
            this.c--;
            this.d = new eld0(iW, iL, b);
        }
    }

    public final void q(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iW = w(i);
        int i4 = iW + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.f13254a;
        if (i4 <= i5) {
            randomAccessFile.seek(iW);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iW;
        randomAccessFile.seek(iW);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void r(byte[] bArr, int i, int i2) throws IOException {
        int iW = w(i);
        int i3 = iW + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.f13254a;
        if (i3 <= i4) {
            randomAccessFile.seek(iW);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iW;
        randomAccessFile.seek(iW);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hld0.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            d(new s88((Object) sb, (byte) 8, false));
        } catch (IOException e) {
            g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final int v() {
        if (this.c == 0) {
            return 16;
        }
        eld0 eld0Var = this.e;
        int i = eld0Var.b;
        int i2 = this.d.b;
        return i >= i2 ? (i - i2) + 4 + eld0Var.c + 16 : (((i + 4) + eld0Var.c) + this.b) - i2;
    }

    public final int w(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void x(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.f13254a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                y(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }
}
