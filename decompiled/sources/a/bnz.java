package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class bnz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bnz f2907a;
    public static final bnz b;
    public static final bnz c;
    public static final bnz d;
    public static final bnz e;
    public static final bnz f;
    public static final bnz g;
    public static final bnz h;
    public static final bnz i;
    public static final bnz j;
    public static final /* synthetic */ bnz[] k;

    static {
        bnz bnzVar = new bnz("LossLimits", 0);
        f2907a = bnzVar;
        bnz bnzVar2 = new bnz("DepositLimits", 1);
        b = bnzVar2;
        bnz bnzVar3 = new bnz("BetLimits", 2);
        c = bnzVar3;
        bnz bnzVar4 = new bnz("Timeout", 3);
        d = bnzVar4;
        bnz bnzVar5 = new bnz("SelfExclusion", 4);
        e = bnzVar5;
        bnz bnzVar6 = new bnz("RealityCheck", 5);
        f = bnzVar6;
        bnz bnzVar7 = new bnz("SessionTime", 6);
        g = bnzVar7;
        bnz bnzVar8 = new bnz("SelfBlock", 7);
        h = bnzVar8;
        bnz bnzVar9 = new bnz("JudicialExclusion", 8);
        i = bnzVar9;
        bnz bnzVar10 = new bnz("Unknown", 9);
        j = bnzVar10;
        k = new bnz[]{bnzVar, bnzVar2, bnzVar3, bnzVar4, bnzVar5, bnzVar6, bnzVar7, bnzVar8, bnzVar9, bnzVar10};
    }

    public static bnz valueOf(String str) {
        return (bnz) Enum.valueOf(bnz.class, str);
    }

    public static bnz[] values() {
        return (bnz[]) k.clone();
    }
}
