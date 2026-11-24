package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cc0 f4086a;
    public static final cc0 b;
    public static final cc0 c;
    public static final cc0 d;
    public static final cc0 e;
    public static final /* synthetic */ cc0[] f;

    static {
        cc0 cc0Var = new cc0("Line", 0);
        f4086a = cc0Var;
        cc0 cc0Var2 = new cc0("BackgroundCompact", 1);
        b = cc0Var2;
        cc0 cc0Var3 = new cc0("BackgroundLine", 2);
        c = cc0Var3;
        cc0 cc0Var4 = new cc0("CardCompat", 3);
        d = cc0Var4;
        cc0 cc0Var5 = new cc0("CardLine", 4);
        e = cc0Var5;
        f = new cc0[]{cc0Var, cc0Var2, cc0Var3, cc0Var4, cc0Var5};
    }

    public static cc0 valueOf(String str) {
        return (cc0) Enum.valueOf(cc0.class, str);
    }

    public static cc0[] values() {
        return (cc0[]) f.clone();
    }
}
