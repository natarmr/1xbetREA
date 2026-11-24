package org.xplatform.cyber.lol.impl.navigation;

import a.kud;
import a.m1r;
import a.wz00;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.game.lol.api.LolScreenParams;
import org.xplatform.cyber.game.lol.api.navigation.CyberGameLolScreenFactory$CyberGameLolScreen;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/cyber/lol/impl/navigation/CyberGameLolScreenFactoryImpl$lolScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/cyber/game/lol/api/navigation/CyberGameLolScreenFactory$CyberGameLolScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGameLolScreenFactoryImpl$lolScreen$1 implements FragmentScreen, CyberGameLolScreenFactory$CyberGameLolScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LolScreenParams f46545a;

    public CyberGameLolScreenFactoryImpl$lolScreen$1(LolScreenParams lolScreenParams, kud kudVar) {
        this.f46545a = lolScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        wz00.b2.getClass();
        wz00 wz00Var = new wz00();
        wz00Var.Z1.J(wz00Var, wz00.c2[1], this.f46545a);
        return wz00Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return String.valueOf(this.f46545a.f46516a);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
