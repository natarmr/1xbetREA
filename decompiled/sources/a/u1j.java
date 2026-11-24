package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class u1j extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final ctf0 o;
    public final h4u p;
    public final duj q;
    public final mne r;
    public final crt s;
    public final rpt t;
    public final b4j u;
    public final je v;
    public final crt w;
    public c4m0 x;
    public bby y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1j(ctf0 ctf0Var, h4u h4uVar, duj dujVar, mne mneVar, crt crtVar, rpt rptVar, b4j b4jVar, je jeVar, crt crtVar2) {
        super(new bmh((byte) 18), cvm0.p(mneVar.c, mneVar.f22085a), new ep4(ctf0Var, (byte) 25), (yzn0) null);
        ctf0Var.getClass();
        this.o = ctf0Var;
        this.p = h4uVar;
        this.q = dujVar;
        this.r = mneVar;
        this.s = crtVar;
        this.t = rptVar;
        this.u = b4jVar;
        this.v = jeVar;
        this.w = crtVar2;
    }

    public final void M(int i, String str) {
        int i2 = i + 1;
        b4j b4jVar = this.u;
        b4jVar.getClass();
        b4jVar.f1961a.a("dchallenge_popup_close", xp20.f(new Pair("index", Integer.valueOf(i2)), new Pair("position", str)));
        je jeVar = this.v;
        jeVar.getClass();
        jeVar.f16351a.a(tx3.l0(new k1p[]{new i1p(i2, (byte) 2), new j1p(str, (byte) 1)}), 10928L);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        n1j n1jVar = (n1j) obj;
        n1jVar.getClass();
        super.x(n1jVar);
        if (n1jVar instanceof h1j) {
            E();
            return;
        }
        boolean z2 = n1jVar instanceof i1j;
        byte b = 0;
        mne mneVar = this.r;
        yje yjeVar = null;
        byte b2 = 1;
        if (z2) {
            sac.T(new fnq(this.w.a(), new r1j(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new r1j(this, yjeVar, b2));
            return;
        }
        if (n1jVar instanceof j1j) {
            e3c.n(this.x);
            e3c.n(this.y);
            return;
        }
        if (n1jVar instanceof l1j) {
            M(((l1j) n1jVar).f19256a, "button");
            G(y1j.f41857a);
            return;
        }
        if (n1jVar instanceof k1j) {
            k1j k1jVar = (k1j) n1jVar;
            if (k1jVar.f17526a + 1 != k1jVar.b) {
                this.u.f1961a.c("dchallenge_popup_second");
                this.v.f16351a.a(xun.f41520a, 10927L);
                return;
            }
            bby bbyVar = this.y;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.y = sac.V(jiu0.a(this), new x2i((byte) 2), null, mneVar.b, new t1j(this, yjeVar, b2), 10);
                return;
            }
            return;
        }
        if (!(n1jVar instanceof m1j)) {
            if (n1jVar instanceof g1j) {
                M(!((b2j) D()).b ? 1 : 0, "outside");
                return;
            } else {
                t9f.b();
                return;
            }
        }
        m1j m1jVar = (m1j) n1jVar;
        int i = m1jVar.f21010a + 1;
        int i2 = m1jVar.b;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (i == i2) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, b2j.a((b2j) value2, null, false, 1)));
            return;
        }
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value = p7m0Var2.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value, b2j.a((b2j) value, null, true, 1)));
    }
}
