package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vpv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vpv0 f37827a;
    public static final vpv0 b;
    public static final vpv0 c;
    public static final /* synthetic */ vpv0[] d;

    static {
        vpv0 vpv0Var = new vpv0("ENABLED", 0);
        f37827a = vpv0Var;
        vpv0 vpv0Var2 = new vpv0("UNDER_MAINTENANCE", 1);
        b = vpv0Var2;
        vpv0 vpv0Var3 = new vpv0("DISABLED", 2);
        c = vpv0Var3;
        d = new vpv0[]{vpv0Var, vpv0Var2, vpv0Var3};
    }

    public static vpv0 valueOf(String str) {
        return (vpv0) Enum.valueOf(vpv0.class, str);
    }

    public static vpv0[] values() {
        return (vpv0[]) d.clone();
    }
}
