package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f5i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f5i0 f8963a;
    public static final f5i0 b;
    public static final f5i0 c;
    public static final /* synthetic */ f5i0[] d;

    static {
        f5i0 f5i0Var = new f5i0("Left", 0);
        f8963a = f5i0Var;
        f5i0 f5i0Var2 = new f5i0("Middle", 1);
        b = f5i0Var2;
        f5i0 f5i0Var3 = new f5i0("Right", 2);
        c = f5i0Var3;
        d = new f5i0[]{f5i0Var, f5i0Var2, f5i0Var3};
    }

    public static f5i0 valueOf(String str) {
        return (f5i0) Enum.valueOf(f5i0.class, str);
    }

    public static f5i0[] values() {
        return (f5i0[]) d.clone();
    }
}
