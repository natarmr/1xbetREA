package org.xplatform.favorites.impl.presentation.category;

import a.a8z;
import a.aac;
import a.agc;
import a.aq2;
import a.bdx;
import a.cad;
import a.cin;
import a.clz;
import a.cq2;
import a.dnq;
import a.e00;
import a.e4p;
import a.eo6;
import a.ez40;
import a.g7p;
import a.hc50;
import a.hep;
import a.icu0;
import a.iep;
import a.igu0;
import a.iiy;
import a.itr;
import a.j0d0;
import a.jfl;
import a.khf0;
import a.kiu0;
import a.lkz;
import a.ltt0;
import a.maz;
import a.mc50;
import a.ms2;
import a.n0o0;
import a.ofl;
import a.pek;
import a.q3d;
import a.qjj;
import a.qmk0;
import a.r6p;
import a.rgi;
import a.rgu0;
import a.rmk0;
import a.s0r;
import a.s6n0;
import a.sek;
import a.sre0;
import a.sxk;
import a.t9f;
import a.tgi;
import a.tzi;
import a.vtb;
import a.wdk0;
import a.wej;
import a.wez;
import a.x0x;
import a.x1x;
import a.y3p;
import a.ybg0;
import a.yje;
import a.yx5;
import a.yzq;
import a.z9f;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/category/e;", "La/yx5;", "<init>", "()V", "a/sek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e extends yx5 {
    public final boolean K1;
    public final khf0 L1;
    public final n0o0 M1;
    public rgi N1;
    public pek O1;
    public tzi P1;
    public wdk0 Q1;
    public final n0o0 R1;
    public final s0r S1;
    public final kiu0 U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(e.class, "params", "getParams()Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;", 0), new j0d0(e.class, "viewBinding", "getViewBinding()Lorg/xplatform/favorites/impl/databinding/FragmentFavoritesCategoryBinding;", 0)};
    public static final sek V1 = new sek();
    public static final String X1 = e.class.getSimpleName();

    public e() {
        super(R.layout.fragment_favorites_category);
        this.K1 = true;
        this.L1 = new khf0("category_state_param_key");
        this.M1 = maz.b(new hep(this, (byte) 0));
        this.R1 = maz.b(new wej(0, this, e.class, "provideAdapter", "provideAdapter()Lorg/xplatform/favorites/impl/presentation/category/adapter/FavoriteCategoryAdapter;", 0, (byte) 13));
        this.S1 = ltt0.o(this, iep.f14644a);
        hep hepVar = new hep(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new jfl(new jfl(this, (byte) 15), (byte) 16));
        this.U1 = agc.G(this, sre0.f32672a.b(f.class), new r6p(a8zVarA, (byte) 2), new r6p(a8zVarA, (byte) 3), hepVar);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        ms2 aq2Var;
        View viewQ0 = q0();
        cad cadVar = new cad(this, (byte) 22);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(viewQ0, cadVar);
        yzq yzqVarG0 = G0();
        String string = o0().getString(R.string.search_by_games);
        string.getClass();
        DsNavigationBar dsNavigationBar = yzqVarG0.c;
        dsNavigationBar.setSearchFieldHint(string);
        iiy[] iiyVarArr = W1;
        iiy iiyVar = iiyVarArr[0];
        khf0 khf0Var = this.L1;
        dsNavigationBar.setTitle(((FavoriteCategoryUiState) khf0Var.n(this, iiyVar)).getB());
        dsNavigationBar.setNavigationBarButtons(q3d.e(new hc50("SEARCH_BUTTON", ybg0.b, R.drawable.ic_glyph_search, new hep(this, (byte) 2), 1008)));
        mc50.a(dsNavigationBar, new hep(this, (byte) 3));
        byte b = 1;
        dsNavigationBar.e(new g7p(this, b));
        G0().d.setAdapter((y3p) this.R1.getValue());
        androidx.recyclerview.widget.b layoutManager = G0().d.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            if (o0().getResources().getBoolean(R.bool.isTablet)) {
                gridLayoutManager.N1(2);
                gridLayoutManager.m1 = new eo6(this, b);
            } else {
                gridLayoutManager.N1(1);
            }
        }
        tzi tziVar = this.P1;
        if (tziVar == null) {
            Intrinsics.h("gameCardFragmentDelegate");
            throw null;
        }
        f fVarH0 = H0();
        FavoriteCategoryUiState favoriteCategoryUiState = (FavoriteCategoryUiState) khf0Var.n(this, iiyVarArr[0]);
        if (favoriteCategoryUiState instanceof FavoriteCategoryUiState.Team) {
            aq2Var = new cq2();
        } else {
            if (!(favoriteCategoryUiState instanceof FavoriteCategoryUiState.Championship)) {
                t9f.b();
                return;
            }
            aq2Var = new aq2();
        }
        tziVar.w(this, fVarH0, aq2Var);
        yzq yzqVarG1 = G0();
        SwipeRefreshLayout swipeRefreshLayout = yzqVarG1.e;
        RecyclerView recyclerView = yzqVarG1.d;
        swipeRefreshLayout.setOnRefreshListener(new z9f(H0(), (byte) 24));
        Context context = recyclerView.getContext();
        context.getClass();
        if (context.getResources().getBoolean(R.bool.isTablet)) {
            Context context2 = recyclerView.getContext();
            context2.getClass();
            e4p e4pVar = new e4p((byte) 21);
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.space_32);
            int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.space_8);
            int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.space_0);
            rmk0 rmk0Var = rmk0.b;
            recyclerView.m(new icu0(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize2, e4pVar, dimensionPixelSize2, dimensionPixelSize2));
        } else {
            Resources resources = recyclerView.getResources();
            resources.getClass();
            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.space_8);
            recyclerView.m(new qmk0(dimensionPixelSize4, dimensionPixelSize4, 0, dimensionPixelSize4, 0, 1, new e4p((byte) 14), rmk0.b, 276));
        }
        bdx.j0(recyclerView);
        wdk0 wdk0Var = this.Q1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.K1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        tgi tgiVar = (tgi) this.M1.getValue();
        this.N1 = (rgi) tgiVar.x.get();
        itr itrVar = tgiVar.g;
        this.O1 = itrVar.c();
        tzi tziVarE = itrVar.e();
        x1x.x(tziVarE);
        this.P1 = tziVarE;
        this.Q1 = tgiVar.t;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        f fVarH0 = H0();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new s6n0(vtb.M(fVarH0.x), new cin(fVarH0, yjeVar, (byte) 4)), new e00(fVarH0, yjeVar, (byte) 29), (byte) 0);
        lkz lkzVar = lkz.f20223a;
        sxk sxkVar = new sxk(this, yjeVar, (byte) 16);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new ofl(dnqVar, clzVarW, sxkVar, (yje) null), 3);
    }

    public final yzq G0() {
        Object objN = this.S1.n(W1[1], this);
        objN.getClass();
        return (yzq) objN;
    }

    public final f H0() {
        return (f) this.U1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().d.setAdapter(null);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.K1;
    }
}
