package a;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pg00 implements bmf0, xdv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f26931a = new CopyOnWriteArrayList();

    @Override // a.xdv
    public final void b() {
        Iterator it = this.f26931a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((l0g0) it.next()).b();
        }
    }

    @Override // a.bmf0
    public final void c(gnf0 gnf0Var, long j, pz2 pz2Var) {
        gnf0Var.getClass();
        h(gnf0Var.x(), pz2Var);
    }

    @Override // a.xdv
    public final void f() {
        Iterator it = this.f26931a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((l0g0) it.next()).b();
        }
    }

    @Override // a.xdv
    public final void g() {
        Iterator it = this.f26931a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((l0g0) it.next()).b();
        }
    }

    public final void h(long j, pz2 pz2Var) {
        Integer num;
        Iterator it = this.f26931a.iterator();
        it.getClass();
        while (it.hasNext()) {
            l0g0 l0g0Var = (l0g0) it.next();
            l0g0Var.getClass();
            pz2Var.getClass();
            if (!l0g0Var.d.isCompleted() && !l0g0Var.d.isCancelled()) {
                synchronized (l0g0Var) {
                    inf0 inf0Var = l0g0Var.g;
                    if (inf0Var != null && j >= inf0Var.f15072a) {
                        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
                        key.getClass();
                        Long l = (Long) pz2Var.f27824a.get(key);
                        long frameNumber = pz2Var.f27824a.getFrameNumber();
                        if (l != null && l0g0Var.f == null) {
                            l0g0Var.f = l;
                        }
                        Long l2 = l0g0Var.f;
                        if (l0g0Var.c == null || l2 == null || l == null || l.longValue() - l2.longValue() <= l0g0Var.c.longValue()) {
                            if (l0g0Var.e == null) {
                                l0g0Var.e = new f7r(frameNumber);
                            }
                            f7r f7rVar = l0g0Var.e;
                            if (f7rVar != null && (num = l0g0Var.b) != null && frameNumber - f7rVar.f9070a > num.intValue()) {
                                l0g0Var.d.N(new k0g0(1, pz2Var));
                            } else if (((Boolean) l0g0Var.f19200a.invoke(pz2Var)).booleanValue()) {
                                l0g0Var.d.N(new k0g0(0, pz2Var));
                            }
                        } else {
                            l0g0Var.d.N(new k0g0(2, pz2Var));
                        }
                    }
                }
            }
            this.f26931a.remove(l0g0Var);
        }
    }

    @Override // a.bmf0
    public final void k(gnf0 gnf0Var) {
        gnf0Var.getClass();
        Iterator it = this.f26931a.iterator();
        it.getClass();
        while (it.hasNext()) {
            l0g0 l0g0Var = (l0g0) it.next();
            long jX = gnf0Var.x();
            synchronized (l0g0Var) {
                if (l0g0Var.g == null) {
                    l0g0Var.g = new inf0(jX);
                }
            }
        }
    }

    @Override // a.bmf0
    public final void y(gnf0 gnf0Var, long j, oz2 oz2Var) {
        h(gnf0Var.x(), oz2Var.b);
    }
}
