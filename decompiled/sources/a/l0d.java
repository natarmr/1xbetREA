package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class l0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0d f19195a;
    public static final l0d b;
    public static final l0d c;
    public static final l0d d;
    public static final l0d e;
    public static final l0d f;
    public static final /* synthetic */ l0d[] g;

    static {
        l0d l0dVar = new l0d("SAME", 0);
        f19195a = l0dVar;
        l0d l0dVar2 = new l0d("HIGHER", 1);
        b = l0dVar2;
        l0d l0dVar3 = new l0d("LOWER", 2);
        c = l0dVar3;
        l0d l0dVar4 = new l0d("NO_COEF", 3);
        d = l0dVar4;
        l0d l0dVar5 = new l0d("BLOCKED", 4);
        e = l0dVar5;
        l0d l0dVar6 = new l0d("FIN_BLOCKED", 5);
        f = l0dVar6;
        g = new l0d[]{l0dVar, l0dVar2, l0dVar3, l0dVar4, l0dVar5, l0dVar6};
    }

    public static l0d valueOf(String str) {
        return (l0d) Enum.valueOf(l0d.class, str);
    }

    public static l0d[] values() {
        return (l0d[]) g.clone();
    }
}
