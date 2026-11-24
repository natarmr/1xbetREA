package a;

import a.j1q0;
import a.l46;
import a.m1r;
import a.q46;
import a.r9u;
import a.ufx;
import a.ygp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import org.xplatform.verification.base.impl.navigation.BaseVerificationScreens$BaseVerificationFragmentScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class r46 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9u f29822a;

    public r46(r9u r9uVar, byte b) {
        r9uVar.getClass();
        switch (b) {
            case 3:
                this.f29822a = r9uVar;
                break;
            default:
                this.f29822a = r9uVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.xplatform.verification.base.impl.navigation.BaseVerificationScreens$BaseVerificationFragmentScreen] */
    public BaseVerificationScreens$BaseVerificationFragmentScreen a() {
        final r9u r9uVar = this.f29822a;
        return new FragmentScreen(r9uVar) { // from class: org.xplatform.verification.base.impl.navigation.BaseVerificationScreens$BaseVerificationFragmentScreen

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final r9u f47309a;

            {
                this.f47309a = r9uVar;
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                ygp ygpVar = ygp.w1;
                j1q0 j1q0Var = this.f47309a.f30104a;
                j1q0Var.getClass();
                if (j1q0Var.f15748a.d(ygpVar)) {
                    l46.O1.getClass();
                    return new l46();
                }
                q46.O1.getClass();
                return new q46();
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

    public yx5 b(b7b0 b7b0Var) {
        ygp ygpVar = ygp.k;
        r9u r9uVar = this.f29822a;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        if (j1q0Var.f15748a.d(ygpVar)) {
            z5b0.R1.getClass();
            z5b0 z5b0Var = new z5b0();
            z5b0Var.P1.u(z5b0Var, z5b0.S1[1], b7b0Var);
            return z5b0Var;
        }
        z6b0.S1.getClass();
        z6b0 z6b0Var = new z6b0();
        z6b0Var.Q1.u(z6b0Var, z6b0.U1[1], b7b0Var);
        return z6b0Var;
    }

    public /* synthetic */ r46(r9u r9uVar, char c) {
        this.f29822a = r9uVar;
    }
}
