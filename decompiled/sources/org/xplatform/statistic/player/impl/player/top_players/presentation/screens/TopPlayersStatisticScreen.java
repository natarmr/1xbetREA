package org.xplatform.statistic.player.impl.player.top_players.presentation.screens;

import a.jbr0;
import a.m1r;
import a.ufx;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/player/impl/player/top_players/presentation/screens/TopPlayersStatisticScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TopPlayersStatisticScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47054a;
    public final long b;

    public TopPlayersStatisticScreen(String str, long j) {
        this.f47054a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        jbr0.O1.getClass();
        jbr0 jbr0Var = new jbr0();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_GAME_ID", this.f47054a);
        bundle.putLong("KEY_SPORT_ID", this.b);
        jbr0Var.s0(bundle);
        return jbr0Var;
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
