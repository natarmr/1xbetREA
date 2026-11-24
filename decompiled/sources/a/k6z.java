package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class k6z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k6z f17794a;
    public static final k6z b;
    public static final /* synthetic */ k6z[] c;

    static {
        k6z k6zVar = new k6z("Ltr", 0);
        f17794a = k6zVar;
        k6z k6zVar2 = new k6z("Rtl", 1);
        b = k6zVar2;
        c = new k6z[]{k6zVar, k6zVar2};
    }

    public static k6z valueOf(String str) {
        return (k6z) Enum.valueOf(k6z.class, str);
    }

    public static k6z[] values() {
        return (k6z[]) c.clone();
    }
}
