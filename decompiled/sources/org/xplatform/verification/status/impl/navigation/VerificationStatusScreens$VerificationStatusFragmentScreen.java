package org.xplatform.verification.status.impl.navigation;

import a.gau0;
import a.j1q0;
import a.m1r;
import a.mau0;
import a.r9u;
import a.ufx;
import a.ygp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class VerificationStatusScreens$VerificationStatusFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47312a;
    public final r9u b;

    public VerificationStatusScreens$VerificationStatusFragmentScreen(boolean z, r9u r9uVar) {
        this.f47312a = z;
        this.b = r9uVar;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ygp ygpVar = ygp.A;
        j1q0 j1q0Var = this.b.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        boolean z = this.f47312a;
        if (zD) {
            gau0.P1.getClass();
            gau0 gau0Var = new gau0();
            gau0Var.N1.v(gau0Var, gau0.Q1[1], z);
            return gau0Var;
        }
        mau0.Q1.getClass();
        mau0 mau0Var = new mau0();
        mau0Var.O1.v(mau0Var, mau0.R1[1], z);
        return mau0Var;
    }

    @Override // a.m7h0
    public final String b() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final /* bridge */ boolean g() {
        return true;
    }
}
