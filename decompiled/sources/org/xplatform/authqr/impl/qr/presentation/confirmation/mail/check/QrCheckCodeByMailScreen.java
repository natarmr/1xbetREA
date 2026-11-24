package org.xplatform.authqr.impl.qr.presentation.confirmation.mail.check;

import a.gfd0;
import a.iiy;
import a.m1r;
import a.swp0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/check/QrCheckCodeByMailScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class QrCheckCodeByMailScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f46360a;
    public final long b;

    public QrCheckCodeByMailScreen(swp0 swp0Var, long j) {
        this.f46360a = swp0Var;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        gfd0.S1.getClass();
        gfd0 gfd0Var = new gfd0();
        iiy[] iiyVarArr = gfd0.U1;
        gfd0Var.Q1.u(gfd0Var, iiyVarArr[1], this.f46360a);
        gfd0Var.R1.j(gfd0Var, iiyVarArr[2], this.b);
        return gfd0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return "QrCheckCodeByMailFragment";
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
