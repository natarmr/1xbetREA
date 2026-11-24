package org.xplatform.security.impl.navigation;

import a.byo;
import a.j1q0;
import a.m1r;
import a.pru;
import a.r9u;
import a.ufx;
import a.we50;
import a.xz80;
import a.ygp;
import a.zn00;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PasswordScreenFactoryImpl$getPasswordChangeFragment$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zn00 f46946a;
    public final /* synthetic */ we50 b;

    public PasswordScreenFactoryImpl$getPasswordChangeFragment$1(zn00 zn00Var, we50 we50Var) {
        this.f46946a = zn00Var;
        this.b = we50Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        zn00 zn00Var = this.f46946a;
        r9u r9uVar = (r9u) zn00Var.f44650a;
        ygp ygpVar = ygp.A1;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        we50 we50Var = this.b;
        if (zD && ((pru) zn00Var.b).a().Q1) {
            byo.P1.getClass();
            we50Var.getClass();
            byo byoVar = new byo();
            byoVar.M1.u(byoVar, byo.Q1[1], we50Var);
            return byoVar;
        }
        xz80.U1.getClass();
        we50Var.getClass();
        xz80 xz80Var = new xz80();
        xz80Var.S1.u(xz80Var, xz80.V1[1], we50Var);
        return xz80Var;
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
