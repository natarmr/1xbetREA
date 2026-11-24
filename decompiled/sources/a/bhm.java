package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class bhm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bhm f2615a;
    public static final bhm b;
    public static final /* synthetic */ bhm[] c;

    static {
        bhm bhmVar = new bhm("LINE", 0);
        f2615a = bhmVar;
        bhm bhmVar2 = new bhm("LIVE", 1);
        b = bhmVar2;
        c = new bhm[]{bhmVar, bhmVar2};
    }

    public static bhm valueOf(String str) {
        return (bhm) Enum.valueOf(bhm.class, str);
    }

    public static bhm[] values() {
        return (bhm[]) c.clone();
    }
}
