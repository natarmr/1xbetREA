package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fho f9552a;
    public static final fho b;
    public static final fho c;
    public static final fho d;
    public static final /* synthetic */ fho[] e;

    static {
        fho fhoVar = new fho("NONE", 0);
        f9552a = fhoVar;
        fho fhoVar2 = new fho("AUTO_SUB", 1);
        b = fhoVar2;
        fho fhoVar3 = new fho("OPTION_BET", 2);
        c = fhoVar3;
        fho fhoVar4 = new fho("EACH_WAY", 3);
        d = fhoVar4;
        e = new fho[]{fhoVar, fhoVar2, fhoVar3, fhoVar4};
    }

    public static fho valueOf(String str) {
        return (fho) Enum.valueOf(fho.class, str);
    }

    public static fho[] values() {
        return (fho[]) e.clone();
    }
}
