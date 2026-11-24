package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.nz00[], still in use, count: 1, list:
  (r0v1 a.nz00[]) from 0x005c: CONSTRUCTOR (r0v1 a.nz00[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:93) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class nz00 {
    /* JADX INFO: Fake field, exist only in values array */
    INFERNAL_DRAGON("3"),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_DRAGON("4"),
    /* JADX INFO: Fake field, exist only in values array */
    OCEAN_DRAGON("5"),
    /* JADX INFO: Fake field, exist only in values array */
    MOUNTAIN_DRAGON("6"),
    /* JADX INFO: Fake field, exist only in values array */
    CHEMTECH_DRAGON("7"),
    /* JADX INFO: Fake field, exist only in values array */
    HEXTECH_DRAGON("8"),
    ELDER_DRAGON("9"),
    UNKNOWN("");

    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24353a;

    static {
        e = new c0o(nz00VarArr);
    }

    public nz00(String str) {
        super(str, i);
        this.f24353a = str;
    }

    public static nz00 valueOf(String str) {
        return (nz00) Enum.valueOf(nz00.class, str);
    }

    public static nz00[] values() {
        return (nz00[]) d.clone();
    }
}
