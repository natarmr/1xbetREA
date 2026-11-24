package a;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class okz implements blz, lx9 {
    public final clz b;
    public final t3a c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25429a = new Object();
    public boolean d = false;
    public rrd e = null;

    public okz(clz clzVar, t3a t3aVar, veg0 veg0Var) {
        this.b = clzVar;
        this.c = t3aVar;
        if (clzVar.x().i.compareTo(lkz.d) >= 0) {
            t3aVar.l();
        } else {
            t3aVar.u();
        }
        clzVar.x().a(this);
    }

    @Override // a.lx9
    public final j0a a() {
        return this.c.f33257a.b;
    }

    public final void c(rrd rrdVar) {
        synchronized (this.f25429a) {
            try {
                if (this.e == null) {
                    this.e = rrdVar;
                } else {
                    ArrayList arrayList = new ArrayList((List) this.e.g);
                    arrayList.addAll((List) rrdVar.g);
                    this.e = new rrd(arrayList, (wju0) rrdVar.b, (List) rrdVar.c);
                }
                t3a t3aVar = this.c;
                wju0 wju0Var = (wju0) rrdVar.b;
                synchronized (t3aVar.l) {
                    t3aVar.h = wju0Var;
                }
                t3a t3aVar2 = this.c;
                List list = (List) rrdVar.c;
                synchronized (t3aVar2.l) {
                    t3aVar2.i = list;
                }
                synchronized (this.c.l) {
                }
                t3a t3aVar3 = this.c;
                Range range = (Range) rrdVar.d;
                synchronized (t3aVar3.l) {
                    t3aVar3.j = range;
                }
                n0a n0aVar = (n0a) a();
                n0aVar.getClass();
                wsf0 wsf0VarC = eke0.c(n0aVar, rrdVar);
                ((ScheduledExecutorService) rrdVar.i).execute(new llo(wsf0VarC, rrdVar, (byte) 13));
                this.c.c((List) rrdVar.g, wsf0VarC);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final clz i() {
        clz clzVar;
        synchronized (this.f25429a) {
            clzVar = this.b;
        }
        return clzVar;
    }

    public final List j() {
        List listUnmodifiableList;
        synchronized (this.f25429a) {
            listUnmodifiableList = Collections.unmodifiableList(this.c.y());
        }
        return listUnmodifiableList;
    }

    @kh60(kkz.ON_DESTROY)
    public void onDestroy(clz clzVar) {
        synchronized (this.f25429a) {
            t3a t3aVar = this.c;
            t3aVar.A((ArrayList) t3aVar.y());
        }
    }

    @kh60(kkz.ON_PAUSE)
    public void onPause(clz clzVar) {
        this.c.f33257a.g(false);
    }

    @kh60(kkz.ON_RESUME)
    public void onResume(clz clzVar) {
        this.c.f33257a.g(true);
    }

    @kh60(kkz.ON_START)
    public void onStart(clz clzVar) {
        synchronized (this.f25429a) {
            try {
                if (!this.d) {
                    this.c.l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @kh60(kkz.ON_STOP)
    public void onStop(clz clzVar) {
        synchronized (this.f25429a) {
            try {
                if (!this.d) {
                    this.c.u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.f25429a) {
            try {
                if (this.d) {
                    return;
                }
                onStop(this.b);
                this.d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t() {
        synchronized (this.f25429a) {
            List listY = this.c.y();
            this.c.A((ArrayList) listY);
            for (fot0 fot0Var : (ArrayList) listY) {
                if (fot0Var.o()) {
                    synchronized (fot0Var.d) {
                    }
                }
            }
            this.e = null;
        }
    }

    public final void u() {
        synchronized (this.f25429a) {
            try {
                if (this.d) {
                    this.d = false;
                    if (this.b.x().i.compareTo(lkz.d) >= 0) {
                        onStart(this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
