package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class dyo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dyo f6903a;
    public static final dyo b;
    public static final dyo c;
    public static final dyo d;
    public static final /* synthetic */ dyo[] e;

    static {
        dyo dyoVar = new dyo("NONE", 0);
        f6903a = dyoVar;
        dyo dyoVar2 = new dyo("SAME_AS_CURRENT", 1);
        b = dyoVar2;
        dyo dyoVar3 = new dyo("REQUIREMENTS_NOT_SATISFIED", 2);
        c = dyoVar3;
        dyo dyoVar4 = new dyo("SHORT_PASSWORD", 3);
        dyo dyoVar5 = new dyo("NOT_MATCH", 4);
        d = dyoVar5;
        e = new dyo[]{dyoVar, dyoVar2, dyoVar3, dyoVar4, dyoVar5};
    }

    public static dyo valueOf(String str) {
        return (dyo) Enum.valueOf(dyo.class, str);
    }

    public static dyo[] values() {
        return (dyo[]) e.clone();
    }
}
