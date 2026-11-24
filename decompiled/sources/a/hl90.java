package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hl90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hl90 f13247a;
    public static final hl90 b;
    public static final hl90 c;
    public static final /* synthetic */ hl90[] d;

    static {
        hl90 hl90Var = new hl90("ACTIVATED", 0);
        f13247a = hl90Var;
        hl90 hl90Var2 = new hl90("NOT_BOUND", 1);
        b = hl90Var2;
        hl90 hl90Var3 = new hl90("NOT_ACTIVATED", 2);
        c = hl90Var3;
        d = new hl90[]{hl90Var, hl90Var2, hl90Var3};
    }

    public static hl90 valueOf(String str) {
        return (hl90) Enum.valueOf(hl90.class, str);
    }

    public static hl90[] values() {
        return (hl90[]) d.clone();
    }
}
