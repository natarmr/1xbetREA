package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class gyr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gyr0 f12145a;
    public static final gyr0 b;
    public static final gyr0 c;
    public static final /* synthetic */ gyr0[] d;

    static {
        gyr0 gyr0Var = new gyr0("TillStart", 0);
        f12145a = gyr0Var;
        gyr0 gyr0Var2 = new gyr0("TillEnd", 1);
        b = gyr0Var2;
        gyr0 gyr0Var3 = new gyr0("Finished", 2);
        c = gyr0Var3;
        d = new gyr0[]{gyr0Var, gyr0Var2, gyr0Var3};
    }

    public static gyr0 valueOf(String str) {
        return (gyr0) Enum.valueOf(gyr0.class, str);
    }

    public static gyr0[] values() {
        return (gyr0[]) d.clone();
    }
}
