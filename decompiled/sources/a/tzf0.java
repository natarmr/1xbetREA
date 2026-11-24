package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tzf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tzf0 f34801a;
    public static final tzf0 b;
    public static final /* synthetic */ tzf0[] c;

    static {
        tzf0 tzf0Var = new tzf0("RESTORE_BY_PHONE", 0);
        f34801a = tzf0Var;
        tzf0 tzf0Var2 = new tzf0("RESTORE_BY_EMAIL", 1);
        b = tzf0Var2;
        c = new tzf0[]{tzf0Var, tzf0Var2};
    }

    public static tzf0 valueOf(String str) {
        return (tzf0) Enum.valueOf(tzf0.class, str);
    }

    public static tzf0[] values() {
        return (tzf0[]) c.clone();
    }
}
