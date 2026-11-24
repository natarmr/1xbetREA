package org.xplatform.results.impl.di.navigation;

import a.ia2;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import kotlin.Metadata;
import org.xplatform.results.impl.presentation.alt_history.GamesHistoryResultsParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getGamesScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ResultsScreenFactoryImpl$getGamesScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46896a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public ResultsScreenFactoryImpl$getGamesScreen$1(int i, String str, List list, boolean z) {
        this.f46896a = str;
        this.b = list;
        this.c = z;
        this.d = i;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        GamesHistoryResultsParams gamesHistoryResultsParams = new GamesHistoryResultsParams(this.d, this.f46896a, this.b, this.c);
        ia2.Q1.getClass();
        ia2 ia2Var = new ia2();
        ia2Var.K1.J(ia2Var, ia2.R1[0], gamesHistoryResultsParams);
        return ia2Var;
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
