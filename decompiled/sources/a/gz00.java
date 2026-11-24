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
public final class gz00 {
    public static final /* synthetic */ gz00[] e;
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f12156a;
    public final float b;
    public final float c;
    public final d310 d;

    /* JADX INFO: Fake field, exist only in values array */
    gz00 EF0;

    static {
        d310 d310Var = d310.RADIANT;
        gz00 gz00Var = new gz00("RADIANT_BOTTOM_NEXUS_TOWER", 0, 0, 16.12f, 80.08f, d310Var);
        gz00 gz00Var2 = new gz00("RADIANT_TOP_NEXUS_TOWER", 1, 1, 9.88f, 74.36f, d310Var);
        gz00 gz00Var3 = new gz00("RADIANT_BOTTOM_TIER_3", 2, 2, 30.16f, 85.28f, d310Var);
        gz00 gz00Var4 = new gz00("RADIANT_BOTTOM_TIER_2", 3, 3, 47.84f, 85.28f, d310Var);
        gz00 gz00Var5 = new gz00("RADIANT_BOTTOM_TIER_1", 4, 4, 67.08f, 85.28f, d310Var);
        gz00 gz00Var6 = new gz00("RADIANT_MIDDLE_TIER_3", 5, 5, 23.4f, 66.04f, d310Var);
        gz00 gz00Var7 = new gz00("RADIANT_MIDDLE_TIER_2", 6, 6, 31.72f, 57.72f, d310Var);
        gz00 gz00Var8 = new gz00("RADIANT_MIDDLE_TIER_1", 7, 7, 39.52f, 49.92f, d310Var);
        gz00 gz00Var9 = new gz00("RADIANT_TOP_TIER_3", 8, 8, 4.16f, 61.36f, d310Var);
        gz00 gz00Var10 = new gz00("RADIANT_TOP_TIER_2", 9, 9, 4.16f, 46.28f, d310Var);
        gz00 gz00Var11 = new gz00("RADIANT_TOP_TIER_1", 10, 10, 4.16f, 28.6f, d310Var);
        d310 d310Var2 = d310.DIRE;
        gz00[] gz00VarArr = {gz00Var, gz00Var2, gz00Var3, gz00Var4, gz00Var5, gz00Var6, gz00Var7, gz00Var8, gz00Var9, gz00Var10, gz00Var11, new gz00("DIRE_BOTTOM_NEXUS_TOWER", 11, 11, 81.64f, 16.12f, d310Var2), new gz00("DIRE_TOP_NEXUS_TOWER", 12, 12, 75.91f, 9.36f, d310Var2), new gz00("DIRE_BOTTOM_TIER_3", 13, 13, 87.88f, 30.16f, d310Var2), new gz00("DIRE_BOTTOM_TIER_2", 14, 14, 87.88f, 46.8f, d310Var2), new gz00("DIRE_BOTTOM_TIER_1", 15, 15, 87.88f, 62.92f, d310Var2), new gz00("DIRE_MIDDLE_TIER_3", 16, 16, 68.64f, 22.88f, d310Var2), new gz00("DIRE_MIDDLE_TIER_2", 17, 17, 59.28f, 32.24f, d310Var2), new gz00("DIRE_MIDDLE_TIER_1", 18, 18, 49.92f, 41.08f, d310Var2), new gz00("DIRE_TOP_TIER_3", 19, 19, 61.36f, 4.16f, d310Var2), new gz00("DIRE_TOP_TIER_2", 20, 20, 42.64f, 4.16f, d310Var2), new gz00("DIRE_TOP_TIER_1", 21, 21, 22.36f, 4.16f, d310Var2)};
        e = gz00VarArr;
        f = new c0o(gz00VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gz00(String str, int i, int i2, float f2, float f3, d310 d310Var) {
        super(str, i);
        this.f12156a = i2;
        this.b = f2;
        this.c = f3;
        this.d = d310Var;
    }

    public static gz00 valueOf(String str) {
        return (gz00) Enum.valueOf(gz00.class, str);
    }

    public static gz00[] values() {
        return (gz00[]) e.clone();
    }
}
