package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tjv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final svs0 f34069a;
    public static final tjv0 b;
    public static final tjv0 c;
    public static final tjv0 d;
    public static final /* synthetic */ tjv0[] e;

    static {
        tjv0 tjv0Var = new tjv0("Compact", 0);
        b = tjv0Var;
        tjv0 tjv0Var2 = new tjv0("Medium", 1);
        c = tjv0Var2;
        tjv0 tjv0Var3 = new tjv0("Expanded", 2);
        d = tjv0Var3;
        e = new tjv0[]{tjv0Var, tjv0Var2, tjv0Var3};
        f34069a = new svs0((byte) 16);
    }

    public static tjv0 valueOf(String str) {
        return (tjv0) Enum.valueOf(tjv0.class, str);
    }

    public static tjv0[] values() {
        return (tjv0[]) e.clone();
    }
}
