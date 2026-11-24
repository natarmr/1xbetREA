package org.xplatform.statistic.stat_results.impl.results_grid.presentation.screen;

import a.iiy;
import a.m1r;
import a.ufx;
import a.x6g0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/stat_results/impl/results_grid/presentation/screen/ResultsGridScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ResultsGridScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47080a;
    public final long b;

    public ResultsGridScreen(String str, long j) {
        this.f47080a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        x6g0.Q1.getClass();
        x6g0 x6g0Var = new x6g0();
        iiy[] iiyVarArr = x6g0.R1;
        x6g0Var.N1.x(x6g0Var, iiyVarArr[1], this.f47080a);
        x6g0Var.O1.j(x6g0Var, iiyVarArr[2], this.b);
        return x6g0Var;
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
