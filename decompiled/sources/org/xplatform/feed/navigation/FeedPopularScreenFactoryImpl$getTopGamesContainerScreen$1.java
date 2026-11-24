package org.xplatform.feed.navigation;

import a.m1r;
import a.m7r0;
import a.r6r0;
import a.rrc;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/feed/navigation/FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rrc f46669a;
    public final /* synthetic */ m7r0 b;

    public FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1(rrc rrcVar, m7r0 m7r0Var) {
        this.f46669a = rrcVar;
        this.b = m7r0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        Object obj = this.f46669a.b;
        r6r0.S1.getClass();
        r6r0 r6r0Var = new r6r0();
        r6r0Var.N1.u(r6r0Var, r6r0.U1[0], this.b);
        return r6r0Var;
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
