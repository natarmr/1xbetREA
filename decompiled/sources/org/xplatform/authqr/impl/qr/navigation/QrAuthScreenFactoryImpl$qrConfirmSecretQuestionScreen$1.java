package org.xplatform.authqr.impl.qr.navigation;

import a.iiy;
import a.m1r;
import a.swp0;
import a.xhd0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrConfirmSecretQuestionScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class QrAuthScreenFactoryImpl$qrConfirmSecretQuestionScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ swp0 f46356a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public QrAuthScreenFactoryImpl$qrConfirmSecretQuestionScreen$1(swp0 swp0Var, String str, String str2) {
        this.f46356a = swp0Var;
        this.b = str;
        this.c = str2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        xhd0.S1.getClass();
        String str = this.c;
        str.getClass();
        xhd0 xhd0Var = new xhd0();
        iiy[] iiyVarArr = xhd0.U1;
        xhd0Var.P1.u(xhd0Var, iiyVarArr[1], this.f46356a);
        xhd0Var.Q1.x(xhd0Var, iiyVarArr[2], this.b);
        xhd0Var.R1.x(xhd0Var, iiyVarArr[3], str);
        return xhd0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return "QrConfirmSecretQuestionFragment";
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
