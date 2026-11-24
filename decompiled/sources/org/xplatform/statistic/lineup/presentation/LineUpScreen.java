package org.xplatform.statistic.lineup.presentation;

import a.ha00;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/lineup/presentation/LineUpScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LineUpScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47040a;
    public final long b;
    public final int c;

    public LineUpScreen(String str, long j, int i) {
        this.f47040a = str;
        this.b = j;
        this.c = i;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ha00.S1.getClass();
        ha00 ha00Var = new ha00();
        iiy[] iiyVarArr = ha00.U1;
        ha00Var.N1.x(ha00Var, iiyVarArr[1], this.f47040a);
        ha00Var.O1.j(ha00Var, iiyVarArr[2], this.b);
        ha00Var.P1.I(ha00Var, iiyVarArr[3], this.c);
        return ha00Var;
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
