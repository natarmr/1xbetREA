package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class bpn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bpn0 f2993a;
    public static final bpn0 b;
    public static final /* synthetic */ bpn0[] c;

    static {
        bpn0 bpn0Var = new bpn0("MANUAL", 0);
        f2993a = bpn0Var;
        bpn0 bpn0Var2 = new bpn0("AUTO", 1);
        b = bpn0Var2;
        c = new bpn0[]{bpn0Var, bpn0Var2};
    }

    public static bpn0 valueOf(String str) {
        return (bpn0) Enum.valueOf(bpn0.class, str);
    }

    public static bpn0[] values() {
        return (bpn0[]) c.clone();
    }
}
