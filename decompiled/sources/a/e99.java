package a;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class e99 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7409a;
    public final /* synthetic */ Object b;

    public e99(zvj zvjVar, tdw0 tdw0Var) {
        this.f7409a = (byte) 3;
        this.b = tdw0Var;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        byte b = this.f7409a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (int) Math.min(((f99) obj).b, 2147483647L);
            case 1:
                zae0 zae0Var = (zae0) obj;
                if (!zae0Var.c) {
                    return (int) Math.min(zae0Var.b.b, 2147483647L);
                }
                ohq.l("closed");
                return 0;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f7409a) {
            case 0:
                break;
            case 1:
                ((zae0) this.b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        byte b = this.f7409a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bArr.getClass();
                return ((f99) obj).read(bArr, i, i2);
            case 1:
                bArr.getClass();
                zae0 zae0Var = (zae0) obj;
                f99 f99Var = zae0Var.b;
                if (zae0Var.c) {
                    ohq.l("closed");
                    return 0;
                }
                cy2.x(bArr.length, i, i2);
                if (f99Var.b == 0 && zae0Var.f44063a.Y(f99Var, 8192L) == -1) {
                    return -1;
                }
                return f99Var.read(bArr, i, i2);
            case 2:
                Inflater inflater = (Inflater) ((zvj) obj).b;
                try {
                    int iInflate = inflater.inflate(bArr, i, i2);
                    if (iInflate > 0) {
                        return iInflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (inflater.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = inflater.getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((tdw0) obj).f(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.f7409a) {
            case 3:
                if (j <= 0) {
                    return 0L;
                }
                int i = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
                ((tdw0) this.b).g(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        byte b = this.f7409a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((f99) obj) + ".inputStream()";
            case 1:
                return ((zae0) obj) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f7409a) {
            case 1:
                outputStream.getClass();
                zae0 zae0Var = (zae0) this.b;
                f99 f99Var = zae0Var.b;
                if (zae0Var.c) {
                    ohq.l("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (f99Var.b == 0 && zae0Var.f44063a.Y(f99Var, 8192L) == -1) {
                        return j;
                    }
                    long j2 = f99Var.b;
                    j += j2;
                    cy2.x(j2, 0L, j2);
                    uvh0 uvh0Var = f99Var.f9145a;
                    while (j2 > 0) {
                        uvh0Var.getClass();
                        int iMin = (int) Math.min(j2, uvh0Var.c - uvh0Var.b);
                        outputStream.write(uvh0Var.f36348a, uvh0Var.b, iMin);
                        int i = uvh0Var.b + iMin;
                        uvh0Var.b = i;
                        long j3 = iMin;
                        f99Var.b -= j3;
                        j2 -= j3;
                        if (i == uvh0Var.c) {
                            uvh0 uvh0VarA = uvh0Var.a();
                            f99Var.f9145a = uvh0VarA;
                            mwh0.a(uvh0Var);
                            uvh0Var = uvh0VarA;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    public /* synthetic */ e99(Closeable closeable, byte b) {
        this.f7409a = b;
        this.b = closeable;
    }

    private final void a() {
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte b = this.f7409a;
        Object obj = this.b;
        switch (b) {
            case 0:
                f99 f99Var = (f99) obj;
                if (f99Var.b > 0) {
                    return f99Var.readByte() & 255;
                }
                return -1;
            case 1:
                zae0 zae0Var = (zae0) obj;
                f99 f99Var2 = zae0Var.b;
                if (zae0Var.c) {
                    ohq.l("closed");
                    return 0;
                }
                if (f99Var2.b == 0 && zae0Var.f44063a.Y(f99Var2, 8192L) == -1) {
                    return -1;
                }
                return f99Var2.readByte() & 255;
            case 2:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((tdw0) obj).f(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
