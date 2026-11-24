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
public final class grp {
    public static final grp b;
    public static final grp c;
    public static final grp[] d;
    public static final /* synthetic */ grp[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f11791a;

    /* JADX INFO: Fake field, exist only in values array */
    grp EF0;

    static {
        cay cayVar = cay.DOUBLE;
        grp grpVar = new grp("DOUBLE", 0, 0, 1, cayVar);
        cay cayVar2 = cay.FLOAT;
        grp grpVar2 = new grp("FLOAT", 1, 1, 1, cayVar2);
        cay cayVar3 = cay.LONG;
        grp grpVar3 = new grp("INT64", 2, 2, 1, cayVar3);
        grp grpVar4 = new grp("UINT64", 3, 3, 1, cayVar3);
        cay cayVar4 = cay.INT;
        grp grpVar5 = new grp("INT32", 4, 4, 1, cayVar4);
        grp grpVar6 = new grp("FIXED64", 5, 5, 1, cayVar3);
        grp grpVar7 = new grp("FIXED32", 6, 6, 1, cayVar4);
        cay cayVar5 = cay.BOOLEAN;
        grp grpVar8 = new grp("BOOL", 7, 7, 1, cayVar5);
        cay cayVar6 = cay.STRING;
        grp grpVar9 = new grp("STRING", 8, 8, 1, cayVar6);
        cay cayVar7 = cay.MESSAGE;
        grp grpVar10 = new grp("MESSAGE", 9, 9, 1, cayVar7);
        cay cayVar8 = cay.BYTE_STRING;
        grp grpVar11 = new grp("BYTES", 10, 10, 1, cayVar8);
        grp grpVar12 = new grp("UINT32", 11, 11, 1, cayVar4);
        cay cayVar9 = cay.ENUM;
        grp grpVar13 = new grp("ENUM", 12, 12, 1, cayVar9);
        grp grpVar14 = new grp("SFIXED32", 13, 13, 1, cayVar4);
        grp grpVar15 = new grp("SFIXED64", 14, 14, 1, cayVar3);
        grp grpVar16 = new grp("SINT32", 15, 15, 1, cayVar4);
        grp grpVar17 = new grp("SINT64", 16, 16, 1, cayVar3);
        grp grpVar18 = new grp("GROUP", 17, 17, 1, cayVar7);
        grp grpVar19 = new grp("DOUBLE_LIST", 18, 18, 2, cayVar);
        grp grpVar20 = new grp("FLOAT_LIST", 19, 19, 2, cayVar2);
        grp grpVar21 = new grp("INT64_LIST", 20, 20, 2, cayVar3);
        grp grpVar22 = new grp("UINT64_LIST", 21, 21, 2, cayVar3);
        grp grpVar23 = new grp("INT32_LIST", 22, 22, 2, cayVar4);
        grp grpVar24 = new grp("FIXED64_LIST", 23, 23, 2, cayVar3);
        grp grpVar25 = new grp("FIXED32_LIST", 24, 24, 2, cayVar4);
        grp grpVar26 = new grp("BOOL_LIST", 25, 25, 2, cayVar5);
        grp grpVar27 = new grp("STRING_LIST", 26, 26, 2, cayVar6);
        grp grpVar28 = new grp("MESSAGE_LIST", 27, 27, 2, cayVar7);
        grp grpVar29 = new grp("BYTES_LIST", 28, 28, 2, cayVar8);
        grp grpVar30 = new grp("UINT32_LIST", 29, 29, 2, cayVar4);
        grp grpVar31 = new grp("ENUM_LIST", 30, 30, 2, cayVar9);
        grp grpVar32 = new grp("SFIXED32_LIST", 31, 31, 2, cayVar4);
        grp grpVar33 = new grp("SFIXED64_LIST", 32, 32, 2, cayVar3);
        grp grpVar34 = new grp("SINT32_LIST", 33, 33, 2, cayVar4);
        grp grpVar35 = new grp("SINT64_LIST", 34, 34, 2, cayVar3);
        grp grpVar36 = new grp("DOUBLE_LIST_PACKED", 35, 35, 3, cayVar);
        b = grpVar36;
        grp grpVar37 = new grp("FLOAT_LIST_PACKED", 36, 36, 3, cayVar2);
        grp grpVar38 = new grp("INT64_LIST_PACKED", 37, 37, 3, cayVar3);
        grp grpVar39 = new grp("UINT64_LIST_PACKED", 38, 38, 3, cayVar3);
        grp grpVar40 = new grp("INT32_LIST_PACKED", 39, 39, 3, cayVar4);
        grp grpVar41 = new grp("FIXED64_LIST_PACKED", 40, 40, 3, cayVar3);
        grp grpVar42 = new grp("FIXED32_LIST_PACKED", 41, 41, 3, cayVar4);
        grp grpVar43 = new grp("BOOL_LIST_PACKED", 42, 42, 3, cayVar5);
        grp grpVar44 = new grp("UINT32_LIST_PACKED", 43, 43, 3, cayVar4);
        grp grpVar45 = new grp("ENUM_LIST_PACKED", 44, 44, 3, cayVar9);
        grp grpVar46 = new grp("SFIXED32_LIST_PACKED", 45, 45, 3, cayVar4);
        grp grpVar47 = new grp("SFIXED64_LIST_PACKED", 46, 46, 3, cayVar3);
        grp grpVar48 = new grp("SINT32_LIST_PACKED", 47, 47, 3, cayVar4);
        grp grpVar49 = new grp("SINT64_LIST_PACKED", 48, 48, 3, cayVar3);
        c = grpVar49;
        e = new grp[]{grpVar, grpVar2, grpVar3, grpVar4, grpVar5, grpVar6, grpVar7, grpVar8, grpVar9, grpVar10, grpVar11, grpVar12, grpVar13, grpVar14, grpVar15, grpVar16, grpVar17, grpVar18, grpVar19, grpVar20, grpVar21, grpVar22, grpVar23, grpVar24, grpVar25, grpVar26, grpVar27, grpVar28, grpVar29, grpVar30, grpVar31, grpVar32, grpVar33, grpVar34, grpVar35, grpVar36, grpVar37, grpVar38, grpVar39, grpVar40, grpVar41, grpVar42, grpVar43, grpVar44, grpVar45, grpVar46, grpVar47, grpVar48, grpVar49, new grp("GROUP_LIST", 49, 49, 2, cayVar7), new grp("MAP", 50, 50, 4, cay.VOID)};
        grp[] grpVarArrValues = values();
        d = new grp[grpVarArrValues.length];
        for (grp grpVar50 : grpVarArrValues) {
            d[grpVar50.f11791a] = grpVar50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public grp(String str, int i, int i2, int i3, cay cayVar) {
        super(str, i);
        this.f11791a = i2;
        int iE = hne.E(i3);
        if (iE == 1 || iE == 3) {
            Class cls = cayVar.f4036a;
        }
        if (i3 == 1) {
            cayVar.ordinal();
        }
    }

    public static grp valueOf(String str) {
        return (grp) Enum.valueOf(grp.class, str);
    }

    public static grp[] values() {
        return (grp[]) e.clone();
    }
}
