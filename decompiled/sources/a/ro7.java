package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ro7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ro7 f30823a;
    public static final ro7 b;
    public static final /* synthetic */ ro7[] c;

    static {
        ro7 ro7Var = new ro7("NORMAL", 0);
        f30823a = ro7Var;
        ro7 ro7Var2 = new ro7("ACCURACY_COMPACT", 1);
        b = ro7Var2;
        c = new ro7[]{ro7Var, ro7Var2};
    }

    public static ro7 valueOf(String str) {
        return (ro7) Enum.valueOf(ro7.class, str);
    }

    public static ro7[] values() {
        return (ro7[]) c.clone();
    }
}
