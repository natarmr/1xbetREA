package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wzi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wzi f40021a;
    public static final wzi b;
    public static final /* synthetic */ wzi[] c;

    static {
        wzi wziVar = new wzi("TABLE_RESULT", 0);
        f40021a = wziVar;
        wzi wziVar2 = new wzi("PRIZE", 1);
        b = wziVar2;
        c = new wzi[]{wziVar, wziVar2, new wzi("WINNERS", 2)};
    }

    public static wzi valueOf(String str) {
        return (wzi) Enum.valueOf(wzi.class, str);
    }

    public static wzi[] values() {
        return (wzi[]) c.clone();
    }
}
