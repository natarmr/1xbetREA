package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wez f39042a;
    public static final wez b;
    public static final /* synthetic */ wez[] c;

    /* JADX INFO: Fake field, exist only in values array */
    wez EF0;

    static {
        wez wezVar = new wez("SYNCHRONIZED", 0);
        wez wezVar2 = new wez("PUBLICATION", 1);
        f39042a = wezVar2;
        wez wezVar3 = new wez("NONE", 2);
        b = wezVar3;
        c = new wez[]{wezVar, wezVar2, wezVar3};
    }

    public static wez valueOf(String str) {
        return (wez) Enum.valueOf(wez.class, str);
    }

    public static wez[] values() {
        return (wez[]) c.clone();
    }
}
