package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.jee[], still in use, count: 1, list:
  (r0v1 a.jee[]) from 0x003c: CONSTRUCTOR (r0v1 a.jee[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:61) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
@ahi0(with = kee.class)
public final class jee {
    UNKNOWN("0"),
    /* JADX INFO: Fake field, exist only in values array */
    UFC_TOP_RANK("38"),
    /* JADX INFO: Fake field, exist only in values array */
    UFC_CHAMPION("39"),
    /* JADX INFO: Fake field, exist only in values array */
    UFC_TEMPORARY_CHAMPION("40"),
    /* JADX INFO: Fake field, exist only in values array */
    UFC_NEWCOMER("41");

    public static final iee Companion = new iee();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16369a;

    static {
        d = new c0o(new jee[]{r0, new jee("38"), new jee("39"), new jee("40"), new jee("41")});
    }

    public jee(String str) {
        super(str, i);
        this.f16369a = str;
    }

    public static jee valueOf(String str) {
        return (jee) Enum.valueOf(jee.class, str);
    }

    public static jee[] values() {
        return (jee[]) c.clone();
    }
}
