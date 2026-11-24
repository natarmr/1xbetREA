package org.xplatform.special_event.impl.alleventsgames.presentation;

import a.a8z;
import a.ekd;
import a.ez40;
import a.g45;
import a.hfk0;
import a.iiy;
import a.j0d0;
import a.k22;
import a.k3t0;
import a.khf0;
import a.ltt0;
import a.m51;
import a.maz;
import a.ms2;
import a.n0o0;
import a.oll0;
import a.pkd;
import a.s0r;
import a.sr2;
import a.sre0;
import a.t9f;
import a.tx;
import a.ugd;
import a.ujd;
import a.vr2;
import a.w22;
import a.wdk0;
import a.x1x;
import a.x22;
import a.x7i;
import a.xbc;
import a.y7i;
import a.yx5;
import a.zr2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;", "La/yx5;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a extends yx5 {
    public oll0 K1;
    public x7i L1;
    public wdk0 M1;
    public ujd N1;
    public final khf0 O1;
    public final s0r P1;
    public final n0o0 Q1;
    public final a8z R1;
    public final boolean S1;
    public static final /* synthetic */ iiy[] V1 = {new ez40(a.class, "screenParams", "getScreenParams()Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;", 0), new j0d0(a.class, "viewBinding", "getViewBinding()Lorg/xplatform/special_event/impl/databinding/ComposeScreenViewBinding;", 0)};
    public static final hfk0 U1 = new hfk0((byte) 19);
    public static final String W1 = a.class.getSimpleName();

    public a() {
        super(R.layout.compose_screen_view);
        this.O1 = new khf0("ALL_EVENT_GAMES_SCREEN_PARAMS_BUNDLE_KEY");
        this.P1 = ltt0.o(this, x22.f40146a);
        this.Q1 = maz.b(new w22(this, (byte) 0));
        this.R1 = xbc.a0(this, sre0.f32672a.b(f.class), null, new w22(this, (byte) 1), 14);
        this.S1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ms2 zr2Var;
        ujd ujdVar = this.N1;
        if (ujdVar == null) {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
        AllEventGamesScreenParams allEventGamesScreenParamsG0 = G0();
        if (allEventGamesScreenParamsG0 instanceof AllEventGamesScreenParams.AllGames) {
            zr2Var = new sr2(G0().getF46963a());
        } else if (allEventGamesScreenParamsG0 instanceof AllEventGamesScreenParams.ParticipantGames) {
            zr2Var = new vr2(G0().getF46963a());
        } else {
            if (!(allEventGamesScreenParamsG0 instanceof AllEventGamesScreenParams.StadiumGames)) {
                t9f.b();
                return;
            }
            zr2Var = new zr2(G0().getF46963a());
        }
        ujdVar.c(this, zr2Var, new m51(this, (byte) 13));
        H0().x(k22.f17555a);
        Object objN = this.P1.n(V1[1], this);
        objN.getClass();
        pkd.k(((ekd) objN).b, ((y7i) this.Q1.getValue()).u.f8531a, new ugd(209337998, true, new tx(this, (byte) 5)));
    }

    @Override // a.yx5
    public final void C0() {
        y7i y7iVar = (y7i) this.Q1.getValue();
        this.K1 = ((g45) y7iVar.f42152a.f45137a).K();
        this.L1 = (x7i) y7iVar.v.get();
        this.M1 = y7iVar.t;
        ujd ujdVarD = y7iVar.p.d();
        x1x.x(ujdVarD);
        this.N1 = ujdVarD;
    }

    public final AllEventGamesScreenParams G0() {
        return (AllEventGamesScreenParams) this.O1.n(this, V1[0]);
    }

    public final k3t0 H0() {
        return (k3t0) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        if (this.N1 == null) {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
        ujd.a(this);
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        wdk0 wdk0Var = this.M1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.S1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getS1() {
        return this.S1;
    }
}
