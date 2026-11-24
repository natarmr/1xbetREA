package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d050 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d050 f5256a;
    public static final /* synthetic */ d050[] b;

    static {
        d050 d050Var = new d050("Default", 0);
        f5256a = d050Var;
        b = new d050[]{d050Var, new d050("UserInput", 1), new d050("PreventUserInput", 2)};
    }

    public static d050 valueOf(String str) {
        return (d050) Enum.valueOf(d050.class, str);
    }

    public static d050[] values() {
        return (d050[]) b.clone();
    }
}
