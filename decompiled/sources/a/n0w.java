package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class n0w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0w f22720a;
    public static final n0w b;
    public static final /* synthetic */ n0w[] c;

    static {
        n0w n0wVar = new n0w("SHORT", 0);
        f22720a = n0wVar;
        n0w n0wVar2 = new n0w("FULL", 1);
        b = n0wVar2;
        c = new n0w[]{n0wVar, n0wVar2};
    }

    public static n0w valueOf(String str) {
        return (n0w) Enum.valueOf(n0w.class, str);
    }

    public static n0w[] values() {
        return (n0w[]) c.clone();
    }
}
