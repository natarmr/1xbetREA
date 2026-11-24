package org.xplatform.statistic.winter_games.impl.winter_game.presentation.screen;

import a.iiy;
import a.m1r;
import a.ufx;
import a.ulv0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/winter_games/impl/winter_game/presentation/screen/WinterGamesMainFragmentScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WinterGamesMainFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47108a;
    public final long b;

    public WinterGamesMainFragmentScreen(String str, long j) {
        str.getClass();
        this.f47108a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ulv0.R1.getClass();
        String str = this.f47108a;
        str.getClass();
        ulv0 ulv0Var = new ulv0();
        iiy[] iiyVarArr = ulv0.S1;
        ulv0Var.L1.x(ulv0Var, iiyVarArr[0], str);
        ulv0Var.M1.j(ulv0Var, iiyVarArr[1], this.b);
        return ulv0Var;
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
