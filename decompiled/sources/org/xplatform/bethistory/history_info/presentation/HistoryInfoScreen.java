package org.xplatform.bethistory.history_info.presentation;

import a.iiy;
import a.izv;
import a.m1r;
import a.n3w;
import a.sys0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HistoryInfoScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3w f46413a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final sys0 e;

    public HistoryInfoScreen(n3w n3wVar, boolean z, long j, boolean z2, sys0 sys0Var) {
        n3wVar.getClass();
        sys0Var.getClass();
        this.f46413a = n3wVar;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.e = sys0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        izv.d2.getClass();
        n3w n3wVar = this.f46413a;
        n3wVar.getClass();
        sys0 sys0Var = this.e;
        sys0Var.getClass();
        izv izvVar = new izv();
        iiy[] iiyVarArr = izv.e2;
        izvVar.L1.u(izvVar, iiyVarArr[0], n3wVar);
        izvVar.M1.v(izvVar, iiyVarArr[1], this.b);
        izvVar.O1.v(izvVar, iiyVarArr[3], this.d);
        izvVar.N1.j(izvVar, iiyVarArr[2], this.c);
        izvVar.P1.v(izvVar, iiyVarArr[4], false);
        izvVar.R1.u(izvVar, iiyVarArr[6], sys0Var);
        return izvVar;
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
