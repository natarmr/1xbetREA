package a;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewPropertyAnimator;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/vic0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vic0 extends yx5 {
    public static final /* synthetic */ iiy[] S1 = {new j0d0(vic0.class, "binding", "getBinding()Lorg/xplatform/bonus_games/impl/databinding/PromoGamesControlFragmentBinding;", 0)};
    public final i9o0 K1;
    public gki L1;
    public PopupWindow M1;
    public final Rect N1;
    public ValueAnimator O1;
    public ViewPropertyAnimator P1;
    public final s0r Q1;
    public final kiu0 R1;

    public vic0() {
        super(R.layout.promo_games_control_fragment);
        this.K1 = i9o0.f14396a;
        this.N1 = new Rect();
        this.Q1 = ltt0.o(this, tic0.f34001a);
        ssa0 ssa0Var = new ssa0(this, (byte) 23);
        a8z a8zVarA = maz.a(wez.b, new g8b0(new g8b0(this, (byte) 17), (byte) 18));
        this.R1 = agc.G(this, sre0.f32672a.b(hjc0.class), new x6b0(a8zVarA, (byte) 20), new x6b0(a8zVarA, (byte) 21), ssa0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        MaterialButton materialButton = G0().f;
        ymx ymxVar = ymx.INTERVAL_1000;
        dyb.N(materialButton, ymxVar, new sic0(this, (byte) 0));
        dyb.N(G0().c, ymxVar, new sic0(this, (byte) 1));
        C().u0("BONUS_BOUGHT_REQUEST_KEY", n0(), new ex60(this, (byte) 14));
    }

    @Override // a.yx5
    public final void C0() {
        kki kkiVar;
        Fragment fragment = this.y;
        kjc0 kjc0Var = fragment instanceof kjc0 ? (kjc0) fragment : null;
        if (kjc0Var == null || (kkiVar = kjc0Var.M1) == null) {
            return;
        }
        switch (kkiVar.f18441a) {
            case 0:
                this.L1 = (gki) ((n5d0) kkiVar.b).get();
                break;
            case 1:
            default:
                this.L1 = (gki) ((n5d0) kkiVar.b).get();
                break;
            case 2:
                this.L1 = (gki) ((n5d0) kkiVar.b).get();
                break;
        }
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().j;
        yje yjeVar = null;
        uic0 uic0Var = new uic0(this, yjeVar, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new p8c0(p7m0Var, clzVarW, uic0Var, (yje) null), 3);
        hjc0 hjc0VarH0 = H0();
        u6n0 u6n0Var = new u6n0(hjc0VarH0.k, new d7a0(hjc0VarH0, yjeVar, (byte) 6));
        uic0 uic0Var2 = new uic0(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new p8c0(u6n0Var, clzVarW2, uic0Var2, (yje) null), 3);
    }

    public final wic0 G0() {
        Object objN = this.Q1.n(S1[0], this);
        objN.getClass();
        return (wic0) objN;
    }

    public final hjc0 H0() {
        return (hjc0) this.R1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        PopupWindow popupWindow = this.M1;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ValueAnimator valueAnimator = this.O1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
