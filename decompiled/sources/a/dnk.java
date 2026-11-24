package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dnk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dnk f6373a;
    public static final dnk b;
    public static final dnk c;
    public static final /* synthetic */ dnk[] d;

    static {
        dnk dnkVar = new dnk("Vertical", 0);
        f6373a = dnkVar;
        dnk dnkVar2 = new dnk("Horizontal", 1);
        b = dnkVar2;
        dnk dnkVar3 = new dnk("Both", 2);
        c = dnkVar3;
        d = new dnk[]{dnkVar, dnkVar2, dnkVar3};
    }

    public static dnk valueOf(String str) {
        return (dnk) Enum.valueOf(dnk.class, str);
    }

    public static dnk[] values() {
        return (dnk[]) d.clone();
    }
}
