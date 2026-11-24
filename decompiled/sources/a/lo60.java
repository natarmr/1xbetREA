package a;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.presentation.bonuses.views.GamesBonusButtonViewNew;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lo60;", "La/yx5;", "<init>", "()V", "a/htz", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lo60 extends yx5 {
    public final i9o0 K1;
    public t6i L1;
    public ii M1;
    public wdk0 N1;
    public kl5 O1;
    public final s0r P1;
    public final kiu0 Q1;
    public final yzn0 R1;
    public final yzn0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(lo60.class, "binding", "getBinding()Lorg/xplatform/core/databinding/OnexGameToolbarFragmentBinding;", 0), new ez40(lo60.class, "bonus", "getBonus()Lorg/xplatform/games_section/api/models/GameBonus;", 0), new ez40(lo60.class, "gameType", "getGameType()Lorg/xplatform/onexuser/domain/entity/onexgame/configs/OneXGamesType;", 0)};
    public static final htz U1 = new htz();

    public lo60() {
        super(R.layout.onex_game_toolbar_fragment);
        this.K1 = i9o0.f14396a;
        this.P1 = ltt0.o(this, ho60.f13380a);
        fo60 fo60Var = new fo60(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new ej50(new ej50(this, (byte) 13), (byte) 14));
        this.Q1 = agc.G(this, sre0.f32672a.b(sp70.class), new co60(a8zVarA, (byte) 2), new co60(a8zVarA, (byte) 3), fo60Var);
        this.R1 = new yzn0("lucky_wheel_bonus");
        this.S1 = new yzn0("GAME_TYPE");
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVar;
        Fragment fragment = this.y;
        bn70 bn70Var = fragment instanceof bn70 ? (bn70) fragment : null;
        if (bn70Var == null || (h5tVar = bn70Var.L1) == null) {
            return;
        }
        h5tVar.m(this);
    }

    public final sm70 G0() {
        Object objN = this.P1.n(V1[0], this);
        objN.getClass();
        return (sm70) objN;
    }

    public final sp70 H0() {
        return (sp70) this.Q1.getValue();
    }

    public final void I0(boolean z) {
        G0().b.setAlpha(z ? 0.5f : 1.0f);
        G0().e.setAlpha(z ? 0.5f : 1.0f);
        boolean z2 = !z;
        G0().b.setEnabled(z2);
        G0().e.setEnabled(z2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        H0().N = false;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().N = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        yje yjeVar = null;
        if (this.O1 == null) {
            Intrinsics.h("bonusesResultListener");
            throw null;
        }
        Fragment fragment = this.y;
        androidx.fragment.app.e eVarF = fragment != null ? fragment.F() : F();
        final byte b = 0;
        eVarF.u0("BonusesFeature.BONUS_RESULT_KEY", this, new jk8(new gq50(2, H0(), sp70.class, "onNewBonus", "onNewBonus$core(Lorg/xplatform/games_section/api/models/GameBonus;J)V", 0, (byte) 10), (byte) 0));
        if (Build.VERSION.SDK_INT >= 29) {
            G0().e.setForceDarkAllowed(false);
        }
        p7m0 p7m0Var = H0().U;
        jo60 jo60Var = new jo60(this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new yd60(p7m0Var, clzVarW, jo60Var, (yje) null), 3);
        itb itbVarV = xkb.V(H0().S);
        final byte b2 = 1;
        jo60 jo60Var2 = new jo60(this, yjeVar, b2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new yd60(itbVarV, clzVarW2, jo60Var2, (yje) null), 3);
        p7m0 p7m0Var2 = H0().T;
        jo60 jo60Var3 = new jo60(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new yd60((gmq) p7m0Var2, clzVarW3, jo60Var3, (yje) null, (byte) 0), 3);
        I0(false);
        G0().d.setNavigationOnClickListener(new l910(this, (byte) 6));
        GamesBonusButtonViewNew gamesBonusButtonViewNew = G0().b;
        ymx ymxVar = ymx.INTERVAL_500;
        dyb.b0(gamesBonusButtonViewNew, ymxVar, new Function1(this) { // from class: a.go60
            public final /* synthetic */ lo60 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                lo60 lo60Var = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        htz htzVar = lo60.U1;
                        view2.getClass();
                        sp70 sp70VarH0 = lo60Var.H0();
                        if (sp70VarH0.o.a()) {
                            sac.V(jiu0.a(sp70VarH0), new gk70(1, sp70VarH0, sp70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, sp70VarH0.C.f22085a, new z210(sp70VarH0, null, (byte) 20), 10);
                        }
                        break;
                    default:
                        htz htzVar2 = lo60.U1;
                        view2.getClass();
                        sp70 sp70VarH1 = lo60Var.H0();
                        sac.V(jiu0.a(sp70VarH1), new gk70(1, sp70VarH1, sp70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, sp70VarH1.C.f22085a, new jkt(sp70VarH1, null), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.b0(G0().e, ymxVar, new Function1(this) { // from class: a.go60
            public final /* synthetic */ lo60 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                lo60 lo60Var = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        htz htzVar = lo60.U1;
                        view2.getClass();
                        sp70 sp70VarH0 = lo60Var.H0();
                        if (sp70VarH0.o.a()) {
                            sac.V(jiu0.a(sp70VarH0), new gk70(1, sp70VarH0, sp70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, sp70VarH0.C.f22085a, new z210(sp70VarH0, null, (byte) 20), 10);
                        }
                        break;
                    default:
                        htz htzVar2 = lo60.U1;
                        view2.getClass();
                        sp70 sp70VarH1 = lo60Var.H0();
                        sac.V(jiu0.a(sp70VarH1), new gk70(1, sp70VarH1, sp70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, sp70VarH1.C.f22085a, new jkt(sp70VarH1, null), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        C().u0("GameIsNotFinishedDialog.REQUEST_KEY", this, new viq(this, (byte) 27));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
