package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.kj0[], still in use, count: 1, list:
  (r0v1 a.kj0[]) from 0x0077: CONSTRUCTOR (r0v1 a.kj0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:120) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class kj0 {
    /* JADX INFO: Fake field, exist only in values array */
    GAME_CAROUSEL(5),
    /* JADX INFO: Fake field, exist only in values array */
    VIRTUAL_CAROUSELS(6),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENT_MONTH(8),
    /* JADX INFO: Fake field, exist only in values array */
    SLOT_MACHINE(9),
    /* JADX INFO: Fake field, exist only in values array */
    REGISTRATION_BONUS_BANNER(11),
    /* JADX INFO: Fake field, exist only in values array */
    AUTHORIZATION_BANNER(12),
    /* JADX INFO: Fake field, exist only in values array */
    JACKPOT_WIDGET(13),
    /* JADX INFO: Fake field, exist only in values array */
    LOYALTY_WIDGET(14),
    /* JADX INFO: Fake field, exist only in values array */
    PROMOTIONS_CAROUSEL(15),
    /* JADX INFO: Fake field, exist only in values array */
    USER_TOURNAMENTS(16),
    /* JADX INFO: Fake field, exist only in values array */
    DAILY_TASK_WIDGET(17);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f18362a;

    static {
        c = new c0o(kj0VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kj0(int i) {
        super(str, i);
        this.f18362a = i;
    }

    public static kj0 valueOf(String str) {
        return (kj0) Enum.valueOf(kj0.class, str);
    }

    public static kj0[] values() {
        return (kj0[]) b.clone();
    }
}
