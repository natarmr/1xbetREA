package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class cex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cex f4233a;
    public static final cex b;
    public static final cex c;
    public static final /* synthetic */ cex[] d;

    static {
        cex cexVar = new cex("INNING_TEAM_ONE", 0);
        f4233a = cexVar;
        cex cexVar2 = new cex("INNING_TEAM_TWO", 1);
        b = cexVar2;
        cex cexVar3 = new cex("INNING_NO_ONE", 2);
        c = cexVar3;
        d = new cex[]{cexVar, cexVar2, cexVar3};
    }

    public static cex valueOf(String str) {
        return (cex) Enum.valueOf(cex.class, str);
    }

    public static cex[] values() {
        return (cex[]) d.clone();
    }
}
