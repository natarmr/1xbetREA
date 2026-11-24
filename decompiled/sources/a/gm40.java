package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gm40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final evz f11524a;
    public static final gm40 b;
    public static final gm40 c;
    public static final gm40 d;
    public static final gm40 e;
    public static final /* synthetic */ gm40[] f;

    static {
        gm40 gm40Var = new gm40("FINAL", 0);
        b = gm40Var;
        gm40 gm40Var2 = new gm40("SEALED", 1);
        c = gm40Var2;
        gm40 gm40Var3 = new gm40("OPEN", 2);
        d = gm40Var3;
        gm40 gm40Var4 = new gm40("ABSTRACT", 3);
        e = gm40Var4;
        f = new gm40[]{gm40Var, gm40Var2, gm40Var3, gm40Var4};
        f11524a = new evz();
    }

    public static gm40 valueOf(String str) {
        return (gm40) Enum.valueOf(gm40.class, str);
    }

    public static gm40[] values() {
        return (gm40[]) f.clone();
    }
}
