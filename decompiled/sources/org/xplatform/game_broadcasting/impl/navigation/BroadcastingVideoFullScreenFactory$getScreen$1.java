package org.xplatform.game_broadcasting.impl.navigation;

import a.m1r;
import a.r59;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingVideoLandscapeParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/game_broadcasting/impl/navigation/BroadcastingVideoFullScreenFactory$getScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BroadcastingVideoFullScreenFactory$getScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BroadcastingVideoLandscapeParams f46701a;

    public BroadcastingVideoFullScreenFactory$getScreen$1(BroadcastingVideoLandscapeParams broadcastingVideoLandscapeParams) {
        this.f46701a = broadcastingVideoLandscapeParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        r59.P1.getClass();
        r59 r59Var = new r59();
        r59Var.N1.J(r59Var, r59.Q1[0], this.f46701a);
        return r59Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
