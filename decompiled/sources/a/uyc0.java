package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uyc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uyc0 f36482a;
    public static final /* synthetic */ uyc0[] b;

    static {
        uyc0 uyc0Var = new uyc0("Primary", 0);
        f36482a = uyc0Var;
        b = new uyc0[]{uyc0Var, new uyc0("Disabled", 1)};
    }

    public static uyc0 valueOf(String str) {
        return (uyc0) Enum.valueOf(uyc0.class, str);
    }

    public static uyc0[] values() {
        return (uyc0[]) b.clone();
    }
}
