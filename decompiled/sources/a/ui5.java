package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ui5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ui5 f35713a;
    public static final ui5 b;
    public static final ui5 c;
    public static final ui5 d;
    public static final ui5 e;
    public static final /* synthetic */ ui5[] f;

    static {
        ui5 ui5Var = new ui5("INITIAL", 0);
        f35713a = ui5Var;
        ui5 ui5Var2 = new ui5("LOADING", 1);
        b = ui5Var2;
        ui5 ui5Var3 = new ui5("ALL_DATA_ERROR", 2);
        c = ui5Var3;
        ui5 ui5Var4 = new ui5("TRANSACTIONS_HISTORY_ERROR", 3);
        d = ui5Var4;
        ui5 ui5Var5 = new ui5("DATA_LOADED", 4);
        e = ui5Var5;
        f = new ui5[]{ui5Var, ui5Var2, ui5Var3, ui5Var4, ui5Var5};
    }

    public static ui5 valueOf(String str) {
        return (ui5) Enum.valueOf(ui5.class, str);
    }

    public static ui5[] values() {
        return (ui5[]) f.clone();
    }
}
