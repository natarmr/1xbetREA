package a;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sys0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sys0 f33037a;
    public static final sys0 b;
    public static final sys0 c;
    public static final /* synthetic */ sys0[] d;

    static {
        sys0 sys0Var = new sys0("BET_HISTORY", 0);
        f33037a = sys0Var;
        sys0 sys0Var2 = new sys0("BET_INFO", 1);
        b = sys0Var2;
        sys0 sys0Var3 = new sys0("BET_CHAMP_HISTORY", 2);
        c = sys0Var3;
        d = new sys0[]{sys0Var, sys0Var2, sys0Var3};
    }

    public static sys0 valueOf(String str) {
        return (sys0) Enum.valueOf(sys0.class, str);
    }

    public static sys0[] values() {
        return (sys0[]) d.clone();
    }
}
