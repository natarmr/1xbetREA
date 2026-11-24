package org.xplatform.statistic.player.impl.player.players_statistic.presentation.screen;

import a.ema0;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/player/impl/player/players_statistic/presentation/screen/PlayersStatisticsScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PlayersStatisticsScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47052a;
    public final long b;

    public PlayersStatisticsScreen(String str, long j) {
        this.f47052a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ema0.R1.getClass();
        ema0 ema0Var = new ema0();
        iiy[] iiyVarArr = ema0.S1;
        ema0Var.N1.x(ema0Var, iiyVarArr[1], this.f47052a);
        ema0Var.O1.j(ema0Var, iiyVarArr[2], this.b);
        return ema0Var;
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
