package org.xplatform.statistic.winter_games.impl.winter_game_result.presentation;

import a.hnv0;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/winter_games/impl/winter_game_result/presentation/WinterGamesResultsTableFragmentScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WinterGamesResultsTableFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47109a;
    public final long b;

    public WinterGamesResultsTableFragmentScreen(String str, long j) {
        this.f47109a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        hnv0.Q1.getClass();
        hnv0 hnv0Var = new hnv0();
        iiy[] iiyVarArr = hnv0.R1;
        hnv0Var.K1.x(hnv0Var, iiyVarArr[0], this.f47109a);
        hnv0Var.L1.j(hnv0Var, iiyVarArr[1], this.b);
        return hnv0Var;
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
