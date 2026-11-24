package a;

import android.javax.sip.message.Response;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class xc30 extends i3t0 {
    public static final /* synthetic */ int H = 0;
    public final jwu A;
    public final clc B;
    public c4m0 C;
    public bby D;
    public c4m0 E;
    public final c4m0 F;
    public bby G;
    public final xsu o;
    public final vzg0 p;
    public final String q;
    public final long r;
    public final duj s;
    public final mne t;
    public final qzt u;
    public final ctf0 v;
    public final fhj w;
    public final wyu x;
    public final i1w0 y;
    public final f7u z;

    public xc30(xsu xsuVar, vzg0 vzg0Var, ocl oclVar, m1e m1eVar, String str, long j, uyu uyuVar, duj dujVar, mne mneVar, weu weuVar, qzt qztVar, ctf0 ctf0Var, fhj fhjVar, wyu wyuVar, i1w0 i1w0Var, f7u f7uVar, jwu jwuVar, clc clcVar, r9u r9uVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        pc30 pc30Var = new pc30(j, weuVar, str, qztVar, ctf0Var, fhjVar, wyuVar, vzg0Var, (byte) 0);
        xuh xuhVar = new xuh(oclVar, r9uVar, (byte) 7);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, pc30Var, xuhVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = xsuVar;
        this.p = vzg0Var;
        this.q = str;
        this.r = j;
        this.s = dujVar;
        this.t = mneVar;
        this.u = qztVar;
        this.v = ctf0Var;
        this.w = fhjVar;
        this.x = wyuVar;
        this.y = i1w0Var;
        this.z = f7uVar;
        this.A = jwuVar;
        this.B = clcVar;
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new qc30(this, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), wc30.h);
        c4m0 c4m0Var = this.F;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            byte b = 2;
            this.F = sac.T(new fnq(m1eVar.b(), new tc30(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new qc30(this, yjeVar, b));
        }
        N();
    }

    public final void M() {
        Object value;
        c4m0 c4m0Var = this.C;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, hc30.a((hc30) value, null, null, true, false, false, false, null, 0L, Response.PROXY_AUTHENTICATION_REQUIRED)));
            boolean z = ((hc30) D()).e;
            mne mneVar = this.t;
            String str = this.q;
            yje yjeVar = null;
            xsu xsuVar = this.o;
            this.C = z ? sac.T(new fnq(xsuVar.a(str), new qc30(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new rc30(this, null, (byte) 0)) : sac.T(dtb.U(new fnq(xsuVar.a(str), new qc30(this, yjeVar, b), (byte) 4), 1), d5c.S(jiu0.a(this), mneVar.f22085a), new rc30(this, null, (byte) 1));
        }
    }

    public final void N() {
        c4m0 c4m0Var;
        bby bbyVar;
        bby bbyVar2 = this.D;
        byte b = 1;
        yje yjeVar = null;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.D) != null) {
            bbyVar.cancel(null);
        }
        boolean z = ((hc30) D()).e;
        mne mneVar = this.t;
        this.D = z ? sac.X(jiu0.a(this), 30L, mneVar.b, sc30.f31969a, new tc30(this, yjeVar, (byte) 0)) : sac.V(jiu0.a(this), uc30.f35410a, null, mneVar.b, new tc30(this, yjeVar, b), 10);
        c4m0 c4m0Var2 = this.E;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.E) != null) {
            c4m0Var.cancel(null);
        }
        this.E = sac.T(new fnq(this.z.n(this.q), new khx((Object) this, (Object) this.u.a(), yjeVar, (byte) 15), (byte) 4), jiu0.a(this), vc30.h);
        M();
    }

    @Override // a.diu0
    public final void v() {
        ((zb30) ((cyu) this.B.b).b).f44096a.a();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        ub30 ub30Var = (ub30) obj;
        ub30Var.getClass();
        super.x(ub30Var);
        if (!ub30Var.equals(rb30.f30165a)) {
            if (ub30Var.equals(tb30.f33643a)) {
                M();
                return;
            }
            if (!(ub30Var instanceof sb30)) {
                t9f.b();
                return;
            }
            long j = ((sb30) ub30Var).f31913a;
            this.p.e("CHECKED_CHIPS_ID_KEY", Long.valueOf(j));
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, hc30.a((hc30) value, null, null, false, false, false, false, null, j, 255)));
            return;
        }
        i1w0 i1w0Var = this.y;
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
