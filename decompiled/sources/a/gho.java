package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class gho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gho f11309a;
    public static final gho b;
    public static final gho c;
    public static final gho d;
    public static final /* synthetic */ gho[] e;

    static {
        gho ghoVar = new gho("DEFAULT", 0);
        f11309a = ghoVar;
        gho ghoVar2 = new gho("AUTOSUB", 1);
        b = ghoVar2;
        gho ghoVar3 = new gho("OPTION_BET", 2);
        c = ghoVar3;
        gho ghoVar4 = new gho("EACH_WAY", 3);
        d = ghoVar4;
        e = new gho[]{ghoVar, ghoVar2, ghoVar3, ghoVar4};
    }

    public static gho valueOf(String str) {
        return (gho) Enum.valueOf(gho.class, str);
    }

    public static gho[] values() {
        return (gho[]) e.clone();
    }
}
