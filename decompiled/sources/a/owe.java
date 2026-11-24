package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class owe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final owe f25963a;
    public static final owe b;
    public static final /* synthetic */ owe[] c;

    static {
        owe oweVar = new owe("REGULAR", 0);
        f25963a = oweVar;
        owe oweVar2 = new owe("BET_BUILDER", 1);
        b = oweVar2;
        c = new owe[]{oweVar, oweVar2};
    }

    public static owe valueOf(String str) {
        return (owe) Enum.valueOf(owe.class, str);
    }

    public static owe[] values() {
        return (owe[]) c.clone();
    }
}
