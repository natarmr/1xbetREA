package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nbk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nbk f23245a;
    public static final nbk b;
    public static final nbk c;
    public static final /* synthetic */ nbk[] d;

    static {
        nbk nbkVar = new nbk("WARNING", 0);
        f23245a = nbkVar;
        nbk nbkVar2 = new nbk("ERROR", 1);
        b = nbkVar2;
        nbk nbkVar3 = new nbk("HIDDEN", 2);
        c = nbkVar3;
        d = new nbk[]{nbkVar, nbkVar2, nbkVar3};
    }

    public static nbk valueOf(String str) {
        return (nbk) Enum.valueOf(nbk.class, str);
    }

    public static nbk[] values() {
        return (nbk[]) d.clone();
    }
}
