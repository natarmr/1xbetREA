package a;

import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class mt extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public final u58 A;
    public final mi70 B;
    public bby C;
    public final myg0 o;
    public final gu00 p;
    public final krc q;
    public final dbu r;
    public final vd1 s;
    public final zg t;
    public final oeg0 u;
    public final zpu v;
    public final ctf0 w;
    public final au0 x;
    public final ik4 y;
    public final gg5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(vzg0 vzg0Var, myg0 myg0Var, gu00 gu00Var, krc krcVar, dbu dbuVar, vd1 vd1Var, zg zgVar, yo4 yo4Var, z4w0 z4w0Var, oeg0 oeg0Var, zpu zpuVar, ctf0 ctf0Var, au0 au0Var, ik4 ik4Var, gg5 gg5Var, u58 u58Var, mi70 mi70Var, mne mneVar) {
        super(null, new q8((byte) 16), new uc(ctf0Var, (byte) 1), cvm0.p(mneVar.c, mneVar.f22085a), null);
        oeg0Var.getClass();
        ctf0Var.getClass();
        this.o = myg0Var;
        this.p = gu00Var;
        this.q = krcVar;
        this.r = dbuVar;
        this.s = vd1Var;
        this.t = zgVar;
        this.u = oeg0Var;
        this.v = zpuVar;
        this.w = ctf0Var;
        this.x = au0Var;
        this.y = ik4Var;
        this.z = gg5Var;
        this.A = u58Var;
        this.B = mi70Var;
    }

    public final void M(boolean z) {
        ((xwb0) this.r.f5820a.b).a("fingerprint_enabled", z);
        gg5 gg5Var = this.z;
        gg5Var.getClass();
        String str = AuthorizationHeaderIms.NO;
        b1j.v(z ? AuthorizationHeaderIms.YES : AuthorizationHeaderIms.NO, gg5Var.f11237a, 11006L);
        u58 u58Var = this.A;
        u58Var.getClass();
        if (z) {
            str = AuthorizationHeaderIms.YES;
        }
        i8i.D("point", str, u58Var.f35083a, "acc_settings_biometrics_click");
        i1w0 i1w0VarC = this.u.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void N(String str) {
        bby bbyVar = this.C;
        if ((bbyVar == null || !bbyVar.isActive()) && str.length() <= 4) {
            this.C = i3t0.K(this, null, null, new za(this, str, null, (byte) 3), 3);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        ys ysVar = (ys) obj;
        ysVar.getClass();
        super.x(ysVar);
        boolean z = ysVar instanceof ps;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            ps psVar = (ps) ysVar;
            if (!psVar.equals(os.f25759a)) {
                if (psVar.equals(ns.f24029a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, kt.a((kt) value2, null, null, null, false, 47)));
            return;
        }
        if (!(ysVar instanceof xs)) {
            t9f.b();
            return;
        }
        xs xsVar = (xs) ysVar;
        boolean zEquals = xsVar.equals(qs.f29233a);
        p0w0 p0w0Var = p0w0.f26173a;
        oeg0 oeg0Var = this.u;
        if (zEquals) {
            i1w0 i1w0VarC = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0VarC, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            if (xsVar.equals(rs.f31009a)) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, kt.a((kt) value, null, null, null, false, 31)));
                return;
            }
            boolean zEquals2 = xsVar.equals(ss.f32703a);
            gu00 gu00Var = this.p;
            if (!zEquals2) {
                if (xsVar.equals(us.f36184a)) {
                    this.s.c();
                    this.y.f14907a.a(tx3.l0(new k1p[]{new j1p("acc_safety", (byte) 0), new j1p("allert_add_phone", (byte) 1)}), 3231L);
                    oeg0Var.c().d(new t1(this, (byte) 14));
                    return;
                }
                if (xsVar instanceof vs) {
                    vs vsVar = (vs) xsVar;
                    au90 au90Var = vsVar.b;
                    boolean z2 = au90Var instanceof xt90;
                    String str = vsVar.f37924a;
                    if (!z2) {
                        N(ttm0.H(1, str));
                        return;
                    }
                    N(str + ((xt90) au90Var).f41455a);
                    return;
                }
                if (!xsVar.equals(ws.f39669a)) {
                    if (xsVar instanceof ts) {
                        M(((ts) xsVar).f34439a);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                ((SharedPreferences) ((xwb0) this.o.f22602a.b).c.getValue()).edit().putString("fingerprint_pass", ((kt) D()).f18838a).apply();
                ((xwb0) gu00Var.f11906a.b).a("fingerprint_auth_enabled", true);
                this.t.f44322a.c("acc_settings_pin_set_done");
                this.x.f1455a.a(xun.f41520a, 3260L);
                if (this.v.l()) {
                    G(ht.f13606a);
                    return;
                } else {
                    M(false);
                    return;
                }
            }
            this.q.b();
            ((xwb0) gu00Var.f11906a.b).a("fingerprint_auth_enabled", false);
            i1w0 i1w0VarC2 = oeg0Var.c();
            i1w0VarC2.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0VarC2, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
