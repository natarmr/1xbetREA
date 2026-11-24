package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.results.impl.presentation.alt_live_games.GamesLiveResultsParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vd2;", "La/yx5;", "<init>", "()V", "a/gfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vd2 extends yx5 {
    public final khf0 K1;
    public final s0r L1;
    public final a8z M1;
    public final a8z N1;
    public final a8z O1;
    public final v62 P1;
    public final boolean Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(vd2.class, "gamesLiveResultsParams", "getGamesLiveResultsParams()Lorg/xplatform/results/impl/presentation/alt_live_games/GamesLiveResultsParams;", 0), new j0d0(vd2.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gfk0 R1 = new gfk0((byte) 20);

    public vd2() {
        super(R.layout.compose_fragment);
        this.K1 = new khf0("KEY_GAME_RESULTS_PARAMS");
        this.L1 = ltt0.o(this, ud2.f35458a);
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.td2
            public final /* synthetic */ vd2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                vd2 vd2Var = this.b;
                switch (b2) {
                    case 0:
                        gfk0 gfk0Var = vd2.R1;
                        ComponentCallbacks2 application = vd2Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(wd2.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof wd2)) {
                                ze3Var = null;
                            }
                            wd2 wd2Var = (wd2) ze3Var;
                            if (wd2Var != null) {
                                i1w0 i1w0VarF = a4n0.f(vd2Var);
                                GamesLiveResultsParams gamesLiveResultsParams = (GamesLiveResultsParams) vd2Var.K1.n(vd2Var, vd2.S1[0]);
                                i1w0VarF.getClass();
                                epi0 epi0Var = wd2Var.f38951a;
                                zx10 zx10Var = wd2Var.c;
                                ugf0 ugf0Var = wd2Var.b;
                                mne mneVar = wd2Var.e;
                                m1e m1eVar = wd2Var.d;
                                duj dujVar = wd2Var.f;
                                y78 y78Var = wd2Var.g;
                                ctf0 ctf0Var = wd2Var.h;
                                lbu lbuVar = wd2Var.i;
                                wdk0 wdk0Var = wd2Var.j;
                                pru pruVar = wd2Var.k;
                                bzt bztVar = wd2Var.l;
                                iip iipVar = wd2Var.m;
                                itr itrVar = wd2Var.n;
                                iipVar.getClass();
                                itrVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                wdk0Var.getClass();
                                return new b8i(zx10Var, ugf0Var, iipVar, itrVar, epi0Var, mneVar, m1eVar, dujVar, i1w0VarF, gamesLiveResultsParams, y78Var, ctf0Var, lbuVar, wdk0Var, pruVar, bztVar);
                            }
                        }
                        jf4.n(b1j.i(wd2.class, "Cannot create dependency "));
                        return null;
                    default:
                        gfk0 gfk0Var2 = vd2.R1;
                        return new q0h0((a8i) ((b8i) vd2Var.M1.getValue()).q.get());
                }
            }
        };
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, function0);
        final byte b2 = 1;
        this.N1 = xbc.a0(this, sre0.f32672a.b(le2.class), null, new Function0(this) { // from class: a.td2
            public final /* synthetic */ vd2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                vd2 vd2Var = this.b;
                switch (b3) {
                    case 0:
                        gfk0 gfk0Var = vd2.R1;
                        ComponentCallbacks2 application = vd2Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(wd2.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof wd2)) {
                                ze3Var = null;
                            }
                            wd2 wd2Var = (wd2) ze3Var;
                            if (wd2Var != null) {
                                i1w0 i1w0VarF = a4n0.f(vd2Var);
                                GamesLiveResultsParams gamesLiveResultsParams = (GamesLiveResultsParams) vd2Var.K1.n(vd2Var, vd2.S1[0]);
                                i1w0VarF.getClass();
                                epi0 epi0Var = wd2Var.f38951a;
                                zx10 zx10Var = wd2Var.c;
                                ugf0 ugf0Var = wd2Var.b;
                                mne mneVar = wd2Var.e;
                                m1e m1eVar = wd2Var.d;
                                duj dujVar = wd2Var.f;
                                y78 y78Var = wd2Var.g;
                                ctf0 ctf0Var = wd2Var.h;
                                lbu lbuVar = wd2Var.i;
                                wdk0 wdk0Var = wd2Var.j;
                                pru pruVar = wd2Var.k;
                                bzt bztVar = wd2Var.l;
                                iip iipVar = wd2Var.m;
                                itr itrVar = wd2Var.n;
                                iipVar.getClass();
                                itrVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                wdk0Var.getClass();
                                return new b8i(zx10Var, ugf0Var, iipVar, itrVar, epi0Var, mneVar, m1eVar, dujVar, i1w0VarF, gamesLiveResultsParams, y78Var, ctf0Var, lbuVar, wdk0Var, pruVar, bztVar);
                            }
                        }
                        jf4.n(b1j.i(wd2.class, "Cannot create dependency "));
                        return null;
                    default:
                        gfk0 gfk0Var2 = vd2.R1;
                        return new q0h0((a8i) ((b8i) vd2Var.M1.getValue()).q.get());
                }
            }
        }, 14);
        this.O1 = maz.a(wezVar, new t32((byte) 4));
        this.P1 = new v62(this, (byte) 2);
        this.Q1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().k().a(K(), this.P1);
        Object objN = this.L1.n(S1[1], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-286402976, true, new fa2(this, (byte) 2)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.Q1;
    }
}
