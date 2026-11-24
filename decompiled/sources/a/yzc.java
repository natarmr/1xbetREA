package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.yzc[], still in use, count: 1, list:
  (r0v1 a.yzc[]) from 0x0044: CONSTRUCTOR (r0v1 a.yzc[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:69) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = zzc.class)
public final class yzc {
    /* JADX INFO: Fake field, exist only in values array */
    X2("2"),
    /* JADX INFO: Fake field, exist only in values array */
    X4("4"),
    /* JADX INFO: Fake field, exist only in values array */
    X5("5"),
    /* JADX INFO: Fake field, exist only in values array */
    X7("7"),
    /* JADX INFO: Fake field, exist only in values array */
    X10("10"),
    /* JADX INFO: Fake field, exist only in values array */
    X20("20");

    public static final xzc Companion = new xzc();
    public static final /* synthetic */ c0o c = new c0o(new yzc[]{new yzc("2"), new yzc("4"), new yzc("5"), new yzc("7"), new yzc("10"), new yzc("20")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43508a;

    static {
    }

    public yzc(String str) {
        super(str, i);
        this.f43508a = str;
    }

    public static yzc valueOf(String str) {
        return (yzc) Enum.valueOf(yzc.class, str);
    }

    public static yzc[] values() {
        return (yzc[]) b.clone();
    }
}
