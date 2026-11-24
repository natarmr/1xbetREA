package a;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.app_update.api.presentation.AppUpdateScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class on3 extends w46 {
    public final vzg0 b;
    public final AppUpdateScreenParams c;
    public final i1w0 d;
    public final ctf0 e;
    public final bb6 f;
    public final nmo g;
    public final mne h;
    public final ocl i;
    public final g2v j;
    public final f7u k;
    public final ilp0 l;
    public final p4u m;
    public final e41 n;
    public final b4j o;
    public final evt p;
    public final iy3 q;
    public final p7m0 r;
    public final p7m0 s;
    public bby t;

    public on3(vzg0 vzg0Var, AppUpdateScreenParams appUpdateScreenParams, i1w0 i1w0Var, pru pruVar, ctf0 ctf0Var, bb6 bb6Var, nmo nmoVar, mne mneVar, aqt aqtVar, ocl oclVar, p4u p4uVar, g2v g2vVar, f7u f7uVar, ilp0 ilp0Var, m1e m1eVar, n4u n4uVar, p4u p4uVar2, e41 e41Var, b4j b4jVar, evt evtVar) {
        byte b;
        boolean z;
        ctf0Var.getClass();
        aqtVar.getClass();
        m1eVar.getClass();
        this.b = vzg0Var;
        this.c = appUpdateScreenParams;
        this.d = i1w0Var;
        this.e = ctf0Var;
        this.f = bb6Var;
        this.g = nmoVar;
        this.h = mneVar;
        this.i = oclVar;
        this.j = g2vVar;
        this.k = f7uVar;
        this.l = ilp0Var;
        this.m = p4uVar2;
        this.n = e41Var;
        this.o = b4jVar;
        this.p = evtVar;
        iy3 iy3VarK0 = jd8.k0(i120.a0(ctf0Var.e.f14784a));
        this.q = iy3VarK0;
        n0o0 n0o0VarB = maz.b(new hc0(pruVar, (byte) 7));
        tm3 tm3Var = ((sff0) n0o0VarB.getValue()).R0;
        boolean z2 = ((sff0) n0o0VarB.getValue()).k0;
        aqtVar.a();
        Integer num = (Integer) vzg0Var.a("KEY_DOWNLOAD_UPDATE_PROGRESS");
        boolean z3 = appUpdateScreenParams.b;
        byte b2 = 1;
        boolean z4 = Build.VERSION.SDK_INT < 29;
        qm3 qm3Var = ((sff0) n0o0VarB.getValue()).R0.d;
        qm3 qm3Var2 = qm3.REMOTE_IMAGE;
        if (qm3Var != qm3Var2) {
            b = 0;
            z = true;
        } else {
            b = 0;
            z = false;
        }
        p7m0 p7m0VarA = q7m0.a(new um3(iy3VarK0, tm3Var, null, null, z2, "org.xbet.client1", num, z3, false, false, false, false, false, false, false, z4, z));
        this.r = p7m0VarA;
        this.s = q7m0.a(rl3.f30677a);
        yje yjeVar = null;
        sac.V(jiu0.a(this), new bn3(this, b), null, mneVar.b, new nn3(this, yjeVar, b), 10);
        byte b3 = 2;
        if (((um3) p7m0VarA.getValue()).b.d == qm3Var2) {
            sac.V(jiu0.a(this), new bn3(this, (byte) 2), null, mneVar.b, new wa(this, yjeVar, (byte) 9), 10);
        }
        if (!((um3) p7m0VarA.getValue()).j && ((um3) p7m0VarA.getValue()).g != null) {
            y();
        }
        sac.T(new fnq(m1eVar.b(), new nn3(this, yjeVar, b2), (byte) 4), jiu0.a(this), new pd(b3, yjeVar, (byte) 16));
        slb.U(new fnq(new i89(((crq) ((ocl) n4uVar.b).f25032a).f4857a, (byte) 22), new tg3(this, null), (byte) 4), jiu0.a(this));
        sac.T(new fnq(new i89(((dcl) ((prc) p4uVar.f26374a).b).f5851a, (byte) 22), new cm3(this, yjeVar, b3), (byte) 4), jiu0.a(this), new pd(b3, yjeVar, (byte) 15));
    }

    public final List w() {
        String strA = this.e.b.a(R.string.default_whats_new_update_message, Arrays.copyOf(new Object[0], 0));
        ysw yswVar = new ysw(null, 15);
        return kotlin.collections.a.c(new ykg0(false, strA, yswVar, yswVar, clg0.DEFAULT));
    }

    public final void x(gk3 gk3Var) {
        Object value;
        boolean zEquals = gk3Var.equals(ck3.f4487a);
        e41 e41Var = this.n;
        b4j b4jVar = this.o;
        p7m0 p7m0Var = this.r;
        if (!zEquals) {
            boolean z = gk3Var instanceof fk3;
            p7m0 p7m0Var2 = this.s;
            yje yjeVar = null;
            if (z) {
                if (((um3) p7m0Var.getValue()).m) {
                    b4jVar.s("update");
                    e41Var.f("update");
                    if (Build.VERSION.SDK_INT < 26) {
                        y();
                        return;
                    } else {
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, vl3.f37603a);
                        return;
                    }
                }
                return;
            }
            if (gk3Var instanceof ek3) {
                y();
                return;
            }
            if (gk3Var.equals(jtv.b)) {
                p7m0Var2.getClass();
                p7m0Var2.o(null, rl3.f30677a);
                return;
            }
            if (gk3Var.equals(rv00.c)) {
                b4jVar.s("what_new");
                e41Var.f("what_new");
                if (((um3) p7m0Var.getValue()).m) {
                    sac.V(jiu0.a(this), new bn3(this, (byte) 1), null, this.h.c, new y32(this, yjeVar, (byte) 10), 10);
                    return;
                }
                return;
            }
            if (!(gk3Var instanceof dk3)) {
                t9f.b();
                return;
            } else {
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, um3.a((um3) value, null, null, null, null, false, false, false, false, false, 122879)));
                return;
            }
        }
        b4jVar.s("close");
        e41Var.f("close");
        um3 um3Var = (um3) p7m0Var.getValue();
        boolean z2 = um3Var.h;
        boolean z3 = um3Var.j;
        if ((z2 || z3) && !(z3 && um3Var.g == null)) {
            return;
        }
        i1w0 i1w0Var = this.d;
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

    public final void y() {
        bby bbyVar = this.t;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.t = sac.V(jiu0.a(this), new bn3(this, (byte) 3), null, this.h.c, new nn3(this, null, (byte) 2), 10);
        }
    }
}
