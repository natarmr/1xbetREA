package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ppc0;", "La/yx5;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ppc0 extends yx5 {
    public final hnm0 K1;
    public final boolean L1;
    public final a8z M1;
    public final s0r N1;
    public final a8z O1;
    public final r34 P1;
    public final phf0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(ppc0.class, "binding", "getBinding()Lorg/xplatform/promo/impl/databinding/FragmentPromoShopCategoriesComposeBinding;", 0), new ez40(ppc0.class, "categoryId", "getCategoryId()J", 0), new ez40(ppc0.class, "categoryName", "getCategoryName()Ljava/lang/String;", 0)};
    public static final nh70 R1 = new nh70();

    public ppc0() {
        super(R.layout.fragment_promo_shop_categories_compose);
        this.K1 = hnm0.f13359a;
        final byte b = 1;
        this.L1 = true;
        final byte b2 = 0;
        this.M1 = maz.a(wez.b, new Function0(this) { // from class: a.mpc0
            public final /* synthetic */ ppc0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                ppc0 ppc0Var = this.b;
                switch (b3) {
                    case 0:
                        nh70 nh70Var = ppc0.R1;
                        ComponentCallbacks2 application = ppc0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(lpc0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof lpc0)) {
                                ze3Var = null;
                            }
                            lpc0 lpc0Var = (lpc0) ze3Var;
                            if (lpc0Var != null) {
                                long jLongValue = ppc0Var.P1.n(ppc0Var, ppc0.S1[1]).longValue();
                                ntu ntuVar = lpc0Var.l;
                                gii0 gii0Var = lpc0Var.k;
                                knf0 knf0Var = lpc0Var.j;
                                btt0 btt0Var = lpc0Var.i;
                                gst0 gst0Var = lpc0Var.h;
                                xyt xytVar = lpc0Var.g;
                                mtc mtcVar = new mtc();
                                mtcVar.f22363a = jLongValue;
                                m1e m1eVar = lpc0Var.f20434a;
                                b4j b4jVar = lpc0Var.b;
                                oeg0 oeg0Var = lpc0Var.c;
                                duj dujVar = lpc0Var.d;
                                cad cadVar = lpc0Var.f;
                                ctf0 ctf0Var = lpc0Var.e;
                                wdk0 wdk0Var = lpc0Var.m;
                                pru pruVar = lpc0Var.n;
                                rou rouVar = lpc0Var.o;
                                d1p d1pVar = lpc0Var.p;
                                cdu cduVar = lpc0Var.q;
                                fhj fhjVar = lpc0Var.r;
                                d1pVar.getClass();
                                gii0Var.getClass();
                                knf0Var.getClass();
                                btt0Var.getClass();
                                gst0Var.getClass();
                                m1eVar.getClass();
                                oeg0Var.getClass();
                                ctf0Var.getClass();
                                wdk0Var.getClass();
                                return new cqi(mtcVar, new std(), cadVar, d1pVar, ntuVar, gii0Var, knf0Var, btt0Var, gst0Var, xytVar, m1eVar, b4jVar, oeg0Var, dujVar, ctf0Var, wdk0Var, pruVar, rouVar, cduVar, fhjVar);
                            }
                        }
                        jf4.n(b1j.i(lpc0.class, "Cannot create dependency "));
                        return null;
                    default:
                        nh70 nh70Var2 = ppc0.R1;
                        return new q0h0((bqi) ((cqi) ppc0Var.M1.getValue()).w.get());
                }
            }
        });
        this.N1 = ltt0.o(this, npc0.f23906a);
        this.O1 = xbc.a0(this, sre0.f32672a.b(aqc0.class), null, new Function0(this) { // from class: a.mpc0
            public final /* synthetic */ ppc0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                ppc0 ppc0Var = this.b;
                switch (b3) {
                    case 0:
                        nh70 nh70Var = ppc0.R1;
                        ComponentCallbacks2 application = ppc0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(lpc0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof lpc0)) {
                                ze3Var = null;
                            }
                            lpc0 lpc0Var = (lpc0) ze3Var;
                            if (lpc0Var != null) {
                                long jLongValue = ppc0Var.P1.n(ppc0Var, ppc0.S1[1]).longValue();
                                ntu ntuVar = lpc0Var.l;
                                gii0 gii0Var = lpc0Var.k;
                                knf0 knf0Var = lpc0Var.j;
                                btt0 btt0Var = lpc0Var.i;
                                gst0 gst0Var = lpc0Var.h;
                                xyt xytVar = lpc0Var.g;
                                mtc mtcVar = new mtc();
                                mtcVar.f22363a = jLongValue;
                                m1e m1eVar = lpc0Var.f20434a;
                                b4j b4jVar = lpc0Var.b;
                                oeg0 oeg0Var = lpc0Var.c;
                                duj dujVar = lpc0Var.d;
                                cad cadVar = lpc0Var.f;
                                ctf0 ctf0Var = lpc0Var.e;
                                wdk0 wdk0Var = lpc0Var.m;
                                pru pruVar = lpc0Var.n;
                                rou rouVar = lpc0Var.o;
                                d1p d1pVar = lpc0Var.p;
                                cdu cduVar = lpc0Var.q;
                                fhj fhjVar = lpc0Var.r;
                                d1pVar.getClass();
                                gii0Var.getClass();
                                knf0Var.getClass();
                                btt0Var.getClass();
                                gst0Var.getClass();
                                m1eVar.getClass();
                                oeg0Var.getClass();
                                ctf0Var.getClass();
                                wdk0Var.getClass();
                                return new cqi(mtcVar, new std(), cadVar, d1pVar, ntuVar, gii0Var, knf0Var, btt0Var, gst0Var, xytVar, m1eVar, b4jVar, oeg0Var, dujVar, ctf0Var, wdk0Var, pruVar, rouVar, cduVar, fhjVar);
                            }
                        }
                        jf4.n(b1j.i(lpc0.class, "Cannot create dependency "));
                        return null;
                    default:
                        nh70 nh70Var2 = ppc0.R1;
                        return new q0h0((bqi) ((cqi) ppc0Var.M1.getValue()).w.get());
                }
            }
        }, 14);
        this.P1 = new r34("EXTRA_CATEGORY_ID");
        this.Q1 = new phf0("EXTRA_CATEGORY_NAME");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(S1[0], this);
        objN.getClass();
        pkd.i(((f3r) objN).b, null, new ugd(637184168, true, new lma0(this, (byte) 28)));
    }

    @Override // a.yx5
    public final void C0() {
        wdk0 wdk0Var = ((cqi) this.M1.getValue()).f4794a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.O1.getValue()).x(jpc0.f16893a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.L1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
