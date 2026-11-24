package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yt40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yt40 f43200a;
    public static final yt40 b;
    public static final yt40 c;
    public static final yt40 d;
    public static final /* synthetic */ yt40[] e;

    static {
        yt40 yt40Var = new yt40("DefaultSpatial", 0);
        f43200a = yt40Var;
        yt40 yt40Var2 = new yt40("FastSpatial", 1);
        b = yt40Var2;
        yt40 yt40Var3 = new yt40("SlowSpatial", 2);
        yt40 yt40Var4 = new yt40("DefaultEffects", 3);
        c = yt40Var4;
        yt40 yt40Var5 = new yt40("FastEffects", 4);
        d = yt40Var5;
        e = new yt40[]{yt40Var, yt40Var2, yt40Var3, yt40Var4, yt40Var5, new yt40("SlowEffects", 5)};
    }

    public static yt40 valueOf(String str) {
        return (yt40) Enum.valueOf(yt40.class, str);
    }

    public static yt40[] values() {
        return (yt40[]) e.clone();
    }
}
