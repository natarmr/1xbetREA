package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.ulr0[], still in use, count: 1, list:
  (r0v1 a.ulr0[]) from 0x006e: CONSTRUCTOR (r0v1 a.ulr0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:111) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class ulr0 {
    NONE(0),
    /* JADX INFO: Fake field, exist only in values array */
    TOTO_FIFTEEN(1),
    TOTO_CORRECT_SCORE(2),
    /* JADX INFO: Fake field, exist only in values array */
    TOTO_FOOTBALL(3),
    TOTO_HOCKEY(4),
    TOTO_BASKETBALL(12),
    TOTO_CYBER_FOOTBALL(6),
    TOTO_1XTOTO(7),
    CRICKET(11),
    TOTO_CYBER_SPORT(9);

    public static final g9m0 b = new g9m0();
    public static final /* synthetic */ c0o l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f35888a;

    static {
        l = new c0o(new ulr0[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ulr0(int i) {
        super(str, i);
        this.f35888a = i;
    }

    public static ulr0 valueOf(String str) {
        return (ulr0) Enum.valueOf(ulr0.class, str);
    }

    public static ulr0[] values() {
        return (ulr0[]) k.clone();
    }
}
