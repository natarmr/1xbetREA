package org.xplatform.authenticator.impl.navigation;

import a.iiy;
import a.m1r;
import a.mq4;
import a.qp4;
import a.r080;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$authenticatorScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AuthenticatorScreenFactoryImpl$authenticatorScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mq4 f46349a;
    public final /* synthetic */ String b;
    public final /* synthetic */ r080 c;

    public AuthenticatorScreenFactoryImpl$authenticatorScreen$1(mq4 mq4Var, String str, r080 r080Var) {
        this.f46349a = mq4Var;
        this.b = str;
        this.c = r080Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        qp4.R1.getClass();
        qp4 qp4Var = new qp4();
        iiy[] iiyVarArr = qp4.S1;
        qp4Var.P1.u(qp4Var, iiyVarArr[3], this.f46349a);
        qp4Var.N1.x(qp4Var, iiyVarArr[1], this.b);
        qp4Var.O1.u(qp4Var, iiyVarArr[2], this.c);
        return qp4Var;
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
