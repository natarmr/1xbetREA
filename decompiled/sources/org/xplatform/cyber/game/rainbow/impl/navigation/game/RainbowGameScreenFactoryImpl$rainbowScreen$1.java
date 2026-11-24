package org.xplatform.cyber.game.rainbow.impl.navigation.game;

import a.fl70;
import a.m1r;
import a.m7h0;
import a.uud0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.game.rainbow.api.RainbowGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/cyber/game/rainbow/impl/navigation/game/RainbowGameScreenFactoryImpl$rainbowScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RainbowGameScreenFactoryImpl$rainbowScreen$1 implements FragmentScreen, m7h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RainbowGameScreenParams f46522a;

    public RainbowGameScreenFactoryImpl$rainbowScreen$1(RainbowGameScreenParams rainbowGameScreenParams, fl70 fl70Var) {
        this.f46522a = rainbowGameScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        uud0.b2.getClass();
        uud0 uud0Var = new uud0();
        uud0Var.Z1.J(uud0Var, uud0.c2[1], this.f46522a);
        return uud0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return String.valueOf(this.f46522a.f46520a);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
