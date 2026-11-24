package org.xplatform.authenticator.impl.navigation;

import a.iiy;
import a.m1r;
import a.ufx;
import a.ur4;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationFailScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AuthenticatorScreenFactoryImpl$registrationFailScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46350a;
    public final /* synthetic */ boolean b;

    public AuthenticatorScreenFactoryImpl$registrationFailScreen$1(String str, boolean z) {
        this.f46350a = str;
        this.b = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ur4.P1.getClass();
        String str = this.f46350a;
        str.getClass();
        ur4 ur4Var = new ur4();
        iiy[] iiyVarArr = ur4.Q1;
        ur4Var.O1.x(ur4Var, iiyVarArr[2], str);
        ur4Var.K1.v(ur4Var, iiyVarArr[0], this.b);
        return ur4Var;
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
