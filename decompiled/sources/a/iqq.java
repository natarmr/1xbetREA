package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class iqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iqq f15221a;
    public static final iqq b;
    public static final iqq c;
    public static final /* synthetic */ iqq[] d;

    static {
        iqq iqqVar = new iqq("Active", 0);
        f15221a = iqqVar;
        iqq iqqVar2 = new iqq("ActiveParent", 1);
        b = iqqVar2;
        iqq iqqVar3 = new iqq("Captured", 2);
        iqq iqqVar4 = new iqq("Inactive", 3);
        c = iqqVar4;
        d = new iqq[]{iqqVar, iqqVar2, iqqVar3, iqqVar4};
    }

    public static iqq valueOf(String str) {
        return (iqq) Enum.valueOf(iqq.class, str);
    }

    public static iqq[] values() {
        return (iqq[]) d.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        t9f.b();
        return false;
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                t9f.b();
                return false;
            }
        }
        return true;
    }
}
