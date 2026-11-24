package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class hkv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hkv0 f13226a;
    public static final hkv0 b;
    public static final hkv0 c;
    public static final /* synthetic */ hkv0[] d;

    static {
        hkv0 hkv0Var = new hkv0("TEAM_ONE", 0);
        f13226a = hkv0Var;
        hkv0 hkv0Var2 = new hkv0("TEAM_TWO", 1);
        b = hkv0Var2;
        hkv0 hkv0Var3 = new hkv0("NONE", 2);
        c = hkv0Var3;
        d = new hkv0[]{hkv0Var, hkv0Var2, hkv0Var3};
    }

    public static hkv0 valueOf(String str) {
        return (hkv0) Enum.valueOf(hkv0.class, str);
    }

    public static hkv0[] values() {
        return (hkv0[]) d.clone();
    }
}
