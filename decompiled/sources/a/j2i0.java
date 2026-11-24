package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j2i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2i0 f15781a;
    public static final j2i0 b;
    public static final /* synthetic */ j2i0[] c;

    static {
        j2i0 j2i0Var = new j2i0("START_DATE", 0);
        f15781a = j2i0Var;
        j2i0 j2i0Var2 = new j2i0("END_DATE", 1);
        b = j2i0Var2;
        c = new j2i0[]{j2i0Var, j2i0Var2};
    }

    public static j2i0 valueOf(String str) {
        return (j2i0) Enum.valueOf(j2i0.class, str);
    }

    public static j2i0[] values() {
        return (j2i0[]) c.clone();
    }
}
