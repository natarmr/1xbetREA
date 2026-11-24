package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class fex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fex f9426a;
    public static final fex b;
    public static final fex c;
    public static final /* synthetic */ fex[] d;

    static {
        fex fexVar = new fex("INNING_TEAM_ONE", 0);
        f9426a = fexVar;
        fex fexVar2 = new fex("INNING_TEAM_TWO", 1);
        b = fexVar2;
        fex fexVar3 = new fex("INNING_NO_ONE", 2);
        c = fexVar3;
        d = new fex[]{fexVar, fexVar2, fexVar3};
    }

    public static fex valueOf(String str) {
        return (fex) Enum.valueOf(fex.class, str);
    }

    public static fex[] values() {
        return (fex[]) d.clone();
    }
}
