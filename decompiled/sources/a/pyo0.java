package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.favorites.impl.presentation.teambet.presentation.models.TeamBetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class pyo0 extends i3t0 {
    public final vzg0 o;
    public final TeamBetScreenParams p;
    public final i1w0 q;
    public final fck0 r;
    public final hcp0 s;
    public final pru t;
    public final n4u u;
    public final j9u v;
    public final yfu w;
    public final duj x;
    public final mne y;
    public bby z;

    /* JADX WARN: Illegal instructions before constructor call */
    public pyo0(vzg0 vzg0Var, TeamBetScreenParams teamBetScreenParams, i1w0 i1w0Var, fck0 fck0Var, hcp0 hcp0Var, pru pruVar, n4u n4uVar, j9u j9uVar, yfu yfuVar, duj dujVar, mne mneVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, new ttn0(teamBetScreenParams, (byte) 17), cvm0.p(rwjVar, rwjVar), new h0j0(ctf0Var, (byte) 14));
        this.o = vzg0Var;
        this.p = teamBetScreenParams;
        this.q = i1w0Var;
        this.r = fck0Var;
        this.s = hcp0Var;
        this.t = pruVar;
        this.u = n4uVar;
        this.v = j9uVar;
        this.w = yfuVar;
        this.x = dujVar;
        this.y = mneVar;
        i3t0.K(this, null, null, new m91(this, null, (byte) 20), 3);
    }

    public final void M(Throwable th) {
        this.x.b(th, new ofo0((byte) 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        pyo0 pyo0Var;
        iyo0 iyo0Var = (iyo0) obj;
        iyo0Var.getClass();
        super.x(iyo0Var);
        byte b = 0;
        byte b2 = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (iyo0Var instanceof dyo0) {
            int length = ((kyo0) D()).c.length();
            mne mneVar = this.y;
            if (length > 0) {
                pyo0Var = this;
            } else {
                e3c.n(this.z);
                pyo0Var = this;
                pyo0Var.z = sac.V(jiu0.a(this), new tfo0(1, this, pyo0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, mneVar.f22085a, new myo0(pyo0Var, objArr3 == true ? 1 : 0, b), 10);
            }
            Class<pyo0> cls = pyo0.class;
            sac.V(jiu0.a(pyo0Var), new tfo0(1, this, cls, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar.f22085a, new myo0(this, objArr5 == true ? 1 : 0, b2), 10);
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = mneVar.f22085a;
            sac.V(bvcVarA, new tfo0(1, this, cls, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, rwjVar, new myo0(this, objArr4 == true ? 1 : 0, (byte) 2), 10);
            return;
        }
        if (iyo0Var instanceof byo0) {
            e3c.n(this.z);
            return;
        }
        if (iyo0Var instanceof cyo0) {
            E();
            return;
        }
        if (!(iyo0Var instanceof eyo0)) {
            if (!(iyo0Var instanceof hyo0)) {
                if (iyo0Var instanceof fyo0) {
                    i3t0.K(this, null, new tfo0(1, this, pyo0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 25), new oyo0(this, objArr2 == true ? 1 : 0, b), 1);
                    return;
                }
                if (!(iyo0Var instanceof gyo0)) {
                    t9f.b();
                    return;
                }
                i3t0.K(this, null, new tfo0(1, this, pyo0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 26), new oyo0(this, objArr == true ? 1 : 0, b2), 1);
                return;
            }
            hyo0 hyo0Var = (hyo0) iyo0Var;
            for (Object obj3 : j3p0.e) {
                if (hyo0Var.f13868a == ((j3p0) obj3).f15848a) {
                    obj2 = obj3;
                    break;
                }
            }
            j3p0 j3p0Var = (j3p0) obj2;
            if (j3p0Var == null) {
                j3p0Var = j3p0.c;
            }
            j3p0 j3p0Var2 = j3p0Var;
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0 oyg0Var = this.f;
                oyg0Var.getClass();
                q7x.F(oyg0Var, j3p0Var2, "CURRENT_TAB_KEY");
            } while (!p7m0Var.m(value, kyo0.a((kyo0) value, null, null, j3p0Var2, false, false, 111)));
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
