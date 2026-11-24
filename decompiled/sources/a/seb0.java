package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class seb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final seb0 f32071a;
    public static final seb0 b;
    public static final seb0 c;
    public static final seb0 d;
    public static final /* synthetic */ seb0[] e;

    static {
        seb0 seb0Var = new seb0("None", 0);
        f32071a = seb0Var;
        seb0 seb0Var2 = new seb0("DefaultError", 1);
        b = seb0Var2;
        seb0 seb0Var3 = new seb0("PreviewError", 2);
        c = seb0Var3;
        seb0 seb0Var4 = new seb0("UnderMaintenance", 3);
        d = seb0Var4;
        e = new seb0[]{seb0Var, seb0Var2, seb0Var3, seb0Var4};
    }

    public static seb0 valueOf(String str) {
        return (seb0) Enum.valueOf(seb0.class, str);
    }

    public static seb0[] values() {
        return (seb0[]) e.clone();
    }
}
