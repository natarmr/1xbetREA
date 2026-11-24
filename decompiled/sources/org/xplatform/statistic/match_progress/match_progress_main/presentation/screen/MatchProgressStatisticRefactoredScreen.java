package org.xplatform.statistic.match_progress.match_progress_main.presentation.screen;

import a.iiy;
import a.m1r;
import a.ufx;
import a.zc30;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/match_progress/match_progress_main/presentation/screen/MatchProgressStatisticRefactoredScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MatchProgressStatisticRefactoredScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47042a;
    public final long b;

    public MatchProgressStatisticRefactoredScreen(String str, long j) {
        this.f47042a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        zc30.R1.getClass();
        zc30 zc30Var = new zc30();
        iiy[] iiyVarArr = zc30.S1;
        zc30Var.L1.x(zc30Var, iiyVarArr[0], this.f47042a);
        zc30Var.M1.j(zc30Var, iiyVarArr[1], this.b);
        return zc30Var;
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
