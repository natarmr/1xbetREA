package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class lfl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lfl f19962a;
    public static final lfl b;
    public static final lfl c;
    public static final lfl d;
    public static final lfl e;
    public static final lfl f;
    public static final /* synthetic */ lfl[] g;

    static {
        lfl lflVar = new lfl("DEFAULT", 0);
        f19962a = lflVar;
        lfl lflVar2 = new lfl("GAME_IN_PROCESS", 1);
        b = lflVar2;
        lfl lflVar3 = new lfl("CELL_IN_MOVE", 2);
        c = lflVar3;
        lfl lflVar4 = new lfl("RESTORE_CELL_IN_MOVE", 3);
        d = lflVar4;
        lfl lflVar5 = new lfl("SHOW_RESULT_CELLS", 4);
        e = lflVar5;
        lfl lflVar6 = new lfl("RESTORE_SHOW_RESULT_CELLS", 5);
        f = lflVar6;
        g = new lfl[]{lflVar, lflVar2, lflVar3, lflVar4, lflVar5, lflVar6};
    }

    public static lfl valueOf(String str) {
        return (lfl) Enum.valueOf(lfl.class, str);
    }

    public static lfl[] values() {
        return (lfl[]) g.clone();
    }
}
