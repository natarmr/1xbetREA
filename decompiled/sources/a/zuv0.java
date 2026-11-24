package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class zuv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zuv0 f45028a;
    public static final zuv0 b;
    public static final zuv0 c;
    public static final /* synthetic */ zuv0[] d;

    static {
        zuv0 zuv0Var = new zuv0("DismissSheetAndKeyboard", 0);
        f45028a = zuv0Var;
        zuv0 zuv0Var2 = new zuv0("SettleRestAndCloseKeyboard", 1);
        b = zuv0Var2;
        zuv0 zuv0Var3 = new zuv0("ReturnToLiftedPosition", 2);
        c = zuv0Var3;
        d = new zuv0[]{zuv0Var, zuv0Var2, zuv0Var3};
    }

    public static zuv0 valueOf(String str) {
        return (zuv0) Enum.valueOf(zuv0.class, str);
    }

    public static zuv0[] values() {
        return (zuv0[]) d.clone();
    }
}
