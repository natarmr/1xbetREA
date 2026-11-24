package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.fm40[], still in use, count: 1, list:
  (r0v1 a.fm40[]) from 0x0030: CONSTRUCTOR (r0v1 a.fm40[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:49) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class fm40 {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);

    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijq f9767a;

    static {
        g = new c0o(fm40VarArr);
    }

    public fm40(int i) {
        super(str, i);
        ljq ljqVar = njq.e;
        ljqVar.getClass();
        this.f9767a = new ijq(ljqVar, i);
    }

    public static fm40 valueOf(String str) {
        return (fm40) Enum.valueOf(fm40.class, str);
    }

    public static fm40[] values() {
        return (fm40[]) f.clone();
    }
}
