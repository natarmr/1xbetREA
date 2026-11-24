package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class j0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0d f15678a;
    public static final j0d b;
    public static final j0d c;
    public static final /* synthetic */ j0d[] d;

    static {
        j0d j0dVar = new j0d("DEFAULT", 0);
        f15678a = j0dVar;
        j0d j0dVar2 = new j0d("HIGHER", 1);
        b = j0dVar2;
        j0d j0dVar3 = new j0d("LOWER", 2);
        c = j0dVar3;
        d = new j0d[]{j0dVar, j0dVar2, j0dVar3};
    }

    public static j0d valueOf(String str) {
        return (j0d) Enum.valueOf(j0d.class, str);
    }

    public static j0d[] values() {
        return (j0d[]) d.clone();
    }
}
