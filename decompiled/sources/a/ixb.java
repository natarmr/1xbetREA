package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ixb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ixb f15534a;
    public static final ixb b;
    public static final /* synthetic */ ixb[] c;

    static {
        ixb ixbVar = new ixb("TOP", 0);
        f15534a = ixbVar;
        ixb ixbVar2 = new ixb("BOTTOM", 1);
        b = ixbVar2;
        c = new ixb[]{ixbVar, ixbVar2};
    }

    public static ixb valueOf(String str) {
        return (ixb) Enum.valueOf(ixb.class, str);
    }

    public static ixb[] values() {
        return (ixb[]) c.clone();
    }
}
