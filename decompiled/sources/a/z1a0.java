package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.playersduel.impl.presentation.players_duel.screen.PlayersDuelParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/z1a0;", "La/yx5;", "La/odf0;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z1a0 extends yx5 implements odf0 {
    public final boolean K1;
    public fiu0 L1;
    public wdk0 M1;
    public ii N1;
    public xi70 O1;
    public zx10 P1;
    public h430 Q1;
    public final khf0 R1;
    public final a8z S1;
    public static final /* synthetic */ iiy[] V1 = {new ez40(z1a0.class, "screenParams", "getScreenParams()Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;", 0)};
    public static final fl70 U1 = new fl70();

    public z1a0() {
        super(R.layout.fragment_players_duel_compose);
        this.K1 = true;
        this.R1 = new khf0("PLAYER_DUEL_FRAGMENT_PARAMS_KEY");
        this.S1 = xbc.b0(this, sre0.f32672a.b(b3a0.class), new y1a0(this, (byte) 3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new y1a0(this, (byte) 0));
        ccq0.V(this, "PLAYERS_DUEL_UNAVAILABLE_REQUEST_KEY", new y1a0(this, (byte) 1));
        pkd.h((ComposeView) q0(), new owp0(this), null, new ugd(1363893316, true, new cz90(this, (byte) 3)));
    }

    @Override // a.yx5
    public final void C0() {
        cb50 cb50VarV = efx.v(this);
        androidx.fragment.app.e eVarF = F();
        while (eVarF != null) {
            int iP = eVarF.P();
            while (true) {
                iP--;
                if (iP >= 0) {
                    Fragment fragmentJ = eVarF.J(eVarF.O(iP).i);
                    if (fragmentJ instanceof ka9) {
                        ioi ioiVarH0 = ((ka9) fragmentJ).H0();
                        androidx.fragment.app.e eVarF2 = F();
                        while (eVarF2 != null) {
                            for (int iP2 = eVarF2.P() - 1; iP2 >= 0; iP2--) {
                                Fragment fragmentJ2 = eVarF2.J(eVarF2.O(iP2).i);
                                if (fragmentJ2 instanceof ka9) {
                                    ((ka9) fragmentJ2).G0();
                                    androidx.fragment.app.e eVarF3 = F();
                                    while (eVarF3 != null) {
                                        for (int iP3 = eVarF3.P() - 1; iP3 >= 0; iP3--) {
                                            i0h0 i0h0VarJ = eVarF3.J(eVarF3.O(iP3).i);
                                            if (i0h0VarJ instanceof ocl0) {
                                                pcl0 pcl0VarU = ((ocl0) i0h0VarJ).u(new y1a0(this, (byte) 2));
                                                ComponentCallbacks2 application = n0().getApplication();
                                                application.getClass();
                                                af3 af3Var = application instanceof af3 ? (af3) application : null;
                                                if (af3Var != null) {
                                                    o5d0 o5d0Var = (o5d0) af3Var.d().get(x1a0.class);
                                                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                                                    x1a0 x1a0Var = (x1a0) (ze3Var instanceof x1a0 ? ze3Var : null);
                                                    if (x1a0Var != null) {
                                                        PlayersDuelParams playersDuelParams = (PlayersDuelParams) this.R1.n(this, V1[0]);
                                                        i1w0 i1w0VarF = a4n0.f(this);
                                                        String str = cb50VarV.f4046a;
                                                        i1w0VarF.getClass();
                                                        pcl0VarU.getClass();
                                                        cad cadVar = x1a0Var.f40113a;
                                                        rmd0 rmd0Var = x1a0Var.e;
                                                        iw20 iw20Var = x1a0Var.f;
                                                        zx10 zx10Var = x1a0Var.g;
                                                        ocl oclVar = x1a0Var.b;
                                                        wdk0 wdk0Var = x1a0Var.c;
                                                        ii iiVar = x1a0Var.d;
                                                        h430 h430Var = x1a0Var.h;
                                                        m1e m1eVar = x1a0Var.i;
                                                        rmd0Var.getClass();
                                                        wdk0Var.getClass();
                                                        iiVar.getClass();
                                                        m1eVar.getClass();
                                                        g45 g45Var = new g45();
                                                        g45Var.f10647a = cadVar;
                                                        g45Var.b = playersDuelParams;
                                                        g45Var.c = iw20Var;
                                                        g45Var.d = ioiVarH0;
                                                        g45Var.e = oclVar;
                                                        g45Var.f = i1w0VarF;
                                                        g45Var.g = rmd0Var;
                                                        g45Var.h = m1eVar;
                                                        g45Var.i = new eni(g45Var, (byte) 10);
                                                        this.L1 = new fiu0(Collections.singletonMap(b3a0.class, (eni) g45Var.i));
                                                        this.M1 = wdk0Var;
                                                        this.N1 = iiVar;
                                                        this.O1 = rmd0Var.f();
                                                        this.P1 = zx10Var;
                                                        this.Q1 = h430Var;
                                                        return;
                                                    }
                                                }
                                                jf4.n(b1j.i(x1a0.class, "Cannot create dependency "));
                                                return;
                                            }
                                        }
                                        Fragment fragment = this.y;
                                        eVarF3 = fragment != null ? fragment.F() : null;
                                    }
                                    jf4.n("Can't find feature provider!");
                                    return;
                                }
                            }
                            Fragment fragment2 = this.y;
                            eVarF2 = fragment2 != null ? fragment2.F() : null;
                        }
                        jf4.n("Can't find feature provider!");
                        return;
                    }
                }
            }
            Fragment fragment3 = this.y;
            eVarF = fragment3 != null ? fragment3.F() : null;
        }
        jf4.n("Can't find feature provider!");
    }

    public final k3t0 G0() {
        return (k3t0) this.S1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        View view = this.l1;
        ComposeView composeView = view instanceof ComposeView ? (ComposeView) view : null;
        if (composeView != null) {
            composeView.e();
        }
        super.Z();
    }

    @Override // a.odf0
    public final pdf0 b() {
        zx10 zx10Var = this.P1;
        if (zx10Var != null) {
            return zx10Var;
        }
        Intrinsics.h("relatedGamesFeature");
        throw null;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.K1;
    }
}
