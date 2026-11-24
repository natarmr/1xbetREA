package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j7h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j7h0 f16040a;
    public static final j7h0 b;
    public static final j7h0 c;
    public static final /* synthetic */ j7h0[] d;

    static {
        j7h0 j7h0Var = new j7h0("WON", 0);
        f16040a = j7h0Var;
        j7h0 j7h0Var2 = new j7h0("LOSE", 1);
        b = j7h0Var2;
        j7h0 j7h0Var3 = new j7h0("EMPTY", 2);
        c = j7h0Var3;
        d = new j7h0[]{j7h0Var, j7h0Var2, j7h0Var3};
    }

    public static j7h0 valueOf(String str) {
        return (j7h0) Enum.valueOf(j7h0.class, str);
    }

    public static j7h0[] values() {
        return (j7h0[]) d.clone();
    }
}
