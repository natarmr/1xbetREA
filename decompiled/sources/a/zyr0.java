package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.zyr0[], still in use, count: 1, list:
  (r0v1 a.zyr0[]) from 0x002c: CONSTRUCTOR (r0v1 a.zyr0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:45) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = azr0.class)
public final class zyr0 {
    TillStart("2"),
    TillEnd("3"),
    Finished("4");

    public static final yyr0 Companion = new yyr0();
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45219a;

    static {
        f = new c0o(new zyr0[]{r0, r1, r2});
    }

    public zyr0(String str) {
        super(str, i);
        this.f45219a = str;
    }

    public static zyr0 valueOf(String str) {
        return (zyr0) Enum.valueOf(zyr0.class, str);
    }

    public static zyr0[] values() {
        return (zyr0[]) e.clone();
    }
}
