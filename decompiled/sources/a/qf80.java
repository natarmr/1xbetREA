package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qf80 f28619a;
    public static final qf80 b;
    public static final /* synthetic */ qf80[] c;

    static {
        qf80 qf80Var = new qf80("RENDER_OVERRIDE", 0);
        f28619a = qf80Var;
        qf80 qf80Var2 = new qf80("RENDER_OPEN", 1);
        b = qf80Var2;
        c = new qf80[]{qf80Var, qf80Var2, new qf80("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static qf80 valueOf(String str) {
        return (qf80) Enum.valueOf(qf80.class, str);
    }

    public static qf80[] values() {
        return (qf80[]) c.clone();
    }
}
