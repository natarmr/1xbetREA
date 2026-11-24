package org.xplatform.feed.navigation;

import a.m1r;
import a.ufx;
import a.url0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/feed/navigation/SportFilterScreenFactoryImpl$getSportFilterScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportFilterScreenFactoryImpl$getSportFilterScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SportFilterScreenParams f46673a;

    public SportFilterScreenFactoryImpl$getSportFilterScreen$1(SportFilterScreenParams sportFilterScreenParams) {
        this.f46673a = sportFilterScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        url0.R1.getClass();
        url0 url0Var = new url0();
        url0Var.Q1.J(url0Var, url0.S1[1], this.f46673a);
        return url0Var;
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
