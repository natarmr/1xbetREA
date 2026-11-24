package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class d3l {
    public static final /* synthetic */ d3l[] e;
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f5407a;
    public final float b;
    public final float c;
    public final j6l d;

    /* JADX INFO: Fake field, exist only in values array */
    d3l EF0;

    static {
        j6l j6lVar = j6l.b;
        d3l d3lVar = new d3l("DIRE_ANCIENT_TOP", 0, 0, 75.0f, 18.9f, j6lVar);
        d3l d3lVar2 = new d3l("DIRE_ANCIENT_BOTTOM", 1, 1, 78.5f, 22.5f, j6lVar);
        d3l d3lVar3 = new d3l("DIRE_BOTTOM_TIER_3", 2, 2, 83.3f, 30.6f, j6lVar);
        d3l d3lVar4 = new d3l("DIRE_BOTTOM_TIER_2", 3, 3, 82.8f, 42.2f, j6lVar);
        d3l d3lVar5 = new d3l("DIRE_BOTTOM_TIER_1", 4, 4, 82.8f, 57.2f, j6lVar);
        d3l d3lVar6 = new d3l("DIRE_MIDDLE_TIER_3", 5, 5, 70.6f, 25.0f, j6lVar);
        d3l d3lVar7 = new d3l("DIRE_MIDDLE_TIER_2", 6, 6, 61.7f, 32.8f, j6lVar);
        d3l d3lVar8 = new d3l("DIRE_MIDDLE_TIER_1", 7, 7, 50.6f, 41.1f, j6lVar);
        d3l d3lVar9 = new d3l("DIRE_TOP_TIER_3", 8, 8, 65.6f, 13.3f, j6lVar);
        d3l d3lVar10 = new d3l("DIRE_TOP_TIER_2", 9, 9, 46.1f, 11.1f, j6lVar);
        d3l d3lVar11 = new d3l("DIRE_TOP_TIER_1", 10, 10, 20.6f, 11.7f, j6lVar);
        j6l j6lVar2 = j6l.f15993a;
        d3l[] d3lVarArr = {d3lVar, d3lVar2, d3lVar3, d3lVar4, d3lVar5, d3lVar6, d3lVar7, d3lVar8, d3lVar9, d3lVar10, d3lVar11, new d3l("RADIANT_ANCIENT_TOP", 11, 11, 14.4f, 71.1f, j6lVar2), new d3l("RADIANT_ANCIENT_BOTTOM", 12, 12, 16.9f, 75.1f, j6lVar2), new d3l("RADIANT_BOTTOM_TIER_3", 13, 13, 26.1f, 80.0f, j6lVar2), new d3l("RADIANT_BOTTOM_TIER_2", 14, 14, 45.6f, 81.1f, j6lVar2), new d3l("RADIANT_BOTTOM_TIER_1", 15, 15, 75.0f, 80.0f, j6lVar2), new d3l("RADIANT_MIDDLE_TIER_3", 16, 16, 21.1f, 68.3f, j6lVar2), new d3l("RADIANT_MIDDLE_TIER_2", 17, 17, 28.3f, 60.6f, j6lVar2), new d3l("RADIANT_MIDDLE_TIER_1", 18, 18, 38.3f, 52.8f, j6lVar2), new d3l("RADIANT_TOP_TIER_3", 19, 19, 9.4f, 63.8f, j6lVar2), new d3l("RADIANT_TOP_TIER_2", 20, 20, 11.1f, 49.4f, j6lVar2), new d3l("RADIANT_TOP_TIER_1", 21, 21, 11.1f, 34.4f, j6lVar2)};
        e = d3lVarArr;
        f = new c0o(d3lVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d3l(String str, int i, int i2, float f2, float f3, j6l j6lVar) {
        super(str, i);
        this.f5407a = i2;
        this.b = f2;
        this.c = f3;
        this.d = j6lVar;
    }

    public static d3l valueOf(String str) {
        return (d3l) Enum.valueOf(d3l.class, str);
    }

    public static d3l[] values() {
        return (d3l[]) e.clone();
    }
}
