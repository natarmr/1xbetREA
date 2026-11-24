package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.zv4[], still in use, count: 1, list:
  (r0v1 a.zv4[]) from 0x0026: CONSTRUCTOR (r0v1 a.zv4[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = bw4.class)
public final class zv4 {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_CANCELLING("0"),
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLING("1"),
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLED("2");

    public static final xv4 Companion = new xv4();
    public static final /* synthetic */ c0o c = new c0o(new zv4[]{new zv4("0"), new zv4("1"), new zv4("2")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45038a;

    static {
    }

    public zv4(String str) {
        super(str, i);
        this.f45038a = str;
    }

    public static zv4 valueOf(String str) {
        return (zv4) Enum.valueOf(zv4.class, str);
    }

    public static zv4[] values() {
        return (zv4[]) b.clone();
    }
}
