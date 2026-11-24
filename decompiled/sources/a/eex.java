package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class eex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eex f7695a;
    public static final eex b;
    public static final eex c;
    public static final /* synthetic */ eex[] d;

    static {
        eex eexVar = new eex("INNING_TEAM_ONE", 0);
        f7695a = eexVar;
        eex eexVar2 = new eex("INNING_TEAM_TWO", 1);
        b = eexVar2;
        eex eexVar3 = new eex("INNING_NO_ONE", 2);
        c = eexVar3;
        d = new eex[]{eexVar, eexVar2, eexVar3};
    }

    public static eex valueOf(String str) {
        return (eex) Enum.valueOf(eex.class, str);
    }

    public static eex[] values() {
        return (eex[]) d.clone();
    }
}
