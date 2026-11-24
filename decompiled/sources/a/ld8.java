package a;

import android.javax.sip.message.Response;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ld8 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public bby A;
    public rb8 B;
    public boolean C;
    public final kki o;
    public final yuu p;
    public final b4j q;
    public final x20 r;
    public final bzt s;
    public final m1e t;
    public final duj u;
    public final mne v;
    public final ctf0 w;
    public final i1w0 x;
    public bby y;
    public c4m0 z;

    public ld8(kki kkiVar, yuu yuuVar, b4j b4jVar, x20 x20Var, bzt bztVar, m1e m1eVar, duj dujVar, mne mneVar, ctf0 ctf0Var, i1w0 i1w0Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        os7 os7Var = new os7((byte) 27);
        kd8 kd8Var = kd8.f18093a;
        rwj rwjVar = mneVar.f22085a;
        super(null, os7Var, kd8Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = kkiVar;
        this.p = yuuVar;
        this.q = b4jVar;
        this.r = x20Var;
        this.s = bztVar;
        this.t = m1eVar;
        this.u = dujVar;
        this.v = mneVar;
        this.w = ctf0Var;
        this.x = i1w0Var;
        this.C = true;
        M(false, true);
    }

    public final void M(boolean z, boolean z2) {
        v3c.N(this.y);
        this.y = sac.V(jiu0.a(this), new x9((Object) this, z2, (byte) 5), null, this.v.b, new no0((byte) 1, null, this, z2, z), 10);
    }

    public final mdm N() {
        xuz xuzVar = pb10.c;
        pb10 pb10Var = pb10.g;
        int i = this.s.f3488a.a().r;
        xuzVar.getClass();
        return new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
    }

    public final void O(Throwable th, boolean z) {
        Object value;
        oyg0 oyg0Var;
        Object value2;
        ocj ocjVar = this.i;
        p7m0 p7m0Var = ocjVar.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            oyg0Var = this.f;
            oyg0Var.getClass();
        } while (!p7m0Var.m(value, hd8.a((hd8) value, null, false, false, false, null, 25)));
        if (((hd8) D()).f12857a.equals(new ic8(iun.f15405a, "", "")) || agc.L(th) || z) {
            mdm mdmVarN = N();
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, hd8.a((hd8) value2, new ic8(iun.f15405a, "", ""), false, false, true, mdmVarN, 6)));
        } else {
            G(new ed8(this.w.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0))));
        }
        this.u.b(th, new i87((byte) 23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        rb8 rb8Var;
        rc8 rc8Var = (rc8) obj;
        rc8Var.getClass();
        super.x(rc8Var);
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (rc8Var instanceof pc8) {
            int i = ((pc8) rc8Var).f26745a;
            for (Object obj3 : ((hd8) D()).f12857a.c) {
                if (((rb8) obj3).f30171a == i) {
                    obj2 = obj3;
                    break;
                }
            }
            rb8 rb8Var2 = (rb8) obj2;
            if (rb8Var2 == null || rb8Var2.e) {
                return;
            }
            this.B = rb8Var2;
            int i2 = rb8Var2.f30171a;
            ah8[] ah8VarArr = ah8.f860a;
            G(new dd8(this.w.b.a(i2 == 0 ? R.string.reject_bonus_warning : (rb8Var2.f || i2 == 2 || i2 == 1) ? R.string.change_bonus_warning : R.string.approve_bonus, Arrays.copyOf(new Object[0], 0))));
            return;
        }
        if (rc8Var.equals(oc8.f25016a)) {
            M(true, true);
            return;
        }
        if (rc8Var.equals(qc8.f28473a)) {
            M(false, true);
            return;
        }
        boolean zEquals = rc8Var.equals(kc8.f18046a);
        mne mneVar = this.v;
        if (zEquals) {
            bby bbyVar = this.A;
            if ((bbyVar == null || !bbyVar.isActive()) && (rb8Var = this.B) != null) {
                int i3 = rb8Var.f30171a;
                b1j.w("reg_type", Integer.valueOf(i3), this.q.f1961a, "promo_bonus_change");
                this.r.f40143a.a(cui0.b(new i1p(i3, (byte) 2)), 3322L);
                this.A = sac.V(jiu0.a(this), new d38(this, (byte) 4), null, mneVar.b, new xw5(this, rb8Var, objArr3 == true ? 1 : 0, (byte) 24), 10);
                return;
            }
            return;
        }
        if (!rc8Var.equals(jc8.f16263a)) {
            if (rc8Var.equals(lc8.f19787a)) {
                E();
                return;
            }
            if (!rc8Var.equals(mc8.f21538a)) {
                if (rc8Var.equals(nc8.f23279a)) {
                    v3c.N(this.z);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            c4m0 c4m0Var = this.z;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.z = sac.T(new fnq(this.t.b(), new qv3(this, objArr2 == true ? 1 : 0, (byte) 16), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new yp6(this, objArr == true ? 1 : 0, (byte) 13));
                return;
            }
            return;
        }
        i1w0 i1w0Var = this.x;
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
