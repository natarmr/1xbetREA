package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j8a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j8a f16073a;
    public static final j8a b;
    public static final j8a c;
    public static final /* synthetic */ j8a[] d;

    static {
        j8a j8aVar = new j8a("PRE_CAPTURE", 0);
        f16073a = j8aVar;
        j8a j8aVar2 = new j8a("MAIN_CAPTURE", 1);
        b = j8aVar2;
        j8a j8aVar3 = new j8a("POST_CAPTURE", 2);
        c = j8aVar3;
        d = new j8a[]{j8aVar, j8aVar2, j8aVar3};
    }

    public static j8a valueOf(String str) {
        return (j8a) Enum.valueOf(j8a.class, str);
    }

    public static j8a[] values() {
        return (j8a[]) d.clone();
    }
}
