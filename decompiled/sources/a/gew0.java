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
public final class gew0 {
    public static final gew0 b;
    public static final gew0 c;
    public static final gew0[] d;
    public static final /* synthetic */ gew0[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f11176a;

    /* JADX INFO: Fake field, exist only in values array */
    gew0 EF0;

    static {
        afw0 afw0Var = afw0.f;
        gew0 gew0Var = new gew0("DOUBLE", 0, 0, 1, afw0Var);
        afw0 afw0Var2 = afw0.e;
        gew0 gew0Var2 = new gew0("FLOAT", 1, 1, 1, afw0Var2);
        afw0 afw0Var3 = afw0.d;
        gew0 gew0Var3 = new gew0("INT64", 2, 2, 1, afw0Var3);
        gew0 gew0Var4 = new gew0("UINT64", 3, 3, 1, afw0Var3);
        afw0 afw0Var4 = afw0.c;
        gew0 gew0Var5 = new gew0("INT32", 4, 4, 1, afw0Var4);
        gew0 gew0Var6 = new gew0("FIXED64", 5, 5, 1, afw0Var3);
        gew0 gew0Var7 = new gew0("FIXED32", 6, 6, 1, afw0Var4);
        afw0 afw0Var5 = afw0.g;
        gew0 gew0Var8 = new gew0("BOOL", 7, 7, 1, afw0Var5);
        afw0 afw0Var6 = afw0.h;
        gew0 gew0Var9 = new gew0("STRING", 8, 8, 1, afw0Var6);
        afw0 afw0Var7 = afw0.k;
        gew0 gew0Var10 = new gew0("MESSAGE", 9, 9, 1, afw0Var7);
        afw0 afw0Var8 = afw0.i;
        gew0 gew0Var11 = new gew0("BYTES", 10, 10, 1, afw0Var8);
        gew0 gew0Var12 = new gew0("UINT32", 11, 11, 1, afw0Var4);
        afw0 afw0Var9 = afw0.j;
        gew0 gew0Var13 = new gew0("ENUM", 12, 12, 1, afw0Var9);
        gew0 gew0Var14 = new gew0("SFIXED32", 13, 13, 1, afw0Var4);
        gew0 gew0Var15 = new gew0("SFIXED64", 14, 14, 1, afw0Var3);
        gew0 gew0Var16 = new gew0("SINT32", 15, 15, 1, afw0Var4);
        gew0 gew0Var17 = new gew0("SINT64", 16, 16, 1, afw0Var3);
        gew0 gew0Var18 = new gew0("GROUP", 17, 17, 1, afw0Var7);
        gew0 gew0Var19 = new gew0("DOUBLE_LIST", 18, 18, 2, afw0Var);
        gew0 gew0Var20 = new gew0("FLOAT_LIST", 19, 19, 2, afw0Var2);
        gew0 gew0Var21 = new gew0("INT64_LIST", 20, 20, 2, afw0Var3);
        gew0 gew0Var22 = new gew0("UINT64_LIST", 21, 21, 2, afw0Var3);
        gew0 gew0Var23 = new gew0("INT32_LIST", 22, 22, 2, afw0Var4);
        gew0 gew0Var24 = new gew0("FIXED64_LIST", 23, 23, 2, afw0Var3);
        gew0 gew0Var25 = new gew0("FIXED32_LIST", 24, 24, 2, afw0Var4);
        gew0 gew0Var26 = new gew0("BOOL_LIST", 25, 25, 2, afw0Var5);
        gew0 gew0Var27 = new gew0("STRING_LIST", 26, 26, 2, afw0Var6);
        gew0 gew0Var28 = new gew0("MESSAGE_LIST", 27, 27, 2, afw0Var7);
        gew0 gew0Var29 = new gew0("BYTES_LIST", 28, 28, 2, afw0Var8);
        gew0 gew0Var30 = new gew0("UINT32_LIST", 29, 29, 2, afw0Var4);
        gew0 gew0Var31 = new gew0("ENUM_LIST", 30, 30, 2, afw0Var9);
        gew0 gew0Var32 = new gew0("SFIXED32_LIST", 31, 31, 2, afw0Var4);
        gew0 gew0Var33 = new gew0("SFIXED64_LIST", 32, 32, 2, afw0Var3);
        gew0 gew0Var34 = new gew0("SINT32_LIST", 33, 33, 2, afw0Var4);
        gew0 gew0Var35 = new gew0("SINT64_LIST", 34, 34, 2, afw0Var3);
        gew0 gew0Var36 = new gew0("DOUBLE_LIST_PACKED", 35, 35, 3, afw0Var);
        b = gew0Var36;
        gew0 gew0Var37 = new gew0("FLOAT_LIST_PACKED", 36, 36, 3, afw0Var2);
        gew0 gew0Var38 = new gew0("INT64_LIST_PACKED", 37, 37, 3, afw0Var3);
        gew0 gew0Var39 = new gew0("UINT64_LIST_PACKED", 38, 38, 3, afw0Var3);
        gew0 gew0Var40 = new gew0("INT32_LIST_PACKED", 39, 39, 3, afw0Var4);
        gew0 gew0Var41 = new gew0("FIXED64_LIST_PACKED", 40, 40, 3, afw0Var3);
        gew0 gew0Var42 = new gew0("FIXED32_LIST_PACKED", 41, 41, 3, afw0Var4);
        gew0 gew0Var43 = new gew0("BOOL_LIST_PACKED", 42, 42, 3, afw0Var5);
        gew0 gew0Var44 = new gew0("UINT32_LIST_PACKED", 43, 43, 3, afw0Var4);
        gew0 gew0Var45 = new gew0("ENUM_LIST_PACKED", 44, 44, 3, afw0Var9);
        gew0 gew0Var46 = new gew0("SFIXED32_LIST_PACKED", 45, 45, 3, afw0Var4);
        gew0 gew0Var47 = new gew0("SFIXED64_LIST_PACKED", 46, 46, 3, afw0Var3);
        gew0 gew0Var48 = new gew0("SINT32_LIST_PACKED", 47, 47, 3, afw0Var4);
        gew0 gew0Var49 = new gew0("SINT64_LIST_PACKED", 48, 48, 3, afw0Var3);
        c = gew0Var49;
        e = new gew0[]{gew0Var, gew0Var2, gew0Var3, gew0Var4, gew0Var5, gew0Var6, gew0Var7, gew0Var8, gew0Var9, gew0Var10, gew0Var11, gew0Var12, gew0Var13, gew0Var14, gew0Var15, gew0Var16, gew0Var17, gew0Var18, gew0Var19, gew0Var20, gew0Var21, gew0Var22, gew0Var23, gew0Var24, gew0Var25, gew0Var26, gew0Var27, gew0Var28, gew0Var29, gew0Var30, gew0Var31, gew0Var32, gew0Var33, gew0Var34, gew0Var35, gew0Var36, gew0Var37, gew0Var38, gew0Var39, gew0Var40, gew0Var41, gew0Var42, gew0Var43, gew0Var44, gew0Var45, gew0Var46, gew0Var47, gew0Var48, gew0Var49, new gew0("GROUP_LIST", 49, 49, 2, afw0Var7), new gew0("MAP", 50, 50, 4, afw0.b)};
        gew0[] gew0VarArrValues = values();
        d = new gew0[gew0VarArrValues.length];
        for (gew0 gew0Var50 : gew0VarArrValues) {
            d[gew0Var50.f11176a] = gew0Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gew0(String str, int i, int i2, int i3, afw0 afw0Var) {
        super(str, i);
        this.f11176a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = afw0Var.f800a;
        }
        if (i3 == 1) {
            afw0 afw0Var2 = afw0.b;
            afw0Var.ordinal();
        }
    }

    public static gew0[] values() {
        return (gew0[]) e.clone();
    }
}
