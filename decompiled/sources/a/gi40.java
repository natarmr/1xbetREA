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
/* JADX INFO: loaded from: classes4.dex */
public final class gi40 {
    public static final /* synthetic */ gi40[] e;
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fi40 f11327a;
    public final byte b;
    public final float c;
    public final float d;

    /* JADX INFO: Fake field, exist only in values array */
    gi40 EF0;

    static {
        fi40 fi40Var = fi40.b;
        gi40 gi40Var = new gi40("RED_TOP_TIER_1", 0, fi40Var, 0, 0.2826087f, 0.054347824f);
        gi40 gi40Var2 = new gi40("RED_TOP_TIER_2", 1, fi40Var, 1, 0.54347825f, 0.054347824f);
        gi40 gi40Var3 = new gi40("RED_TOP_INHIBITOR", 2, fi40Var, 2, 0.73913044f, 0.054347824f);
        gi40 gi40Var4 = new gi40("RED_MID_TIER_1", 3, fi40Var, 3, 0.6086956f, 0.4293478f);
        gi40 gi40Var5 = new gi40("RED_MID_TIER_2", 4, fi40Var, 4, 0.7173913f, 0.3206522f);
        gi40 gi40Var6 = new gi40("RED_MID_INHIBITOR", 5, fi40Var, 5, 0.8043478f, 0.21195652f);
        gi40 gi40Var7 = new gi40("RED_BOTTOM_TIER_1", 6, fi40Var, 6, 0.9456522f, 0.75f);
        gi40 gi40Var8 = new gi40("RED_BOTTOM_TIER_2", 7, fi40Var, 7, 0.9456522f, 0.54347825f);
        gi40 gi40Var9 = new gi40("RED_BOTTOM_INHIBITOR", 8, fi40Var, 8, 0.9456522f, 0.2826087f);
        fi40 fi40Var2 = fi40.f9571a;
        gi40[] gi40VarArr = {gi40Var, gi40Var2, gi40Var3, gi40Var4, gi40Var5, gi40Var6, gi40Var7, gi40Var8, gi40Var9, new gi40("BLUE_BOTTOM_TIER_1", 9, fi40Var2, 9, 0.73913044f, 0.9456522f), new gi40("BLUE_BOTTOM_TIER_2", 10, fi40Var2, 10, 0.45652175f, 0.9456522f), new gi40("BLUE_BOTTOM_INHIBITOR", 11, fi40Var2, 11, 0.26086956f, 0.9456522f), new gi40("BLUE_MID_TIER_1", 12, fi40Var2, 12, 0.39130434f, 0.59782606f), new gi40("BLUE_MID_TIER_2", 13, fi40Var2, 13, 0.2826087f, 0.70108694f), new gi40("BLUE_MID_INHIBITOR", 14, fi40Var2, 14, 0.19565217f, 0.8097826f), new gi40("BLUE_TOP_TIER_1", 15, fi40Var2, 15, 0.054347824f, 0.2826087f), new gi40("BLUE_TOP_TIER_2", 16, fi40Var2, 16, 0.054347824f, 0.48913044f), new gi40("BLUE_TOP_INHIBITOR", 17, fi40Var2, 17, 0.054347824f, 0.75f)};
        e = gi40VarArr;
        f = new c0o(gi40VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gi40(String str, int i, fi40 fi40Var, int i2, float f2, float f3) {
        super(str, i);
        this.f11327a = fi40Var;
        this.b = i2;
        this.c = f2;
        this.d = f3;
    }

    public static gi40 valueOf(String str) {
        return (gi40) Enum.valueOf(gi40.class, str);
    }

    public static gi40[] values() {
        return (gi40[]) e.clone();
    }
}
