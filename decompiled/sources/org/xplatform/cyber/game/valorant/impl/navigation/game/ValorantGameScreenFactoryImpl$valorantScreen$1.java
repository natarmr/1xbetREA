package org.xplatform.cyber.game.valorant.impl.navigation.game;

import a.m1r;
import a.sxt0;
import a.uxs0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.game.valorant.api.ValorantGameScreenParams;
import org.xplatform.cyber.game.valorant.api.navigation.game.ValorantGameScreenFactory$ValorantGameScreen;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/cyber/game/valorant/impl/navigation/game/ValorantGameScreenFactoryImpl$valorantScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/cyber/game/valorant/api/navigation/game/ValorantGameScreenFactory$ValorantGameScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ValorantGameScreenFactoryImpl$valorantScreen$1 implements FragmentScreen, ValorantGameScreenFactory$ValorantGameScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValorantGameScreenParams f46544a;

    public ValorantGameScreenFactoryImpl$valorantScreen$1(ValorantGameScreenParams valorantGameScreenParams, uxs0 uxs0Var) {
        this.f46544a = valorantGameScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        sxt0.b2.getClass();
        sxt0 sxt0Var = new sxt0();
        sxt0Var.Z1.J(sxt0Var, sxt0.c2[1], this.f46544a);
        return sxt0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return String.valueOf(this.f46544a.f46542a);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
