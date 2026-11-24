package org.xplatform.games_list.features.common;

import a.csr;
import a.m1r;
import a.ufx;
import a.zl10;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/games_list/features/common/OneXGamesScreens$LuckyWheelDsScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "games_list"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OneXGamesScreens$LuckyWheelDsScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f46711a;

    public OneXGamesScreens$LuckyWheelDsScreen(csr csrVar) {
        csrVar.getClass();
        this.f46711a = csrVar;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        zl10.U1.getClass();
        csr csrVar = this.f46711a;
        csrVar.getClass();
        zl10 zl10Var = new zl10();
        zl10Var.R1.u(zl10Var, zl10.V1[1], csrVar);
        return zl10Var;
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
