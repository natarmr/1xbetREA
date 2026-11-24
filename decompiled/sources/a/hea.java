package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hea f12913a;
    public static final hea b;
    public static final hea c;
    public static final hea d;
    public static final hea e;
    public static final hea f;
    public static final /* synthetic */ hea[] g;

    static {
        hea heaVar = new hea("FIRST_OPPONENT_WIN", 0);
        f12913a = heaVar;
        hea heaVar2 = new hea("SECOND_OPPONENT_WIN", 1);
        b = heaVar2;
        hea heaVar3 = new hea("GAME", 2);
        c = heaVar3;
        hea heaVar4 = new hea("PAUSE", 3);
        d = heaVar4;
        hea heaVar5 = new hea("DRAW", 4);
        e = heaVar5;
        hea heaVar6 = new hea("DEFAULT", 5);
        f = heaVar6;
        g = new hea[]{heaVar, heaVar2, heaVar3, heaVar4, heaVar5, heaVar6};
    }

    public static hea valueOf(String str) {
        return (hea) Enum.valueOf(hea.class, str);
    }

    public static hea[] values() {
        return (hea[]) g.clone();
    }
}
