package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class grs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final grs f11797a;
    public static final grs b;
    public static final /* synthetic */ grs[] c;

    static {
        grs grsVar = new grs("SHOW_COEFFICIENT", 0);
        f11797a = grsVar;
        grs grsVar2 = new grs("NONE", 1);
        b = grsVar2;
        c = new grs[]{grsVar, grsVar2};
    }

    public static grs valueOf(String str) {
        return (grs) Enum.valueOf(grs.class, str);
    }

    public static grs[] values() {
        return (grs[]) c.clone();
    }
}
