package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.rlc[], still in use, count: 1, list:
  (r0v1 a.rlc[]) from 0x004e: CONSTRUCTOR (r0v1 a.rlc[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:79) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class rlc {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    OBJECT(5),
    COMPANION_OBJECT(6);

    public static final /* synthetic */ c0o j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijq f30689a;

    static {
        j = new c0o(rlcVarArr);
    }

    public rlc(int i2) {
        super(str, i);
        ljq ljqVar = njq.f;
        ljqVar.getClass();
        this.f30689a = new ijq(ljqVar, i2);
    }

    public static rlc valueOf(String str) {
        return (rlc) Enum.valueOf(rlc.class, str);
    }

    public static rlc[] values() {
        return (rlc[]) i.clone();
    }
}
