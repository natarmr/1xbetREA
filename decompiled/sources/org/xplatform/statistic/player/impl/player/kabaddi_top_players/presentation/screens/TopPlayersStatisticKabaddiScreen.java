package org.xplatform.statistic.player.impl.player.kabaddi_top_players.presentation.screens;

import a.m1r;
import a.qbr0;
import a.ufx;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/player/impl/player/kabaddi_top_players/presentation/screens/TopPlayersStatisticKabaddiScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TopPlayersStatisticKabaddiScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47045a;
    public final long b;

    public TopPlayersStatisticKabaddiScreen(String str, long j) {
        this.f47045a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        qbr0.O1.getClass();
        qbr0 qbr0Var = new qbr0();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_GAME_ID", this.f47045a);
        bundle.putLong("KEY_SPORT_ID", this.b);
        qbr0Var.s0(bundle);
        return qbr0Var;
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
