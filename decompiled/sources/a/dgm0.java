package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v36 a.dgm0[], still in use, count: 1, list:
  (r0v36 a.dgm0[]) from 0x02ab: CONSTRUCTOR (r0v36 a.dgm0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:684) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes3.dex */
public final class dgm0 {
    /* JADX INFO: Fake field, exist only in values array */
    GAME_EVENTS(3, "game_events"),
    /* JADX INFO: Fake field, exist only in values array */
    TEAM_NATURE(4, "team_nature"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_KABADDI(39, "top_kabaddi"),
    /* JADX INFO: Fake field, exist only in values array */
    LATEST_GAMES(5, "latest_games"),
    /* JADX INFO: Fake field, exist only in values array */
    TEXT_BROADCAST(6, "text_broadcast"),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENT_BRACKET(7, "tournament_bracket"),
    /* JADX INFO: Fake field, exist only in values array */
    LEADERBOARD(8, "leaderboard"),
    /* JADX INFO: Fake field, exist only in values array */
    CHECKERBOARD(44, "checkerboard"),
    /* JADX INFO: Fake field, exist only in values array */
    TEAM_STATS(9, "team_stats"),
    /* JADX INFO: Fake field, exist only in values array */
    HEATMAP(38, "heatmap"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYERS_STATS(10, "players_stats"),
    /* JADX INFO: Fake field, exist only in values array */
    CHAMPIONSHIP_STATS(11, "championship_stats"),
    /* JADX INFO: Fake field, exist only in values array */
    CHAMPIONSHIP_APPEARANCES(41, "championship_appearances"),
    /* JADX INFO: Fake field, exist only in values array */
    STADIUM(18, "stadium"),
    /* JADX INFO: Fake field, exist only in values array */
    FACTS(43, "facts"),
    /* JADX INFO: Fake field, exist only in values array */
    FORECAST(42, "forecast"),
    /* JADX INFO: Fake field, exist only in values array */
    BATTLE_CARD(12, "battle_card"),
    /* JADX INFO: Fake field, exist only in values array */
    NEWS(45, "news"),
    /* JADX INFO: Fake field, exist only in values array */
    RATING(13, "rating"),
    /* JADX INFO: Fake field, exist only in values array */
    GATES_BREAKS(46, "gates_breaks"),
    /* JADX INFO: Fake field, exist only in values array */
    COURT_CARD(47, "court_card"),
    /* JADX INFO: Fake field, exist only in values array */
    STARTING_LINEUPS(14, "starting_lineups"),
    /* JADX INFO: Fake field, exist only in values array */
    FULL_STATS(1, "full_stats"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_PLAYERS(40, "top_players"),
    /* JADX INFO: Fake field, exist only in values array */
    MATCH_PROGRESS(35, "match_progress"),
    /* JADX INFO: Fake field, exist only in values array */
    BALL_BY_BALL(36, "ballByBall"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_COMPARISON(16, "player_сomparison"),
    /* JADX INFO: Fake field, exist only in values array */
    TEAM_LIST(17, "team_list"),
    /* JADX INFO: Fake field, exist only in values array */
    TEAM_TRANSITIONS(19, "team_transitions"),
    /* JADX INFO: Fake field, exist only in values array */
    FINISHED_MATCHES(20, "finished_matches"),
    /* JADX INFO: Fake field, exist only in values array */
    FUTURE_MATCHES(21, "future_matches"),
    /* JADX INFO: Fake field, exist only in values array */
    RATING_HISTORY(22, "rating_history"),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_MATCHES(56, "last_matches"),
    /* JADX INFO: Fake field, exist only in values array */
    CAREER(24, "career"),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSITIONS(25, "transitions"),
    /* JADX INFO: Fake field, exist only in values array */
    INJURY(26, "injury"),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENT_PARTICIPANTS(27, "tournament_participants"),
    /* JADX INFO: Fake field, exist only in values array */
    TEAMS(28, "teams"),
    /* JADX INFO: Fake field, exist only in values array */
    MATCHES(29, "matches"),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENT_TABLES(32, "tournament_tables"),
    /* JADX INFO: Fake field, exist only in values array */
    FINISHED6MATCHES(33, "finished6matches"),
    /* JADX INFO: Fake field, exist only in values array */
    FUTURE6MATCHES(34, "future6matches"),
    /* JADX INFO: Fake field, exist only in values array */
    MAP_STATISTICS(15, "map_statistics"),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENT_GRIDS(31, "tournament_grids");

    public static final s2m0 c = new s2m0();
    public static final /* synthetic */ c0o e = new c0o(new dgm0[]{new dgm0(3, "game_events"), new dgm0(4, "team_nature"), new dgm0(39, "top_kabaddi"), new dgm0(5, "latest_games"), new dgm0(6, "text_broadcast"), new dgm0(7, "tournament_bracket"), new dgm0(8, "leaderboard"), new dgm0(44, "checkerboard"), new dgm0(9, "team_stats"), new dgm0(38, "heatmap"), new dgm0(10, "players_stats"), new dgm0(11, "championship_stats"), new dgm0(41, "championship_appearances"), new dgm0(18, "stadium"), new dgm0(43, "facts"), new dgm0(42, "forecast"), new dgm0(12, "battle_card"), new dgm0(45, "news"), new dgm0(13, "rating"), new dgm0(46, "gates_breaks"), new dgm0(47, "court_card"), new dgm0(14, "starting_lineups"), new dgm0(1, "full_stats"), new dgm0(40, "top_players"), new dgm0(35, "match_progress"), new dgm0(36, "ballByBall"), new dgm0(16, "player_сomparison"), new dgm0(17, "team_list"), new dgm0(19, "team_transitions"), new dgm0(20, "finished_matches"), new dgm0(21, "future_matches"), new dgm0(22, "rating_history"), new dgm0(56, "last_matches"), new dgm0(24, "career"), new dgm0(25, "transitions"), new dgm0(26, "injury"), new dgm0(27, "tournament_participants"), new dgm0(28, "teams"), new dgm0(29, "matches"), new dgm0(32, "tournament_tables"), new dgm0(33, "finished6matches"), new dgm0(34, "future6matches"), new dgm0(15, "map_statistics"), new dgm0(31, "tournament_grids")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f6049a;
    public final String b;

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dgm0(int i, String str) {
        super(str, i);
        this.f6049a = i;
        this.b = str;
    }

    public static dgm0 valueOf(String str) {
        return (dgm0) Enum.valueOf(dgm0.class, str);
    }

    public static dgm0[] values() {
        return (dgm0[]) d.clone();
    }
}
