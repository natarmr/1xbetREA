package org.xplatform.statistic.champ_statistic.presentation.screens;

import a.iiy;
import a.m1r;
import a.ubm0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/champ_statistic/presentation/screens/ChampStatisticScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ChampStatisticScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47020a;
    public final long b;

    public ChampStatisticScreen(String str, long j) {
        this.f47020a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ubm0.R1.getClass();
        ubm0 ubm0Var = new ubm0();
        iiy[] iiyVarArr = ubm0.S1;
        ubm0Var.N1.x(ubm0Var, iiyVarArr[1], this.f47020a);
        ubm0Var.O1.j(ubm0Var, iiyVarArr[2], this.b);
        return ubm0Var;
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
