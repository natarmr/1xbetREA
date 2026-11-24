package a;

import android.graphics.Bitmap;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class bmj0 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final vzg0 o;
    public final tpt p;
    public final i1w0 q;
    public final mne r;
    public final mzt s;
    public final qu t;
    public final s64 u;
    public final m1e v;
    public final pru w;
    public c4m0 x;
    public bby y;
    public boolean z;

    public bmj0(vzg0 vzg0Var, ctf0 ctf0Var, ocl oclVar, tpt tptVar, i1w0 i1w0Var, mne mneVar, mzt mztVar, qu quVar, s64 s64Var, m1e m1eVar, pru pruVar, wyu wyuVar, kl5 kl5Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        wja0 wja0Var = new wja0(wyuVar, vzg0Var);
        gpb0 gpb0Var = new gpb0(ctf0Var, oclVar, kl5Var);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, wja0Var, gpb0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = vzg0Var;
        this.p = tptVar;
        this.q = i1w0Var;
        this.r = mneVar;
        this.s = mztVar;
        this.t = quVar;
        this.u = s64Var;
        this.v = m1eVar;
        this.w = pruVar;
        sac.V(jiu0.a(this), ylj0.f42846a, null, rwjVar, new xlj0(this, null, (byte) 1), 10);
    }

    public final void M() {
        v3c.N(this.y);
        this.y = sac.V(jiu0.a(this), new uki0(1, this, bmj0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, null, new zlj0(this, null, (byte) 0), 14);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        olj0 olj0Var = (olj0) obj;
        olj0Var.getClass();
        super.x(olj0Var);
        boolean z = olj0Var instanceof llj0;
        mne mneVar = this.r;
        yje yjeVar = null;
        if (z) {
            v3c.N(this.x);
            this.x = sac.T(new fnq(this.v.b(), new zlj0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), amj0.h);
            return;
        }
        if (olj0Var instanceof klj0) {
            v3c.N(this.x);
            return;
        }
        boolean z2 = olj0Var instanceof ilj0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z2) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, vlj0.a((vlj0) value3, 0, null, null, false, true, 47)));
            return;
        }
        boolean z3 = olj0Var instanceof nlj0;
        s64 s64Var = this.u;
        qu quVar = this.t;
        if (z3) {
            int i = ((nlj0) olj0Var).f23731a;
            this.o.e("CURRENT_TAB", Integer.valueOf(i));
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, vlj0.a((vlj0) value2, i, null, null, false, false, 62)));
            String strL = fww.L(((vlj0) D()).f37627a);
            quVar.getClass();
            quVar.f29324a.a("acc_settings_share_qr_switch", wp20.b(new Pair("action", strL)));
            String strL2 = fww.L(i);
            s64Var.getClass();
            b1j.v(strL2, s64Var.f31684a, 11075L);
            return;
        }
        if (!(olj0Var instanceof glj0)) {
            if (!(olj0Var instanceof mlj0)) {
                if (olj0Var instanceof jlj0) {
                    M();
                    return;
                } else if (olj0Var instanceof hlj0) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            Bitmap bitmap = ((mlj0) olj0Var).f21993a;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, vlj0.a((vlj0) value, 0, null, null, false, false, 55)));
            String strL3 = fww.L(((vlj0) D()).f37627a);
            quVar.getClass();
            quVar.f29324a.a("acc_settings_share_qr_button", wp20.b(new Pair("option", strL3)));
            String strL4 = fww.L(((vlj0) D()).f37627a);
            s64Var.getClass();
            b1j.v(strL4, s64Var.f31684a, 3283L);
            ((us3) this.s.f22668a.b).getClass();
            G(new ulj0(bitmap));
            sac.f0(jiu0.a(this), 1L, TimeUnit.SECONDS, mneVar.b, new thj0((byte) 5), new xlj0(this, null, (byte) 0), 32);
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
