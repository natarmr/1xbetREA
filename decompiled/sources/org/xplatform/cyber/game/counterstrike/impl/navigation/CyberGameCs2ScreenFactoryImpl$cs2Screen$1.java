package org.xplatform.cyber.game.counterstrike.impl.navigation;

import a.alf;
import a.m1r;
import a.usd;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.game.counterstrike.api.Cs2GameScreenParams;
import org.xplatform.cyber.game.counterstrike.api.navigation.CyberGameCs2ScreenFactory$CyberGameCs2Screen;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/cyber/game/counterstrike/impl/navigation/CyberGameCs2ScreenFactoryImpl$cs2Screen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/cyber/game/counterstrike/api/navigation/CyberGameCs2ScreenFactory$CyberGameCs2Screen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGameCs2ScreenFactoryImpl$cs2Screen$1 implements FragmentScreen, CyberGameCs2ScreenFactory$CyberGameCs2Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cs2GameScreenParams f46512a;

    public CyberGameCs2ScreenFactoryImpl$cs2Screen$1(Cs2GameScreenParams cs2GameScreenParams, usd usdVar) {
        this.f46512a = cs2GameScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        alf.a2.getClass();
        alf alfVar = new alf();
        alfVar.U1.J(alfVar, alf.b2[0], this.f46512a);
        return alfVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return String.valueOf(this.f46512a.f46511a);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
