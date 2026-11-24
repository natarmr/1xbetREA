package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class bbb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bbb f2300a;
    public static final bbb b;
    public static final /* synthetic */ bbb[] c;

    static {
        bbb bbbVar = new bbb("ISRG_ROOT_X1", 0);
        f2300a = bbbVar;
        bbb bbbVar2 = new bbb("ISRG_ROOT_X2", 1);
        b = bbbVar2;
        c = new bbb[]{bbbVar, bbbVar2};
    }

    public static bbb valueOf(String str) {
        return (bbb) Enum.valueOf(bbb.class, str);
    }

    public static bbb[] values() {
        return (bbb[]) c.clone();
    }
}
