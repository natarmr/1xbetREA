package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0d f17460a;
    public static final k0d b;
    public static final k0d c;
    public static final k0d d;
    public static final /* synthetic */ k0d[] e;

    static {
        k0d k0dVar = new k0d("DEFAULT", 0);
        f17460a = k0dVar;
        k0d k0dVar2 = new k0d("BLOCKED", 1);
        b = k0dVar2;
        k0d k0dVar3 = new k0d("HIGHER", 2);
        c = k0dVar3;
        k0d k0dVar4 = new k0d("LOWER", 3);
        d = k0dVar4;
        e = new k0d[]{k0dVar, k0dVar2, k0dVar3, k0dVar4};
    }

    public static k0d valueOf(String str) {
        return (k0d) Enum.valueOf(k0d.class, str);
    }

    public static k0d[] values() {
        return (k0d[]) e.clone();
    }
}
