package org.xplatform.statistic.stadium.impl.stadium.screen;

import a.iiy;
import a.m1r;
import a.ovl0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/stadium/impl/stadium/screen/StadiumScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class StadiumScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47066a;
    public final long b;
    public final int c;

    public StadiumScreen(String str, long j, int i) {
        this.f47066a = str;
        this.b = j;
        this.c = i;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ovl0.R1.getClass();
        ovl0 ovl0Var = new ovl0();
        iiy[] iiyVarArr = ovl0.S1;
        ovl0Var.L1.x(ovl0Var, iiyVarArr[1], this.f47066a);
        ovl0Var.M1.j(ovl0Var, iiyVarArr[2], this.b);
        ovl0Var.N1.I(ovl0Var, iiyVarArr[3], this.c);
        return ovl0Var;
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
