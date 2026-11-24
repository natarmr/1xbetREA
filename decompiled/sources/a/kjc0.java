package a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/kjc0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class kjc0 extends yx5 {
    public static final /* synthetic */ iiy[] P1 = {new j0d0(kjc0.class, "binding", "getBinding()Lorg/xplatform/bonus_games/impl/databinding/PromoGameHolderFragmentBinding;", 0)};
    public final e9o0 K1;
    public final hnm0 L1;
    public kki M1;
    public ii N1;
    public final s0r O1;

    public kjc0() {
        super(R.layout.promo_game_holder_fragment);
        bp3 bp3Var = bp3.b;
        this.K1 = new e9o0(R.attr.uikitWebGamesControlBackground, R.attr.uikitWebGamesControlBackground, bp3Var, bp3Var);
        this.L1 = hnm0.f13359a;
        this.O1 = ltt0.o(this, ijc0.f14868a);
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = K0().n;
        Class<kjc0> cls = kjc0.class;
        jjc0 jjc0Var = new jjc0(2, this, cls, "observeViewState", "observeViewState(Lorg/xplatform/bonus_games/impl/core/presentation/holder/PromoGamesHolderViewModel$HolderViewState;)V", 4, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new p8c0(p7m0Var, clzVarW, jjc0Var, (yje) null), 3);
        p7m0 p7m0Var2 = K0().o;
        int i = 4;
        jjc0 jjc0Var2 = new jjc0(2, this, cls, "observeBackgroundState", "observeBackgroundState(Lorg/xplatform/bonus_games/impl/core/presentation/holder/PromoGamesHolderViewModel$BackgroundState;)V", i, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new p8c0((gmq) p7m0Var2, clzVarW2, jjc0Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = K0().p;
        jjc0 jjc0Var3 = new jjc0(2, this, cls, "observeErrorDialogState", "observeErrorDialogState(Lorg/xplatform/bonus_games/impl/core/presentation/holder/PromoGamesHolderViewModel$ErrorDialogState;)V", i, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new p8c0((gmq) p7m0Var3, clzVarW3, jjc0Var3, (yje) null, (char) 0), 3);
        ol60 ol60Var = K0().q;
        jjc0 jjc0Var4 = new jjc0(2, this, cls, "observeOneExecuteActions", "observeOneExecuteActions(Lorg/xplatform/bonus_games/impl/core/presentation/holder/PromoGamesHolderViewModel$OneExecutionState;)V", i, (byte) 3);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new p8c0(ol60Var, clzVarW4, jjc0Var4, (yje) null, 0), 3);
    }

    public final void G0(int i, Fragment fragment) {
        String simpleName = fragment.getClass().getSimpleName();
        if (C().J(simpleName) != null) {
            return;
        }
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        zb5 zb5Var = new zb5(eVarC);
        zb5Var.o(i, fragment, simpleName);
        zb5Var.f();
    }

    public final ii H0() {
        ii iiVar = this.N1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final iic0 I0() {
        Object objN = this.O1.n(P1[0], this);
        objN.getClass();
        return (iic0) objN;
    }

    public abstract Fragment J0();

    public abstract gkc0 K0();

    public final void L0(boolean z) {
        Object next;
        androidx.fragment.app.e eVarC;
        String strH = H(R.string.attention);
        String strH2 = H(R.string.web_game_restart_dialog_message);
        String strH3 = H(R.string.web_game_restart_dialog_exit_from_game_button);
        String strH4 = H(R.string.web_game_restart_dialog_button);
        strH4.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH4, strH3, (String) null, "PROMO_REQUEST_DIALOG_RESTART_GAME_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 464);
        List listP = C().c.p();
        listP.getClass();
        b5q b5qVar = new b5q(pgi0.h(pgi0.k(new sx3(listP, (byte) 1), new wyb0((byte) 28)), b180.g));
        while (true) {
            if (!b5qVar.hasNext()) {
                next = null;
                break;
            }
            next = b5qVar.next();
            hz6 hz6Var = (hz6) next;
            if (hz6Var.N() && !hz6Var.m) {
                break;
            }
        }
        hz6 hz6Var2 = (hz6) next;
        if (hz6Var2 == null || (eVarC = hz6Var2.C()) == null) {
            eVarC = C();
            eVarC.getClass();
        }
        if (z) {
            H0().a(dialogFields, eVarC);
        } else {
            H0().d(dialogFields, eVarC);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "BONUS_GAMES_TECHNICAL_WORKS_DIALOG_REQUEST_KEY", new b0c0(0, K0(), gkc0.class, "onTechnicalDialogGameClick", "onTechnicalDialogGameClick()V", 0, (byte) 11));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        n0().getWindow().clearFlags(128);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        n0().getWindow().addFlags(128);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        knm0.h(I0().b, false);
        knm0.h(I0().d, false);
        knm0.h(I0().c, false);
        knm0.h(I0().e, false);
        K0().x();
        Class<gkc0> cls = gkc0.class;
        ccq0.V(this, "PROMO_REQUEST_DIALOG_ERROR_KEY", new b0c0(0, K0(), cls, "onRequestErrorDialogClosed", "onRequestErrorDialogClosed()V", 0, (byte) 9));
        int i = 0;
        int i2 = 0;
        ccq0.V(this, "PROMO_REQUEST_DIALOG_CRITICAL_ERROR_KEY", new b0c0(i2, K0(), cls, "exitGame", "exitGame()V", i, (byte) 8));
        ccq0.V(this, "PROMO_REQUEST_DIALOG_RESTART_GAME_KEY", new ssa0(this, (byte) 24));
        ccq0.T(this, "PROMO_REQUEST_DIALOG_RESTART_GAME_KEY", new b0c0(i2, K0(), cls, "onRestartGameDialogExit", "onRestartGameDialogExit()V", i, (byte) 10));
        G0(R.id.promoHolderGameContainer, J0());
        G0(R.id.promoInfoViewContainer, new ikc0());
        G0(R.id.promoToolbarContainer, new ukc0());
        G0(R.id.promoControlContainer, new vic0());
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
