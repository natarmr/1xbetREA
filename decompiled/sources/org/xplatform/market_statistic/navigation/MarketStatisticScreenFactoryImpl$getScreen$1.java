package org.xplatform.market_statistic.navigation;

import a.m1r;
import a.s730;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.market_statistic.api.presentation.MarketStatisticParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/market_statistic/navigation/MarketStatisticScreenFactoryImpl$getScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MarketStatisticScreenFactoryImpl$getScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarketStatisticParams f46777a;

    public MarketStatisticScreenFactoryImpl$getScreen$1(MarketStatisticParams marketStatisticParams) {
        this.f46777a = marketStatisticParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        s730.Q1.getClass();
        s730 s730Var = new s730();
        s730Var.O1.J(s730Var, s730.R1[1], this.f46777a);
        return s730Var;
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
