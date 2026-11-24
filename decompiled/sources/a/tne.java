package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class tne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tne f34229a;
    public static final tne b;
    public static final tne c;
    public static final tne d;
    public static final tne e;
    public static final /* synthetic */ tne[] f;

    static {
        tne tneVar = new tne("CPU_ACQUIRED", 0);
        f34229a = tneVar;
        tne tneVar2 = new tne("BLOCKING", 1);
        b = tneVar2;
        tne tneVar3 = new tne("PARKING", 2);
        c = tneVar3;
        tne tneVar4 = new tne("DORMANT", 3);
        d = tneVar4;
        tne tneVar5 = new tne("TERMINATED", 4);
        e = tneVar5;
        f = new tne[]{tneVar, tneVar2, tneVar3, tneVar4, tneVar5};
    }

    public static tne valueOf(String str) {
        return (tne) Enum.valueOf(tne.class, str);
    }

    public static tne[] values() {
        return (tne[]) f.clone();
    }
}
