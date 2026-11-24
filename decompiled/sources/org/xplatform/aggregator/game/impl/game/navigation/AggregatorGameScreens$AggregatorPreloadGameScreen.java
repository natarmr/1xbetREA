package org.xplatform.aggregator.game.impl.game.navigation;

import a.cb1;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AggregatorGameScreens$AggregatorPreloadGameScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46273a;
    public final String b;
    public final long c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final boolean m;

    public AggregatorGameScreens$AggregatorPreloadGameScreen(long j, String str, long j2, boolean z, long j3, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, String str2, boolean z7) {
        str.getClass();
        str2.getClass();
        this.f46273a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = z2;
        this.g = z3;
        this.h = i;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = str2;
        this.m = z7;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        cb1.e2.getClass();
        String str = this.b;
        str.getClass();
        String str2 = this.l;
        str2.getClass();
        cb1 cb1Var = new cb1();
        iiy[] iiyVarArr = cb1.f2;
        cb1Var.L1.j(cb1Var, iiyVarArr[0], this.f46273a);
        cb1Var.M1.x(cb1Var, iiyVarArr[1], str);
        cb1Var.O1.j(cb1Var, iiyVarArr[3], this.c);
        cb1Var.N1.I(cb1Var, iiyVarArr[2], this.h);
        cb1Var.P1.j(cb1Var, iiyVarArr[4], this.e);
        cb1Var.S1.v(cb1Var, iiyVarArr[7], this.f);
        cb1Var.Q1.v(cb1Var, iiyVarArr[5], this.d);
        cb1Var.R1.v(cb1Var, iiyVarArr[6], this.g);
        cb1Var.U1.v(cb1Var, iiyVarArr[8], this.i);
        cb1Var.V1.v(cb1Var, iiyVarArr[9], this.k);
        cb1Var.W1.v(cb1Var, iiyVarArr[10], this.j);
        cb1Var.X1.x(cb1Var, iiyVarArr[11], str2);
        cb1Var.Y1.v(cb1Var, iiyVarArr[12], this.m);
        return cb1Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final boolean getB() {
        return false;
    }
}
