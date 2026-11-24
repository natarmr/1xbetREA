package a;

import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v82 a.t9m0[], still in use, count: 1, list:
  (r0v82 a.t9m0[]) from 0x0518: CONSTRUCTOR (r0v82 a.t9m0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:1305) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class t9m0 {
    DOTA_SELECTED_HEROES(0),
    DOTA_MINI_MAP(1),
    DOTA_STATISTIC_ITEMS_SKILLS(2),
    DOTA_GOLD_CREEPS_BUYBACK(3),
    DOTA_BANS_PICKS(4),
    DOTA_GAME_LOG(5),
    DOTA_GRAPH(6),
    DOTA_PREVIOUS_GAMES(7),
    DOTA_COMPOSITION(8),
    DOTA_BEST_HEROES(9),
    DOTA_LAST_MATCHES(10),
    DOTA_FUTURE_MATCHES(11),
    DOTA_STAGE_TABLE(12),
    DOTA_MINI_MAP_SELECTED_HEROES(13),
    DOTA_STATISTIC(14),
    DOTA_PLAYER_ABILITIES(15),
    DOTA_ITEM_STATISTICS(16),
    DOTA_ABOUT_MAP(17),
    CS_STAT_WEAPONS(100),
    CS_STAT_ROUNDS(101),
    CS_GAME_LOG(102),
    CS_MAP_SERIES(103),
    CS_STAT_OF_MAPS(104),
    CS_COMPOSITION(105),
    CS_LAST_MATCHES(106),
    CS_PLAYER_STATISTIC(107),
    CS_FUTURE_MATCHES(108),
    CS_STAGE_TABLE(109),
    CS_ABOUT_MAP(110),
    LOL_TEAM_STAT_RED_BLUE(Response.OK),
    LOL_TEAM_STAT_RED(201),
    LOL_MINI_MAP(Response.ACCEPTED),
    LOL_TEAM_STAT_BLUE(203),
    LOL_STAT_AND_ITEMS(204),
    LOL_GRAPH(205),
    LOL_LAST_MAPS(206),
    LOL_COMPOSITION(207),
    LOL_BEST_HEROES(208),
    LOL_GAME_LOG(209),
    LOL_BANS_AND_PICKS(210),
    /* JADX INFO: Fake field, exist only in values array */
    LOL_POPULAR_CHAMPIONS(211),
    LOL_LAST_MATCHES(212),
    LOL_COMPARE_TEAM(213),
    LOL_FUTURE_MATCHES(214),
    LOL_STAGE_TABLE(215),
    LOL_ABOUT_MAP(216),
    RAINBOW_TEAM_STAT(300),
    RAINBOW_ROUND_STAT(301),
    RAINBOW_BANS_AND_PICKS(302),
    RAINBOW_MAP_SERIES(WarningHeader.INCOMPATIBLE_BANDWIDTH_UNITS),
    RAINBOW_COMPOSITION(WarningHeader.MEDIA_TYPE_NOT_AVAILABLE),
    RAINBOW_BANS_STAT(305),
    RAINBOW_COMPARE_TEAMS(WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD),
    RAINBOW_LAST_MATCHES(WarningHeader.SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD),
    RAINBOW_FUTURE_MATCHES(308),
    /* JADX INFO: Fake field, exist only in values array */
    RAINBOW_STAGE_TABLE(309),
    RAINBOW_ABOUT_MAP(310),
    VALORANT_MAP_SERIES(Response.BAD_REQUEST),
    VALORANT_COMPOSITION(Response.UNAUTHORIZED),
    VALORANT_ECONOMIC_GRAPH(Response.REQUEST_TIMEOUT),
    VALORANT_LAST_MATCHES(Response.PAYMENT_REQUIRED),
    VALORANT_STATISTIC_TABLET(Response.FORBIDDEN),
    VALORANT_ROUND_STATISTIC(Response.NOT_FOUND),
    VALORANT_MAPS_STATISTIC(Response.PROXY_AUTHENTICATION_REQUIRED),
    VALORANT_FUTURE_MATCHES(Response.METHOD_NOT_ALLOWED),
    VALORANT_STAGE_TABLE(Response.NOT_ACCEPTABLE),
    VALORANT_AIM_PLAYERS(Response.GONE),
    VALORANT_TEAM_ADVANTAGE(409),
    VALORANT_ABOUT_MAP(411),
    MLBB_TEAMS_RED_BLUE_SIDE(500),
    MLBB_TEAMS_RED_SIDE(Response.NOT_IMPLEMENTED),
    MLBB_TEAMS_BLUE_SIDE(Response.BAD_GATEWAY),
    MLBB_BANS_PICKS(Response.SERVICE_UNAVAILABLE),
    MLBB_COMPOSITION(Response.SERVER_TIMEOUT),
    MLBB_STAT_AND_ITEMS(Response.VERSION_NOT_SUPPORTED),
    MLBB_MINI_MAP(506),
    MLBB_PREVIOUS_MAPS(507),
    MLBB_GOLD_GRAPH(508),
    UFC_GENERAL_STATISTIC(900),
    UFC_LAST_FIGHTS(901),
    UFC_STATISTIC_FIGHT(902),
    UFC_SHOT_MAP(903);

    public static final s9m0 b = new s9m0();
    public static final /* synthetic */ c0o h2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f33572a;

    static {
        h2 = new c0o(new t9m0[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t9m0(int i) {
        super(str, i);
        this.f33572a = i;
    }

    public static t9m0 valueOf(String str) {
        return (t9m0) Enum.valueOf(t9m0.class, str);
    }

    public static t9m0[] values() {
        return (t9m0[]) g2.clone();
    }
}
