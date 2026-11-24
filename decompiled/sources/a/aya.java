package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.search.SearchMaterialViewNew;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/aya;", "La/yx5;", "<init>", "()V", "a/bj5", "cashback"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class aya extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public sbi M1;
    public wdk0 N1;
    public final kiu0 O1;
    public final r34 P1;
    public final s0r Q1;
    public final n0o0 R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(aya.class, "monthGameId", "getMonthGameId()J", 0), new j0d0(aya.class, "viewBinding", "getViewBinding()Lorg/xplatform/games_section/feature/cashback/databinding/CashbackSelectorFragmentBinding;", 0)};
    public static final bj5 S1 = new bj5();

    public aya() {
        super(R.layout.cashback_selector_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        xxa xxaVar = new xxa(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new h79(new h79(this, (byte) 10), (byte) 11));
        this.O1 = agc.G(this, sre0.f32672a.b(yya.class), new rt6(a8zVarA, (byte) 24), new rt6(a8zVarA, (byte) 25), xxaVar);
        this.P1 = new r34("MONTH_GAME", 0L);
        this.Q1 = ltt0.o(this, zxa.f45149a);
        this.R1 = maz.b(new xxa(this, (byte) 3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new xxa(this, (byte) 0));
        yya yyaVarI0 = I0();
        yyaVarI0.t = G0();
        byte b = 1;
        byte b2 = 4;
        slb.U(new fnq(new dnq(yyaVarI0.g.b(), new lo3(3, null, (byte) 5), (byte) 1), new qv3(yyaVarI0, null, (byte) 29), (byte) 4), jiu0.a(yyaVarI0));
        H0().f.l(R.menu.one_x_search_menu);
        MenuItem menuItemFindItem = H0().f.getMenu().findItem(R.id.search);
        menuItemFindItem.setOnActionExpandListener(new kw20(this, (byte) 2));
        View actionView = menuItemFindItem.getActionView();
        final SearchMaterialViewNew searchMaterialViewNew = actionView instanceof SearchMaterialViewNew ? (SearchMaterialViewNew) actionView : null;
        if (searchMaterialViewNew != null) {
            searchMaterialViewNew.setMaxWidth(Integer.MAX_VALUE);
            searchMaterialViewNew.setIgnorePrevIconifiedValue(false);
            searchMaterialViewNew.setText(R.string.search_by_games);
            final View view = H0().b;
            searchMaterialViewNew.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: a.kih0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    View view3 = view;
                    if (z) {
                        view3.setOnTouchListener(new jw5(searchMaterialViewNew, (byte) 13));
                    } else {
                        view3.setOnTouchListener(null);
                    }
                }
            });
            searchMaterialViewNew.setOnQueryTextListener(new c5k(searchMaterialViewNew, this));
        }
        H0().f.setNavigationOnClickListener(new q10(this, (byte) 7));
        H0().e.setItemAnimator(null);
        RecyclerView recyclerView = H0().e;
        Context context = H0().e.getContext();
        Context context2 = H0().e.getContext();
        context2.getClass();
        recyclerView.setLayoutManager(new GridLayoutManager(context, context2.getResources().getBoolean(R.bool.isLand) ? (byte) 3 : (byte) 2));
        vvw.o(H0().e, false, 3);
        I0().w(G0());
        H0().g.setOnSaveClickListener(new bna(this, b2));
        H0().g.setOnCancelClickListener(new xxa(this, b));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        if (!(application instanceof vmv)) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
        if (applicationLoader.c() == null) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        g8i g8iVarC = applicationLoader.c();
        if (g8iVarC == null) {
            hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.CashbackDependencies");
            return;
        }
        a4n0.f(this).getClass();
        this.M1 = (sbi) ((n5d0) new nhf0(new kj5(), g8iVarC).c).get();
        wdk0 wdk0VarI9 = g8iVarC.I9();
        x1x.x(wdk0VarI9);
        this.N1 = wdk0VarI9;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = I0().u;
        Class<aya> cls = aya.class;
        c48 c48Var = new c48(2, this, cls, "updateGames", "updateGames(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/CashbackChoosingViewModelOld$ViewState;)V", 4, (byte) 11);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new l19((gmq) p7m0Var, clzVarW, c48Var, (yje) null, (char) 0), 3);
        p7m0 p7m0Var2 = I0().v;
        int i = 4;
        c48 c48Var2 = new c48(2, this, cls, "showLottie", "showLottie(Lorg/xplatform/uikit/components/lottie/LottieConfig;)V", i, (byte) 12);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new l19(p7m0Var2, clzVarW2, c48Var2, (yje) null, 0), 3);
        p7m0 p7m0Var3 = I0().w;
        int i2 = 2;
        c48 c48Var3 = new c48(i2, this, cls, "showProgressView", "showProgressView(Z)V", i, (byte) 13);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new yxa(p7m0Var3, clzVarW3, c48Var3, (yje) null), 3);
        ol60 ol60Var = I0().x;
        c48 c48Var4 = new c48(i2, this, cls, "showToastNotification", "showToastNotification(Ljava/lang/String;)V", i, (byte) 14);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new yxa((gmq) ol60Var, clzVarW4, c48Var4, (yje) null, (byte) 0), 3);
        ol60 ol60Var2 = I0().y;
        c48 c48Var5 = new c48(2, this, cls, "showSnackMessage", "showSnackMessage(Ljava/lang/String;)V", i, (byte) 15);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new yxa((gmq) ol60Var2, clzVarW5, c48Var5, (yje) null, (char) 0), 3);
    }

    public final long G0() {
        return this.P1.n(this, U1[0]).longValue();
    }

    public final m0b H0() {
        Object objN = this.Q1.n(U1[1], this);
        objN.getClass();
        return (m0b) objN;
    }

    public final yya I0() {
        return (yya) this.O1.getValue();
    }

    public final void J0(boolean z) {
        H0().e.setVisibility(z ? 0 : 8);
        H0().c.setVisibility(z ? 8 : 0);
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
