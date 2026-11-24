package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.n7t[], still in use, count: 1, list:
  (r0v1 a.n7t[]) from 0x005a: CONSTRUCTOR (r0v1 a.n7t[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:91) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = o7t.class)
public final class n7t {
    UNKNOWN("-1"),
    /* JADX INFO: Fake field, exist only in values array */
    EMPTY_FIELD("100"),
    /* JADX INFO: Fake field, exist only in values array */
    EXTRA_THROW("101"),
    /* JADX INFO: Fake field, exist only in values array */
    BONUS_LUCKY_WHEEL("102"),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE_BET_OF_WINNING("103"),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_HALF_BET_OF_LOSE("104"),
    /* JADX INFO: Fake field, exist only in values array */
    FREE_BET_ONE_EURO("105"),
    /* JADX INFO: Fake field, exist only in values array */
    PUZZLE_PIECE("106");

    public static final m7t Companion = new m7t();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23057a;

    static {
        d = new c0o(new n7t[]{r0, new n7t("100"), new n7t("101"), new n7t("102"), new n7t("103"), new n7t("104"), new n7t("105"), new n7t("106")});
    }

    public n7t(String str) {
        super(str, i);
        this.f23057a = str;
    }

    public static n7t valueOf(String str) {
        return (n7t) Enum.valueOf(n7t.class, str);
    }

    public static n7t[] values() {
        return (n7t[]) c.clone();
    }
}
