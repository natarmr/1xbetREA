package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fi40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fi40 f9571a;
    public static final fi40 b;
    public static final /* synthetic */ fi40[] c;

    static {
        fi40 fi40Var = new fi40("BLUE", 0);
        f9571a = fi40Var;
        fi40 fi40Var2 = new fi40("RED", 1);
        b = fi40Var2;
        c = new fi40[]{fi40Var, fi40Var2};
    }

    public static fi40 valueOf(String str) {
        return (fi40) Enum.valueOf(fi40.class, str);
    }

    public static fi40[] values() {
        return (fi40[]) c.clone();
    }
}
