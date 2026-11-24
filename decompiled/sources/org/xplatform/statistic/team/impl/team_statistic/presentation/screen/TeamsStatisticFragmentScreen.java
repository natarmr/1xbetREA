package org.xplatform.statistic.team.impl.team_statistic.presentation.screen;

import a.bsp0;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/team/impl/team_statistic/presentation/screen/TeamsStatisticFragmentScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TeamsStatisticFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47091a;
    public final long b;

    public TeamsStatisticFragmentScreen(String str, long j) {
        this.f47091a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        bsp0.R1.getClass();
        bsp0 bsp0Var = new bsp0();
        iiy[] iiyVarArr = bsp0.S1;
        bsp0Var.L1.x(bsp0Var, iiyVarArr[0], this.f47091a);
        bsp0Var.M1.j(bsp0Var, iiyVarArr[1], this.b);
        return bsp0Var;
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
