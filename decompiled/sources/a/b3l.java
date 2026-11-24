package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.b3l[], still in use, count: 1, list:
  (r0v1 a.b3l[]) from 0x0028: CONSTRUCTOR (r0v1 a.b3l[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:41) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class b3l {
    /* JADX INFO: Fake field, exist only in values array */
    DIRE_ANCIENT(79.1f, 17.3f, j6l.b),
    /* JADX INFO: Fake field, exist only in values array */
    RADIANT_ANCIENT(13.3f, 75.8f, j6l.f15993a);

    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1912a;
    public final float b;
    public final j6l c;

    static {
        e = new c0o(b3lVarArr);
    }

    public b3l(float f, float f2, j6l j6lVar) {
        super(str, i);
        this.f1912a = f;
        this.b = f2;
        this.c = j6lVar;
    }

    public static b3l valueOf(String str) {
        return (b3l) Enum.valueOf(b3l.class, str);
    }

    public static b3l[] values() {
        return (b3l[]) d.clone();
    }
}
