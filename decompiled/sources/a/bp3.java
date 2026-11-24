package a;

import android.content.Context;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class bp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bp3 f2960a;
    public static final bp3 b;
    public static final bp3 c;
    public static final /* synthetic */ bp3[] d;

    static {
        bp3 bp3Var = new bp3("LIGHT", 0);
        f2960a = bp3Var;
        bp3 bp3Var2 = new bp3("DARK", 1);
        b = bp3Var2;
        bp3 bp3Var3 = new bp3("THEME", 2);
        c = bp3Var3;
        d = new bp3[]{bp3Var, bp3Var2, bp3Var3};
    }

    public static bp3 valueOf(String str) {
        return (bp3) Enum.valueOf(bp3.class, str);
    }

    public static bp3[] values() {
        return (bp3[]) d.clone();
    }

    public final boolean a(Context context) {
        int iOrdinal = ordinal();
        return iOrdinal == 0 || !(iOrdinal == 1 || qem0.r(context));
    }
}
