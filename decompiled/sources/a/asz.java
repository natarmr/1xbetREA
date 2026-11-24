package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class asz implements wrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tqt f1411a;
    public static final asz b;
    public static final /* synthetic */ asz[] c;

    static {
        asz aszVar = new asz("EMPTY", 0);
        b = aszVar;
        c = new asz[]{aszVar};
        f1411a = new tqt();
    }

    public static asz valueOf(String str) {
        return (asz) Enum.valueOf(asz.class, str);
    }

    public static asz[] values() {
        return (asz[]) c.clone();
    }

    @Override // a.wrz
    public final int getId() {
        return -1;
    }
}
