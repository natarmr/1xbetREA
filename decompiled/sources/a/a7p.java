package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a7p f382a;
    public static final /* synthetic */ a7p[] b;

    /* JADX INFO: Fake field, exist only in values array */
    a7p EF0;

    static {
        a7p a7pVar = new a7p("ALL", 0);
        a7p a7pVar2 = new a7p("AGGREGATOR", 1);
        f382a = a7pVar2;
        b = new a7p[]{a7pVar, a7pVar2, new a7p("ONE_XGAMES", 2)};
    }

    public static a7p valueOf(String str) {
        return (a7p) Enum.valueOf(a7p.class, str);
    }

    public static a7p[] values() {
        return (a7p[]) b.clone();
    }
}
