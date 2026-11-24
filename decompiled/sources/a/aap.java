package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class aap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aap f539a;
    public static final aap b;
    public static final /* synthetic */ aap[] c;

    static {
        aap aapVar = new aap("RIGHT", 0);
        f539a = aapVar;
        aap aapVar2 = new aap("LEFT", 1);
        b = aapVar2;
        c = new aap[]{aapVar, aapVar2};
    }

    public static aap valueOf(String str) {
        return (aap) Enum.valueOf(aap.class, str);
    }

    public static aap[] values() {
        return (aap[]) c.clone();
    }
}
