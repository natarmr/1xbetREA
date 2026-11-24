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
public final class irp {
    public static final irp b;
    public static final irp c;
    public static final irp[] d;
    public static final /* synthetic */ irp[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f15270a;

    /* JADX INFO: Fake field, exist only in values array */
    irp EF0;

    static {
        eay eayVar = eay.DOUBLE;
        irp irpVar = new irp("DOUBLE", 0, 0, 1, eayVar);
        eay eayVar2 = eay.FLOAT;
        irp irpVar2 = new irp("FLOAT", 1, 1, 1, eayVar2);
        eay eayVar3 = eay.LONG;
        irp irpVar3 = new irp("INT64", 2, 2, 1, eayVar3);
        irp irpVar4 = new irp("UINT64", 3, 3, 1, eayVar3);
        eay eayVar4 = eay.INT;
        irp irpVar5 = new irp("INT32", 4, 4, 1, eayVar4);
        irp irpVar6 = new irp("FIXED64", 5, 5, 1, eayVar3);
        irp irpVar7 = new irp("FIXED32", 6, 6, 1, eayVar4);
        eay eayVar5 = eay.BOOLEAN;
        irp irpVar8 = new irp("BOOL", 7, 7, 1, eayVar5);
        eay eayVar6 = eay.STRING;
        irp irpVar9 = new irp("STRING", 8, 8, 1, eayVar6);
        eay eayVar7 = eay.MESSAGE;
        irp irpVar10 = new irp("MESSAGE", 9, 9, 1, eayVar7);
        eay eayVar8 = eay.BYTE_STRING;
        irp irpVar11 = new irp("BYTES", 10, 10, 1, eayVar8);
        irp irpVar12 = new irp("UINT32", 11, 11, 1, eayVar4);
        eay eayVar9 = eay.ENUM;
        irp irpVar13 = new irp("ENUM", 12, 12, 1, eayVar9);
        irp irpVar14 = new irp("SFIXED32", 13, 13, 1, eayVar4);
        irp irpVar15 = new irp("SFIXED64", 14, 14, 1, eayVar3);
        irp irpVar16 = new irp("SINT32", 15, 15, 1, eayVar4);
        irp irpVar17 = new irp("SINT64", 16, 16, 1, eayVar3);
        irp irpVar18 = new irp("GROUP", 17, 17, 1, eayVar7);
        irp irpVar19 = new irp("DOUBLE_LIST", 18, 18, 2, eayVar);
        irp irpVar20 = new irp("FLOAT_LIST", 19, 19, 2, eayVar2);
        irp irpVar21 = new irp("INT64_LIST", 20, 20, 2, eayVar3);
        irp irpVar22 = new irp("UINT64_LIST", 21, 21, 2, eayVar3);
        irp irpVar23 = new irp("INT32_LIST", 22, 22, 2, eayVar4);
        irp irpVar24 = new irp("FIXED64_LIST", 23, 23, 2, eayVar3);
        irp irpVar25 = new irp("FIXED32_LIST", 24, 24, 2, eayVar4);
        irp irpVar26 = new irp("BOOL_LIST", 25, 25, 2, eayVar5);
        irp irpVar27 = new irp("STRING_LIST", 26, 26, 2, eayVar6);
        irp irpVar28 = new irp("MESSAGE_LIST", 27, 27, 2, eayVar7);
        irp irpVar29 = new irp("BYTES_LIST", 28, 28, 2, eayVar8);
        irp irpVar30 = new irp("UINT32_LIST", 29, 29, 2, eayVar4);
        irp irpVar31 = new irp("ENUM_LIST", 30, 30, 2, eayVar9);
        irp irpVar32 = new irp("SFIXED32_LIST", 31, 31, 2, eayVar4);
        irp irpVar33 = new irp("SFIXED64_LIST", 32, 32, 2, eayVar3);
        irp irpVar34 = new irp("SINT32_LIST", 33, 33, 2, eayVar4);
        irp irpVar35 = new irp("SINT64_LIST", 34, 34, 2, eayVar3);
        irp irpVar36 = new irp("DOUBLE_LIST_PACKED", 35, 35, 3, eayVar);
        b = irpVar36;
        irp irpVar37 = new irp("FLOAT_LIST_PACKED", 36, 36, 3, eayVar2);
        irp irpVar38 = new irp("INT64_LIST_PACKED", 37, 37, 3, eayVar3);
        irp irpVar39 = new irp("UINT64_LIST_PACKED", 38, 38, 3, eayVar3);
        irp irpVar40 = new irp("INT32_LIST_PACKED", 39, 39, 3, eayVar4);
        irp irpVar41 = new irp("FIXED64_LIST_PACKED", 40, 40, 3, eayVar3);
        irp irpVar42 = new irp("FIXED32_LIST_PACKED", 41, 41, 3, eayVar4);
        irp irpVar43 = new irp("BOOL_LIST_PACKED", 42, 42, 3, eayVar5);
        irp irpVar44 = new irp("UINT32_LIST_PACKED", 43, 43, 3, eayVar4);
        irp irpVar45 = new irp("ENUM_LIST_PACKED", 44, 44, 3, eayVar9);
        irp irpVar46 = new irp("SFIXED32_LIST_PACKED", 45, 45, 3, eayVar4);
        irp irpVar47 = new irp("SFIXED64_LIST_PACKED", 46, 46, 3, eayVar3);
        irp irpVar48 = new irp("SINT32_LIST_PACKED", 47, 47, 3, eayVar4);
        irp irpVar49 = new irp("SINT64_LIST_PACKED", 48, 48, 3, eayVar3);
        c = irpVar49;
        e = new irp[]{irpVar, irpVar2, irpVar3, irpVar4, irpVar5, irpVar6, irpVar7, irpVar8, irpVar9, irpVar10, irpVar11, irpVar12, irpVar13, irpVar14, irpVar15, irpVar16, irpVar17, irpVar18, irpVar19, irpVar20, irpVar21, irpVar22, irpVar23, irpVar24, irpVar25, irpVar26, irpVar27, irpVar28, irpVar29, irpVar30, irpVar31, irpVar32, irpVar33, irpVar34, irpVar35, irpVar36, irpVar37, irpVar38, irpVar39, irpVar40, irpVar41, irpVar42, irpVar43, irpVar44, irpVar45, irpVar46, irpVar47, irpVar48, irpVar49, new irp("GROUP_LIST", 49, 49, 2, eayVar7), new irp("MAP", 50, 50, 4, eay.VOID)};
        irp[] irpVarArrValues = values();
        d = new irp[irpVarArrValues.length];
        for (irp irpVar50 : irpVarArrValues) {
            d[irpVar50.f15270a] = irpVar50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public irp(String str, int i, int i2, int i3, eay eayVar) {
        super(str, i);
        this.f15270a = i2;
        int iE = hne.E(i3);
        if (iE == 1 || iE == 3) {
            Class cls = eayVar.f7492a;
        }
        if (i3 == 1) {
            eayVar.ordinal();
        }
    }

    public static irp valueOf(String str) {
        return (irp) Enum.valueOf(irp.class, str);
    }

    public static irp[] values() {
        return (irp[]) e.clone();
    }
}
