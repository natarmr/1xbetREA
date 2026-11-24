package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class pac0 extends i3t0 {
    public static final /* synthetic */ int y = 0;
    public final mne o;
    public final duj p;
    public final b4j q;
    public final abu r;
    public final m1e s;
    public final x20 t;
    public final mne u;
    public final i1w0 v;
    public final vzg0 w;
    public c4m0 x;

    public pac0(ctf0 ctf0Var, mne mneVar, duj dujVar, b4j b4jVar, abu abuVar, m1e m1eVar, x20 x20Var, mne mneVar2, i1w0 i1w0Var, vzg0 vzg0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        wg2 wg2Var = new wg2(vzg0Var, (byte) 8);
        iv80 iv80Var = new iv80(ctf0Var, (byte) 8);
        rwj rwjVar = mneVar2.f22085a;
        super(null, wg2Var, iv80Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = mneVar;
        this.p = dujVar;
        this.q = b4jVar;
        this.r = abuVar;
        this.s = m1eVar;
        this.t = x20Var;
        this.u = mneVar2;
        this.v = i1w0Var;
        this.w = vzg0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        j9c0 j9c0Var = (j9c0) obj;
        j9c0Var.getClass();
        super.x(j9c0Var);
        boolean z = j9c0Var instanceof c9c0;
        byte b = 0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        yje yjeVar = null;
        if (z) {
            String string = StringsKt.u0(((c9c0) j9c0Var).f3955a).toString();
            G(cac0.f4004a);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, jac0.a((jac0) value4, true, false, false, null, null, 30)));
            sac.R(jiu0.a(this), new oac0(this, string, b), new ssa0(this, (byte) 19), this.o.b, new oed(this, string, yjeVar, (byte) 16));
            return;
        }
        boolean z2 = j9c0Var instanceof d9c0;
        vzg0 vzg0Var = this.w;
        if (z2) {
            vzg0Var.e("SAVE_STATE_INPUT_PROMO_KEY", "");
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, jac0.a((jac0) value3, false, false, false, "", null, 2)));
            return;
        }
        if (!(j9c0Var instanceof w8c0)) {
            if (j9c0Var instanceof y8c0) {
                E();
                return;
            }
            if (j9c0Var instanceof g9c0) {
                String str = ((g9c0) j9c0Var).f10907a;
                vzg0Var.e("SAVE_STATE_INPUT_PROMO_KEY", StringsKt.u0(str).toString());
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value, jac0.a((jac0) value, false, false, false, str, null, 19)));
                return;
            }
            if (!j9c0Var.equals(e9c0.f7414a)) {
                if (j9c0Var.equals(f9c0.f9148a)) {
                    v3c.N(this.x);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            c4m0 c4m0Var = this.x;
            byte b2 = 1;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.x = sac.T(new fnq(this.s.b(), new c670(this, yjeVar, (byte) 26), (byte) 4), d5c.S(jiu0.a(this), this.u.f22085a), new s9c0(this, yjeVar, b2));
                return;
            }
            return;
        }
        if (((jac0) D()).e != null) {
            vzg0Var.e("SAVE_STATE_INPUT_PROMO_KEY", "");
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value2 = p7m0Var4.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value2, jac0.a((jac0) value2, false, false, false, "", null, 2)));
            return;
        }
        i1w0 i1w0Var = this.v;
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
