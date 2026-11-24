package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h8k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h8k0 f12630a;
    public static final h8k0 b;
    public static final h8k0 c;
    public static final /* synthetic */ h8k0[] d;

    static {
        h8k0 h8k0Var = new h8k0("NEW_STAKE", 0);
        f12630a = h8k0Var;
        h8k0 h8k0Var2 = new h8k0("CREDITED_ACCOUNT", 1);
        b = h8k0Var2;
        h8k0 h8k0Var3 = new h8k0("AUTO_BET", 2);
        c = h8k0Var3;
        d = new h8k0[]{h8k0Var, h8k0Var2, h8k0Var3};
    }

    public static h8k0 valueOf(String str) {
        return (h8k0) Enum.valueOf(h8k0.class, str);
    }

    public static h8k0[] values() {
        return (h8k0[]) d.clone();
    }
}
