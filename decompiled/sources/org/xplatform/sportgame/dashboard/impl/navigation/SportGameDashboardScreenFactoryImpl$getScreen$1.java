package org.xplatform.sportgame.dashboard.impl.navigation;

import a.gne0;
import a.h97;
import a.i7s;
import a.m1r;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.sportgame.dashboard.api.SportGameDashboardScreenFactory$SportGameDashboardScreen;
import org.xplatform.sportgame.dashboard.api.SportGameDashboardScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/sportgame/dashboard/impl/navigation/SportGameDashboardScreenFactoryImpl$getScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/sportgame/dashboard/api/SportGameDashboardScreenFactory$SportGameDashboardScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportGameDashboardScreenFactoryImpl$getScreen$1 implements FragmentScreen, SportGameDashboardScreenFactory$SportGameDashboardScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SportGameDashboardScreenParams f47003a;

    public SportGameDashboardScreenFactoryImpl$getScreen$1(gne0 gne0Var, SportGameDashboardScreenParams sportGameDashboardScreenParams) {
        this.f47003a = sportGameDashboardScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        i7s.a2.getClass();
        i7s i7sVar = new i7s();
        i7sVar.Y1.J(i7sVar, i7s.b2[1], this.f47003a);
        return i7sVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return h97.h(this.f47003a.c, "GameDashboardScreenFragment");
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
