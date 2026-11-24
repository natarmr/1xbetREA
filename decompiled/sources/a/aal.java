package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public enum aal {
    /* JADX INFO: Fake field, exist only in values array */
    STATISTIC(R.string.lol_statistic_tab, 1),
    /* JADX INFO: Fake field, exist only in values array */
    ITEMS(R.string.cyber_game_dota_hero_items, 2),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLS(R.string.cyber_game_dota_hero_talent_tab, 3),
    TOTAL_VALUE(R.string.cyber_game_dota_hero_total, 4),
    CREEPS(R.string.cyber_game_dota_crips, 10),
    BUYBACK(R.string.cyber_game_dota_buyout, 11),
    GOLD(R.string.dota_gpm, 12),
    EXPERIENCE(R.string.dota_epm, 13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f531a;
    public final int b;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    aal(int i, long j) {
        this.f531a = (int) j;
        this.b = i;
    }
}
