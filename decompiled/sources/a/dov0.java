package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public class dov0 {
    public static final dov0 c;
    public static final rnv0 d;
    public static final unv0 e;
    public static final /* synthetic */ dov0[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gov0 f6430a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    dov0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    dov0 EF1;

    static {
        dov0 dov0Var = new dov0("DOUBLE", 0, gov0.DOUBLE, 1);
        dov0 dov0Var2 = new dov0("FLOAT", 1, gov0.FLOAT, 5);
        gov0 gov0Var = gov0.LONG;
        dov0 dov0Var3 = new dov0("INT64", 2, gov0Var, 0);
        c = dov0Var3;
        dov0 dov0Var4 = new dov0("UINT64", 3, gov0Var, 0);
        gov0 gov0Var2 = gov0.INT;
        dov0 dov0Var5 = new dov0("INT32", 4, gov0Var2, 0);
        dov0 dov0Var6 = new dov0("FIXED64", 5, gov0Var, 1);
        dov0 dov0Var7 = new dov0("FIXED32", 6, gov0Var2, 5);
        dov0 dov0Var8 = new dov0("BOOL", 7, gov0.BOOLEAN, 0);
        rnv0 rnv0Var = new rnv0("STRING", 8, gov0.STRING, 2);
        d = rnv0Var;
        gov0 gov0Var3 = gov0.MESSAGE;
        unv0 unv0Var = new unv0("GROUP", 9, gov0Var3, 3);
        e = unv0Var;
        f = new dov0[]{dov0Var, dov0Var2, dov0Var3, dov0Var4, dov0Var5, dov0Var6, dov0Var7, dov0Var8, rnv0Var, unv0Var, new xnv0("MESSAGE", 10, gov0Var3, 2), new aov0("BYTES", 11, gov0.BYTE_STRING, 2), new dov0("UINT32", 12, gov0Var2, 0), new dov0("ENUM", 13, gov0.ENUM, 0), new dov0("SFIXED32", 14, gov0Var2, 5), new dov0("SFIXED64", 15, gov0Var, 1), new dov0("SINT32", 16, gov0Var2, 0), new dov0("SINT64", 17, gov0Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dov0(String str, int i, gov0 gov0Var, int i2) {
        super(str, i);
        this.f6430a = gov0Var;
        this.b = i2;
    }

    public static dov0 valueOf(String str) {
        return (dov0) Enum.valueOf(dov0.class, str);
    }

    public static dov0[] values() {
        return (dov0[]) f.clone();
    }
}
