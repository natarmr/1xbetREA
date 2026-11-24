package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.kyk0[], still in use, count: 1, list:
  (r0v1 a.kyk0[]) from 0x001c: CONSTRUCTOR (r0v1 a.kyk0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = lyk0.class)
public final class kyk0 {
    /* JADX INFO: Fake field, exist only in values array */
    WIN("2"),
    /* JADX INFO: Fake field, exist only in values array */
    LOSE("3");

    public static final jyk0 Companion = new jyk0();
    public static final /* synthetic */ c0o c = new c0o(new kyk0[]{new kyk0("2"), new kyk0("3")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19109a;

    static {
    }

    public kyk0(String str) {
        super(str, i);
        this.f19109a = str;
    }

    public static kyk0 valueOf(String str) {
        return (kyk0) Enum.valueOf(kyk0.class, str);
    }

    public static kyk0[] values() {
        return (kyk0[]) b.clone();
    }
}
