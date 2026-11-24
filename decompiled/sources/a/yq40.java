package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class yq40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yq40 f43059a;
    public static final yq40 b;
    public static final /* synthetic */ yq40[] c;

    static {
        yq40 yq40Var = new yq40("INACTIVE", 0);
        f43059a = yq40Var;
        yq40 yq40Var2 = new yq40("ACTIVE", 1);
        b = yq40Var2;
        c = new yq40[]{yq40Var, yq40Var2};
    }

    public static yq40 valueOf(String str) {
        return (yq40) Enum.valueOf(yq40.class, str);
    }

    public static yq40[] values() {
        return (yq40[]) c.clone();
    }
}
