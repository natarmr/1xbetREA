package org.xplatform.app_update.impl.navigation;

import a.dm3;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.app_update.api.presentation.AppUpdateScreenParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AppUpdateScreenFactoryImpl$getAppUpdateScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppUpdateScreenParams f46324a;

    public AppUpdateScreenFactoryImpl$getAppUpdateScreen$1(AppUpdateScreenParams appUpdateScreenParams) {
        this.f46324a = appUpdateScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        dm3.U1.getClass();
        dm3 dm3Var = new dm3();
        dm3Var.Q1.J(dm3Var, dm3.V1[1], this.f46324a);
        return dm3Var;
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
