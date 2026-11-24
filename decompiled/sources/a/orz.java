package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class orz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final art f25758a;
    public static final orz b;
    public static final orz c;
    public static final orz d;
    public static final /* synthetic */ orz[] e;

    static {
        orz orzVar = new orz("ACTIVE", 0);
        b = orzVar;
        orz orzVar2 = new orz("PENDING", 1);
        c = orzVar2;
        orz orzVar3 = new orz("INACTIVE", 2);
        d = orzVar3;
        e = new orz[]{orzVar, orzVar2, orzVar3};
        f25758a = new art();
    }

    public static orz valueOf(String str) {
        return (orz) Enum.valueOf(orz.class, str);
    }

    public static orz[] values() {
        return (orz[]) e.clone();
    }
}
