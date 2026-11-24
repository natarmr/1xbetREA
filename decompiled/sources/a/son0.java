package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class son0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final son0 f32552a;
    public static final son0 b;
    public static final son0 c;
    public static final /* synthetic */ son0[] d;

    static {
        son0 son0Var = new son0("EDGE", 0);
        f32552a = son0Var;
        son0 son0Var2 = new son0("VERTICAL", 1);
        b = son0Var2;
        son0 son0Var3 = new son0("HORIZONTAL", 2);
        c = son0Var3;
        d = new son0[]{son0Var, son0Var2, son0Var3};
    }

    public static son0 valueOf(String str) {
        return (son0) Enum.valueOf(son0.class, str);
    }

    public static son0[] values() {
        return (son0[]) d.clone();
    }
}
