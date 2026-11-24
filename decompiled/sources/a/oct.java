package a;

import a.m1r;
import a.ni8;
import a.ufx;
import a.v3t;
import a.yk5;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import org.xplatform.games_list.features.common.OneXGamesScreens$LuckyWheelDsScreen;
import org.xplatform.games_list.features.common.OneXGamesScreens$LuckyWheelScreen;
import org.xplatform.games_section.feature.bonuses.di.BonusesScreenFactoryImpl$getGameBonusesScreen$1;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$JackpotFragmentScreen;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$JackpotOldFragmentScreen;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$OneXGamesFragmentScreen;
import org.xplatform.web.impl.di.feature.WebGameScreenFactoryImpl$getWebGameScreen$2;

/* JADX INFO: loaded from: classes4.dex */
public final class oct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uxs0 f25044a;
    public final r9u b;

    public oct(uxs0 uxs0Var, mj8 mj8Var, bj5 bj5Var, r9u r9uVar) {
        r9uVar.getClass();
        this.f25044a = uxs0Var;
        this.b = r9uVar;
    }

    public static GamesSectionScreens$OneXGamesFragmentScreen f(oct octVar, long j, d270 d270Var, int i, t270 t270Var, String str, int i2) {
        r270 r270Var;
        if ((i2 & 1) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            d270Var = d270.UNKNOWN;
        }
        d270 d270Var2 = d270Var;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            t270Var = t270.f33203a;
        }
        if ((i2 & 16) != 0) {
            str = "";
        }
        String str2 = str;
        octVar.getClass();
        d270Var2.getClass();
        t270Var.getClass();
        str2.getClass();
        int iOrdinal = t270Var.ordinal();
        if (iOrdinal == 0) {
            r270Var = r270.f29718a;
        } else if (iOrdinal == 1) {
            r270Var = r270.b;
        } else if (iOrdinal == 2) {
            r270Var = r270.c;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            r270Var = r270.d;
        }
        return new GamesSectionScreens$OneXGamesFragmentScreen(j2, d270Var2, i3, r270Var, str2);
    }

    public final FragmentScreen a(long j, csr csrVar, String str) {
        str.getClass();
        csrVar.getClass();
        s470.Companion.getClass();
        return r470.a(j) == s470.LUCKY_WHEEL ? e() : jtv.L0(j, csrVar, this.b);
    }

    public final WebGameScreenFactoryImpl$getWebGameScreen$2 b(long j, csr csrVar, boolean z, String str) {
        csrVar.getClass();
        str.getClass();
        return uxs0.c(this.f25044a, j, csrVar, z, str, 4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.xplatform.games_section.feature.bonuses.di.BonusesScreenFactoryImpl$getGameBonusesScreen$1] */
    public final BonusesScreenFactoryImpl$getGameBonusesScreen$1 c(final long j, final csr csrVar, final String str) {
        csrVar.getClass();
        return new FragmentScreen() { // from class: org.xplatform.games_section.feature.bonuses.di.BonusesScreenFactoryImpl$getGameBonusesScreen$1
            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                yk5 yk5Var = ni8.U1;
                String str2 = str;
                v3t v3tVar = new v3t(j, csrVar, str2);
                yk5Var.getClass();
                return yk5.l(v3tVar, "");
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

    public final FragmentScreen d() {
        ygp ygpVar = ygp.r1;
        r9u r9uVar = this.b;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        return j1q0Var.f15748a.d(ygpVar) ? new GamesSectionScreens$JackpotFragmentScreen() : new GamesSectionScreens$JackpotOldFragmentScreen();
    }

    public final FragmentScreen e() {
        csr csrVar = csr.e;
        r9u r9uVar = this.b;
        r9uVar.getClass();
        csrVar.getClass();
        ygp ygpVar = ygp.s;
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        return j1q0Var.f15748a.d(ygpVar) ? new OneXGamesScreens$LuckyWheelDsScreen(csrVar) : new OneXGamesScreens$LuckyWheelScreen(csrVar);
    }
}
