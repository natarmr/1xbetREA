package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.b5s[], still in use, count: 1, list:
  (r0v1 a.b5s[]) from 0x0038: CONSTRUCTOR (r0v1 a.b5s[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class b5s {
    Circle("smallCircles"),
    /* JADX INFO: Fake field, exist only in values array */
    SquareS("smallSquares"),
    /* JADX INFO: Fake field, exist only in values array */
    SquareSNoHeader("smallSquaresNoHeader"),
    /* JADX INFO: Fake field, exist only in values array */
    Rectangle("mediumRectangles");

    public static final bek b;
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2018a;

    static {
        g5s g5sVar = g5s.Circle;
        g5s g5sVar2 = g5s.Circle;
        g5s g5sVar3 = g5s.Circle;
        e = new c0o(b5sVarArr);
        b = new bek();
    }

    public b5s(String str) {
        super(str, i);
        this.f2018a = str;
    }

    public static b5s valueOf(String str) {
        return (b5s) Enum.valueOf(b5s.class, str);
    }

    public static b5s[] values() {
        return (b5s[]) d.clone();
    }
}
