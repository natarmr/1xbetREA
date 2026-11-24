package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.hcs[], still in use, count: 1, list:
  (r0v1 a.hcs[]) from 0x0046: CONSTRUCTOR (r0v1 a.hcs[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:71) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = ics.class)
public final class hcs {
    NONE("0"),
    /* JADX INFO: Fake field, exist only in values array */
    NEW("1"),
    /* JADX INFO: Fake field, exist only in values array */
    FREE("2"),
    /* JADX INFO: Fake field, exist only in values array */
    BEST("3"),
    /* JADX INFO: Fake field, exist only in values array */
    LIVE("4"),
    /* JADX INFO: Fake field, exist only in values array */
    SPECIAL("6");

    public static final gcs Companion = new gcs();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12840a;

    static {
        d = new c0o(new hcs[]{r0, new hcs("1"), new hcs("2"), new hcs("3"), new hcs("4"), new hcs("6")});
    }

    public hcs(String str) {
        super(str, i);
        this.f12840a = str;
    }

    public static hcs valueOf(String str) {
        return (hcs) Enum.valueOf(hcs.class, str);
    }

    public static hcs[] values() {
        return (hcs[]) c.clone();
    }
}
