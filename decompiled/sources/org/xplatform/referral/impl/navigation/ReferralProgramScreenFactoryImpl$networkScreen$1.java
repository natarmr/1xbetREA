package org.xplatform.referral.impl.navigation;

import a.jne0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.referral.api.presentation.ReferralNetworkParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/referral/impl/navigation/ReferralProgramScreenFactoryImpl$networkScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ReferralProgramScreenFactoryImpl$networkScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferralNetworkParams f46846a;

    public ReferralProgramScreenFactoryImpl$networkScreen$1(ReferralNetworkParams referralNetworkParams) {
        this.f46846a = referralNetworkParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        jne0.S1.getClass();
        jne0 jne0Var = new jne0();
        jne0Var.P1.J(jne0Var, jne0.U1[0], this.f46846a);
        return jne0Var;
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
