package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dqf f6512a;
    public static final dqf b;
    public static final dqf c;
    public static final dqf d;
    public static final dqf e;
    public static final dqf f;
    public static final /* synthetic */ dqf[] g;

    static {
        dqf dqfVar = new dqf("ADR", 0);
        f6512a = dqfVar;
        dqf dqfVar2 = new dqf("IMPACT", 1);
        b = dqfVar2;
        dqf dqfVar3 = new dqf("KPR", 2);
        c = dqfVar3;
        dqf dqfVar4 = new dqf("RATING", 3);
        d = dqfVar4;
        dqf dqfVar5 = new dqf("DPR", 4);
        e = dqfVar5;
        dqf dqfVar6 = new dqf("KAST", 5);
        f = dqfVar6;
        g = new dqf[]{dqfVar, dqfVar2, dqfVar3, dqfVar4, dqfVar5, dqfVar6};
    }

    public static dqf valueOf(String str) {
        return (dqf) Enum.valueOf(dqf.class, str);
    }

    public static dqf[] values() {
        return (dqf[]) g.clone();
    }
}
