package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.svn[], still in use, count: 1, list:
  (r0v1 a.svn[]) from 0x0058: CONSTRUCTOR (r0v1 a.svn[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:89) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = vvn.class)
public final class svn {
    /* JADX INFO: Fake field, exist only in values array */
    NONE("-1"),
    /* JADX INFO: Fake field, exist only in values array */
    LOST("0"),
    /* JADX INFO: Fake field, exist only in values array */
    WIN("1"),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_FULL("2"),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN("3"),
    /* JADX INFO: Fake field, exist only in values array */
    WIN_RETURN_HALF("4"),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_HALF("5"),
    /* JADX INFO: Fake field, exist only in values array */
    RESULT("7");

    public static final pvn Companion = new pvn();
    public static final /* synthetic */ c0o c = new c0o(new svn[]{new svn("-1"), new svn("0"), new svn("1"), new svn("2"), new svn("3"), new svn("4"), new svn("5"), new svn("7")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32877a;

    static {
    }

    public svn(String str) {
        super(str, i);
        this.f32877a = str;
    }

    public static svn valueOf(String str) {
        return (svn) Enum.valueOf(svn.class, str);
    }

    public static svn[] values() {
        return (svn[]) b.clone();
    }
}
