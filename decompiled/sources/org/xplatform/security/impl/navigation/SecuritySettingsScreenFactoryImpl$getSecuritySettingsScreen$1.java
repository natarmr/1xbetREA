package org.xplatform.security.impl.navigation;

import a.fsh0;
import a.i120;
import a.iw20;
import a.joh0;
import a.m1r;
import a.nqh0;
import a.oph0;
import a.pru;
import a.t9f;
import a.ufx;
import a.xph0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/security/impl/navigation/SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iw20 f46948a;
    public final /* synthetic */ fsh0 b;
    public final /* synthetic */ nqh0 c;

    public SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1(iw20 iw20Var, fsh0 fsh0Var, nqh0 nqh0Var) {
        this.f46948a = iw20Var;
        this.b = fsh0Var;
        this.c = nqh0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        int iOrdinal = ((pru) this.f46948a.f15470a).a().g.r.ordinal();
        if (iOrdinal == 0) {
            oph0.Q1.getClass();
            oph0 oph0Var = new oph0();
            fsh0 fsh0Var = this.b;
            oph0Var.s0(i120.V(new Pair("KEY_SETTINGS_EVENT", fsh0Var != null ? Integer.valueOf(fsh0Var.ordinal()) : null)));
            return oph0Var;
        }
        if (iOrdinal == 1) {
            joh0.N1.getClass();
            return new joh0();
        }
        if (iOrdinal != 2) {
            t9f.b();
            return null;
        }
        xph0.Q1.getClass();
        xph0 xph0Var = new xph0();
        xph0Var.L1.u(xph0Var, xph0.R1[0], this.c);
        return xph0Var;
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
