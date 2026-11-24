package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class y4d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y4d0 f41998a;
    public static final /* synthetic */ y4d0[] b;

    static {
        y4d0 y4d0Var = new y4d0("DEFAULT", 0);
        f41998a = y4d0Var;
        b = new y4d0[]{y4d0Var, new y4d0("SIGNED", 1), new y4d0("FIXED", 2)};
    }

    public static y4d0 valueOf(String str) {
        return (y4d0) Enum.valueOf(y4d0.class, str);
    }

    public static y4d0[] values() {
        return (y4d0[]) b.clone();
    }
}
