package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.ui0[], still in use, count: 1, list:
  (r0v1 a.ui0[]) from 0x0079: CONSTRUCTOR (r0v1 a.ui0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:122) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class ui0 {
    /* JADX INFO: Fake field, exist only in values array */
    DAILY_TASK_WIDGET("daily_tasks"),
    /* JADX INFO: Fake field, exist only in values array */
    RECOMMENDED_CAROUSEL("recommended"),
    /* JADX INFO: Fake field, exist only in values array */
    FAVORITES_CAROUSEL("favorites"),
    /* JADX INFO: Fake field, exist only in values array */
    VIEWED_CAROUSEL("viewed"),
    /* JADX INFO: Fake field, exist only in values array */
    SLOTS_POPULAR_CAROUSEL("slots_popular"),
    /* JADX INFO: Fake field, exist only in values array */
    LIVE_POPULAR_CAROUSEL("live_popular"),
    /* JADX INFO: Fake field, exist only in values array */
    CRASH_POPULAR_CAROUSEL("crash_popular"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_GAMES_CAROUSEL("top_games"),
    /* JADX INFO: Fake field, exist only in values array */
    PROMOTIONS_CAROUSEL("promotions"),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENTS_MONTH_CAROUSEL("tournament_month"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_TOURNAMENTS_CAROUSEL("user_tournaments");

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35706a;

    static {
        c = new c0o(ui0VarArr);
    }

    public ui0(String str) {
        super(str, i);
        this.f35706a = str;
    }

    public static ui0 valueOf(String str) {
        return (ui0) Enum.valueOf(ui0.class, str);
    }

    public static ui0[] values() {
        return (ui0[]) b.clone();
    }
}
