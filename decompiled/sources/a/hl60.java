package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class hl60 extends w46 {
    public final gxu b;
    public final rek0 c;
    public final yo4 d;
    public final s64 e;
    public final zr1 f;
    public final ort g;
    public final nyb h;
    public final sp4 i;
    public final rou j;
    public final zn00 k;
    public final z4w0 l;
    public final boolean m;
    public final i1w0 n;
    public final ctf0 o;
    public final mi70 p;
    public final myb q;
    public final ik4 r;
    public final vd1 s;
    public final duj t;
    public final p7m0 u;
    public final ol60 v;
    public bby w;
    public m2c0 x;

    public hl60(vzg0 vzg0Var, gxu gxuVar, rek0 rek0Var, epc epcVar, yo4 yo4Var, s64 s64Var, zr1 zr1Var, ort ortVar, uyu uyuVar, nyb nybVar, sp4 sp4Var, rou rouVar, zn00 zn00Var, z4w0 z4w0Var, boolean z, i1w0 i1w0Var, ctf0 ctf0Var, mi70 mi70Var, myb mybVar, mne mneVar, ik4 ik4Var, vd1 vd1Var, duj dujVar) {
        ctf0Var.getClass();
        this.b = gxuVar;
        this.c = rek0Var;
        this.d = yo4Var;
        this.e = s64Var;
        this.f = zr1Var;
        this.g = ortVar;
        this.h = nybVar;
        this.i = sp4Var;
        this.j = rouVar;
        this.k = zn00Var;
        this.l = z4w0Var;
        this.m = z;
        this.n = i1w0Var;
        this.o = ctf0Var;
        this.p = mi70Var;
        this.q = mybVar;
        this.r = ik4Var;
        this.s = vd1Var;
        this.t = dujVar;
        byte b = 1;
        this.u = q7m0.a(new ek60(lak0.c, z, true));
        this.v = new ol60(3);
        if (!epcVar.a().f13512a) {
            i1w0Var.d(new yk60(this, b));
            return;
        }
        bvc bvcVarA = jiu0.a(this);
        vs10 vs10Var = mneVar.c;
        yje yjeVar = null;
        sac.V(bvcVarA, new jw50(1, dujVar, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, vs10Var, new w620((Object) this, yjeVar, (byte) 27), 10);
        sac.T(new fnq(uyuVar.f36509a.h(), new nf60(this, yjeVar, (byte) 5), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), el60.h);
    }

    public final void A() {
        z(false);
        this.d.f42966a.c("authenticator_next_call");
        this.f.f44833a.a(xun.f41520a, 3338L);
        sac.V(jiu0.a(this), new yk60(this, (byte) 0), null, null, new j940((Object) this, (yje) null, (byte) 27), 14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(zje zjeVar) {
        fl60 fl60Var;
        if (zjeVar instanceof fl60) {
            fl60Var = (fl60) zjeVar;
            int i = fl60Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fl60Var.k = i - Integer.MIN_VALUE;
            } else {
                fl60Var = new fl60(this, zjeVar);
            }
        } else {
            fl60Var = new fl60(this, zjeVar);
        }
        Object objA = fl60Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fl60Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            m2c0 m2c0Var = this.x;
            if (m2c0Var != null) {
                return m2c0Var;
            }
            fl60Var.k = 1;
            objA = this.j.a(true, fl60Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        m2c0 m2c0Var2 = (m2c0) objA;
        this.x = m2c0Var2;
        return m2c0Var2;
    }

    public final void w(jqt0 jqt0Var) {
        if (!q3d.j(jqt0.e, jqt0.d).contains(jqt0Var)) {
            this.v.f(al60.f1053a);
            return;
        }
        bby bbyVar = this.w;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.w = sac.V(jiu0.a(this), new yk60(this, (byte) 3), null, null, new cl60(this, null), 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(zje zjeVar) {
        dl60 dl60Var;
        if (zjeVar instanceof dl60) {
            dl60Var = (dl60) zjeVar;
            int i = dl60Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dl60Var.k = i - Integer.MIN_VALUE;
            } else {
                dl60Var = new dl60(this, zjeVar);
            }
        } else {
            dl60Var = new dl60(this, zjeVar);
        }
        Object objB = dl60Var.i;
        Object obj = wne.f39444a;
        int i2 = dl60Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            dl60Var.k = 1;
            objB = B(dl60Var);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        this.n.d(new rw40(this, ((m2c0) objB).Z, (byte) 24));
        return Unit.f46060a;
    }

    public final void y(boolean z) {
        i8i.D("point", z ? "system_back" : "back", this.d.f42966a, "authenticator_back_click");
        this.f.f44833a.a(cui0.b(new j1p(z ? "system_back" : "back", (byte) 0)), 3339L);
        i1w0 i1w0Var = this.n;
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

    public final void z(boolean z) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.u;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ek60.a((ek60) value, z, null, 13)));
    }
}
