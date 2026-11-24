package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.gik0[], still in use, count: 1, list:
  (r0v1 a.gik0[]) from 0x0031: CONSTRUCTOR (r0v1 a.gik0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:50) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class gik0 {
    /* JADX INFO: Fake field, exist only in values array */
    TELEGRAM(1, "org.telegram.messenger"),
    /* JADX INFO: Fake field, exist only in values array */
    INSTAGRAM(2, "com.instagram.android"),
    /* JADX INFO: Fake field, exist only in values array */
    TWITTER(3, "com.twitter.android"),
    /* JADX INFO: Fake field, exist only in values array */
    DISCORD(4, "com.discord");

    public static final lme0 c = new lme0((byte) 23);
    public static final /* synthetic */ c0o e = new c0o(new gik0[]{new gik0(1, "org.telegram.messenger"), new gik0(2, "com.instagram.android"), new gik0(3, "com.twitter.android"), new gik0(4, "com.discord")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f11352a;
    public final String b;

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gik0(int i, String str) {
        super(str, i);
        this.f11352a = i;
        this.b = str;
    }

    public static gik0 valueOf(String str) {
        return (gik0) Enum.valueOf(gik0.class, str);
    }

    public static gik0[] values() {
        return (gik0[]) d.clone();
    }
}
