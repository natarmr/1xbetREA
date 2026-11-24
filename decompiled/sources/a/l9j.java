package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.l9j[], still in use, count: 1, list:
  (r0v1 a.l9j[]) from 0x0028: CONSTRUCTOR (r0v1 a.l9j[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:41) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = m9j.class)
public final class l9j {
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_PLAYER_MOVE("1"),
    /* JADX INFO: Fake field, exist only in values array */
    SECOND_PLAYER_MOVE("2"),
    PAUSE("0");

    public static final k9j Companion = new k9j();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19655a;

    static {
        d = new c0o(new l9j[]{r0, r1, r2});
    }

    public l9j(String str) {
        super(str, i);
        this.f19655a = str;
    }

    public static l9j valueOf(String str) {
        return (l9j) Enum.valueOf(l9j.class, str);
    }

    public static l9j[] values() {
        return (l9j[]) c.clone();
    }
}
