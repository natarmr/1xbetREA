package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.ih2[], still in use, count: 1, list:
  (r0v1 a.ih2[]) from 0x0044: CONSTRUCTOR (r0v1 a.ih2[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:69) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ih2 {
    Events(1L),
    Teams(2L),
    Tournaments(3L),
    Tracked(4L),
    Viewed(5L);

    public static final /* synthetic */ c0o h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f14760a;

    static {
        h = new c0o(ih2VarArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public ih2(long j) {
        super(str, i);
        this.f14760a = (int) j;
    }

    public static ih2 valueOf(String str) {
        return (ih2) Enum.valueOf(ih2.class, str);
    }

    public static ih2[] values() {
        return (ih2[]) g.clone();
    }
}
