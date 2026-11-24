package org.xplatform.statistic.player.impl.player.players_statistic_cricket.presentation.screen;

import a.iiy;
import a.m1r;
import a.ufx;
import a.vka0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/player/impl/player/players_statistic_cricket/presentation/screen/PlayersStatisticsCricketScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PlayersStatisticsCricketScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47053a;
    public final long b;

    public PlayersStatisticsCricketScreen(String str, long j) {
        this.f47053a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        vka0.R1.getClass();
        vka0 vka0Var = new vka0();
        iiy[] iiyVarArr = vka0.S1;
        vka0Var.N1.x(vka0Var, iiyVarArr[1], this.f47053a);
        vka0Var.O1.j(vka0Var, iiyVarArr[2], this.b);
        return vka0Var;
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
