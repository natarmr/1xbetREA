package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s7z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7z f31776a;
    public static final /* synthetic */ s7z[] b;

    static {
        s7z s7zVar = new s7z("Horizontal", 0);
        f31776a = s7zVar;
        b = new s7z[]{s7zVar, new s7z("Vertical", 1)};
    }

    public static s7z valueOf(String str) {
        return (s7z) Enum.valueOf(s7z.class, str);
    }

    public static s7z[] values() {
        return (s7z[]) b.clone();
    }
}
