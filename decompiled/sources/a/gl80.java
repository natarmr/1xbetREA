package a;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class gl80 extends yge0 {
    public boolean d;
    public final f04 e;
    public final gmq f;
    public final vae0 g;

    public gl80(dtb dtbVar) {
        rwj rwjVar = tvk.f34603a;
        vs10 vs10Var = ys10.f43147a;
        rwj rwjVar2 = tvk.f34603a;
        vs10Var.getClass();
        rwjVar2.getClass();
        f04 f04Var = new f04(dtbVar, new fvt0(this), vs10Var, rwjVar2);
        this.e = f04Var;
        super.x(3);
        v(new l5g(this, (byte) 5));
        z(new n160(this));
        this.f = f04Var.j;
        this.g = f04Var.k;
    }

    public final Object A(int i) {
        Object value;
        Object value2;
        Object value3;
        f04 f04Var = this.e;
        p7m0 p7m0Var = f04Var.e;
        do {
            try {
                value2 = p7m0Var.getValue();
                ((Boolean) value2).getClass();
            } catch (Throwable th) {
                do {
                    value = p7m0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var.m(value, Boolean.FALSE));
                throw th;
            }
        } while (!p7m0Var.m(value2, Boolean.TRUE));
        f04Var.f = i;
        zi80 zi80Var = (zi80) f04Var.g.get();
        Object objQ = zi80Var != null ? q8a.Q(zi80Var, i) : f04Var.h.a(i);
        do {
            value3 = p7m0Var.getValue();
            ((Boolean) value3).getClass();
        } while (!p7m0Var.m(value3, Boolean.FALSE));
        return objQ;
    }

    public final Object B(int i) {
        f04 f04Var = this.e;
        zi80 zi80Var = (zi80) f04Var.g.get();
        return zi80Var != null ? q8a.Q(zi80Var, i) : f04Var.h.d.b(i);
    }

    public final txx C() {
        f04 f04Var = this.e;
        zi80 zi80Var = (zi80) f04Var.g.get();
        if (zi80Var == null) {
            return f04Var.h.d();
        }
        int i = zi80Var.b - 1;
        ArrayList arrayList = new ArrayList();
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                arrayList.add(zi80Var.c(i2));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return new txx(arrayList, zi80Var.c, zi80Var.d);
    }

    public final Object D(fl80 fl80Var, yje yjeVar) {
        f04 f04Var = this.e;
        f04Var.i.incrementAndGet();
        d04 d04Var = f04Var.h;
        Object objK = d04Var.g.k(new gv60(d04Var, fl80Var, null, (byte) 1), yjeVar);
        wne wneVar = wne.f39444a;
        if (objK != wneVar) {
            objK = Unit.f46060a;
        }
        if (objK != wneVar) {
            objK = Unit.f46060a;
        }
        return objK == wneVar ? objK : Unit.f46060a;
    }

    @Override // a.yge0
    public final int d() {
        f04 f04Var = this.e;
        zi80 zi80Var = (zi80) f04Var.g.get();
        return zi80Var != null ? zi80Var.f() : f04Var.h.d.f();
    }

    @Override // a.yge0
    public final long e(int i) {
        return -1L;
    }

    @Override // a.yge0
    public final void x(int i) {
        if (i == 0) {
            throw null;
        }
        this.d = true;
        super.x(i);
    }

    public final void z(Function1 function1) {
        f04 f04Var = this.e;
        f04Var.getClass();
        AtomicReference atomicReference = f04Var.l;
        if (atomicReference.get() == null) {
            b33 b33Var = f04Var.n;
            b33Var.getClass();
            atomicReference.set(b33Var);
            d04 d04Var = f04Var.h;
            d04Var.getClass();
            gxu gxuVar = d04Var.e;
            gxuVar.getClass();
            ((CopyOnWriteArrayList) ((rx3) gxuVar.f12096a).b).add(b33Var);
            h7d h7dVar = (h7d) ((p7m0) gxuVar.b).getValue();
            if (h7dVar != null) {
                b33Var.invoke(h7dVar);
            }
        }
        f04Var.m.add(function1);
    }
}
