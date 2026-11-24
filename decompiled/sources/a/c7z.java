package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c7z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c7z f3886a;
    public static final c7z b;
    public static final c7z c;
    public static final /* synthetic */ c7z[] d;

    static {
        c7z c7zVar = new c7z("InMeasureBlock", 0);
        f3886a = c7zVar;
        c7z c7zVar2 = new c7z("InLayoutBlock", 1);
        b = c7zVar2;
        c7z c7zVar3 = new c7z("NotUsed", 2);
        c = c7zVar3;
        d = new c7z[]{c7zVar, c7zVar2, c7zVar3};
    }

    public static c7z valueOf(String str) {
        return (c7z) Enum.valueOf(c7z.class, str);
    }

    public static c7z[] values() {
        return (c7z[]) d.clone();
    }
}
