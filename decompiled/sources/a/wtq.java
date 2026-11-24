package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wtq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wtq f39753a;
    public static final wtq b;
    public static final wtq c;
    public static final /* synthetic */ wtq[] d;

    static {
        wtq wtqVar = new wtq("AGGREGATOR_SLOTS", 0);
        f39753a = wtqVar;
        wtq wtqVar2 = new wtq("DAILY_TASK", 1);
        b = wtqVar2;
        wtq wtqVar3 = new wtq("AGGREGATOR_GAME", 2);
        c = wtqVar3;
        d = new wtq[]{wtqVar, wtqVar2, wtqVar3};
    }

    public static wtq valueOf(String str) {
        return (wtq) Enum.valueOf(wtq.class, str);
    }

    public static wtq[] values() {
        return (wtq[]) d.clone();
    }
}
