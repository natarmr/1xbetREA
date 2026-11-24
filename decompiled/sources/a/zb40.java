package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.zb40[], still in use, count: 1, list:
  (r0v1 a.zb40[]) from 0x0046: CONSTRUCTOR (r0v1 a.zb40[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:71) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = ac40.class)
public final class zb40 {
    UNKNOWN("-1"),
    /* JADX INFO: Fake field, exist only in values array */
    CARRY_POSITION("1"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDDLE_POSITION("2"),
    /* JADX INFO: Fake field, exist only in values array */
    OFFLANE_POSITION("3"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORT_POSITION("4"),
    /* JADX INFO: Fake field, exist only in values array */
    FULL_SUPPORT_POSITION("5");

    public static final yb40 Companion = new yb40();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44097a;

    static {
        d = new c0o(new zb40[]{r0, new zb40("1"), new zb40("2"), new zb40("3"), new zb40("4"), new zb40("5")});
    }

    public zb40(String str) {
        super(str, i);
        this.f44097a = str;
    }

    public static zb40 valueOf(String str) {
        return (zb40) Enum.valueOf(zb40.class, str);
    }

    public static zb40[] values() {
        return (zb40[]) c.clone();
    }
}
