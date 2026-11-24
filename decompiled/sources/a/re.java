package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final re f30310a;
    public static final re b;
    public static final /* synthetic */ re[] c;

    static {
        re reVar = new re("SMALL_STYLE", 0);
        f30310a = reVar;
        re reVar2 = new re("LARGE_STYLE", 1);
        b = reVar2;
        c = new re[]{reVar, reVar2};
    }

    public static re valueOf(String str) {
        return (re) Enum.valueOf(re.class, str);
    }

    public static re[] values() {
        return (re[]) c.clone();
    }
}
