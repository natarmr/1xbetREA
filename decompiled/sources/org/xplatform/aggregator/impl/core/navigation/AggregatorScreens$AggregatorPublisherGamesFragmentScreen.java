package org.xplatform.aggregator.impl.core.navigation;

import a.iiy;
import a.m1r;
import a.qj1;
import a.rj1;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorPublisherGamesFragmentScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AggregatorScreens$AggregatorPublisherGamesFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46292a;
    public final long b;
    public final String c;
    public final boolean d;
    public final rj1 e;

    public AggregatorScreens$AggregatorPublisherGamesFragmentScreen(long j, long j2, String str, boolean z, rj1 rj1Var) {
        str.getClass();
        this.f46292a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
        this.e = rj1Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        qj1.X1.getClass();
        String str = this.c;
        str.getClass();
        rj1 rj1Var = this.e;
        rj1Var.getClass();
        qj1 qj1Var = new qj1();
        iiy[] iiyVarArr = qj1.Y1;
        qj1Var.Q1.j(qj1Var, iiyVarArr[1], this.f46292a);
        qj1Var.R1.j(qj1Var, iiyVarArr[2], this.b);
        qj1Var.S1.x(qj1Var, iiyVarArr[3], str);
        qj1Var.U1.I(qj1Var, iiyVarArr[4], 0);
        qj1Var.W1.v(qj1Var, iiyVarArr[6], this.d);
        qj1Var.V1.u(qj1Var, iiyVarArr[5], rj1Var);
        return qj1Var;
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
