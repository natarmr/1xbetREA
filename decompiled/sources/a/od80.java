package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class od80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final od80 f25065a;
    public static final od80 b;
    public static final /* synthetic */ od80[] c;

    static {
        od80 od80Var = new od80("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f25065a = od80Var;
        od80 od80Var2 = new od80("DROP_WORK_REQUEST", 1);
        b = od80Var2;
        c = new od80[]{od80Var, od80Var2};
    }

    public static od80 valueOf(String str) {
        return (od80) Enum.valueOf(od80.class, str);
    }

    public static od80[] values() {
        return (od80[]) c.clone();
    }
}
