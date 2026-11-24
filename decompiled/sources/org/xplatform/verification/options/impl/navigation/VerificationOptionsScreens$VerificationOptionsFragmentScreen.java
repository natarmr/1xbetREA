package org.xplatform.verification.options.impl.navigation;

import a.a9u0;
import a.j1q0;
import a.m1r;
import a.r9u;
import a.ufx;
import a.v8u0;
import a.ygp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/verification/options/impl/navigation/VerificationOptionsScreens$VerificationOptionsFragmentScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class VerificationOptionsScreens$VerificationOptionsFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47310a;
    public final r9u b;

    public VerificationOptionsScreens$VerificationOptionsFragmentScreen(int i, r9u r9uVar) {
        this.f47310a = i;
        this.b = r9uVar;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ygp ygpVar = ygp.Y;
        j1q0 j1q0Var = this.b.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        int i = this.f47310a;
        if (zD) {
            v8u0.P1.getClass();
            v8u0 v8u0Var = new v8u0();
            v8u0Var.L1.I(v8u0Var, v8u0.Q1[1], i);
            return v8u0Var;
        }
        a9u0.R1.getClass();
        a9u0 a9u0Var = new a9u0();
        a9u0Var.L1.I(a9u0Var, a9u0.S1[1], i);
        return a9u0Var;
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
