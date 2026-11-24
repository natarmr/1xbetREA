package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ur8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ur8 f36151a;
    public static final ur8 b;
    public static final /* synthetic */ ur8[] c;

    static {
        ur8 ur8Var = new ur8("SINGLE_VIEW", 0);
        f36151a = ur8Var;
        ur8 ur8Var2 = new ur8("FULL_SIZE", 1);
        b = ur8Var2;
        c = new ur8[]{ur8Var, ur8Var2};
    }

    public static ur8 valueOf(String str) {
        return (ur8) Enum.valueOf(ur8.class, str);
    }

    public static ur8[] values() {
        return (ur8[]) c.clone();
    }
}
