package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.h8i0[], still in use, count: 1, list:
  (r0v1 a.h8i0[]) from 0x0038: CONSTRUCTOR (r0v1 a.h8i0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class h8i0 implements xrz {
    SELF_EXCLUSION(30),
    ETERNAL_SELF_EXCLUSION(37),
    SHORT_SELF_EXCLUSION_SPORT(55),
    SHORT_SELF_EXCLUSION_CASINO(56);

    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f12627a;

    static {
        g = new c0o(h8i0VarArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h8i0(int i) {
        super(str, i);
        bnz bnzVar = bnz.f2907a;
        this.f12627a = i;
    }

    public static h8i0 valueOf(String str) {
        return (h8i0) Enum.valueOf(h8i0.class, str);
    }

    public static h8i0[] values() {
        return (h8i0[]) f.clone();
    }

    @Override // a.xrz
    public final bnz a() {
        return bnz.e;
    }

    @Override // a.xrz
    public final int getId() {
        return this.f12627a;
    }
}
