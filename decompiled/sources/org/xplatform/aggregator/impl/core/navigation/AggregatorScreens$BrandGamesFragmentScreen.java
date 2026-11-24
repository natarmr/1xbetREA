package org.xplatform.aggregator.impl.core.navigation;

import a.m1r;
import a.uc0;
import a.uw8;
import a.vfc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandGamesFragmentScreen", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AggregatorScreens$BrandGamesFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc0 f46301a;

    public AggregatorScreens$BrandGamesFragmentScreen(uc0 uc0Var) {
        this.f46301a = uc0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        uw8.S1.getClass();
        uw8 uw8Var = new uw8();
        uw8Var.Q1.u(uw8Var, uw8.U1[1], this.f46301a);
        return uw8Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return vfc.I(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
