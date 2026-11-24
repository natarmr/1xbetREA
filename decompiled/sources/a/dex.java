package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class dex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dex f5973a;
    public static final dex b;
    public static final dex c;
    public static final /* synthetic */ dex[] d;

    static {
        dex dexVar = new dex("INNING_TEAM_ONE", 0);
        f5973a = dexVar;
        dex dexVar2 = new dex("INNING_TEAM_TWO", 1);
        b = dexVar2;
        dex dexVar3 = new dex("INNING_NO_ONE", 2);
        c = dexVar3;
        d = new dex[]{dexVar, dexVar2, dexVar3};
    }

    public static dex valueOf(String str) {
        return (dex) Enum.valueOf(dex.class, str);
    }

    public static dex[] values() {
        return (dex[]) d.clone();
    }
}
