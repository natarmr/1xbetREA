package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wyl f39978a;
    public static final wyl b;
    public static final /* synthetic */ wyl[] c;

    static {
        wyl wylVar = new wyl("THEME", 0);
        f39978a = wylVar;
        wyl wylVar2 = new wyl("OVERLAY", 1);
        b = wylVar2;
        c = new wyl[]{wylVar, wylVar2};
    }

    public static wyl valueOf(String str) {
        return (wyl) Enum.valueOf(wyl.class, str);
    }

    public static wyl[] values() {
        return (wyl[]) c.clone();
    }
}
