package org.xplatform.main_menu.impl.navigation;

import a.bz30;
import a.dw10;
import a.iiy;
import a.m1r;
import a.q040;
import a.r040;
import a.ufx;
import a.wsz;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MainMenuFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r040 f46767a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public MainMenuFragmentScreen(r040 r040Var, boolean z, boolean z2, boolean z3) {
        this.f46767a = r040Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        boolean z = this.d;
        boolean z2 = this.c;
        boolean z3 = this.b;
        r040 r040Var = this.f46767a;
        if (z) {
            wsz wszVar = bz30.P1;
            q040 q040Var = new q040(r040Var, z3, z2);
            wszVar.getClass();
            bz30 bz30Var = new bz30();
            bz30Var.K1.u(bz30Var, bz30.Q1[0], q040Var);
            return bz30Var;
        }
        dw10.V1.getClass();
        dw10 dw10Var = new dw10();
        iiy[] iiyVarArr = dw10.W1;
        dw10Var.P1.u(dw10Var, iiyVarArr[1], r040Var);
        dw10Var.S1.u(dw10Var, iiyVarArr[2], Boolean.valueOf(z3));
        dw10Var.U1.v(dw10Var, iiyVarArr[3], z2);
        return dw10Var;
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
