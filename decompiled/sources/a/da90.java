package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class da90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final da90 f5737a;
    public static final da90 b;
    public static final da90 c;
    public static final /* synthetic */ da90[] d;

    static {
        da90 da90Var = new da90("Success", 0);
        f5737a = da90Var;
        da90 da90Var2 = new da90("Warning", 1);
        b = da90Var2;
        da90 da90Var3 = new da90("Info", 2);
        c = da90Var3;
        d = new da90[]{da90Var, da90Var2, da90Var3};
    }

    public static da90 valueOf(String str) {
        return (da90) Enum.valueOf(da90.class, str);
    }

    public static da90[] values() {
        return (da90[]) d.clone();
    }
}
