package org.xplatform.verification.status.impl.navigation;

import a.m10;
import a.m1r;
import a.r9u;
import a.s10;
import a.ufx;
import a.ygp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47311a;
    public final r9u b;

    public VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen(int i, r9u r9uVar) {
        r9uVar.getClass();
        this.f47311a = i;
        this.b = r9uVar;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ygp ygpVar = ygp.A;
        r9u r9uVar = this.b;
        r9uVar.getClass();
        boolean zA = r9uVar.f30104a.a(ygpVar);
        int i = this.f47311a;
        if (zA) {
            m10.P1.getClass();
            m10 m10Var = new m10();
            m10Var.L1.I(m10Var, m10.Q1[1], i);
            return m10Var;
        }
        s10.Q1.getClass();
        s10 s10Var = new s10();
        s10Var.L1.I(s10Var, s10.R1[1], i);
        return s10Var;
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
