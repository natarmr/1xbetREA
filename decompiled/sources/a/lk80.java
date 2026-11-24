package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class lk80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lk80 f20189a;
    public static final lk80 b;
    public static final lk80 c;
    public static final /* synthetic */ lk80[] d;

    static {
        lk80 lk80Var = new lk80("INITIAL_PAGE_LOADING", 0);
        f20189a = lk80Var;
        lk80 lk80Var2 = new lk80("NEXT_PAGE_LOADING", 1);
        b = lk80Var2;
        lk80 lk80Var3 = new lk80("REFRESH_LOADING", 2);
        c = lk80Var3;
        d = new lk80[]{lk80Var, lk80Var2, lk80Var3};
    }

    public static lk80 valueOf(String str) {
        return (lk80) Enum.valueOf(lk80.class, str);
    }

    public static lk80[] values() {
        return (lk80[]) d.clone();
    }
}
