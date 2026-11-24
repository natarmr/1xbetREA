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
public final class fkw0 {
    public static final fkw0 b;
    public static final fkw0 c;
    public static final fkw0[] d;
    public static final /* synthetic */ fkw0[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f9714a;

    /* JADX INFO: Fake field, exist only in values array */
    fkw0 EF0;

    static {
        rkw0 rkw0Var = rkw0.f;
        fkw0 fkw0Var = new fkw0("DOUBLE", 0, 0, 1, rkw0Var);
        rkw0 rkw0Var2 = rkw0.e;
        fkw0 fkw0Var2 = new fkw0("FLOAT", 1, 1, 1, rkw0Var2);
        rkw0 rkw0Var3 = rkw0.d;
        fkw0 fkw0Var3 = new fkw0("INT64", 2, 2, 1, rkw0Var3);
        fkw0 fkw0Var4 = new fkw0("UINT64", 3, 3, 1, rkw0Var3);
        rkw0 rkw0Var4 = rkw0.c;
        fkw0 fkw0Var5 = new fkw0("INT32", 4, 4, 1, rkw0Var4);
        fkw0 fkw0Var6 = new fkw0("FIXED64", 5, 5, 1, rkw0Var3);
        fkw0 fkw0Var7 = new fkw0("FIXED32", 6, 6, 1, rkw0Var4);
        rkw0 rkw0Var5 = rkw0.g;
        fkw0 fkw0Var8 = new fkw0("BOOL", 7, 7, 1, rkw0Var5);
        rkw0 rkw0Var6 = rkw0.h;
        fkw0 fkw0Var9 = new fkw0("STRING", 8, 8, 1, rkw0Var6);
        rkw0 rkw0Var7 = rkw0.k;
        fkw0 fkw0Var10 = new fkw0("MESSAGE", 9, 9, 1, rkw0Var7);
        rkw0 rkw0Var8 = rkw0.i;
        fkw0 fkw0Var11 = new fkw0("BYTES", 10, 10, 1, rkw0Var8);
        fkw0 fkw0Var12 = new fkw0("UINT32", 11, 11, 1, rkw0Var4);
        rkw0 rkw0Var9 = rkw0.j;
        fkw0 fkw0Var13 = new fkw0("ENUM", 12, 12, 1, rkw0Var9);
        fkw0 fkw0Var14 = new fkw0("SFIXED32", 13, 13, 1, rkw0Var4);
        fkw0 fkw0Var15 = new fkw0("SFIXED64", 14, 14, 1, rkw0Var3);
        fkw0 fkw0Var16 = new fkw0("SINT32", 15, 15, 1, rkw0Var4);
        fkw0 fkw0Var17 = new fkw0("SINT64", 16, 16, 1, rkw0Var3);
        fkw0 fkw0Var18 = new fkw0("GROUP", 17, 17, 1, rkw0Var7);
        fkw0 fkw0Var19 = new fkw0("DOUBLE_LIST", 18, 18, 2, rkw0Var);
        fkw0 fkw0Var20 = new fkw0("FLOAT_LIST", 19, 19, 2, rkw0Var2);
        fkw0 fkw0Var21 = new fkw0("INT64_LIST", 20, 20, 2, rkw0Var3);
        fkw0 fkw0Var22 = new fkw0("UINT64_LIST", 21, 21, 2, rkw0Var3);
        fkw0 fkw0Var23 = new fkw0("INT32_LIST", 22, 22, 2, rkw0Var4);
        fkw0 fkw0Var24 = new fkw0("FIXED64_LIST", 23, 23, 2, rkw0Var3);
        fkw0 fkw0Var25 = new fkw0("FIXED32_LIST", 24, 24, 2, rkw0Var4);
        fkw0 fkw0Var26 = new fkw0("BOOL_LIST", 25, 25, 2, rkw0Var5);
        fkw0 fkw0Var27 = new fkw0("STRING_LIST", 26, 26, 2, rkw0Var6);
        fkw0 fkw0Var28 = new fkw0("MESSAGE_LIST", 27, 27, 2, rkw0Var7);
        fkw0 fkw0Var29 = new fkw0("BYTES_LIST", 28, 28, 2, rkw0Var8);
        fkw0 fkw0Var30 = new fkw0("UINT32_LIST", 29, 29, 2, rkw0Var4);
        fkw0 fkw0Var31 = new fkw0("ENUM_LIST", 30, 30, 2, rkw0Var9);
        fkw0 fkw0Var32 = new fkw0("SFIXED32_LIST", 31, 31, 2, rkw0Var4);
        fkw0 fkw0Var33 = new fkw0("SFIXED64_LIST", 32, 32, 2, rkw0Var3);
        fkw0 fkw0Var34 = new fkw0("SINT32_LIST", 33, 33, 2, rkw0Var4);
        fkw0 fkw0Var35 = new fkw0("SINT64_LIST", 34, 34, 2, rkw0Var3);
        fkw0 fkw0Var36 = new fkw0("DOUBLE_LIST_PACKED", 35, 35, 3, rkw0Var);
        b = fkw0Var36;
        fkw0 fkw0Var37 = new fkw0("FLOAT_LIST_PACKED", 36, 36, 3, rkw0Var2);
        fkw0 fkw0Var38 = new fkw0("INT64_LIST_PACKED", 37, 37, 3, rkw0Var3);
        fkw0 fkw0Var39 = new fkw0("UINT64_LIST_PACKED", 38, 38, 3, rkw0Var3);
        fkw0 fkw0Var40 = new fkw0("INT32_LIST_PACKED", 39, 39, 3, rkw0Var4);
        fkw0 fkw0Var41 = new fkw0("FIXED64_LIST_PACKED", 40, 40, 3, rkw0Var3);
        fkw0 fkw0Var42 = new fkw0("FIXED32_LIST_PACKED", 41, 41, 3, rkw0Var4);
        fkw0 fkw0Var43 = new fkw0("BOOL_LIST_PACKED", 42, 42, 3, rkw0Var5);
        fkw0 fkw0Var44 = new fkw0("UINT32_LIST_PACKED", 43, 43, 3, rkw0Var4);
        fkw0 fkw0Var45 = new fkw0("ENUM_LIST_PACKED", 44, 44, 3, rkw0Var9);
        fkw0 fkw0Var46 = new fkw0("SFIXED32_LIST_PACKED", 45, 45, 3, rkw0Var4);
        fkw0 fkw0Var47 = new fkw0("SFIXED64_LIST_PACKED", 46, 46, 3, rkw0Var3);
        fkw0 fkw0Var48 = new fkw0("SINT32_LIST_PACKED", 47, 47, 3, rkw0Var4);
        fkw0 fkw0Var49 = new fkw0("SINT64_LIST_PACKED", 48, 48, 3, rkw0Var3);
        c = fkw0Var49;
        e = new fkw0[]{fkw0Var, fkw0Var2, fkw0Var3, fkw0Var4, fkw0Var5, fkw0Var6, fkw0Var7, fkw0Var8, fkw0Var9, fkw0Var10, fkw0Var11, fkw0Var12, fkw0Var13, fkw0Var14, fkw0Var15, fkw0Var16, fkw0Var17, fkw0Var18, fkw0Var19, fkw0Var20, fkw0Var21, fkw0Var22, fkw0Var23, fkw0Var24, fkw0Var25, fkw0Var26, fkw0Var27, fkw0Var28, fkw0Var29, fkw0Var30, fkw0Var31, fkw0Var32, fkw0Var33, fkw0Var34, fkw0Var35, fkw0Var36, fkw0Var37, fkw0Var38, fkw0Var39, fkw0Var40, fkw0Var41, fkw0Var42, fkw0Var43, fkw0Var44, fkw0Var45, fkw0Var46, fkw0Var47, fkw0Var48, fkw0Var49, new fkw0("GROUP_LIST", 49, 49, 2, rkw0Var7), new fkw0("MAP", 50, 50, 4, rkw0.b)};
        fkw0[] fkw0VarArrValues = values();
        d = new fkw0[fkw0VarArrValues.length];
        for (fkw0 fkw0Var50 : fkw0VarArrValues) {
            d[fkw0Var50.f9714a] = fkw0Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fkw0(String str, int i, int i2, int i3, rkw0 rkw0Var) {
        super(str, i);
        this.f9714a = i2;
        int iE = hne.E(i3);
        if (iE == 1 || iE == 3) {
            Class cls = rkw0Var.f30669a;
        }
        if (i3 == 1) {
            int i4 = gkw0.f11465a[rkw0Var.ordinal()];
        }
    }

    public static fkw0[] values() {
        return (fkw0[]) e.clone();
    }
}
