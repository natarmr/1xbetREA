package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class q0y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0y f27925a;
    public static final q0y b;
    public static final /* synthetic */ q0y[] c;

    static {
        q0y q0yVar = new q0y("NoInternet", 0);
        f27925a = q0yVar;
        q0y q0yVar2 = new q0y("Data", 1);
        b = q0yVar2;
        c = new q0y[]{q0yVar, q0yVar2};
    }

    public static q0y valueOf(String str) {
        return (q0y) Enum.valueOf(q0y.class, str);
    }

    public static q0y[] values() {
        return (q0y[]) c.clone();
    }
}
