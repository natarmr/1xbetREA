package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wb6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb6 f38862a;
    public static final wb6 b;
    public static final /* synthetic */ wb6[] c;

    static {
        wb6 wb6Var = new wb6("Dota", 0);
        f38862a = wb6Var;
        wb6 wb6Var2 = new wb6("LeagueOfLegends", 1);
        b = wb6Var2;
        c = new wb6[]{wb6Var, wb6Var2};
    }

    public static wb6 valueOf(String str) {
        return (wb6) Enum.valueOf(wb6.class, str);
    }

    public static wb6[] values() {
        return (wb6[]) c.clone();
    }
}
