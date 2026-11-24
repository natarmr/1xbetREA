package org.xplatform.onboarding.impl.navigation;

import a.iiy;
import a.ki60;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OnBoardingScreens$TipsDialogScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46779a;
    public final String b;

    public OnBoardingScreens$TipsDialogScreen(int i, String str) {
        str.getClass();
        this.f46779a = i;
        this.b = str;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ki60.q2.getClass();
        String str = this.b;
        str.getClass();
        ki60 ki60Var = new ki60();
        iiy[] iiyVarArr = ki60.r2;
        ki60Var.n2.I(ki60Var, iiyVarArr[1], this.f46779a);
        ki60Var.o2.x(ki60Var, iiyVarArr[2], str);
        return ki60Var;
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
