package org.xplatform.bet_history.powerbet.presentation;

import a.iiy;
import a.kob0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/powerbet/presentation/PowerBetScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PowerBetScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46403a;
    public final long b;

    public PowerBetScreen(String str, long j) {
        str.getClass();
        this.f46403a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        kob0.R1.getClass();
        String str = this.f46403a;
        str.getClass();
        kob0 kob0Var = new kob0();
        iiy[] iiyVarArr = kob0.S1;
        kob0Var.O1.x(kob0Var, iiyVarArr[1], str);
        kob0Var.P1.j(kob0Var, iiyVarArr[2], this.b);
        return kob0Var;
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
