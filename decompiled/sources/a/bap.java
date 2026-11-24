package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class bap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bap f2271a;
    public static final bap b;
    public static final /* synthetic */ bap[] c;

    static {
        bap bapVar = new bap("RIGHT", 0);
        f2271a = bapVar;
        bap bapVar2 = new bap("LEFT", 1);
        b = bapVar2;
        c = new bap[]{bapVar, bapVar2};
    }

    public static bap valueOf(String str) {
        return (bap) Enum.valueOf(bap.class, str);
    }

    public static bap[] values() {
        return (bap[]) c.clone();
    }
}
