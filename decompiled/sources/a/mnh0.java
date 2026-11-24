package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v22 a.mnh0[], still in use, count: 1, list:
  (r0v22 a.mnh0[]) from 0x0126: CONSTRUCTOR (r0v22 a.mnh0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:295) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class mnh0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF9(1, "ONE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19(2, "TWO"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29(3, "THREE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF40(4, "FOUR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF50(5, "FIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF61(6, "SIX"),
    /* JADX INFO: Fake field, exist only in values array */
    EF71(7, "SEVEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF82(8, "EIGHT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF93(9, "NINE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF104(10, "TEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF115(11, "ELEVEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF126(12, "TWELVE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF140(13, "THIRTEEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF153(14, "FOURTEEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF166(15, "FIFTEEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF179(16, "SIXTEEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF192(17, "SEVENTEEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF206(18, "EIGHTEEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF219(19, "NINETEEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF233(20, "TWENTY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF246(25, "TWENTY_FIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF261(50, "FIFTY");

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f22088a;
    public final float b;

    static {
        d = new c0o(mnh0VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mnh0(int i, String str) {
        super(str, i);
        this.f22088a = i;
        this.b = f;
    }

    public static mnh0 valueOf(String str) {
        return (mnh0) Enum.valueOf(mnh0.class, str);
    }

    public static mnh0[] values() {
        return (mnh0[]) c.clone();
    }
}
