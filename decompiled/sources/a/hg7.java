package a;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hg7 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hg7 f13004a;
    public static final hg7 b;
    public static final hg7 c;
    public static final /* synthetic */ hg7[] d;

    static {
        hg7 hg7Var = new hg7("SIMPLE", 0);
        f13004a = hg7Var;
        hg7 hg7Var2 = new hg7("PROMO", 1);
        b = hg7Var2;
        hg7 hg7Var3 = new hg7("AUTO", 2);
        c = hg7Var3;
        d = new hg7[]{hg7Var, hg7Var2, hg7Var3};
    }

    public static hg7 valueOf(String str) {
        return (hg7) Enum.valueOf(hg7.class, str);
    }

    public static hg7[] values() {
        return (hg7[]) d.clone();
    }
}
