package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l5a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l5a f19443a;
    public static final l5a b;
    public static final /* synthetic */ l5a[] c;

    static {
        l5a l5aVar = new l5a("INTERNAL", 0);
        f19443a = l5aVar;
        l5a l5aVar2 = new l5a("USER", 1);
        b = l5aVar2;
        c = new l5a[]{l5aVar, l5aVar2, new l5a("CLIENT", 2), new l5a("NEGATIVE_BUTTON", 3), new l5a("FALLBACK_OPTION", 4), new l5a("MORE_OPTIONS_BUTTON", 5)};
    }

    public static l5a valueOf(String str) {
        return (l5a) Enum.valueOf(l5a.class, str);
    }

    public static l5a[] values() {
        return (l5a[]) c.clone();
    }
}
