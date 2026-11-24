package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.epf0[], still in use, count: 1, list:
  (r0v1 a.epf0[]) from 0x0026: CONSTRUCTOR (r0v1 a.epf0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
@ahi0(with = fpf0.class)
public final class epf0 {
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVE("1"),
    /* JADX INFO: Fake field, exist only in values array */
    WON("2"),
    /* JADX INFO: Fake field, exist only in values array */
    LOSE("3");

    public static final dpf0 Companion = new dpf0();
    public static final /* synthetic */ c0o c = new c0o(new epf0[]{new epf0("1"), new epf0("2"), new epf0("3")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8186a;

    static {
    }

    public epf0(String str) {
        super(str, i);
        this.f8186a = str;
    }

    public static epf0 valueOf(String str) {
        return (epf0) Enum.valueOf(epf0.class, str);
    }

    public static epf0[] values() {
        return (epf0[]) b.clone();
    }
}
