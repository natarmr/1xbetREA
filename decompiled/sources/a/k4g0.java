package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k4g0 extends i3t0 {
    public static final /* synthetic */ int F = 0;
    public c4m0 A;
    public bby B;
    public bby C;
    public bby D;
    public bby E;
    public final vzg0 o;
    public final g2g0 p;
    public final reu q;
    public final owp0 r;
    public final p4u s;
    public final j3c t;
    public final luu u;
    public final s31 v;
    public final cyu w;
    public final mne x;
    public final m1e y;
    public final p7m0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public k4g0(vzg0 vzg0Var, pru pruVar, g2g0 g2g0Var, reu reuVar, owp0 owp0Var, p4u p4uVar, j3c j3cVar, luu luuVar, ctf0 ctf0Var, s31 s31Var, cyu cyuVar, mne mneVar, m1e m1eVar, bzt bztVar, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(vs10Var, rwjVar);
        yje yjeVar = null;
        super(new mr0(pruVar, bztVar, r9uVar, ctf0Var, (byte) 29), g090VarP, new wtf0((byte) 4), (yzn0) null);
        this.o = vzg0Var;
        this.p = g2g0Var;
        this.q = reuVar;
        this.r = owp0Var;
        this.s = p4uVar;
        this.t = j3cVar;
        this.u = luuVar;
        this.v = s31Var;
        this.w = cyuVar;
        this.x = mneVar;
        this.y = m1eVar;
        this.z = q7m0.a("");
        i3t0.K(this, null, null, new hhb0(this, yjeVar, (byte) 7), 3);
        sac.V(jiu0.a(this), e4g0.f7181a, null, rwjVar, new f4g0(this, yjeVar, (byte) 0), 10);
    }

    public final synchronized void M(String str, boolean z) {
        p7m0 p7m0Var;
        Object value;
        Object value2;
        Object value3;
        List list;
        Object value4;
        try {
            v3c.N(this.C);
            yje yjeVar = null;
            if (z) {
                p7m0 p7m0Var2 = this.i.f25029a;
                do {
                    value4 = p7m0Var2.getValue();
                    value4.getClass();
                    this.f.getClass();
                } while (!p7m0Var2.m(value4, y3g0.a((y3g0) value4, false, null, true, null, null, null, null, null, false, false, 16379)));
            } else if (((y3g0) D()).e instanceof ohh0) {
                whh0 whh0Var = ((y3g0) D()).e;
                ohh0 ohh0Var = whh0Var instanceof ohh0 ? (ohh0) whh0Var : null;
                if (ohh0Var == null || (list = ohh0Var.b) == null || !list.isEmpty()) {
                    whh0 whh0Var2 = ((y3g0) D()).e;
                    ohh0 ohh0Var2 = whh0Var2 instanceof ohh0 ? (ohh0) whh0Var2 : null;
                    if (Intrinsics.d(ohh0Var2 != null ? ohh0Var2.f25264a : null, str)) {
                        p7m0 p7m0Var3 = this.i.f25029a;
                        do {
                            value3 = p7m0Var3.getValue();
                            value3.getClass();
                            this.f.getClass();
                        } while (!p7m0Var3.m(value3, y3g0.a((y3g0) value3, false, null, false, null, null, null, null, null, false, false, 16379)));
                        return;
                    }
                    p7m0 p7m0Var4 = this.i.f25029a;
                    do {
                        value2 = p7m0Var4.getValue();
                        value2.getClass();
                        this.f.getClass();
                    } while (!p7m0Var4.m(value2, y3g0.a((y3g0) value2, false, null, true, null, null, null, null, null, false, false, 16379)));
                } else {
                    p7m0Var = this.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        this.f.getClass();
                    } while (!p7m0Var.m(value, y3g0.a((y3g0) value, false, null, false, null, qhh0.f28739a, null, null, null, false, false, 16363)));
                }
            } else {
                p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, y3g0.a((y3g0) value, false, null, false, null, qhh0.f28739a, null, null, null, false, false, 16363)));
            }
            this.C = sac.W(jiu0.a(this), true, "ResultSearchViewModel.loadData", this.x.f22085a, new c4g0(this, (byte) 0), new iq3((Object) this, (Object) str, yjeVar, (byte) 4));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void N(boolean z) {
        Object value;
        Object value2;
        try {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, y3g0.a((y3g0) value, false, null, false, null, qhh0.f28739a, null, null, null, false, false, 16367)));
            a8z a8zVarA = maz.a(wez.b, new rd7(z, (Object) this, (byte) 17));
            bby bbyVar = this.B;
            byte b = 1;
            if ((bbyVar == null || !bbyVar.isActive()) && !((Boolean) a8zVarA.getValue()).booleanValue()) {
                this.B = sac.W(jiu0.a(this), !((y3g0) D()).f41952a, k4g0.class.getName(), this.x.f22085a, new c4g0(this, b), new zye0((Object) this, (yje) null, (byte) 13));
                p7m0 p7m0Var2 = this.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    this.f.getClass();
                } while (!p7m0Var2.m(value2, y3g0.a((y3g0) value2, true, null, false, null, null, null, null, null, false, false, 16382)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        q3g0 q3g0Var = (q3g0) obj;
        q3g0Var.getClass();
        boolean z = q3g0Var instanceof k3g0;
        u3g0 u3g0Var = u3g0.f34996a;
        if (z) {
            aw40 aw40Var = ((k3g0) q3g0Var).f17617a;
            G(u3g0Var);
            G(new v3g0(aw40Var.b));
            long j = aw40Var.f1556a;
            h97.x("game_id", Long.valueOf(j), this.v.f31532a, "search_recomendation_call");
            b1j.r((int) j, (s1p) this.w.f5196a, 3073L);
            return;
        }
        boolean zEquals = q3g0Var.equals(o3g0.f24584a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        m1e m1eVar = this.y;
        byte b = 1;
        if (zEquals) {
            if (m1eVar.c()) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, y3g0.a((y3g0) value3, false, null, false, null, null, null, null, null, false, false, 16382)));
                String str = ((y3g0) D()).b;
                if (ntb.Y(str)) {
                    N(true);
                    return;
                } else {
                    M(str, false);
                    return;
                }
            }
            return;
        }
        if (q3g0Var.equals(m3g0.f21114a)) {
            M(((y3g0) D()).b, true);
            return;
        }
        if (q3g0Var instanceof p3g0) {
            i3t0.A(this, this.p, q0x.U(((p3g0) q3g0Var).f26299a), null, null, 6);
            return;
        }
        if (q3g0Var.equals(g3g0.f10610a)) {
            E();
            return;
        }
        boolean zEquals2 = q3g0Var.equals(h3g0.f12384a);
        p7m0 p7m0Var2 = this.z;
        yje yjeVar = null;
        if (zEquals2) {
            bby bbyVar = this.D;
            mne mneVar = this.x;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.D = sac.V(jiu0.a(this), g4g0.f10665a, null, mneVar.f22085a, new f4g0(this, yjeVar, b), 10);
            }
            c4m0 c4m0Var = this.A;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.A = sac.T(new p6d(i120.W(new lsa(aoq.a(p7m0Var2, new k6d0(this, yjeVar, (byte) 17)), (byte) 9)), m1eVar.b(), new ib60(this, yjeVar, (byte) 8), b), d5c.S(jiu0.a(this), mneVar.f22085a), j4g0.h);
            }
            bby bbyVar2 = this.E;
            if (bbyVar2 == null || !bbyVar2.isActive()) {
                this.E = i3t0.F(this, this.p, null, null, new vtf0((byte) 4), 119);
                return;
            }
            return;
        }
        if (q3g0Var.equals(i3g0.f14095a)) {
            v3c.N(this.E);
            v3c.N(this.A);
            v3c.N(this.C);
            v3c.N(this.B);
            v3c.N(this.D);
            return;
        }
        if (q3g0Var instanceof l3g0) {
            String str2 = ((l3g0) q3g0Var).f19358a;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, y3g0.a((y3g0) value2, false, str2, false, null, null, null, null, null, false, false, 16381)));
            p7m0Var2.getClass();
            p7m0Var2.o(null, str2);
            return;
        }
        if (!q3g0Var.equals(n3g0.f22849a)) {
            if (q3g0Var.equals(j3g0.f15831a)) {
                G(u3g0Var);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        p7m0 p7m0Var4 = ocjVar.f25029a;
        do {
            value = p7m0Var4.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var4.m(value, y3g0.a((y3g0) value, false, null, false, null, null, null, null, null, false, false, 14335)));
    }
}
