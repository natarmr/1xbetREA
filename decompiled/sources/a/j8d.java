package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j8d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j8d f16077a;
    public static final /* synthetic */ j8d[] b;

    static {
        j8d j8dVar = new j8d("SELECT_VARIANT", 0);
        f16077a = j8dVar;
        b = new j8d[]{j8dVar};
    }

    public static j8d valueOf(String str) {
        return (j8d) Enum.valueOf(j8d.class, str);
    }

    public static j8d[] values() {
        return (j8d[]) b.clone();
    }
}
