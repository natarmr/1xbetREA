package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0d f3518a;
    public static final c0d b;
    public static final c0d c;
    public static final c0d d;
    public static final c0d e;
    public static final c0d f;
    public static final /* synthetic */ c0d[] g;

    static {
        c0d c0dVar = new c0d("SAME", 0);
        f3518a = c0dVar;
        c0d c0dVar2 = new c0d("HIGHER", 1);
        b = c0dVar2;
        c0d c0dVar3 = new c0d("LOWER", 2);
        c = c0dVar3;
        c0d c0dVar4 = new c0d("BLOCKED", 3);
        d = c0dVar4;
        c0d c0dVar5 = new c0d("CHANGED_BLOCKED", 4);
        e = c0dVar5;
        c0d c0dVar6 = new c0d("NONE", 5);
        f = c0dVar6;
        g = new c0d[]{c0dVar, c0dVar2, c0dVar3, c0dVar4, c0dVar5, c0dVar6};
    }

    public static c0d valueOf(String str) {
        return (c0d) Enum.valueOf(c0d.class, str);
    }

    public static c0d[] values() {
        return (c0d[]) g.clone();
    }
}
