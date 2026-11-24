package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dnx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dnx f6392a;
    public static final dnx b;
    public static final /* synthetic */ dnx[] c;

    static {
        dnx dnxVar = new dnx("Min", 0);
        f6392a = dnxVar;
        dnx dnxVar2 = new dnx("Max", 1);
        b = dnxVar2;
        c = new dnx[]{dnxVar, dnxVar2};
    }

    public static dnx valueOf(String str) {
        return (dnx) Enum.valueOf(dnx.class, str);
    }

    public static dnx[] values() {
        return (dnx[]) c.clone();
    }
}
