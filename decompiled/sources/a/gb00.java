package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class gb00 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final String o;
    public final long p;
    public final mne q;
    public final i1w0 r;
    public final e1u s;
    public final duj t;
    public final rl70 u;
    public final c4m0 v;
    public bby w;

    /* JADX WARN: Illegal instructions before constructor call */
    public gb00(String str, long j, int i, mne mneVar, i1w0 i1w0Var, ocl oclVar, m1e m1eVar, e1u e1uVar, duj dujVar, rl70 rl70Var, wyu wyuVar, uyu uyuVar, r9u r9uVar, ctf0 ctf0Var) {
        m1eVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        ctf0Var.getClass();
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        yje yjeVar = null;
        super(new bh1((Object) wyuVar, (Object) r9uVar, i, (byte) 5), cvm0.p(vs10Var, mneVar.f22085a), new mz0((Object) ctf0Var, (Object) oclVar, j, (byte) 21), (yzn0) null);
        this.o = str;
        this.p = j;
        this.q = mneVar;
        this.r = i1w0Var;
        this.s = e1uVar;
        this.t = dujVar;
        this.u = rl70Var;
        M(false);
        c4m0 c4m0Var = this.v;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.v = sac.T(new fnq(m1eVar.b(), new slx(this, yjeVar, (byte) 15), (byte) 4), d5c.S(jiu0.a(this), dvjVar), foe.h);
        }
        sac.T(new fnq(uyuVar.f36509a.h(), new kaw(this, yjeVar, (byte) 18), (byte) 4), d5c.S(jiu0.a(this), dvjVar), foe.h);
    }

    public final void M(boolean z) {
        bby bbyVar = this.w;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.w = sac.V(jiu0.a(this), new ebz(this, (byte) 26), null, this.q.b, new u88(z, (Object) this, (yje) null, (byte) 28), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        aa00 aa00Var = (aa00) obj;
        aa00Var.getClass();
        if (aa00Var.equals(y900.f42222a)) {
            M(true);
            return;
        }
        boolean zEquals = aa00Var.equals(v900.f37010a);
        i1w0 i1w0Var = this.r;
        if (!zEquals) {
            boolean z = aa00Var instanceof w900;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z) {
                long j = ((w900) aa00Var).f38753a;
                if (((ma00) D()).c == 0) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value3, ma00.a((ma00) value3, false, false, 0, (int) j, 0, null, null, 247)));
                    return;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, ma00.a((ma00) value2, false, false, 0, 0, (int) j, null, null, 239)));
                return;
            }
            if (aa00Var instanceof x900) {
                i1w0Var.d(new u400(this, ((x900) aa00Var).f40487a, (byte) 4));
                return;
            }
            if (aa00Var instanceof z900) {
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value, ma00.a((ma00) value, false, false, ((z900) aa00Var).f43994a, 0, 0, null, null, 251)));
                return;
            }
            if (aa00Var instanceof u900) {
                bby bbyVar = this.w;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                c4m0 c4m0Var = this.v;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                    return;
                }
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
