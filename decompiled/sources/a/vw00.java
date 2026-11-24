package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class vw00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vw00 f38127a;
    public static final vw00 b;
    public static final vw00 c;
    public static final /* synthetic */ vw00[] d;

    static {
        vw00 vw00Var = new vw00("NATIVE", 0);
        f38127a = vw00Var;
        vw00 vw00Var2 = new vw00("CHROME_TAB", 1);
        b = vw00Var2;
        vw00 vw00Var3 = new vw00("WEBVIEW", 2);
        c = vw00Var3;
        d = new vw00[]{vw00Var, vw00Var2, vw00Var3};
    }

    public static vw00 valueOf(String str) {
        return (vw00) Enum.valueOf(vw00.class, str);
    }

    public static vw00[] values() {
        return (vw00[]) d.clone();
    }
}
