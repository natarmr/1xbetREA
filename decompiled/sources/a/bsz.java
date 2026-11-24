package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class bsz implements trz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bst f3156a;
    public static final bsz b;
    public static final /* synthetic */ bsz[] c;

    static {
        bsz bszVar = new bsz("EMPTY", 0);
        b = bszVar;
        c = new bsz[]{bszVar};
        f3156a = new bst();
    }

    public static bsz valueOf(String str) {
        return (bsz) Enum.valueOf(bsz.class, str);
    }

    public static bsz[] values() {
        return (bsz[]) c.clone();
    }

    @Override // a.trz
    public final int getId() {
        return -1;
    }
}
