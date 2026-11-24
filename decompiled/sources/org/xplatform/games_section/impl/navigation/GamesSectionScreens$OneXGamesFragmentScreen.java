package org.xplatform.games_section.impl.navigation;

import a.d270;
import a.ez60;
import a.i120;
import a.m1r;
import a.r270;
import a.t270;
import a.t9f;
import a.tn;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "La/tn;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GamesSectionScreens$OneXGamesFragmentScreen implements FragmentScreen, tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46736a;
    public final d270 b;
    public final int c;
    public final r270 d;
    public final String e;

    public GamesSectionScreens$OneXGamesFragmentScreen(long j, d270 d270Var, int i, r270 r270Var, String str) {
        this.f46736a = j;
        this.b = d270Var;
        this.c = i;
        this.d = r270Var;
        this.e = str;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        t270 t270Var;
        m1rVar.getClass();
        ez60 ez60Var = new ez60();
        Pair pair = new Pair("OPEN_GAME_KEY", Long.valueOf(this.f46736a));
        Pair pair2 = new Pair("OPEN_PROMO_KEY", this.b);
        Pair pair3 = new Pair("EXTRA_CATEGORY_ID_KEY", Integer.valueOf(this.c));
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            t270Var = t270.f33203a;
        } else if (iOrdinal == 1) {
            t270Var = t270.b;
        } else if (iOrdinal == 2) {
            t270Var = t270.c;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            t270Var = t270.d;
        }
        ez60Var.s0(i120.V(pair, pair2, pair3, new Pair("OPEN_SCREEN_KEY", t270Var), new Pair("BUNDLE_SCREEN_KEY", "javaClass"), new Pair("WEB_GAME_SESSION_UUID", this.e)));
        return ez60Var;
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
