package org.xplatform.cyber.game.mlbb.impl.navigation;

import a.ai40;
import a.m1r;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.game.mlbb.api.MlbbGameScreenParams;
import org.xplatform.cyber.game.mlbb.api.navigation.MlbbGameScreenFactory$MlbbGameScreen;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/cyber/game/mlbb/impl/navigation/MlbbGameScreenFactoryImpl$mlbbScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/cyber/game/mlbb/api/navigation/MlbbGameScreenFactory$MlbbGameScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MlbbGameScreenFactoryImpl$mlbbScreen$1 implements FragmentScreen, MlbbGameScreenFactory$MlbbGameScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MlbbGameScreenParams f46519a;

    public MlbbGameScreenFactoryImpl$mlbbScreen$1(MlbbGameScreenParams mlbbGameScreenParams) {
        this.f46519a = mlbbGameScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ai40.b2.getClass();
        ai40 ai40Var = new ai40();
        ai40Var.a2.J(ai40Var, ai40.c2[1], this.f46519a);
        return ai40Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return String.valueOf(this.f46519a.f46517a);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
