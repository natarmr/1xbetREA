package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.qy20[], still in use, count: 1, list:
  (r0v1 a.qy20[]) from 0x001b: CONSTRUCTOR (r0v1 a.qy20[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:28) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class qy20 {
    ROW(1),
    /* JADX INFO: Fake field, exist only in values array */
    LIST(2);

    public static final htz b = new htz();
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f29514a;

    static {
        e = new c0o(new qy20[]{r0, new qy20(2)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qy20(int i) {
        super(str, i);
        this.f29514a = i;
    }

    public static qy20 valueOf(String str) {
        return (qy20) Enum.valueOf(qy20.class, str);
    }

    public static qy20[] values() {
        return (qy20[]) d.clone();
    }
}
