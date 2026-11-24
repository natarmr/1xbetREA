package org.xplatform.cyber.dota.impl.navigation;

import a.l3l;
import a.m1r;
import a.sek;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.game.dota.api.navigation.GameDotaScreenFactory$GameDotaScreen;
import org.xplatform.cyber.game.dota.api.presentation.CyberGameDotaScreenParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/cyber/dota/impl/navigation/GameDotaScreenFactoryImpl$dotaScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/cyber/game/dota/api/navigation/GameDotaScreenFactory$GameDotaScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GameDotaScreenFactoryImpl$dotaScreen$1 implements FragmentScreen, GameDotaScreenFactory$GameDotaScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CyberGameDotaScreenParams f46496a;

    public GameDotaScreenFactoryImpl$dotaScreen$1(CyberGameDotaScreenParams cyberGameDotaScreenParams, sek sekVar) {
        this.f46496a = cyberGameDotaScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        l3l.b2.getClass();
        l3l l3lVar = new l3l();
        l3lVar.Z1.J(l3lVar, l3l.c2[1], this.f46496a);
        return l3lVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return String.valueOf(this.f46496a.f46514a);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
