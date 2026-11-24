package a;

import java.util.Arrays;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class be10 extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public bby A;
    public final o470 o;
    public final mne p;
    public final a6u q;
    public final ntu r;
    public final xru s;
    public final hcp0 t;
    public final v88 u;
    public final i1w0 v;
    public final ctf0 w;
    public final duj x;
    public final fd10 y;
    public boolean z;

    public be10(m1e m1eVar, o470 o470Var, mne mneVar, a6u a6uVar, ntu ntuVar, xru xruVar, hcp0 hcp0Var, j1q0 j1q0Var, v88 v88Var, i1w0 i1w0Var, ocl oclVar, ctf0 ctf0Var, duj dujVar, fd10 fd10Var) {
        m1eVar.getClass();
        j1q0Var.getClass();
        ctf0Var.getClass();
        yd10 yd10Var = new yd10(j1q0Var, (byte) 0);
        yar yarVar = new yar(oclVar, (byte) 4);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, yd10Var, yarVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = o470Var;
        this.p = mneVar;
        this.q = a6uVar;
        this.r = ntuVar;
        this.s = xruVar;
        this.t = hcp0Var;
        this.u = v88Var;
        this.v = i1w0Var;
        this.w = ctf0Var;
        this.x = dujVar;
        this.y = fd10Var;
        this.z = true;
        sac.T(new fnq(m1eVar.b(), new zd10(this, null, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), rwjVar), ae10.h);
    }

    public final void M() {
        Object value;
        yje yjeVar;
        bby bbyVar = this.A;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                yjeVar = null;
            } while (!p7m0Var.m(value, td10.a((td10) value, null, true, false, 3)));
            bvc bvcVarA = jiu0.a(this);
            String strConcat = be10.class.getSimpleName().concat(".loadLotto");
            dvj dvjVar = this.p.b;
            this.A = sac.i0(bvcVarA, strConcat, 3, 0L, kotlin.collections.a.c(oqt0.class), null, new n1(this, yjeVar, (byte) 18), null, dvjVar, new svz(1, this, be10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, 596);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        hc10 hc10Var = (hc10) obj;
        hc10Var.getClass();
        if (hc10Var.equals(fc10.f9287a)) {
            long jA = xru.a(this.s);
            v88.b(this.u, this.v, jA, 2);
            return;
        }
        boolean zEquals = hc10Var.equals(ac10.f607a);
        byte b = 0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        yje yjeVar = null;
        if (zEquals) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, td10.a((td10) value3, null, false, true, 3)));
            return;
        }
        if (hc10Var.equals(cc10.f4089a)) {
            sac.V(jiu0.a(this), new p610((byte) 6), new rx00(this, (byte) 7), this.p.f22085a, new zd10(this, yjeVar, b), 8);
            return;
        }
        if (hc10Var.equals(dc10.f5829a)) {
            E();
            return;
        }
        if (hc10Var.equals(bc10.f2332a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, td10.a((td10) value2, null, true, false, 3)));
            G(new rd10(this.w.b.a(R.string.error_not_installed_v2, Arrays.copyOf(new Object[]{"WebView"}, 1))));
            return;
        }
        if (!hc10Var.equals(gc10.f11037a)) {
            if (hc10Var.equals(ec10.f7544a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        p7m0 p7m0Var3 = ocjVar.f25029a;
        do {
            value = p7m0Var3.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var3.m(value, td10.a((td10) value, null, false, false, 3)));
    }
}
