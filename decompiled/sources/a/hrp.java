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
public final class hrp {
    public static final hrp b;
    public static final hrp c;
    public static final hrp[] d;
    public static final /* synthetic */ hrp[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f13542a;

    /* JADX INFO: Fake field, exist only in values array */
    hrp EF0;

    static {
        day dayVar = day.DOUBLE;
        hrp hrpVar = new hrp("DOUBLE", 0, 0, 1, dayVar);
        day dayVar2 = day.FLOAT;
        hrp hrpVar2 = new hrp("FLOAT", 1, 1, 1, dayVar2);
        day dayVar3 = day.LONG;
        hrp hrpVar3 = new hrp("INT64", 2, 2, 1, dayVar3);
        hrp hrpVar4 = new hrp("UINT64", 3, 3, 1, dayVar3);
        day dayVar4 = day.INT;
        hrp hrpVar5 = new hrp("INT32", 4, 4, 1, dayVar4);
        hrp hrpVar6 = new hrp("FIXED64", 5, 5, 1, dayVar3);
        hrp hrpVar7 = new hrp("FIXED32", 6, 6, 1, dayVar4);
        day dayVar5 = day.BOOLEAN;
        hrp hrpVar8 = new hrp("BOOL", 7, 7, 1, dayVar5);
        day dayVar6 = day.STRING;
        hrp hrpVar9 = new hrp("STRING", 8, 8, 1, dayVar6);
        day dayVar7 = day.MESSAGE;
        hrp hrpVar10 = new hrp("MESSAGE", 9, 9, 1, dayVar7);
        day dayVar8 = day.BYTE_STRING;
        hrp hrpVar11 = new hrp("BYTES", 10, 10, 1, dayVar8);
        hrp hrpVar12 = new hrp("UINT32", 11, 11, 1, dayVar4);
        day dayVar9 = day.ENUM;
        hrp hrpVar13 = new hrp("ENUM", 12, 12, 1, dayVar9);
        hrp hrpVar14 = new hrp("SFIXED32", 13, 13, 1, dayVar4);
        hrp hrpVar15 = new hrp("SFIXED64", 14, 14, 1, dayVar3);
        hrp hrpVar16 = new hrp("SINT32", 15, 15, 1, dayVar4);
        hrp hrpVar17 = new hrp("SINT64", 16, 16, 1, dayVar3);
        hrp hrpVar18 = new hrp("GROUP", 17, 17, 1, dayVar7);
        hrp hrpVar19 = new hrp("DOUBLE_LIST", 18, 18, 2, dayVar);
        hrp hrpVar20 = new hrp("FLOAT_LIST", 19, 19, 2, dayVar2);
        hrp hrpVar21 = new hrp("INT64_LIST", 20, 20, 2, dayVar3);
        hrp hrpVar22 = new hrp("UINT64_LIST", 21, 21, 2, dayVar3);
        hrp hrpVar23 = new hrp("INT32_LIST", 22, 22, 2, dayVar4);
        hrp hrpVar24 = new hrp("FIXED64_LIST", 23, 23, 2, dayVar3);
        hrp hrpVar25 = new hrp("FIXED32_LIST", 24, 24, 2, dayVar4);
        hrp hrpVar26 = new hrp("BOOL_LIST", 25, 25, 2, dayVar5);
        hrp hrpVar27 = new hrp("STRING_LIST", 26, 26, 2, dayVar6);
        hrp hrpVar28 = new hrp("MESSAGE_LIST", 27, 27, 2, dayVar7);
        hrp hrpVar29 = new hrp("BYTES_LIST", 28, 28, 2, dayVar8);
        hrp hrpVar30 = new hrp("UINT32_LIST", 29, 29, 2, dayVar4);
        hrp hrpVar31 = new hrp("ENUM_LIST", 30, 30, 2, dayVar9);
        hrp hrpVar32 = new hrp("SFIXED32_LIST", 31, 31, 2, dayVar4);
        hrp hrpVar33 = new hrp("SFIXED64_LIST", 32, 32, 2, dayVar3);
        hrp hrpVar34 = new hrp("SINT32_LIST", 33, 33, 2, dayVar4);
        hrp hrpVar35 = new hrp("SINT64_LIST", 34, 34, 2, dayVar3);
        hrp hrpVar36 = new hrp("DOUBLE_LIST_PACKED", 35, 35, 3, dayVar);
        b = hrpVar36;
        hrp hrpVar37 = new hrp("FLOAT_LIST_PACKED", 36, 36, 3, dayVar2);
        hrp hrpVar38 = new hrp("INT64_LIST_PACKED", 37, 37, 3, dayVar3);
        hrp hrpVar39 = new hrp("UINT64_LIST_PACKED", 38, 38, 3, dayVar3);
        hrp hrpVar40 = new hrp("INT32_LIST_PACKED", 39, 39, 3, dayVar4);
        hrp hrpVar41 = new hrp("FIXED64_LIST_PACKED", 40, 40, 3, dayVar3);
        hrp hrpVar42 = new hrp("FIXED32_LIST_PACKED", 41, 41, 3, dayVar4);
        hrp hrpVar43 = new hrp("BOOL_LIST_PACKED", 42, 42, 3, dayVar5);
        hrp hrpVar44 = new hrp("UINT32_LIST_PACKED", 43, 43, 3, dayVar4);
        hrp hrpVar45 = new hrp("ENUM_LIST_PACKED", 44, 44, 3, dayVar9);
        hrp hrpVar46 = new hrp("SFIXED32_LIST_PACKED", 45, 45, 3, dayVar4);
        hrp hrpVar47 = new hrp("SFIXED64_LIST_PACKED", 46, 46, 3, dayVar3);
        hrp hrpVar48 = new hrp("SINT32_LIST_PACKED", 47, 47, 3, dayVar4);
        hrp hrpVar49 = new hrp("SINT64_LIST_PACKED", 48, 48, 3, dayVar3);
        c = hrpVar49;
        e = new hrp[]{hrpVar, hrpVar2, hrpVar3, hrpVar4, hrpVar5, hrpVar6, hrpVar7, hrpVar8, hrpVar9, hrpVar10, hrpVar11, hrpVar12, hrpVar13, hrpVar14, hrpVar15, hrpVar16, hrpVar17, hrpVar18, hrpVar19, hrpVar20, hrpVar21, hrpVar22, hrpVar23, hrpVar24, hrpVar25, hrpVar26, hrpVar27, hrpVar28, hrpVar29, hrpVar30, hrpVar31, hrpVar32, hrpVar33, hrpVar34, hrpVar35, hrpVar36, hrpVar37, hrpVar38, hrpVar39, hrpVar40, hrpVar41, hrpVar42, hrpVar43, hrpVar44, hrpVar45, hrpVar46, hrpVar47, hrpVar48, hrpVar49, new hrp("GROUP_LIST", 49, 49, 2, dayVar7), new hrp("MAP", 50, 50, 4, day.VOID)};
        hrp[] hrpVarArrValues = values();
        d = new hrp[hrpVarArrValues.length];
        for (hrp hrpVar50 : hrpVarArrValues) {
            d[hrpVar50.f13542a] = hrpVar50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hrp(String str, int i, int i2, int i3, day dayVar) {
        super(str, i);
        this.f13542a = i2;
        int iE = hne.E(i3);
        if (iE == 1 || iE == 3) {
            Class cls = dayVar.f5774a;
        }
        if (i3 == 1) {
            dayVar.ordinal();
        }
    }

    public static hrp valueOf(String str) {
        return (hrp) Enum.valueOf(hrp.class, str);
    }

    public static hrp[] values() {
        return (hrp[]) e.clone();
    }
}
