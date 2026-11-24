package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ixf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ixf f15540a;
    public static final ixf b;
    public static final ixf c;
    public static final /* synthetic */ ixf[] d;

    static {
        ixf ixfVar = new ixf("None", 0);
        f15540a = ixfVar;
        ixf ixfVar2 = new ixf("Cancelled", 1);
        b = ixfVar2;
        ixf ixfVar3 = new ixf("Redirected", 2);
        c = ixfVar3;
        d = new ixf[]{ixfVar, ixfVar2, ixfVar3, new ixf("RedirectCancelled", 3)};
    }

    public static ixf valueOf(String str) {
        return (ixf) Enum.valueOf(ixf.class, str);
    }

    public static ixf[] values() {
        return (ixf[]) d.clone();
    }
}
