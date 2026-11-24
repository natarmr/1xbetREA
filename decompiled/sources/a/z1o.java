package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class z1o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1o f43631a;
    public static final z1o b;
    public static final /* synthetic */ z1o[] c;

    static {
        z1o z1oVar = new z1o("EMPTY_CONTENT", 0);
        f43631a = z1oVar;
        z1o z1oVar2 = new z1o("ERROR_CONTENT", 1);
        b = z1oVar2;
        c = new z1o[]{z1oVar, z1oVar2};
    }

    public static z1o valueOf(String str) {
        return (z1o) Enum.valueOf(z1o.class, str);
    }

    public static z1o[] values() {
        return (z1o[]) c.clone();
    }
}
