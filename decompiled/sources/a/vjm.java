package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vjm f37535a;
    public static final vjm b;
    public static final /* synthetic */ vjm[] c;

    static {
        vjm vjmVar = new vjm("LEFT_REGULAR", 0);
        f37535a = vjmVar;
        vjm vjmVar2 = new vjm("LEFT_MEDIUM", 1);
        b = vjmVar2;
        c = new vjm[]{vjmVar, vjmVar2};
    }

    public static vjm valueOf(String str) {
        return (vjm) Enum.valueOf(vjm.class, str);
    }

    public static vjm[] values() {
        return (vjm[]) c.clone();
    }
}
