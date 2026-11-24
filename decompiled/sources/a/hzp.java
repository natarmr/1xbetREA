package a;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class hzp implements emk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uey f13917a;
    public long b;
    public boolean c;

    public hzp(uey ueyVar, long j) {
        this.f13917a = ueyVar;
        this.b = j;
    }

    @Override // a.emk0
    public final long Y(f99 f99Var, long j) {
        long j2;
        long j3;
        int i;
        f99Var.getClass();
        if (this.c) {
            jf4.n("closed");
            return 0L;
        }
        uey ueyVar = this.f13917a;
        long j4 = this.b;
        if (j < 0) {
            c99.s(h97.h(j, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                uvh0 uvh0VarS = f99Var.S(1);
                byte[] bArr = uvh0VarS.f36348a;
                int i2 = uvh0VarS.c;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (ueyVar) {
                    bArr.getClass();
                    ueyVar.d.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = ueyVar.d.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (uvh0VarS.b == uvh0VarS.c) {
                        f99Var.f9145a = uvh0VarS.a();
                        mwh0.a(uvh0VarS);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    uvh0VarS.c += i;
                    long j7 = i;
                    j6 += j7;
                    f99Var.b += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.b += j3;
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        uey ueyVar = this.f13917a;
        if (this.c) {
            return;
        }
        this.c = true;
        ReentrantLock reentrantLock = ueyVar.c;
        reentrantLock.lock();
        try {
            int i = ueyVar.b - 1;
            ueyVar.b = i;
            if (i == 0 && ueyVar.f35554a) {
                reentrantLock.unlock();
                synchronized (ueyVar) {
                    ueyVar.d.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // a.emk0
    public final fmq0 h() {
        return fmq0.d;
    }
}
