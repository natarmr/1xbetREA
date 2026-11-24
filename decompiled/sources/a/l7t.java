package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class l7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l7t f19576a;
    public static final l7t b;
    public static final l7t c;
    public static final l7t d;
    public static final /* synthetic */ l7t[] e;

    static {
        l7t l7tVar = new l7t("DEFAULT", 0);
        f19576a = l7tVar;
        l7t l7tVar2 = new l7t("WIN", 1);
        b = l7tVar2;
        l7t l7tVar3 = new l7t("LOSE", 2);
        c = l7tVar3;
        l7t l7tVar4 = new l7t("BONUS", 3);
        d = l7tVar4;
        e = new l7t[]{l7tVar, l7tVar2, l7tVar3, l7tVar4};
    }

    public static l7t valueOf(String str) {
        return (l7t) Enum.valueOf(l7t.class, str);
    }

    public static l7t[] values() {
        return (l7t[]) e.clone();
    }
}
