package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.results.impl.presentation.alt_history.GamesHistoryResultsParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ia2;", "La/yx5;", "<init>", "()V", "a/rek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ia2 extends yx5 {
    public final khf0 K1;
    public final a8z L1;
    public final v62 M1;
    public final a8z N1;
    public final s0r O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(ia2.class, "gamesHistoryResultsParams", "getGamesHistoryResultsParams()Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;", 0), new j0d0(ia2.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final rek0 Q1 = new rek0((byte) 20);

    public ia2() {
        super(R.layout.compose_fragment);
        this.K1 = new khf0("KEY_GAME_RESULTS_PARAMS");
        t32 t32Var = new t32((byte) 2);
        wez wezVar = wez.b;
        this.L1 = maz.a(wezVar, t32Var);
        final byte b = 1;
        this.M1 = new v62(this, (byte) 1);
        final byte b2 = 0;
        this.N1 = maz.a(wezVar, new Function0(this) { // from class: a.ga2
            public final /* synthetic */ ia2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                ia2 ia2Var = this.b;
                switch (b3) {
                    case 0:
                        rek0 rek0Var = ia2.Q1;
                        ComponentCallbacks2 application = ia2Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(q6w.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof q6w)) {
                                ze3Var = null;
                            }
                            q6w q6wVar = (q6w) ze3Var;
                            if (q6wVar != null) {
                                i1w0 i1w0VarF = a4n0.f(ia2Var);
                                GamesHistoryResultsParams gamesHistoryResultsParams = (GamesHistoryResultsParams) ia2Var.K1.n(ia2Var, ia2.R1[0]);
                                i1w0VarF.getClass();
                                epi0 epi0Var = q6wVar.f28220a;
                                bwl bwlVar = q6wVar.c;
                                u5g0 u5g0Var = q6wVar.e;
                                ugf0 ugf0Var = q6wVar.b;
                                knf0 knf0Var = q6wVar.f;
                                iip iipVar = q6wVar.d;
                                m1e m1eVar = q6wVar.h;
                                gii0 gii0Var = q6wVar.g;
                                ctf0 ctf0Var = q6wVar.i;
                                mne mneVar = q6wVar.j;
                                pru pruVar = q6wVar.k;
                                reu reuVar = q6wVar.l;
                                bzt bztVar = q6wVar.m;
                                iipVar.getClass();
                                u5g0Var.getClass();
                                knf0Var.getClass();
                                m1eVar.getClass();
                                gii0Var.getClass();
                                ctf0Var.getClass();
                                return new wii(ugf0Var, iipVar, bwlVar, epi0Var, mneVar, u5g0Var, knf0Var, m1eVar, gii0Var, ctf0Var, i1w0VarF, gamesHistoryResultsParams, pruVar, reuVar, bztVar);
                            }
                        }
                        jf4.n(b1j.i(q6w.class, "Cannot create dependency "));
                        return null;
                    default:
                        rek0 rek0Var2 = ia2.Q1;
                        return new q0h0((vii) ((wii) ia2Var.N1.getValue()).q.get());
                }
            }
        });
        this.O1 = ltt0.o(this, ha2.f12704a);
        this.P1 = xbc.a0(this, sre0.f32672a.b(hb2.class), null, new Function0(this) { // from class: a.ga2
            public final /* synthetic */ ia2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                ia2 ia2Var = this.b;
                switch (b3) {
                    case 0:
                        rek0 rek0Var = ia2.Q1;
                        ComponentCallbacks2 application = ia2Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(q6w.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof q6w)) {
                                ze3Var = null;
                            }
                            q6w q6wVar = (q6w) ze3Var;
                            if (q6wVar != null) {
                                i1w0 i1w0VarF = a4n0.f(ia2Var);
                                GamesHistoryResultsParams gamesHistoryResultsParams = (GamesHistoryResultsParams) ia2Var.K1.n(ia2Var, ia2.R1[0]);
                                i1w0VarF.getClass();
                                epi0 epi0Var = q6wVar.f28220a;
                                bwl bwlVar = q6wVar.c;
                                u5g0 u5g0Var = q6wVar.e;
                                ugf0 ugf0Var = q6wVar.b;
                                knf0 knf0Var = q6wVar.f;
                                iip iipVar = q6wVar.d;
                                m1e m1eVar = q6wVar.h;
                                gii0 gii0Var = q6wVar.g;
                                ctf0 ctf0Var = q6wVar.i;
                                mne mneVar = q6wVar.j;
                                pru pruVar = q6wVar.k;
                                reu reuVar = q6wVar.l;
                                bzt bztVar = q6wVar.m;
                                iipVar.getClass();
                                u5g0Var.getClass();
                                knf0Var.getClass();
                                m1eVar.getClass();
                                gii0Var.getClass();
                                ctf0Var.getClass();
                                return new wii(ugf0Var, iipVar, bwlVar, epi0Var, mneVar, u5g0Var, knf0Var, m1eVar, gii0Var, ctf0Var, i1w0VarF, gamesHistoryResultsParams, pruVar, reuVar, bztVar);
                            }
                        }
                        jf4.n(b1j.i(q6w.class, "Cannot create dependency "));
                        return null;
                    default:
                        rek0 rek0Var2 = ia2.Q1;
                        return new q0h0((vii) ((wii) ia2Var.N1.getValue()).q.get());
                }
            }
        }, 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().k().a(K(), this.M1);
        Object objN = this.O1.n(R1[1], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-1335075327, true, new fa2((Object) this, (byte) 0)));
        sj3.s0(this, "SELECT_DATE_TIME_REQUEST_KEY", new m51(this, (byte) 15));
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
