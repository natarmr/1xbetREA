package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.jxw[], still in use, count: 1, list:
  (r0v1 a.jxw[]) from 0x005a: CONSTRUCTOR (r0v1 a.jxw[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:91) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = kxw.class)
public final class jxw {
    NO_VERIFICATION("0"),
    /* JADX INFO: Fake field, exist only in values array */
    KZ("1"),
    /* JADX INFO: Fake field, exist only in values array */
    BET_22_GH("4"),
    /* JADX INFO: Fake field, exist only in values array */
    UA("6"),
    /* JADX INFO: Fake field, exist only in values array */
    VIVAT_EE("7"),
    /* JADX INFO: Fake field, exist only in values array */
    BETWINNER_GH("9"),
    /* JADX INFO: Fake field, exist only in values array */
    VIVAT_BE("11"),
    /* JADX INFO: Fake field, exist only in values array */
    TJ("13");

    public static final ixw Companion = new ixw();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17331a;

    static {
        d = new c0o(new jxw[]{r0, new jxw("1"), new jxw("4"), new jxw("6"), new jxw("7"), new jxw("9"), new jxw("11"), new jxw("13")});
    }

    public jxw(String str) {
        super(str, i);
        this.f17331a = str;
    }

    public static jxw valueOf(String str) {
        return (jxw) Enum.valueOf(jxw.class, str);
    }

    public static jxw[] values() {
        return (jxw[]) c.clone();
    }
}
