package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class dap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dap f5761a;
    public static final dap b;
    public static final /* synthetic */ dap[] c;

    static {
        dap dapVar = new dap("RIGHT_BOTTOM", 0);
        f5761a = dapVar;
        dap dapVar2 = new dap("LEFT_BOTTOM", 1);
        b = dapVar2;
        c = new dap[]{dapVar, dapVar2};
    }

    public static dap valueOf(String str) {
        return (dap) Enum.valueOf(dap.class, str);
    }

    public static dap[] values() {
        return (dap[]) c.clone();
    }
}
