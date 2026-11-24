package a;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class cyj0 implements skj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byj0 f5179a;
    public final wkj[] e;
    public final xkj[] f;
    public int g;
    public int h;
    public wkj i;
    public ypc j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public cyj0(wkj[] wkjVarArr, xkj[] xkjVarArr) {
        this.e = wkjVarArr;
        this.g = wkjVarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = xkjVarArr;
        this.h = xkjVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        byj0 byj0Var = new byj0(this);
        this.f5179a = byj0Var;
        byj0Var.start();
    }

    @Override // a.skj
    public final void d(long j) {
        synchronized (this.b) {
            try {
                x0x.K(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.skj
    public final Object e() {
        wkj wkjVar;
        synchronized (this.b) {
            try {
                ypc ypcVar = this.j;
                if (ypcVar != null) {
                    throw ypcVar;
                }
                x0x.K(this.i == null);
                int i = this.g;
                if (i == 0) {
                    wkjVar = null;
                } else {
                    wkj[] wkjVarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    wkjVar = wkjVarArr[i2];
                }
                this.i = wkjVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wkjVar;
    }

    public wkj f() {
        return new wkj(1);
    }

    @Override // a.skj
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                wkj wkjVar = this.i;
                if (wkjVar != null) {
                    wkjVar.v();
                    wkj[] wkjVarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    wkjVarArr[i] = wkjVar;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    wkj wkjVar2 = (wkj) this.c.removeFirst();
                    wkjVar2.v();
                    wkj[] wkjVarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    wkjVarArr2[i2] = wkjVar2;
                }
                while (!this.d.isEmpty()) {
                    ((xkj) this.d.removeFirst()).w();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract xkj g();

    public ypc h(Throwable th) {
        return new uzw("Unexpected decode error", th);
    }

    public abstract ypc i(wkj wkjVar, xkj xkjVar, boolean z);

    public final boolean j() {
        boolean z;
        ypc ypcVarH;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l) {
                return false;
            }
            wkj wkjVar = (wkj) this.c.removeFirst();
            xkj[] xkjVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            xkj xkjVar = xkjVarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (wkjVar.m(4)) {
                xkjVar.b(4);
            } else {
                xkjVar.e = wkjVar.i;
                if (wkjVar.m(134217728)) {
                    xkjVar.b(134217728);
                }
                long j = wkjVar.i;
                synchronized (this.b) {
                    long j2 = this.m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    xkjVar.f = true;
                }
                try {
                    ypcVarH = i(wkjVar, xkjVar, z2);
                } catch (OutOfMemoryError e) {
                    ypcVarH = h(e);
                } catch (RuntimeException e2) {
                    ypcVarH = h(e2);
                }
                if (ypcVarH != null) {
                    synchronized (this.b) {
                        this.j = ypcVarH;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || xkjVar.f) {
                        xkjVar.w();
                    } else {
                        this.d.addLast(xkjVar);
                    }
                    wkjVar.v();
                    wkj[] wkjVarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    wkjVarArr[i2] = wkjVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // a.skj
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final xkj b() {
        synchronized (this.b) {
            try {
                ypc ypcVar = this.j;
                if (ypcVar != null) {
                    throw ypcVar;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (xkj) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.skj
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void c(wkj wkjVar) {
        synchronized (this.b) {
            try {
                ypc ypcVar = this.j;
                if (ypcVar != null) {
                    throw ypcVar;
                }
                x0x.A(wkjVar == this.i);
                this.c.addLast(wkjVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(xkj xkjVar) {
        synchronized (this.b) {
            xkjVar.v();
            xkj[] xkjVarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            xkjVarArr[i] = xkjVar;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // a.skj
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.f5179a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
