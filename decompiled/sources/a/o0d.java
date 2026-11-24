package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0d f24418a;
    public static final o0d b;
    public static final /* synthetic */ o0d[] c;

    static {
        o0d o0dVar = new o0d("INVISIBLE", 0);
        f24418a = o0dVar;
        o0d o0dVar2 = new o0d("VISIBLE", 1);
        b = o0dVar2;
        c = new o0d[]{o0dVar, o0dVar2};
    }

    public static o0d valueOf(String str) {
        return (o0d) Enum.valueOf(o0d.class, str);
    }

    public static o0d[] values() {
        return (o0d[]) c.clone();
    }
}
