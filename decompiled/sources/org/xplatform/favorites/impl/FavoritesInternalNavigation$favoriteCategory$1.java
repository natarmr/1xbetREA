package org.xplatform.favorites.impl;

import a.ifp;
import a.j1q0;
import a.m1r;
import a.m4p;
import a.r9u;
import a.ufx;
import a.vcp;
import a.ygp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState;
import org.xplatform.favorites.impl.presentation.category.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FavoritesInternalNavigation$favoriteCategory$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ifp f46630a;
    public final /* synthetic */ FavoriteCategoryUiState b;

    public FavoritesInternalNavigation$favoriteCategory$1(ifp ifpVar, FavoriteCategoryUiState favoriteCategoryUiState) {
        this.f46630a = ifpVar;
        this.b = favoriteCategoryUiState;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ifp ifpVar = this.f46630a;
        r9u r9uVar = ifpVar.f14699a;
        ygp ygpVar = ygp.o;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        FavoriteCategoryUiState favoriteCategoryUiState = this.b;
        if (!zD || ifpVar.b.a().g.B == vcp.Classic) {
            e.V1.getClass();
            e eVar = new e();
            eVar.L1.J(eVar, e.W1[0], favoriteCategoryUiState);
            return eVar;
        }
        m4p.S1.getClass();
        m4p m4pVar = new m4p();
        m4pVar.L1.J(m4pVar, m4p.U1[0], favoriteCategoryUiState);
        return m4pVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
