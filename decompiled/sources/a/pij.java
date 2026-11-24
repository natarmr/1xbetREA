package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pij f27045a;
    public static final pij b;
    public static final pij c;
    public static final pij d;
    public static final pij e;
    public static final /* synthetic */ pij[] f;

    static {
        pij pijVar = new pij("INTERRUPTED", 0);
        f27045a = pijVar;
        pij pijVar2 = new pij("COMPLETED", 1);
        b = pijVar2;
        pij pijVar3 = new pij("ACTIVE", 2);
        c = pijVar3;
        pij pijVar4 = new pij("AWAITING", 3);
        d = pijVar4;
        pij pijVar5 = new pij("TAKE_REWARD", 4);
        e = pijVar5;
        f = new pij[]{pijVar, pijVar2, pijVar3, pijVar4, pijVar5};
    }

    public static pij valueOf(String str) {
        return (pij) Enum.valueOf(pij.class, str);
    }

    public static pij[] values() {
        return (pij[]) f.clone();
    }
}
