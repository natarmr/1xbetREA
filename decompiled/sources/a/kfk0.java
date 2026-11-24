package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kfk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kfk0 f18200a;
    public static final kfk0 b;
    public static final /* synthetic */ kfk0[] c;

    static {
        kfk0 kfk0Var = new kfk0("Expanded", 0);
        f18200a = kfk0Var;
        kfk0 kfk0Var2 = new kfk0("Collapsed", 1);
        b = kfk0Var2;
        c = new kfk0[]{kfk0Var, kfk0Var2};
    }

    public static kfk0 valueOf(String str) {
        return (kfk0) Enum.valueOf(kfk0.class, str);
    }

    public static kfk0[] values() {
        return (kfk0[]) c.clone();
    }
}
