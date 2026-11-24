package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wz9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wz9 f40013a;
    public static final /* synthetic */ wz9[] b;

    static {
        wz9 wz9Var = new wz9("AT_LEAST", 0);
        f40013a = wz9Var;
        b = new wz9[]{wz9Var, new wz9("EXACT", 1)};
    }

    public static wz9 valueOf(String str) {
        return (wz9) Enum.valueOf(wz9.class, str);
    }

    public static wz9[] values() {
        return (wz9[]) b.clone();
    }
}
