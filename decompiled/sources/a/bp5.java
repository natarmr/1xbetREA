package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.bp5[], still in use, count: 1, list:
  (r0v1 a.bp5[]) from 0x001d: CONSTRUCTOR (r1v2 a.c0o) = (r0v1 a.bp5[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:30) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class bp5 {
    INFO_TYPE(1),
    DEEPLINK_TYPE(2);

    public static final yk5 b;
    public static final bp5[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f2964a;

    static {
        c0o c0oVar = new c0o(bp5VarArr);
        b = new yk5();
        c = (bp5[]) wha0.W(c0oVar, new bp5[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bp5(int i) {
        super(str, i);
        this.f2964a = i;
    }

    public static bp5 valueOf(String str) {
        return (bp5) Enum.valueOf(bp5.class, str);
    }

    public static bp5[] values() {
        return (bp5[]) f.clone();
    }
}
