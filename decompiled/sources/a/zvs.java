package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class zvs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zvs f45072a;
    public static final zvs b;
    public static final /* synthetic */ zvs[] c;

    static {
        zvs zvsVar = new zvs("TWO_TEAM", 0);
        f45072a = zvsVar;
        zvs zvsVar2 = new zvs("ONE_TEAM", 1);
        b = zvsVar2;
        c = new zvs[]{zvsVar, zvsVar2};
    }

    public static zvs valueOf(String str) {
        return (zvs) Enum.valueOf(zvs.class, str);
    }

    public static zvs[] values() {
        return (zvs[]) c.clone();
    }
}
