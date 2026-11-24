package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class heo implements Runnable, Comparable, nwk {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12932a;
    public int b = -1;

    public heo(long j) {
        this.f12932a = j;
    }

    @Override // a.nwk
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                pfw pfwVar = keo.f18162a;
                if (obj == pfwVar) {
                    return;
                }
                ieo ieoVar = obj instanceof ieo ? (ieo) obj : null;
                if (ieoVar != null) {
                    synchronized (ieoVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof kcq0 ? (kcq0) obj2 : null) != null) {
                            ieoVar.c(this.b);
                        }
                    }
                }
                this._heap = pfwVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j, ieo ieoVar, jeo jeoVar) {
        synchronized (this) {
            if (this._heap == keo.f18162a) {
                return 2;
            }
            synchronized (ieoVar) {
                try {
                    heo[] heoVarArr = ieoVar.f18073a;
                    heo heoVar = heoVarArr != null ? heoVarArr[0] : null;
                    int i = jeo.j;
                    if (defpackage.a.f0a.getIntVolatile(jeoVar, jeo.h) == 1) {
                        return 1;
                    }
                    if (heoVar == null) {
                        ieoVar.c = j;
                    } else {
                        long j2 = heoVar.f12932a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = ieoVar.c;
                        if (j - j3 > 0) {
                            ieoVar.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.f12932a - j < 0) {
                        this.f12932a = j;
                    }
                    ieoVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f12932a - ((heo) obj).f12932a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(ieo ieoVar) {
        if (this._heap != keo.f18162a) {
            this._heap = ieoVar;
        } else {
            jf4.o("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f12932a + ']';
    }
}
