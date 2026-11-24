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
public final class fz00 {
    public static final /* synthetic */ fz00[] e;
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f10385a;
    public final float b;
    public final float c;
    public final d310 d;

    /* JADX INFO: Fake field, exist only in values array */
    fz00 EF0;

    static {
        d310 d310Var = d310.RADIANT;
        fz00 fz00Var = new fz00("RADIANT_BOTTOM", 0, 0, 23.92f, 86.32f, d310Var);
        fz00 fz00Var2 = new fz00("RADIANT_MIDDLE", 1, 1, 18.72f, 72.28f, d310Var);
        fz00 fz00Var3 = new fz00("RADIANT_TOP", 2, 2, 4.16f, 69.16f, d310Var);
        d310 d310Var2 = d310.DIRE;
        fz00[] fz00VarArr = {fz00Var, fz00Var2, fz00Var3, new fz00("DIRE_BOTTOM", 3, 3, 87.88f, 21.32f, d310Var2), new fz00("DIRE_MIDDLE", 4, 4, 74.36f, 17.16f, d310Var2), new fz00("DIRE_TOP", 5, 5, 67.6f, 4.68f, d310Var2)};
        e = fz00VarArr;
        f = new c0o(fz00VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fz00(String str, int i, int i2, float f2, float f3, d310 d310Var) {
        super(str, i);
        this.f10385a = i2;
        this.b = f2;
        this.c = f3;
        this.d = d310Var;
    }

    public static fz00 valueOf(String str) {
        return (fz00) Enum.valueOf(fz00.class, str);
    }

    public static fz00[] values() {
        return (fz00[]) e.clone();
    }
}
