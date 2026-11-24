package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class zkp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zkp0 f44544a;
    public static final zkp0 b;
    public static final zkp0 c;
    public static final /* synthetic */ zkp0[] d;

    static {
        zkp0 zkp0Var = new zkp0("FOOTBALL", 0);
        f44544a = zkp0Var;
        zkp0 zkp0Var2 = new zkp0("HOCKEY", 1);
        b = zkp0Var2;
        zkp0 zkp0Var3 = new zkp0("OTHER", 2);
        c = zkp0Var3;
        d = new zkp0[]{zkp0Var, zkp0Var2, zkp0Var3};
    }

    public static zkp0 valueOf(String str) {
        return (zkp0) Enum.valueOf(zkp0.class, str);
    }

    public static zkp0[] values() {
        return (zkp0[]) d.clone();
    }
}
