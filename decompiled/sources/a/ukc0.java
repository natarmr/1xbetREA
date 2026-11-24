package a;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/ukc0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ukc0 extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(ukc0.class, "binding", "getBinding()Lorg/xplatform/bonus_games/impl/databinding/PromoToolbarBinding;", 0)};
    public final i9o0 K1;
    public hki L1;
    public ii M1;
    public wdk0 N1;
    public final s0r O1;
    public final kiu0 P1;

    public ukc0() {
        super(R.layout.promo_toolbar);
        this.K1 = i9o0.f14396a;
        this.O1 = ltt0.o(this, tkc0.f34089a);
        skc0 skc0Var = new skc0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new g8b0(new g8b0(this, (byte) 21), (byte) 22));
        this.P1 = agc.G(this, sre0.f32672a.b(clc0.class), new x6b0(a8zVarA, (byte) 24), new x6b0(a8zVarA, (byte) 25), skc0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        C().u0("GameIsNotFinishedDialog.REQUEST_KEY", this, new ex60(this, (byte) 15));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite, o0()));
        colorStateListValueOf.getClass();
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        DsNavigationBar dsNavigationBar = ((tuc0) objN).b;
        TypedValue typedValue = j5d.f15927a;
        dsNavigationBar.setBackgroundColor(j5d.a(o0(), R.attr.uikitWebGamesControlBackground, false));
        mc50.a(dsNavigationBar, new skc0(this, (byte) 1));
        dsNavigationBar.setNavigationBarButtons(q3d.e(new hc50("RULES_BUTTON", ybg0.f42342a, R.drawable.ic_info_white_round, new skc0(this, (byte) 2), 2032)));
        dsNavigationBar.setTitleColor(colorStateListValueOf);
        dsNavigationBar.setNavigationBarButtonsColorStateList(colorStateListValueOf);
        dsNavigationBar.setBackIconColor(colorStateListValueOf);
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
                this.L1 = (hki) ((n5d0) kkiVar.c).get();
                g8i g8iVar = ((fki) kkiVar.e).f9693a;
                this.M1 = g8iVar.j();
                wdk0 wdk0VarI9 = g8iVar.I9();
                x1x.x(wdk0VarI9);
                this.N1 = wdk0VarI9;
                break;
            case 1:
            default:
                this.L1 = (hki) ((n5d0) kkiVar.c).get();
                g8i g8iVar2 = ((iyi) kkiVar.e).f15590a;
                this.M1 = g8iVar2.j();
                wdk0 wdk0VarI10 = g8iVar2.I9();
                x1x.x(wdk0VarI10);
                this.N1 = wdk0VarI10;
                break;
            case 2:
                this.L1 = (hki) ((n5d0) kkiVar.c).get();
                g8i g8iVar3 = ((nli) kkiVar.e).f23729a;
                this.M1 = g8iVar3.j();
                wdk0 wdk0VarI11 = g8iVar3.I9();
                x1x.x(wdk0VarI11);
                this.N1 = wdk0VarI11;
                break;
        }
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = G0().q;
        s9c0 s9c0Var = new s9c0(this, null, (byte) 4);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new p8c0((gmq) p7m0Var, clzVarW, s9c0Var, (yje) null, (char) 0), 3);
        itb itbVarV = xkb.V(G0().p);
        jjc0 jjc0Var = new jjc0(2, this, ukc0.class, "handleChannelState", "handleChannelState(Lorg/xplatform/bonus_games/impl/core/presentation/holder/PromoGamesToolbarViewModel$ChannelViewState;)V", 4, (byte) 4);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new p8c0(itbVarV, clzVarW2, jjc0Var, (yje) null), 3);
    }

    public final clc0 G0() {
        return (clc0) this.P1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
