package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.z93[], still in use, count: 1, list:
  (r0v1 a.z93[]) from 0x0026: CONSTRUCTOR (r0v1 a.z93[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = aa3.class)
public final class z93 {
    /* JADX INFO: Fake field, exist only in values array */
    SECRET_QUESTION("1"),
    /* JADX INFO: Fake field, exist only in values array */
    PASSPORT("2"),
    /* JADX INFO: Fake field, exist only in values array */
    PHONE("3");

    public static final y93 Companion = new y93();
    public static final /* synthetic */ c0o c = new c0o(new z93[]{new z93("1"), new z93("2"), new z93("3")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43997a;

    static {
    }

    public z93(String str) {
        super(str, i);
        this.f43997a = str;
    }

    public static z93 valueOf(String str) {
        return (z93) Enum.valueOf(z93.class, str);
    }

    public static z93[] values() {
        return (z93[]) b.clone();
    }
}
