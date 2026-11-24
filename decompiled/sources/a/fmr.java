package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class fmr {

    /* JADX INFO: Fake field, exist only in values array */
    fmr EF5;
    public static final /* synthetic */ fmr[] b = {new fmr(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0), new fmr("ADD_TIME", 1), new fmr("STAT_ONE", 2), new fmr("STAT_TWO", 3), new fmr("TEAM_ONE_SCORE", 4), new fmr("TEAM_TWO_SCORE", 5), new fmr("ALT_HOST_GUESTS_NAMES", 6), new fmr("STAT_DAY", 7), new fmr("ALT_HOSTS_GUESTS_TITLE", 8), new fmr("STAT_HOME_AWAY", 9), new fmr("RED_CARD_TEAM_ONE", 10), new fmr("RED_CARD_TEAM_TWO", 11), new fmr("YELLOW_CARD_TEAM_ONE", 12), new fmr("YELLOW_CARD_TEAM_TWO", 13), new fmr("CORNERS_TEAM_ONE", 14), new fmr("CORNERS_TEAM_TWO", 15), new fmr("DICE_ROUND", 16), new fmr("FIRST_TEAM_CARDS", 17), new fmr("SECOND_TEAM_CARDS", 18), new fmr("CURRENT_OVER_AND_SEVER", 19), new fmr("CURRENT_GAME_STATE", 20), new fmr("ROUND_TABLE", 21), new fmr("FIRST_TEAM_COMBINATION", 22), new fmr("FIRST_PLAYER_FORMULA", 23), new fmr("SECOND_PLAYER_FORMULA", 24), new fmr("SECOND_TEAM_COMBINATION", 25), new fmr("BOARD_CARDS", 26), new fmr("LEFT_ACTION_ZONES", 27), new fmr("CENTRAL_ACTION_ZONES", 28), new fmr("RIGHT_ACTION_ZONES", 29), new fmr("CHAMP_TYPE", 30)};
    public static final emr Companion = new emr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f9799a = maz.a(wez.f39042a, new s9r(19));

    public static fmr valueOf(String str) {
        return (fmr) Enum.valueOf(fmr.class, str);
    }

    public static fmr[] values() {
        return (fmr[]) b.clone();
    }
}
