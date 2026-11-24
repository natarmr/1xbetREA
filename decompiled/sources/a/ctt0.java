package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ctt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ctt0 f4959a;
    public static final /* synthetic */ ctt0[] b;

    static {
        ctt0 ctt0Var = new ctt0("ALL", 0);
        f4959a = ctt0Var;
        b = new ctt0[]{ctt0Var, new ctt0("REMOTE", 1), new ctt0("ACTIVE", 2)};
    }

    public static ctt0 valueOf(String str) {
        return (ctt0) Enum.valueOf(ctt0.class, str);
    }

    public static ctt0[] values() {
        return (ctt0[]) b.clone();
    }
}
