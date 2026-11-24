package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.results.impl.presentation.alt_champs.ChampsResultsParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/w62;", "La/yx5;", "<init>", "()V", "a/pek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w62 extends yx5 {
    public final khf0 K1;
    public final a8z L1;
    public final v62 M1;
    public final a8z N1;
    public final s0r O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(w62.class, "params", "getParams()Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;", 0), new j0d0(w62.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final pek0 Q1 = new pek0();

    public w62() {
        super(R.layout.compose_fragment);
        this.K1 = new khf0("KEY_PARAMS");
        final byte b = 1;
        t32 t32Var = new t32((byte) 1);
        wez wezVar = wez.b;
        this.L1 = maz.a(wezVar, t32Var);
        final byte b2 = 0;
        this.M1 = new v62(this, (byte) 0);
        this.N1 = maz.a(wezVar, new Function0(this) { // from class: a.t62
            public final /* synthetic */ w62 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                w62 w62Var = this.b;
                switch (b3) {
                    case 0:
                        pek0 pek0Var = w62.Q1;
                        ComponentCallbacks2 application = w62Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(p5g0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof p5g0)) {
                                ze3Var = null;
                            }
                            p5g0 p5g0Var = (p5g0) ze3Var;
                            if (p5g0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(w62Var);
                                ChampsResultsParams champsResultsParams = (ChampsResultsParams) w62Var.K1.n(w62Var, w62.R1[0]);
                                chf0 chf0Var = qx40.f29464a;
                                Application application2 = w62Var.n0().getApplication();
                                application2.getClass();
                                sx40 sx40Var = (sx40) ((n5d0) qx40.b(application2, cui0.b(s72.class.getSimpleName())).c).get();
                                i1w0VarF.getClass();
                                sx40Var.getClass();
                                zx10 zx10Var = p5g0Var.b;
                                iw20 iw20Var = p5g0Var.i;
                                ctf0 ctf0Var = p5g0Var.f26403a;
                                m1e m1eVar = p5g0Var.c;
                                knf0 knf0Var = p5g0Var.d;
                                sjl0 sjl0Var = p5g0Var.g;
                                mne mneVar = p5g0Var.h;
                                u5g0 u5g0Var = p5g0Var.e;
                                bzt bztVar = p5g0Var.j;
                                gii0 gii0Var = p5g0Var.f;
                                fvt0 fvt0Var = p5g0Var.k;
                                nv20 nv20Var = p5g0Var.l;
                                z8u z8uVar = p5g0Var.m;
                                ivn ivnVar = p5g0Var.n;
                                wdk0 wdk0Var = p5g0Var.o;
                                ctf0Var.getClass();
                                m1eVar.getClass();
                                u5g0Var.getClass();
                                knf0Var.getClass();
                                gii0Var.getClass();
                                sjl0Var.getClass();
                                wdk0Var.getClass();
                                return new esi(zx10Var, iw20Var, ctf0Var, m1eVar, i1w0VarF, u5g0Var, champsResultsParams, sx40Var, knf0Var, gii0Var, mneVar, bztVar, sjl0Var, fvt0Var, nv20Var, z8uVar, ivnVar, wdk0Var);
                            }
                        }
                        jf4.n(b1j.i(p5g0.class, "Cannot create dependency "));
                        return null;
                    default:
                        pek0 pek0Var2 = w62.Q1;
                        return new q0h0((dsi) ((esi) w62Var.N1.getValue()).s.get());
                }
            }
        });
        this.O1 = ltt0.o(this, u62.f35118a);
        this.P1 = xbc.a0(this, sre0.f32672a.b(s72.class), null, new Function0(this) { // from class: a.t62
            public final /* synthetic */ w62 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                w62 w62Var = this.b;
                switch (b3) {
                    case 0:
                        pek0 pek0Var = w62.Q1;
                        ComponentCallbacks2 application = w62Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(p5g0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof p5g0)) {
                                ze3Var = null;
                            }
                            p5g0 p5g0Var = (p5g0) ze3Var;
                            if (p5g0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(w62Var);
                                ChampsResultsParams champsResultsParams = (ChampsResultsParams) w62Var.K1.n(w62Var, w62.R1[0]);
                                chf0 chf0Var = qx40.f29464a;
                                Application application2 = w62Var.n0().getApplication();
                                application2.getClass();
                                sx40 sx40Var = (sx40) ((n5d0) qx40.b(application2, cui0.b(s72.class.getSimpleName())).c).get();
                                i1w0VarF.getClass();
                                sx40Var.getClass();
                                zx10 zx10Var = p5g0Var.b;
                                iw20 iw20Var = p5g0Var.i;
                                ctf0 ctf0Var = p5g0Var.f26403a;
                                m1e m1eVar = p5g0Var.c;
                                knf0 knf0Var = p5g0Var.d;
                                sjl0 sjl0Var = p5g0Var.g;
                                mne mneVar = p5g0Var.h;
                                u5g0 u5g0Var = p5g0Var.e;
                                bzt bztVar = p5g0Var.j;
                                gii0 gii0Var = p5g0Var.f;
                                fvt0 fvt0Var = p5g0Var.k;
                                nv20 nv20Var = p5g0Var.l;
                                z8u z8uVar = p5g0Var.m;
                                ivn ivnVar = p5g0Var.n;
                                wdk0 wdk0Var = p5g0Var.o;
                                ctf0Var.getClass();
                                m1eVar.getClass();
                                u5g0Var.getClass();
                                knf0Var.getClass();
                                gii0Var.getClass();
                                sjl0Var.getClass();
                                wdk0Var.getClass();
                                return new esi(zx10Var, iw20Var, ctf0Var, m1eVar, i1w0VarF, u5g0Var, champsResultsParams, sx40Var, knf0Var, gii0Var, mneVar, bztVar, sjl0Var, fvt0Var, nv20Var, z8uVar, ivnVar, wdk0Var);
                            }
                        }
                        jf4.n(b1j.i(p5g0.class, "Cannot create dependency "));
                        return null;
                    default:
                        pek0 pek0Var2 = w62.Q1;
                        return new q0h0((dsi) ((esi) w62Var.N1.getValue()).s.get());
                }
            }
        }, 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().k().a(K(), this.M1);
        Object objN = this.O1.n(R1[1], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(1712266938, true, new o00(this, (byte) 26)));
        sj3.s0(this, "SELECT_DATE_TIME_REQUEST_KEY", new m51(this, (byte) 14));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        hxm0.m(q0());
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        hxm0.n(q0());
        super.e0();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getO1() {
        return true;
    }
}
