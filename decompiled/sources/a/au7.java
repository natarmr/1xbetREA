package a;

import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.sportgame.bets_on_players.api.navigation.BetsOnPlayersScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/au7;", "La/yx5;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class au7 extends yx5 {
    public final e9o0 K1;
    public final s0r L1;
    public final boolean M1;
    public final khf0 N1;
    public cai O1;
    public xi70 P1;
    public fiu0 Q1;
    public final n0o0 R1;
    public final a8z S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(au7.class, "viewBinding", "getViewBinding()Lorg/xplatform/sportgame/bets_on_players/impl/databinding/FragmentBetsOnPlayersBinding;", 0), new ez40(au7.class, "screenParams", "getScreenParams()Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;", 0)};
    public static final yk5 U1 = new yk5();
    public static final String W1 = au7.class.getSimpleName();

    public au7() {
        super(R.layout.fragment_bets_on_players);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.L1 = ltt0.o(this, zt7.f44942a);
        this.M1 = true;
        this.N1 = new khf0("SCREEN_PARAMS_KEY");
        this.R1 = maz.b(new wt7(this, (byte) 3));
        this.S1 = xbc.b0(this, sre0.f32672a.b(tu7.class), new wt7(this, (byte) 6));
    }

    @Override // a.yx5
    public final void C0() {
        dai daiVar = (dai) this.R1.getValue();
        this.P1 = daiVar.f5748a;
        this.Q1 = new fiu0(Collections.singletonMap(tu7.class, daiVar.q));
    }

    public final BetsOnPlayersScreenParams G0() {
        return (BetsOnPlayersScreenParams) this.N1.n(this, V1[1]);
    }

    public final k3t0 H0() {
        return (k3t0) this.S1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        kxq kxqVarB;
        if (F().J(this.B) == null || ((kxqVarB = B()) != null && kxqVarB.isFinishing())) {
            LinkedHashMap linkedHashMap = st7.f32759a;
            long j = G0().f46987a;
            String str = efx.v(this).f4046a;
            st7.f32759a.remove(j + str);
            LinkedHashMap linkedHashMap2 = tt7.f34496a;
            long j2 = G0().f46987a;
            String str2 = efx.v(this).f4046a;
            tt7.f34496a.remove(j2 + str2);
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(V1[0], this);
        objN.getClass();
        pkd.h(((nyq) objN).f24341a, new owp0(this), null, new ugd(1174007127, true, new tx(this, (byte) 9)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
