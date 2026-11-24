package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ton0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ton0 f34294a;
    public static final ton0 b;
    public static final ton0 c;
    public static final ton0 d;
    public static final /* synthetic */ ton0[] e;

    static {
        ton0 ton0Var = new ton0("LEFT", 0);
        f34294a = ton0Var;
        ton0 ton0Var2 = new ton0("TOP", 1);
        b = ton0Var2;
        ton0 ton0Var3 = new ton0("RIGHT", 2);
        c = ton0Var3;
        ton0 ton0Var4 = new ton0("BOTTOM", 3);
        d = ton0Var4;
        e = new ton0[]{ton0Var, ton0Var2, ton0Var3, ton0Var4};
    }

    public static ton0 valueOf(String str) {
        return (ton0) Enum.valueOf(ton0.class, str);
    }

    public static ton0[] values() {
        return (ton0[]) e.clone();
    }
}
