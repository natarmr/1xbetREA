package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class iwe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iwe f15485a;
    public static final iwe b;
    public static final iwe c;
    public static final iwe d;
    public static final iwe e;
    public static final iwe f;
    public static final /* synthetic */ iwe[] g;

    static {
        iwe iweVar = new iwe("NONE", 0);
        f15485a = iweVar;
        iwe iweVar2 = new iwe("BLOCKED", 1);
        b = iweVar2;
        iwe iweVar3 = new iwe("RELATION", 2);
        c = iweVar3;
        iwe iweVar4 = new iwe("BANNED_EXPRESS", 3);
        d = iweVar4;
        iwe iweVar5 = new iwe("NOT_VALID", 4);
        e = iweVar5;
        iwe iweVar6 = new iwe("FINISHED", 5);
        f = iweVar6;
        g = new iwe[]{iweVar, iweVar2, iweVar3, iweVar4, iweVar5, iweVar6};
    }

    public static iwe valueOf(String str) {
        return (iwe) Enum.valueOf(iwe.class, str);
    }

    public static iwe[] values() {
        return (iwe[]) g.clone();
    }
}
