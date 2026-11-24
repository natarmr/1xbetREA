package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class t2z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t2z f33240a;
    public static final t2z b;
    public static final t2z c;
    public static final t2z d;
    public static final /* synthetic */ t2z[] e;

    static {
        t2z t2zVar = new t2z("NONE", 0);
        f33240a = t2zVar;
        t2z t2zVar2 = new t2z("LOAD_ARCHIVE_TRANSACTIONS_BUTTON", 1);
        b = t2zVar2;
        t2z t2zVar3 = new t2z("TRANSACTIONS_PAGE_LOADER", 2);
        c = t2zVar3;
        t2z t2zVar4 = new t2z("ARCHIVE_TRANSACTIONS_BUTTON_LOADER", 3);
        d = t2zVar4;
        e = new t2z[]{t2zVar, t2zVar2, t2zVar3, t2zVar4};
    }

    public static t2z valueOf(String str) {
        return (t2z) Enum.valueOf(t2z.class, str);
    }

    public static t2z[] values() {
        return (t2z[]) e.clone();
    }
}
