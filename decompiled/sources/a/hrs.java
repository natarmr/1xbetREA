package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hrs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hrs f13547a;
    public static final hrs b;
    public static final /* synthetic */ hrs[] c;

    static {
        hrs hrsVar = new hrs("DEFAULT", 0);
        f13547a = hrsVar;
        hrs hrsVar2 = new hrs("BET_BUILDER", 1);
        b = hrsVar2;
        c = new hrs[]{hrsVar, hrsVar2};
    }

    public static hrs valueOf(String str) {
        return (hrs) Enum.valueOf(hrs.class, str);
    }

    public static hrs[] values() {
        return (hrs[]) c.clone();
    }
}
