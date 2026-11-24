package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class y6n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6n f42107a;
    public static final y6n b;
    public static final /* synthetic */ y6n[] c;

    static {
        y6n y6nVar = new y6n("FIRST", 0);
        f42107a = y6nVar;
        y6n y6nVar2 = new y6n("SECOND", 1);
        b = y6nVar2;
        c = new y6n[]{y6nVar, y6nVar2};
    }

    public static y6n valueOf(String str) {
        return (y6n) Enum.valueOf(y6n.class, str);
    }

    public static y6n[] values() {
        return (y6n[]) c.clone();
    }
}
