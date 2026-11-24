package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class xx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xx30 f41640a;
    public static final xx30 b;
    public static final xx30 c;
    public static final xx30 d;
    public static final /* synthetic */ xx30[] e;

    static {
        xx30 xx30Var = new xx30("Single", 0);
        f41640a = xx30Var;
        xx30 xx30Var2 = new xx30("Top", 1);
        b = xx30Var2;
        xx30 xx30Var3 = new xx30("Bottom", 2);
        c = xx30Var3;
        xx30 xx30Var4 = new xx30("Middle", 3);
        d = xx30Var4;
        e = new xx30[]{xx30Var, xx30Var2, xx30Var3, xx30Var4};
    }

    public static xx30 valueOf(String str) {
        return (xx30) Enum.valueOf(xx30.class, str);
    }

    public static xx30[] values() {
        return (xx30[]) e.clone();
    }
}
