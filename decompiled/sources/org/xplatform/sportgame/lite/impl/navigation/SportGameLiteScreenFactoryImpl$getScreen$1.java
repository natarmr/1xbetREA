package org.xplatform.sportgame.lite.impl.navigation;

import a.cjs;
import a.eke0;
import a.h97;
import a.m1r;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.sportgame.lite.api.SportGameLiteScreenFactory$SportGameLiteScreen;
import org.xplatform.sportgame.lite.api.SportGameLiteScreenParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/sportgame/lite/impl/navigation/SportGameLiteScreenFactoryImpl$getScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenFactory$SportGameLiteScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportGameLiteScreenFactoryImpl$getScreen$1 implements FragmentScreen, SportGameLiteScreenFactory$SportGameLiteScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SportGameLiteScreenParams f47005a;

    public SportGameLiteScreenFactoryImpl$getScreen$1(eke0 eke0Var, SportGameLiteScreenParams sportGameLiteScreenParams) {
        this.f47005a = sportGameLiteScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        cjs.a2.getClass();
        cjs cjsVar = new cjs();
        cjsVar.Y1.J(cjsVar, cjs.b2[1], this.f47005a);
        return cjsVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return h97.h(this.f47005a.c, "GameLiteScreenFragment");
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
