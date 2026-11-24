package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;
import org.xplatform.statistic.rating.impl.rating_statistic.presentation.screen.RatingFilterScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class x8e0 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final RatingStatisticScreenParams o;
    public final ctf0 p;
    public final mne q;
    public final luu r;
    public final r2u s;
    public final i1w0 t;
    public final edu u;
    public final clc v;
    public bby w;

    public x8e0(RatingStatisticScreenParams ratingStatisticScreenParams, ctf0 ctf0Var, mne mneVar, ocl oclVar, qzt qztVar, fhj fhjVar, luu luuVar, r2u r2uVar, wyu wyuVar, i1w0 i1w0Var, m1e m1eVar, edu eduVar, clc clcVar, y4u y4uVar, r9u r9uVar) {
        ctf0Var.getClass();
        wyuVar.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        mr0 mr0Var = new mr0(fhjVar, ratingStatisticScreenParams, wyuVar, qztVar, (byte) 27);
        tla0 tla0Var = new tla0(ctf0Var, oclVar, r9uVar, (byte) 2);
        yje yjeVar = null;
        super(mr0Var, g090VarP, tla0Var, (yzn0) null);
        this.o = ratingStatisticScreenParams;
        this.p = ctf0Var;
        this.q = mneVar;
        this.r = luuVar;
        this.s = r2uVar;
        this.t = i1w0Var;
        this.u = eduVar;
        this.v = clcVar;
        sac.T(new fnq(m1eVar.b(), new coc0(this, yjeVar, (byte) 9), (byte) 4), jiu0.a(this), new jjc0(2, this, x8e0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 14));
        slb.U(new fnq(((r7e0) y4uVar.f42022a.c).c, new s9c0(this, yjeVar, (byte) 23), (byte) 4), jiu0.a(this));
    }

    public final void M() {
        bby bbyVar = this.w;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.w = sac.V(jiu0.a(this), new d8e0(1, this, x8e0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, this.q.b, new er60((Object) this, (yje) null, (byte) 26), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r13 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0105, code lost:
    
        if (r13 == r1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(a.y4e0 r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x8e0.N(a.y4e0, a.zje):java.lang.Object");
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        a8e0 a8e0Var = (a8e0) obj;
        a8e0Var.getClass();
        boolean zEquals = a8e0Var.equals(x7e0.f40410a);
        i1w0 i1w0Var = this.t;
        if (zEquals) {
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
        } else {
            if (!a8e0Var.equals(y7e0.f42148a)) {
                boolean zEquals2 = a8e0Var.equals(z7e0.f43915a);
                oyg0 oyg0Var = this.f;
                ocj ocjVar = this.i;
                if (zEquals2) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, l8e0.a((l8e0) value2, true, false, null, new HashMap(), null, null, 0, false, false, 222)));
                    M();
                    return;
                }
                yje yjeVar = null;
                if (!(a8e0Var instanceof w7e0)) {
                    if (!a8e0Var.equals(v7e0.f36920a)) {
                        t9f.b();
                        return;
                    }
                    bby bbyVar = this.w;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    r7e0 r7e0Var = (r7e0) ((z220) this.v.b).c;
                    r7e0Var.b = null;
                    r7e0Var.f29971a.clear();
                    r7e0Var.c.i();
                    return;
                }
                w7e0 w7e0Var = (w7e0) a8e0Var;
                int i = w7e0Var.f38669a;
                int i2 = w7e0Var.b;
                if (((l8e0) D()).k || ((l8e0) D()).j || i + 5 < i2) {
                    return;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, l8e0.a((l8e0) value, false, false, null, null, null, null, 0, false, true, 1023)));
                sac.V(jiu0.a(this), new v6d0(this, (byte) 18), null, this.q.b, new u52((diu0) this, yjeVar, (byte) 19), 10);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            FragmentScreen ratingFilterScreen = new RatingFilterScreen(this.o);
            if (ratingFilterScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) ratingFilterScreen)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(ratingFilterScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
