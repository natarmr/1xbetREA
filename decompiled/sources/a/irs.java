package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class irs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final irs f15274a;
    public static final irs b;
    public static final /* synthetic */ irs[] c;

    static {
        irs irsVar = new irs("INFORMATION", 0);
        f15274a = irsVar;
        irs irsVar2 = new irs("BROADCASTING", 1);
        b = irsVar2;
        c = new irs[]{irsVar, irsVar2};
    }

    public static irs valueOf(String str) {
        return (irs) Enum.valueOf(irs.class, str);
    }

    public static irs[] values() {
        return (irs[]) c.clone();
    }
}
