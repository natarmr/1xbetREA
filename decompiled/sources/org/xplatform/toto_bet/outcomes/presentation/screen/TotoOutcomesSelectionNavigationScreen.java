package org.xplatform.toto_bet.outcomes.presentation.screen;

import a.iiy;
import a.m1r;
import a.ufx;
import a.ytr0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/toto_bet/outcomes/presentation/screen/TotoOutcomesSelectionNavigationScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TotoOutcomesSelectionNavigationScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47164a;
    public final long b;

    public TotoOutcomesSelectionNavigationScreen(int i, long j) {
        this.f47164a = i;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ytr0.P1.getClass();
        ytr0 ytr0Var = new ytr0();
        iiy[] iiyVarArr = ytr0.Q1;
        ytr0Var.K1.I(ytr0Var, iiyVarArr[0], this.f47164a);
        ytr0Var.L1.j(ytr0Var, iiyVarArr[1], this.b);
        return ytr0Var;
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
