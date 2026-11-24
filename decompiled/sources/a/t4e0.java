package a;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;

/* JADX INFO: loaded from: classes6.dex */
public final class t4e0 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final RatingStatisticScreenParams o;
    public final mne p;
    public final i1w0 q;
    public final b8u r;
    public final duj s;
    public final cmt t;
    public final xsu u;
    public final ddk v;
    public final eyg0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4e0(RatingStatisticScreenParams ratingStatisticScreenParams, mne mneVar, m1e m1eVar, i1w0 i1w0Var, b8u b8uVar, duj dujVar, ocl oclVar, cmt cmtVar, xsu xsuVar, ddk ddkVar, eyg0 eyg0Var) {
        super(null, new etd0((byte) 23), new yar(oclVar, (byte) 11), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        i1w0Var.getClass();
        this.o = ratingStatisticScreenParams;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = b8uVar;
        this.s = dujVar;
        this.t = cmtVar;
        this.u = xsuVar;
        this.v = ddkVar;
        this.w = eyg0Var;
        sac.T(new fnq(m1eVar.b(), new s4e0(this, null, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new jjc0(2, this, t4e0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 13));
    }

    public final void M(Throwable th) {
        this.s.b(th, new nrc0(this, (byte) 16));
    }

    public final void N() {
        sac.V(jiu0.a(this), new prc0(1, this, t4e0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, this.p.b, new s4e0(this, null, (byte) 1), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        List list;
        Map map;
        d4e0 d4e0Var = (d4e0) obj;
        d4e0Var.getClass();
        byte b = 0;
        if (!d4e0Var.equals(x3e0.f40214a)) {
            boolean zEquals = d4e0Var.equals(w3e0.f38498a);
            yje yjeVar = null;
            mne mneVar = this.p;
            if (zEquals) {
                sac.V(jiu0.a(this), new prc0(1, this, t4e0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 22), new p7d0(this, (byte) 16), mneVar.b, new s4e0(this, yjeVar, b), 8);
                return;
            }
            if (d4e0Var.equals(a4e0.f219a)) {
                sac.V(jiu0.a(this), new prc0(1, this, t4e0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, mneVar.b, new d7a0(this, yjeVar, (byte) 19), 10);
                return;
            }
            if (d4e0Var.equals(b4e0.f1954a)) {
                N();
                return;
            }
            if (d4e0Var.equals(c4e0.f3721a)) {
                E();
                return;
            }
            if (d4e0Var instanceof y3e0) {
                i6i0 i6i0Var = ((y3e0) d4e0Var).f41949a;
                j6i0 j6i0Var = ((n4e0) D()).f22894a;
                if (j6i0Var == null || (map = j6i0Var.b) == null || (list = (List) map.get(j0x.V(i6i0Var))) == null) {
                    list = iun.f15405a;
                }
                G(new m4e0(list, i6i0Var));
                return;
            }
            if (!(d4e0Var instanceof z3e0)) {
                t9f.b();
                return;
            }
            z3e0 z3e0Var = (z3e0) d4e0Var;
            sac.V(jiu0.a(this), new prc0(1, this, t4e0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar.b, new wmq((Object) z3e0Var.f43713a, (Object) z3e0Var.b, false, (Object) this, yjeVar, (byte) 21), 10);
            return;
        }
        i1w0 i1w0Var = this.q;
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
