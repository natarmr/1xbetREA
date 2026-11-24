package org.xplatform.favorites.impl.di;

import a.bek;
import a.j1q0;
import a.lk5;
import a.m1r;
import a.m4p;
import a.r9u;
import a.sek;
import a.ufx;
import a.vcp;
import a.ygp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState;
import org.xplatform.favorites.impl.presentation.category.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lk5 f46633a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1(lk5 lk5Var, long j, String str) {
        this.f46633a = lk5Var;
        this.b = j;
        this.c = str;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        lk5 lk5Var = this.f46633a;
        r9u r9uVar = lk5Var.b;
        ygp ygpVar = ygp.o;
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        if (!j1q0Var.f15748a.d(ygpVar) || lk5Var.f20182a.a().g.B == vcp.Classic) {
            sek sekVar = e.V1;
            FavoriteCategoryUiState.Team team = new FavoriteCategoryUiState.Team(this.b, -1L, -1L, this.c);
            sekVar.getClass();
            e eVar = new e();
            eVar.L1.J(eVar, e.W1[0], team);
            return eVar;
        }
        bek bekVar = m4p.S1;
        FavoriteCategoryUiState.Team team2 = new FavoriteCategoryUiState.Team(this.b, -1L, -1L, this.c);
        bekVar.getClass();
        m4p m4pVar = new m4p();
        m4pVar.L1.J(m4pVar, m4p.U1[0], team2);
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
