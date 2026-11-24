package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j31 implements jvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j31 f15808a;
    public static final j31 b;
    public static final /* synthetic */ j31[] c;

    /* JADX INFO: Fake field, exist only in values array */
    j31 EF0;

    static {
        j31 j31Var = new j31("NONE", 0);
        j31 j31Var2 = new j31("ALL", 1);
        j31 j31Var3 = new j31("REAL_MONEY", 2);
        f15808a = j31Var3;
        j31 j31Var4 = new j31("FREE_SPINS", 3);
        b = j31Var4;
        c = new j31[]{j31Var, j31Var2, j31Var3, j31Var4};
    }

    public static j31 valueOf(String str) {
        return (j31) Enum.valueOf(j31.class, str);
    }

    public static j31[] values() {
        return (j31[]) c.clone();
    }
}
