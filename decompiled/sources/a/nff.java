package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.nff[], still in use, count: 1, list:
  (r0v1 a.nff[]) from 0x0026: CONSTRUCTOR (r0v1 a.nff[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = off.class)
public final class nff {
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVE("1"),
    /* JADX INFO: Fake field, exist only in values array */
    WIN("2"),
    /* JADX INFO: Fake field, exist only in values array */
    LOSE("3");

    public static final lff Companion = new lff();
    public static final /* synthetic */ c0o c = new c0o(new nff[]{new nff("1"), new nff("2"), new nff("3")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23434a;

    static {
    }

    public nff(String str) {
        super(str, i);
        this.f23434a = str;
    }

    public static nff valueOf(String str) {
        return (nff) Enum.valueOf(nff.class, str);
    }

    public static nff[] values() {
        return (nff[]) b.clone();
    }
}
