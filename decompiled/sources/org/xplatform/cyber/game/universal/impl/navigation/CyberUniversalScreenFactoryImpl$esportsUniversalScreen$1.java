package org.xplatform.cyber.game.universal.impl.navigation;

import a.i5o;
import a.m1r;
import a.nwd;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.game.universal.api.EsportsUniversalScreenParams;
import org.xplatform.cyber.game.universal.api.navigation.CyberUniversalScreenFactory$CyberUniversalScreen;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/cyber/game/universal/impl/navigation/CyberUniversalScreenFactoryImpl$esportsUniversalScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/cyber/game/universal/api/navigation/CyberUniversalScreenFactory$CyberUniversalScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberUniversalScreenFactoryImpl$esportsUniversalScreen$1 implements FragmentScreen, CyberUniversalScreenFactory$CyberUniversalScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EsportsUniversalScreenParams f46524a;

    public CyberUniversalScreenFactoryImpl$esportsUniversalScreen$1(EsportsUniversalScreenParams esportsUniversalScreenParams, nwd nwdVar) {
        this.f46524a = esportsUniversalScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        i5o.Z1.getClass();
        i5o i5oVar = new i5o();
        i5oVar.V1.J(i5oVar, i5o.a2[0], this.f46524a);
        return i5oVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return String.valueOf(this.f46524a.f46523a);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
