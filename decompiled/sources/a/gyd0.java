package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.gyd0[], still in use, count: 1, list:
  (r0v1 a.gyd0[]) from 0x0032: CONSTRUCTOR (r0v1 a.gyd0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:51) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = hyd0.class)
public final class gyd0 {
    UNKNOWN("0"),
    /* JADX INFO: Fake field, exist only in values array */
    PICKED("1"),
    /* JADX INFO: Fake field, exist only in values array */
    BANNED("2"),
    /* JADX INFO: Fake field, exist only in values array */
    DECIDING("3");

    public static final fyd0 Companion = new fyd0();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12122a;

    static {
        d = new c0o(new gyd0[]{r0, new gyd0("1"), new gyd0("2"), new gyd0("3")});
    }

    public gyd0(String str) {
        super(str, i);
        this.f12122a = str;
    }

    public static gyd0 valueOf(String str) {
        return (gyd0) Enum.valueOf(gyd0.class, str);
    }

    public static gyd0[] values() {
        return (gyd0[]) c.clone();
    }
}
