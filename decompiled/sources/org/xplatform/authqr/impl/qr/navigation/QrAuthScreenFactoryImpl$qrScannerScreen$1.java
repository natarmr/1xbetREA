package org.xplatform.authqr.impl.qr.navigation;

import a.iiy;
import a.m1r;
import a.qid0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class QrAuthScreenFactoryImpl$qrScannerScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46357a;
    public final /* synthetic */ String b;

    public QrAuthScreenFactoryImpl$qrScannerScreen$1(String str, String str2) {
        this.f46357a = str;
        this.b = str2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        qid0.V1.getClass();
        qid0 qid0Var = new qid0();
        iiy[] iiyVarArr = qid0.W1;
        qid0Var.P1.x(qid0Var, iiyVarArr[1], this.f46357a);
        qid0Var.Q1.x(qid0Var, iiyVarArr[2], this.b);
        return qid0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return "QrScannerFragment";
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
