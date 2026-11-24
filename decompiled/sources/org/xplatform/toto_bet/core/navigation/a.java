package org.xplatform.toto_bet.core.navigation;

import a.j1q0;
import a.m1r;
import a.r9u;
import a.ufx;
import a.ygp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import org.xplatform.toto_bet.active_tirage.presentation.screen.TotoBetDsScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9u f47163a;

    public a(r9u r9uVar) {
        r9uVar.getClass();
        this.f47163a = r9uVar;
    }

    public final FragmentScreen a() {
        ygp ygpVar = ygp.H1;
        r9u r9uVar = this.f47163a;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        final TotoBetDsScreen totoBetDsScreen = new TotoBetDsScreen(j1q0Var.f15748a.d(ygpVar));
        return new FragmentScreen(totoBetDsScreen) { // from class: org.xplatform.toto_bet.core.navigation.TotoBetScreenFactoryImpl$TotoBetRootFragmentScreen

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TotoBetDsScreen f47162a;

            {
                this.f47162a = totoBetDsScreen;
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                return this.f47162a.a(m1rVar);
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
        };
    }
}
