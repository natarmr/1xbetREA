package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w05 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w05 f38333a;
    public static final w05 b;
    public static final w05 c;
    public static final w05 d;
    public static final w05 e;
    public static final /* synthetic */ w05[] f;

    static {
        w05 w05Var = new w05("AUTOSPIN_ENDLESS", 0);
        f38333a = w05Var;
        w05 w05Var2 = new w05("AUTOSPIN_5", 1);
        b = w05Var2;
        w05 w05Var3 = new w05("AUTOSPIN_10", 2);
        c = w05Var3;
        w05 w05Var4 = new w05("AUTOSPIN_25", 3);
        d = w05Var4;
        w05 w05Var5 = new w05("AUTOSPIN_50", 4);
        e = w05Var5;
        f = new w05[]{w05Var, w05Var2, w05Var3, w05Var4, w05Var5};
    }

    public static w05 valueOf(String str) {
        return (w05) Enum.valueOf(w05.class, str);
    }

    public static w05[] values() {
        return (w05[]) f.clone();
    }
}
