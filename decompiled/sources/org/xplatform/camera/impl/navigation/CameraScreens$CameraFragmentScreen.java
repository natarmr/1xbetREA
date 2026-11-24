package org.xplatform.camera.impl.navigation;

import a.e0g0;
import a.g0g0;
import a.iiy;
import a.j0g0;
import a.kkd0;
import a.kl5;
import a.m1r;
import a.qz9;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/camera/impl/navigation/CameraScreens$CameraFragmentScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CameraScreens$CameraFragmentScreen implements FragmentScreen {
    public CameraScreens$CameraFragmentScreen() {
        kkd0 kkd0Var = kkd0.LOW;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        kl5 kl5Var = qz9.t2;
        kkd0 kkd0Var = kkd0.LOW;
        kl5Var.getClass();
        qz9 qz9Var = new qz9();
        e0g0 e0g0Var = j0g0.b;
        g0g0 g0g0Var = new g0g0(new Exception());
        iiy[] iiyVarArr = qz9.u2;
        qz9Var.e2.u(qz9Var, iiyVarArr[1], new j0g0(g0g0Var));
        qz9Var.d2.u(qz9Var, iiyVarArr[0], kkd0Var);
        return qz9Var;
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
