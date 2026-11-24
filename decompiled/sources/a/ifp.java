package a;

import a.i0p0;
import a.j6m0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsScreen$1;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$favoriteCategory$1;
import org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState;
import org.xplatform.favorites.impl.presentation.teambet.presentation.models.TeamBetScreenParams;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getFighterFragmentScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class ifp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9u f14699a;
    public final pru b;
    public final vqc c;

    public ifp(r9u r9uVar, pru pruVar, vqc vqcVar, kys0 kys0Var) {
        r9uVar.getClass();
        this.f14699a = r9uVar;
        this.b = pruVar;
        this.c = vqcVar;
    }

    public final FragmentScreen a(final long j, tnp0 tnp0Var, final String str, final long j2, final long j3, final String str2) {
        tnp0Var.getClass();
        pru pruVar = this.b;
        if (pruVar.a().B0) {
            ygp ygpVar = ygp.u;
            r9u r9uVar = this.f14699a;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            if (j1q0Var.f15748a.d(ygpVar)) {
                if (tnp0Var instanceof rnp0) {
                    if (j2 == 40) {
                        return new CyberGamesScreenFactoryImpl$teamDetailsScreen$1(this.c, new TeamDetailsParams(j3, j, str));
                    }
                    rnp0 rnp0Var = (rnp0) tnp0Var;
                    return new FavoritesInternalNavigation$favoriteCategory$1(this, new FavoriteCategoryUiState.Team(rnp0Var.f30800a, rnp0Var.b, j3, str));
                }
                if (tnp0Var instanceof snp0) {
                    return new FragmentScreen() { // from class: org.xplatform.favorites.impl.FavoritesInternalNavigation$teamBetSportScreen$1
                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            j6m0 j6m0Var = i0p0.Z1;
                            TeamBetScreenParams teamBetScreenParams = new TeamBetScreenParams(j, j2, j3, str, str2);
                            j6m0Var.getClass();
                            i0p0 i0p0Var = new i0p0();
                            i0p0Var.M1.J(i0p0Var, i0p0.a2[0], teamBetScreenParams);
                            return i0p0Var;
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
                    };
                }
                t9f.b();
                return null;
            }
        }
        return (tnp0Var.c() == 189 && pruVar.a().c.d) ? new UfcScreensFactoryImpl$getFighterFragmentScreen$1(tnp0Var.a()) : new FavoritesInternalNavigation$favoriteCategory$1(this, new FavoriteCategoryUiState.Team(tnp0Var.a(), tnp0Var.c(), j3, str));
    }
}
