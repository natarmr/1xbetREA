package org.xplatform.statistic.team.impl.team_statistic.presentation.screen;

import a.iiy;
import a.m1r;
import a.ufx;
import a.y4k0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/team/impl/team_statistic/presentation/screen/SingleTeamStatisticFragmentScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SingleTeamStatisticFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47090a;
    public final long b;
    public final int c;
    public final int d;

    public SingleTeamStatisticFragmentScreen(String str, int i, int i2, long j) {
        str.getClass();
        this.f47090a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        y4k0.S1.getClass();
        String str = this.f47090a;
        str.getClass();
        y4k0 y4k0Var = new y4k0();
        iiy[] iiyVarArr = y4k0.U1;
        y4k0Var.L1.x(y4k0Var, iiyVarArr[0], str);
        y4k0Var.M1.j(y4k0Var, iiyVarArr[1], this.b);
        y4k0Var.N1.I(y4k0Var, iiyVarArr[2], this.c);
        y4k0Var.O1.I(y4k0Var, iiyVarArr[3], this.d);
        return y4k0Var;
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
