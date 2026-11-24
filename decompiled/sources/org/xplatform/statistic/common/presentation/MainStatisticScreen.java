package org.xplatform.statistic.common.presentation;

import a.iiy;
import a.llm0;
import a.m1r;
import a.u020;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/common/presentation/MainStatisticScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MainStatisticScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47021a;
    public final long b;
    public final llm0 c;

    public MainStatisticScreen(String str, long j, llm0 llm0Var) {
        str.getClass();
        this.f47021a = str;
        this.b = j;
        this.c = llm0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        u020.S1.getClass();
        String str = this.f47021a;
        str.getClass();
        u020 u020Var = new u020();
        iiy[] iiyVarArr = u020.U1;
        u020Var.P1.x(u020Var, iiyVarArr[1], str);
        u020Var.Q1.j(u020Var, iiyVarArr[2], this.b);
        u020Var.R1.u(u020Var, iiyVarArr[3], this.c);
        return u020Var;
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
