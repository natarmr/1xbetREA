package org.xplatform.results.impl.di.navigation;

import a.m1r;
import a.pek0;
import a.ufx;
import a.w62;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import org.xplatform.results.impl.presentation.alt_champs.ChampsResultsParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ResultsScreenFactoryImpl$getChampsScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f46895a;

    public ResultsScreenFactoryImpl$getChampsScreen$1(List list) {
        this.f46895a = list;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        pek0 pek0Var = w62.Q1;
        new ChampsResultsParams(-1, 0L, a.c(0L), false);
        List list = this.f46895a;
        list.getClass();
        ChampsResultsParams champsResultsParams = new ChampsResultsParams(-1, 0L, list, false);
        pek0Var.getClass();
        w62 w62Var = new w62();
        w62Var.K1.J(w62Var, w62.R1[0], champsResultsParams);
        return w62Var;
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
