package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c01 f3501a;
    public static final c01 b;
    public static final c01 c;
    public static final c01 d;
    public static final c01 e;
    public static final /* synthetic */ c01[] f;

    static {
        c01 c01Var = new c01("BACKGROUND_PICTURE_STYLE", 0);
        f3501a = c01Var;
        c01 c01Var2 = new c01("BACKGROUND_ILLUSTRATION_STYLE", 1);
        b = c01Var2;
        c01 c01Var3 = new c01("ICON_STYLE", 2);
        c = c01Var3;
        c01 c01Var4 = new c01("TICKET_PRIMARY_STYLE", 3);
        d = c01Var4;
        c01 c01Var5 = new c01("TICKET_SECONDARY_STYLE", 4);
        e = c01Var5;
        f = new c01[]{c01Var, c01Var2, c01Var3, c01Var4, c01Var5};
    }

    public static c01 valueOf(String str) {
        return (c01) Enum.valueOf(c01.class, str);
    }

    public static c01[] values() {
        return (c01[]) f.clone();
    }
}
