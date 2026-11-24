package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class gex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gex f11177a;
    public static final gex b;
    public static final gex c;
    public static final /* synthetic */ gex[] d;

    static {
        gex gexVar = new gex("INNING_TEAM_ONE", 0);
        f11177a = gexVar;
        gex gexVar2 = new gex("INNING_TEAM_TWO", 1);
        b = gexVar2;
        gex gexVar3 = new gex("INNING_NO_ONE", 2);
        c = gexVar3;
        d = new gex[]{gexVar, gexVar2, gexVar3};
    }

    public static gex valueOf(String str) {
        return (gex) Enum.valueOf(gex.class, str);
    }

    public static gex[] values() {
        return (gex[]) d.clone();
    }
}
