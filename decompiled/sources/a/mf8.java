package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public enum mf8 {
    d(R.string.doubling_bonus_title, R.string.doubling_bonus_body, "DOUBLING"),
    e(R.string.return_bonus_title, R.string.return_bonus_body, "RETURN"),
    f(R.string.free_bet_bonus_title, R.string.free_bet_bonus_body, "FREE_BET"),
    g(R.string.free_spin_bonus_title, R.string.free_spin_bonus_description_with_custom_games_title_v2, "FREE_SPIN"),
    h(R.string.wild_freebet_bonus_title, R.string.wild_freebet_bonus_description, "WILD_FREE_BET");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21682a;
    public final int b;
    public final int c;

    mf8(int i2, int i3, String str) {
        this.f21682a = i;
        this.b = i2;
        this.c = i3;
    }
}
