package org.xplatform.bethistory.history.presentation;

import a.bj5;
import a.bst;
import a.iiy;
import a.m1r;
import a.p57;
import a.s1w;
import a.s77;
import a.sys0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bethistory/history/presentation/HistoryScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HistoryScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p57 f46412a;
    public final sys0 b;

    public HistoryScreen(p57 p57Var, sys0 sys0Var) {
        sys0Var.getClass();
        this.f46412a = p57Var;
        this.b = sys0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        bst bstVar = s1w.d2;
        p57 p57Var = this.f46412a;
        long j = p57Var.c;
        long j2 = p57Var.b;
        bj5 bj5Var = s77.b;
        int i = p57Var.f26391a;
        bj5Var.getClass();
        s77 s77VarB = bj5.b(i);
        String str = p57Var.e;
        String str2 = p57Var.d;
        bstVar.getClass();
        sys0 sys0Var = this.b;
        sys0Var.getClass();
        str2.getClass();
        str.getClass();
        s1w s1wVar = new s1w();
        iiy[] iiyVarArr = s1w.e2;
        s1wVar.R1.j(s1wVar, iiyVarArr[1], j);
        s1wVar.S1.j(s1wVar, iiyVarArr[2], j2);
        s1wVar.U1.u(s1wVar, iiyVarArr[3], s77VarB);
        s1wVar.V1.u(s1wVar, iiyVarArr[4], sys0Var);
        s1wVar.W1.x(s1wVar, iiyVarArr[5], str2);
        s1wVar.X1.x(s1wVar, iiyVarArr[6], str);
        return s1wVar;
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
