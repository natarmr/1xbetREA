package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class pic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pic f27036a;
    public static final pic b;
    public static final /* synthetic */ pic[] c;

    static {
        pic picVar = new pic("SEASON", 0);
        f27036a = picVar;
        pic picVar2 = new pic("SURFACE", 1);
        b = picVar2;
        c = new pic[]{picVar, picVar2};
    }

    public static pic valueOf(String str) {
        return (pic) Enum.valueOf(pic.class, str);
    }

    public static pic[] values() {
        return (pic[]) c.clone();
    }
}
