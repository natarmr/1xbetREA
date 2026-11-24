package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.sr10[], still in use, count: 1, list:
  (r0v1 a.sr10[]) from 0x001a: CONSTRUCTOR (r0v1 a.sr10[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:27) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sr10 {
    CALL(0),
    /* JADX INFO: Fake field, exist only in values array */
    HISTORY(1);

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32655a;

    static {
        d = new c0o(sr10VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sr10(int i) {
        super(str, i);
        this.f32655a = i;
    }

    public static sr10 valueOf(String str) {
        return (sr10) Enum.valueOf(sr10.class, str);
    }

    public static sr10[] values() {
        return (sr10[]) c.clone();
    }
}
