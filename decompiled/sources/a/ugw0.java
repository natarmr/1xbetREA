package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class ugw0 {
    public static final ugw0 c;
    public static final ugw0 d;
    public static final ugw0 e;
    public static final /* synthetic */ ugw0[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vgw0 f35647a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    ugw0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    ugw0 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    ugw0 EF0;

    static {
        ugw0 ugw0Var = new ugw0("DOUBLE", 0, vgw0.d, 1);
        ugw0 ugw0Var2 = new ugw0("FLOAT", 1, vgw0.c, 5);
        vgw0 vgw0Var = vgw0.b;
        ugw0 ugw0Var3 = new ugw0("INT64", 2, vgw0Var, 0);
        ugw0 ugw0Var4 = new ugw0("UINT64", 3, vgw0Var, 0);
        vgw0 vgw0Var2 = vgw0.f37403a;
        ugw0 ugw0Var5 = new ugw0("INT32", 4, vgw0Var2, 0);
        ugw0 ugw0Var6 = new ugw0("FIXED64", 5, vgw0Var, 1);
        ugw0 ugw0Var7 = new ugw0("FIXED32", 6, vgw0Var2, 5);
        ugw0 ugw0Var8 = new ugw0("BOOL", 7, vgw0.e, 0);
        ugw0 ugw0Var9 = new ugw0("STRING", 8, vgw0.f, 2);
        c = ugw0Var9;
        vgw0 vgw0Var3 = vgw0.i;
        ugw0 ugw0Var10 = new ugw0("GROUP", 9, vgw0Var3, 3);
        d = ugw0Var10;
        ugw0 ugw0Var11 = new ugw0("MESSAGE", 10, vgw0Var3, 2);
        e = ugw0Var11;
        f = new ugw0[]{ugw0Var, ugw0Var2, ugw0Var3, ugw0Var4, ugw0Var5, ugw0Var6, ugw0Var7, ugw0Var8, ugw0Var9, ugw0Var10, ugw0Var11, new ugw0("BYTES", 11, vgw0.g, 2), new ugw0("UINT32", 12, vgw0Var2, 0), new ugw0("ENUM", 13, vgw0.h, 0), new ugw0("SFIXED32", 14, vgw0Var2, 5), new ugw0("SFIXED64", 15, vgw0Var, 1), new ugw0("SINT32", 16, vgw0Var2, 0), new ugw0("SINT64", 17, vgw0Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ugw0(String str, int i, vgw0 vgw0Var, int i2) {
        super(str, i);
        this.f35647a = vgw0Var;
        this.b = i2;
    }

    public static ugw0[] values() {
        return (ugw0[]) f.clone();
    }
}
