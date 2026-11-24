package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hdh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hdh0 f12871a;
    public static final hdh0 b;
    public static final /* synthetic */ hdh0[] c;

    static {
        hdh0 hdh0Var = new hdh0("HORIZONTAL", 0);
        f12871a = hdh0Var;
        hdh0 hdh0Var2 = new hdh0("VERTICAL", 1);
        b = hdh0Var2;
        c = new hdh0[]{hdh0Var, hdh0Var2};
    }

    public static hdh0 valueOf(String str) {
        return (hdh0) Enum.valueOf(hdh0.class, str);
    }

    public static hdh0[] values() {
        return (hdh0[]) c.clone();
    }
}
