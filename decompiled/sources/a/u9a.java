package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class u9a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u9a f35274a;
    public static final /* synthetic */ u9a[] b;

    static {
        u9a u9aVar = new u9a("FOR_SUBTYPING", 0);
        f35274a = u9aVar;
        b = new u9a[]{u9aVar, new u9a("FOR_INCORPORATION", 1), new u9a("FROM_EXPRESSION", 2)};
    }

    public static u9a valueOf(String str) {
        return (u9a) Enum.valueOf(u9a.class, str);
    }

    public static u9a[] values() {
        return (u9a[]) b.clone();
    }
}
