package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.lsf[], still in use, count: 1, list:
  (r0v1 a.lsf[]) from 0x003c: CONSTRUCTOR (r0v1 a.lsf[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:61) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = msf.class)
public final class lsf {
    TERRORIST_WIN("0"),
    /* JADX INFO: Fake field, exist only in values array */
    BOMB_DETONATE("1"),
    /* JADX INFO: Fake field, exist only in values array */
    COUNTER_WIN("2"),
    /* JADX INFO: Fake field, exist only in values array */
    BOMB_DEFUSED("3"),
    /* JADX INFO: Fake field, exist only in values array */
    HOSTAGES_RESCUED("4");

    public static final ksf Companion = new ksf();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20576a;

    static {
        d = new c0o(new lsf[]{r0, new lsf("1"), new lsf("2"), new lsf("3"), new lsf("4")});
    }

    public lsf(String str) {
        super(str, i);
        this.f20576a = str;
    }

    public static lsf valueOf(String str) {
        return (lsf) Enum.valueOf(lsf.class, str);
    }

    public static lsf[] values() {
        return (lsf[]) c.clone();
    }
}
