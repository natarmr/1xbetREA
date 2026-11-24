package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v18 a.gwe[], still in use, count: 1, list:
  (r0v18 a.gwe[]) from 0x00d8: CONSTRUCTOR (r0v18 a.gwe[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:217) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class gwe {
    DEFAULT(0),
    NEW_POPULAR(1),
    OLD_POPULAR(2),
    SEARCH(3),
    NOTIFICATIONS(4),
    CYBER(5),
    FAVORITE(6),
    GAME(7),
    EXPRESS_CRICKET(8),
    RELATED(9),
    SWIPE_X(10),
    INSIGHTS(11),
    CHAMPIONSHIP(12),
    HISTORY(13),
    LOAD_COUPON(14),
    GENERATE_COUPON(15),
    DAY_EXPRESS(16),
    COUPON_FAVORITE(17);

    public static final std b = new std();
    public static final /* synthetic */ c0o v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f12022a;

    static {
        v = new c0o(new gwe[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gwe(int i) {
        super(str, i);
        this.f12022a = i;
    }

    public static gwe valueOf(String str) {
        return (gwe) Enum.valueOf(gwe.class, str);
    }

    public static gwe[] values() {
        return (gwe[]) u.clone();
    }
}
