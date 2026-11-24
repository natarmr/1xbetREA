package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.toy[], still in use, count: 1, list:
  (r0v1 a.toy[]) from 0x0055: CONSTRUCTOR (r0v1 a.toy[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:86) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class toy {
    UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LIVE(1),
    /* JADX INFO: Fake field, exist only in values array */
    LIVE_LINE(2),
    /* JADX INFO: Fake field, exist only in values array */
    LINE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ZONE_PLAY(4),
    /* JADX INFO: Fake field, exist only in values array */
    FINANCE_365(6),
    /* JADX INFO: Fake field, exist only in values array */
    BONUS(7),
    /* JADX INFO: Fake field, exist only in values array */
    BM(8),
    /* JADX INFO: Fake field, exist only in values array */
    BM_LIVE(9);

    public static final sqt b = new sqt();
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f34306a;

    static {
        e = new c0o(new toy[]{r0, new toy(1), new toy(2), new toy(3), new toy(4), new toy(6), new toy(7), new toy(8), new toy(9)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public toy(int i) {
        super(str, i);
        this.f34306a = i;
    }

    public static toy valueOf(String str) {
        return (toy) Enum.valueOf(toy.class, str);
    }

    public static toy[] values() {
        return (toy[]) d.clone();
    }
}
