package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class dha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dha f6082a;
    public static final dha b;
    public static final dha c;
    public static final dha d;
    public static final /* synthetic */ dha[] e;

    static {
        dha dhaVar = new dha("FIRST_TEAM_WIN", 0);
        f6082a = dhaVar;
        dha dhaVar2 = new dha("SECOND_TEAM_WIN", 1);
        b = dhaVar2;
        dha dhaVar3 = new dha("ALL_TEAMS_WIN", 2);
        c = dhaVar3;
        dha dhaVar4 = new dha("DRAW", 3);
        d = dhaVar4;
        e = new dha[]{dhaVar, dhaVar2, dhaVar3, dhaVar4};
    }

    public static dha valueOf(String str) {
        return (dha) Enum.valueOf(dha.class, str);
    }

    public static dha[] values() {
        return (dha[]) e.clone();
    }
}
