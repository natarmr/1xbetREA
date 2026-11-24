package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ifq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ifq f14701a;
    public static final ifq b;
    public static final ifq c;
    public static final ifq d;
    public static final /* synthetic */ ifq[] e;

    static {
        ifq ifqVar = new ifq("AD_STORAGE", 0);
        f14701a = ifqVar;
        ifq ifqVar2 = new ifq("ANALYTICS_STORAGE", 1);
        b = ifqVar2;
        ifq ifqVar3 = new ifq("AD_USER_DATA", 2);
        c = ifqVar3;
        ifq ifqVar4 = new ifq("AD_PERSONALIZATION", 3);
        d = ifqVar4;
        e = new ifq[]{ifqVar, ifqVar2, ifqVar3, ifqVar4};
    }

    public static ifq valueOf(String str) {
        return (ifq) Enum.valueOf(ifq.class, str);
    }

    public static ifq[] values() {
        return (ifq[]) e.clone();
    }
}
