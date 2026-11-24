package org.xplatform.statistic.team.impl.team_champ_statistic.presentation.screen;

import a.iiy;
import a.lop0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/team/impl/team_champ_statistic/presentation/screen/TeamsChampStatisticScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TeamsChampStatisticScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47082a;
    public final long b;

    public TeamsChampStatisticScreen(String str, long j) {
        this.f47082a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        lop0.Q1.getClass();
        lop0 lop0Var = new lop0();
        iiy[] iiyVarArr = lop0.R1;
        lop0Var.M1.j(lop0Var, iiyVarArr[2], this.b);
        lop0Var.L1.x(lop0Var, iiyVarArr[1], this.f47082a);
        return lop0Var;
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
