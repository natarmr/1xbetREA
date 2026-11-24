package org.xplatform.bethistory.sale.presentation;

import a.iiy;
import a.m1r;
import a.n3w;
import a.ufx;
import a.zug0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bethistory/sale/presentation/SaleScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SaleScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3w f46416a;
    public final boolean b;
    public final long c;
    public final boolean d;

    public SaleScreen(n3w n3wVar, boolean z, long j, boolean z2) {
        n3wVar.getClass();
        this.f46416a = n3wVar;
        this.b = z;
        this.c = j;
        this.d = z2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        zug0.V1.getClass();
        n3w n3wVar = this.f46416a;
        n3wVar.getClass();
        zug0 zug0Var = new zug0();
        iiy[] iiyVarArr = zug0.W1;
        zug0Var.L1.u(zug0Var, iiyVarArr[0], n3wVar);
        zug0Var.M1.v(zug0Var, iiyVarArr[1], this.b);
        zug0Var.N1.j(zug0Var, iiyVarArr[2], this.c);
        zug0Var.O1.v(zug0Var, iiyVarArr[3], this.d);
        return zug0Var;
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
