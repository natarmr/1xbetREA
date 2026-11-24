package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.rkv[], still in use, count: 1, list:
  (r0v1 a.rkv[]) from 0x004e: CONSTRUCTOR (r0v1 a.rkv[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:79) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
public final class rkv {
    PAYMENT(0),
    HISTORY_BETS(1),
    FAVORITES(2),
    EXPRESS(3),
    CYBER_SPORT(4),
    GAMES(5),
    SLOTS(6);

    public static final /* synthetic */ c0o j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f30668a;

    static {
        j = new c0o(rkvVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rkv(int i2) {
        super(str, i);
        this.f30668a = i2;
    }

    public static rkv valueOf(String str) {
        return (rkv) Enum.valueOf(rkv.class, str);
    }

    public static rkv[] values() {
        return (rkv[]) i.clone();
    }

    public final String a() {
        switch (this) {
            case PAYMENT:
                return "Deposit";
            case HISTORY_BETS:
                return "BetHistory";
            case FAVORITES:
                return "Favor";
            case EXPRESS:
                return "Express";
            case CYBER_SPORT:
                return "Cyber";
            case GAMES:
                return "Games";
            case SLOTS:
                return "Slots";
            default:
                t9f.b();
                return null;
        }
    }
}
