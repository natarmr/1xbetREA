package org.xplatform.games_list.features.common;

import a.gx60;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/games_list/features/common/OneXGamesScreens$OneXGamesFavoritesScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "games_list"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OneXGamesScreens$OneXGamesFavoritesScreen implements FragmentScreen {
    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        gx60.R1.getClass();
        gx60 gx60Var = new gx60();
        gx60Var.K1.x(gx60Var, gx60.S1[0], "OneXGamesTabContainerFragment.UM_RESULT_KEY");
        return gx60Var;
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
