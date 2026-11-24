package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h5d f12474a;
    public static final h5d b;
    public static final h5d c;
    public static final /* synthetic */ h5d[] d;

    static {
        h5d h5dVar = new h5d("NORMAL", 0);
        f12474a = h5dVar;
        h5d h5dVar2 = new h5d("GREEN", 1);
        b = h5dVar2;
        h5d h5dVar3 = new h5d("RED", 2);
        c = h5dVar3;
        d = new h5d[]{h5dVar, h5dVar2, h5dVar3};
    }

    public static h5d valueOf(String str) {
        return (h5d) Enum.valueOf(h5d.class, str);
    }

    public static h5d[] values() {
        return (h5d[]) d.clone();
    }
}
