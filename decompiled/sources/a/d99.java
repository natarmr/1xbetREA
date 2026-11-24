package a;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d99 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f99 f5689a;
    public boolean b;
    public uvh0 c;
    public byte[] e;
    public long d = -1;
    public int f = -1;
    public int g = -1;

    public final void a(long j) {
        f99 f99Var = this.f5689a;
        if (f99Var == null) {
            jf4.n("not attached to a buffer");
            return;
        }
        if (!this.b) {
            jf4.n("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j2 = f99Var.b;
        if (j <= j2) {
            if (j < 0) {
                c99.s(h97.h(j, "newSize < 0: "));
                return;
            }
            long j3 = j2 - j;
            while (j3 > 0) {
                uvh0 uvh0Var = f99Var.f9145a;
                uvh0Var.getClass();
                uvh0 uvh0Var2 = uvh0Var.g;
                uvh0Var2.getClass();
                int i = uvh0Var2.c;
                long j4 = i - uvh0Var2.b;
                if (j4 > j3) {
                    uvh0Var2.c = i - ((int) j3);
                    break;
                } else {
                    f99Var.f9145a = uvh0Var2.a();
                    mwh0.a(uvh0Var2);
                    j3 -= j4;
                }
            }
            this.c = null;
            this.d = j;
            this.e = null;
            this.f = -1;
            this.g = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                uvh0 uvh0VarS = f99Var.S(i2);
                int iMin = (int) Math.min(j5, 8192 - uvh0VarS.c);
                int i3 = uvh0VarS.c + iMin;
                uvh0VarS.c = i3;
                j5 -= (long) iMin;
                if (z) {
                    this.c = uvh0VarS;
                    this.d = j2;
                    this.e = uvh0VarS.f36348a;
                    this.f = i3 - iMin;
                    this.g = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        f99Var.b = j;
    }

    public final int c(long j) {
        f99 f99Var = this.f5689a;
        if (f99Var == null) {
            jf4.n("not attached to a buffer");
            return 0;
        }
        if (j >= -1) {
            long j2 = f99Var.b;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.c = null;
                    this.d = j;
                    this.e = null;
                    this.f = -1;
                    this.g = -1;
                    return -1;
                }
                uvh0 uvh0Var = f99Var.f9145a;
                uvh0 uvh0Var2 = this.c;
                long j3 = 0;
                if (uvh0Var2 != null) {
                    long j4 = this.d - ((long) (this.f - uvh0Var2.b));
                    if (j4 > j) {
                        uvh0Var2 = uvh0Var;
                        uvh0Var = uvh0Var2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    uvh0Var2 = uvh0Var;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        uvh0Var2.getClass();
                        long j5 = ((long) (uvh0Var2.c - uvh0Var2.b)) + j3;
                        if (j < j5) {
                            break;
                        }
                        uvh0Var2 = uvh0Var2.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        uvh0Var.getClass();
                        uvh0Var = uvh0Var.g;
                        uvh0Var.getClass();
                        j2 -= (long) (uvh0Var.c - uvh0Var.b);
                    }
                    uvh0Var2 = uvh0Var;
                    j3 = j2;
                }
                if (this.b) {
                    uvh0Var2.getClass();
                    if (uvh0Var2.d) {
                        byte[] bArr = uvh0Var2.f36348a;
                        uvh0 uvh0Var3 = new uvh0(Arrays.copyOf(bArr, bArr.length), uvh0Var2.b, uvh0Var2.c, false, true);
                        if (f99Var.f9145a == uvh0Var2) {
                            f99Var.f9145a = uvh0Var3;
                        }
                        uvh0Var2.b(uvh0Var3);
                        uvh0 uvh0Var4 = uvh0Var3.g;
                        uvh0Var4.getClass();
                        uvh0Var4.a();
                        uvh0Var2 = uvh0Var3;
                    }
                }
                this.c = uvh0Var2;
                this.d = j;
                uvh0Var2.getClass();
                this.e = uvh0Var2.f36348a;
                int i = uvh0Var2.b + ((int) (j - j3));
                this.f = i;
                int i2 = uvh0Var2.c;
                this.g = i2;
                return i2 - i;
            }
        }
        StringBuilder sbQ = kng0.q(j, "offset=", " > size=");
        sbQ.append(f99Var.b);
        throw new ArrayIndexOutOfBoundsException(sbQ.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5689a == null) {
            jf4.n("not attached to a buffer");
            return;
        }
        this.f5689a = null;
        this.c = null;
        this.d = -1L;
        this.e = null;
        this.f = -1;
        this.g = -1;
    }
}
