package org.xplatform.sportgame.classic.impl.navigation;

import a.gbl0;
import a.h97;
import a.j1q0;
import a.j2s;
import a.m1r;
import a.r46;
import a.r9u;
import a.ygp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.sportgame.classic.api.navigation.SportGameClassicScreenFactory$SportGameClassicScreen;
import org.xplatform.sportgame.classic.api.navigation.SportGameClassicScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/sportgame/classic/impl/navigation/SportGameClassicScreenFactoryImpl$getScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenFactory$SportGameClassicScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportGameClassicScreenFactoryImpl$getScreen$1 implements FragmentScreen, SportGameClassicScreenFactory$SportGameClassicScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r46 f46992a;
    public final /* synthetic */ SportGameClassicScreenParams b;

    public SportGameClassicScreenFactoryImpl$getScreen$1(r46 r46Var, SportGameClassicScreenParams sportGameClassicScreenParams) {
        this.f46992a = r46Var;
        this.b = sportGameClassicScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        r9u r9uVar = this.f46992a.f29822a;
        ygp ygpVar = ygp.o1;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        SportGameClassicScreenParams sportGameClassicScreenParams = this.b;
        if (zD) {
            j2s.b2.getClass();
            j2s j2sVar = new j2s();
            j2sVar.Z1.J(j2sVar, j2s.c2[1], sportGameClassicScreenParams);
            return j2sVar;
        }
        gbl0.c2.getClass();
        gbl0 gbl0Var = new gbl0();
        gbl0Var.X1.J(gbl0Var, gbl0.d2[1], sportGameClassicScreenParams);
        return gbl0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return h97.h(this.b.c, "GameScreenFragment");
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
