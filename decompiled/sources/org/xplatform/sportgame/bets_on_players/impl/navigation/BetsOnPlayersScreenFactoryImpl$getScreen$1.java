package org.xplatform.sportgame.bets_on_players.impl.navigation;

import a.au7;
import a.m1r;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.sportgame.bets_on_players.api.navigation.BetsOnPlayersScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/sportgame/bets_on_players/impl/navigation/BetsOnPlayersScreenFactoryImpl$getScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetsOnPlayersScreenFactoryImpl$getScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BetsOnPlayersScreenParams f46988a;

    public BetsOnPlayersScreenFactoryImpl$getScreen$1(BetsOnPlayersScreenParams betsOnPlayersScreenParams) {
        this.f46988a = betsOnPlayersScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        au7.U1.getClass();
        au7 au7Var = new au7();
        au7Var.N1.J(au7Var, au7.V1[1], this.f46988a);
        return au7Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        au7.U1.getClass();
        String str = au7.W1;
        str.getClass();
        return str;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
