package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wh30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wh30 f39147a;
    public static final wh30 b;
    public static final wh30 c;
    public static final wh30 d;
    public static final /* synthetic */ wh30[] e;

    static {
        wh30 wh30Var = new wh30("NONE", 0);
        f39147a = wh30Var;
        wh30 wh30Var2 = new wh30("START", 1);
        b = wh30Var2;
        wh30 wh30Var3 = new wh30("END", 2);
        c = wh30Var3;
        wh30 wh30Var4 = new wh30("BOTH", 3);
        d = wh30Var4;
        e = new wh30[]{wh30Var, wh30Var2, wh30Var3, wh30Var4};
    }

    public static wh30 valueOf(String str) {
        return (wh30) Enum.valueOf(wh30.class, str);
    }

    public static wh30[] values() {
        return (wh30[]) e.clone();
    }
}
