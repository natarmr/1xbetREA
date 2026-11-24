package org.xplatform.statistic.fight_statistic.presentatiton.screen;

import a.iiy;
import a.m1r;
import a.ufx;
import a.wtp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/fight_statistic/presentatiton/screen/FightStatisticScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FightStatisticScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47027a;
    public final long b;

    public FightStatisticScreen(String str, long j) {
        this.f47027a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        wtp.R1.getClass();
        wtp wtpVar = new wtp();
        iiy[] iiyVarArr = wtp.S1;
        wtpVar.O1.x(wtpVar, iiyVarArr[1], this.f47027a);
        wtpVar.P1.j(wtpVar, iiyVarArr[2], this.b);
        return wtpVar;
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
