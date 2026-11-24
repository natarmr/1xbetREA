package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k7n f17831a;
    public static final k7n b;
    public static final /* synthetic */ k7n[] c;

    static {
        k7n k7nVar = new k7n("TWO", 0);
        f17831a = k7nVar;
        k7n k7nVar2 = new k7n("THREE", 1);
        b = k7nVar2;
        c = new k7n[]{k7nVar, k7nVar2};
    }

    public static k7n valueOf(String str) {
        return (k7n) Enum.valueOf(k7n.class, str);
    }

    public static k7n[] values() {
        return (k7n[]) c.clone();
    }
}
