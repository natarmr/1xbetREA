package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class uhq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uhq0 f35695a;
    public static final uhq0 b;
    public static final uhq0 c;
    public static final /* synthetic */ uhq0[] d;

    static {
        uhq0 uhq0Var = new uhq0("AM", 0);
        f35695a = uhq0Var;
        uhq0 uhq0Var2 = new uhq0("PM", 1);
        b = uhq0Var2;
        uhq0 uhq0Var3 = new uhq0("TWENTY_FOUR", 2);
        c = uhq0Var3;
        d = new uhq0[]{uhq0Var, uhq0Var2, uhq0Var3};
    }

    public static uhq0 valueOf(String str) {
        return (uhq0) Enum.valueOf(uhq0.class, str);
    }

    public static uhq0[] values() {
        return (uhq0[]) d.clone();
    }
}
