package org.xplatform.sportgame.advanced.impl.navigation;

import a.dnr;
import a.gle0;
import a.h97;
import a.m1r;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.sportgame.advanced.api.SportGameAdvancedScreenFactory$SportGameAdvancedScreen;
import org.xplatform.sportgame.advanced.api.SportGameAdvancedScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/sportgame/advanced/impl/navigation/SportGameAdvancedScreenFactoryImpl$getScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenFactory$SportGameAdvancedScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportGameAdvancedScreenFactoryImpl$getScreen$1 implements FragmentScreen, SportGameAdvancedScreenFactory$SportGameAdvancedScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SportGameAdvancedScreenParams f46986a;

    public SportGameAdvancedScreenFactoryImpl$getScreen$1(gle0 gle0Var, SportGameAdvancedScreenParams sportGameAdvancedScreenParams) {
        this.f46986a = sportGameAdvancedScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        dnr.c2.getClass();
        dnr dnrVar = new dnr();
        dnrVar.Z1.J(dnrVar, dnr.d2[1], this.f46986a);
        return dnrVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return h97.h(this.f46986a.c, "GameAdvancedScreenFragment");
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
