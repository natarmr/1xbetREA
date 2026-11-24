package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.vzc[], still in use, count: 1, list:
  (r0v1 a.vzc[]) from 0x0039: CONSTRUCTOR (r0v1 a.vzc[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:58) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class vzc {
    /* JADX INFO: Fake field, exist only in values array */
    ENG(1),
    /* JADX INFO: Fake field, exist only in values array */
    US(2),
    /* JADX INFO: Fake field, exist only in values array */
    DEC(3),
    /* JADX INFO: Fake field, exist only in values array */
    HONG(4),
    /* JADX INFO: Fake field, exist only in values array */
    IND(5),
    /* JADX INFO: Fake field, exist only in values array */
    MAL(6);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f38290a;

    static {
        c = new c0o(vzcVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vzc(int i) {
        super(str, i);
        this.f38290a = i;
    }

    public static vzc valueOf(String str) {
        return (vzc) Enum.valueOf(vzc.class, str);
    }

    public static vzc[] values() {
        return (vzc[]) b.clone();
    }
}
