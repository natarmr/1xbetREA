package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import org.xplatform.app_start.impl.navigation.AppStartScreenFactoryImpl$appStartScreen$1;
import org.xplatform.app_start.impl.navigation.AppStartScreenFactoryImpl$loadScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final class bh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9u f2585a;

    public bh3(r9u r9uVar) {
        r9uVar.getClass();
        this.f2585a = r9uVar;
    }

    public final FragmentScreen a() {
        ygp ygpVar = ygp.n1;
        r9u r9uVar = this.f2585a;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        return j1q0Var.f15748a.d(ygpVar) ? new AppStartScreenFactoryImpl$loadScreen$1() : new AppStartScreenFactoryImpl$appStartScreen$1();
    }
}
