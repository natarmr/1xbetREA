package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zd30 extends i3t0 {
    public static final /* synthetic */ int H = 0;
    public final jwu A;
    public final r7v B;
    public c4m0 C;
    public bby D;
    public c4m0 E;
    public final c4m0 F;
    public bby G;
    public final vzg0 o;
    public final yox p;
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

    public zd30(vzg0 vzg0Var, yox yoxVar, ocl oclVar, m1e m1eVar, String str, long j, uyu uyuVar, duj dujVar, mne mneVar, weu weuVar, qzt qztVar, ctf0 ctf0Var, fhj fhjVar, wyu wyuVar, i1w0 i1w0Var, f7u f7uVar, jwu jwuVar, r7v r7vVar, r9u r9uVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        pc30 pc30Var = new pc30(j, weuVar, str, qztVar, ctf0Var, fhjVar, wyuVar, vzg0Var, (byte) 1);
        xuh xuhVar = new xuh(oclVar, r9uVar, (byte) 8);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, pc30Var, xuhVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = vzg0Var;
        this.p = yoxVar;
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
        this.B = r7vVar;
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new sd30(this, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), yd30.h);
        c4m0 c4m0Var = this.F;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            byte b = 2;
            this.F = sac.T(new fnq(m1eVar.b(), new vd30(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new sd30(this, yjeVar, b));
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
            } while (!p7m0Var.m(value, hd30.a((hd30) value, null, null, true, false, false, false, null, 0L, 919)));
            boolean z = ((hd30) D()).e;
            mne mneVar = this.t;
            String str = this.q;
            yje yjeVar = null;
            yox yoxVar = this.p;
            this.C = z ? sac.T(new fnq(yoxVar.k(str), new sd30(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new td30(this, null, (byte) 0)) : sac.T(dtb.U(new fnq(yoxVar.k(str), new sd30(this, yjeVar, b), (byte) 4), 1), d5c.S(jiu0.a(this), mneVar.f22085a), new td30(this, null, (byte) 1));
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
        boolean z = ((hd30) D()).e;
        mne mneVar = this.t;
        this.D = z ? sac.X(jiu0.a(this), 30L, mneVar.b, ud30.f35461a, new vd30(this, yjeVar, (byte) 0)) : sac.V(jiu0.a(this), wd30.f38954a, null, mneVar.b, new vd30(this, yjeVar, b), 10);
        c4m0 c4m0Var2 = this.E;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.E) != null) {
            c4m0Var.cancel(null);
        }
        this.E = sac.T(new fnq(this.z.n(this.q), new khx((Object) this, (Object) this.u.a(), yjeVar, (byte) 16), (byte) 4), jiu0.a(this), xd30.h);
        M();
    }

    @Override // a.diu0
    public final void v() {
        ((jd30) ((ouu) this.B.f29996a).c).f16311a.a();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        pb30 pb30Var = (pb30) obj;
        pb30Var.getClass();
        super.x(pb30Var);
        if (!pb30Var.equals(mb30.f21488a)) {
            if (pb30Var.equals(ob30.f24959a)) {
                M();
                return;
            }
            if (!(pb30Var instanceof nb30)) {
                t9f.b();
                return;
            }
            long j = ((nb30) pb30Var).f23221a;
            this.o.e("CHECKED_CHIPS_ID_KEY", Long.valueOf(j));
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, hd30.a((hd30) value, null, null, false, false, false, false, null, j, 511)));
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
