package org.xplatform.security.impl.navigation;

import a.dvs0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/security/impl/navigation/TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1 implements FragmentScreen {
    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        dvs0.Q1.getClass();
        dvs0 dvs0Var = new dvs0();
        dvs0Var.P1.x(dvs0Var, dvs0.R1[1], "OTP_CONFIRMATION_RESULT_KEY");
        return dvs0Var;
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
