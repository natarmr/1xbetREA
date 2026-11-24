package org.xplatform.statistic.races.presentation.screens;

import a.iiy;
import a.llm0;
import a.m1r;
import a.ufx;
import a.xqd0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/races/presentation/screens/RacesStatisticScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RacesStatisticScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47059a;
    public final long b;
    public final llm0 c;

    public RacesStatisticScreen(String str, long j, llm0 llm0Var) {
        str.getClass();
        this.f47059a = str;
        this.b = j;
        this.c = llm0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        xqd0.S1.getClass();
        String str = this.f47059a;
        str.getClass();
        xqd0 xqd0Var = new xqd0();
        iiy[] iiyVarArr = xqd0.U1;
        xqd0Var.L1.x(xqd0Var, iiyVarArr[0], str);
        xqd0Var.M1.j(xqd0Var, iiyVarArr[1], this.b);
        xqd0Var.N1.u(xqd0Var, iiyVarArr[2], this.c);
        return xqd0Var;
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
