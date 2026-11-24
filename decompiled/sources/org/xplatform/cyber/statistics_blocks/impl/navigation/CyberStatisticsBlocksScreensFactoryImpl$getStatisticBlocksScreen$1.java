package org.xplatform.cyber.statistics_blocks.impl.navigation;

import a.m1r;
import a.nam0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StatisticBlocksParams f46625a;

    public CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1(StatisticBlocksParams statisticBlocksParams) {
        this.f46625a = statisticBlocksParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        nam0.U1.getClass();
        nam0 nam0Var = new nam0();
        nam0Var.Q1.J(nam0Var, nam0.V1[1], this.f46625a);
        return nam0Var;
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
