package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$authenticatorScreen$1;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$OneXGamesFragmentScreen;
import org.xplatform.support.api.navigation.SupportMenuScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class uf3 implements tf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oct f35560a;
    public final lp4 b;
    public final nv20 c;
    public final onv d;
    public final fvt0 e;

    public uf3(oct octVar, lp4 lp4Var, wxs0 wxs0Var, jdk0 jdk0Var, nv20 nv20Var, onv onvVar, s9m0 s9m0Var, wxs0 wxs0Var2, s9m0 s9m0Var2, fvt0 fvt0Var, atz atzVar, sek sekVar) {
        lp4Var.getClass();
        this.f35560a = octVar;
        this.b = lp4Var;
        this.c = nv20Var;
        this.d = onvVar;
        this.e = fvt0Var;
    }

    public final AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1 b() {
        this.b.m();
        return new AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1(false);
    }

    public final AuthenticatorScreenFactoryImpl$authenticatorScreen$1 c() {
        return rek0.b(this.b.m(), mq4.c);
    }

    public final FragmentScreen$Companion$invoke$1 d(boolean z) {
        return s9m0.f(new SupportMenuScreenParams(z, pjn0.f27099a, SupportMenuScreenParams.AdditionalParams.None.f47112a));
    }

    public final GamesSectionScreens$OneXGamesFragmentScreen e(int i) {
        return oct.f(this.f35560a, 0L, null, i, null, null, 27);
    }
}
