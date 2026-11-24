package org.xplatform.toto_bet.active_tirage.presentation.screen;

import a.m1r;
import a.phr0;
import a.pir0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/toto_bet/active_tirage/presentation/screen/TotoBetDsScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TotoBetDsScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47161a;

    public TotoBetDsScreen(boolean z) {
        this.f47161a = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        if (this.f47161a) {
            phr0.W1.getClass();
            phr0 phr0Var = new phr0();
            phr0Var.L1.x(phr0Var, phr0.X1[0], "NONE");
            return phr0Var;
        }
        pir0.W1.getClass();
        pir0 pir0Var = new pir0();
        pir0Var.L1.x(pir0Var, pir0.X1[0], "NONE");
        return pir0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF46460a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
