package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ocq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ocq f25039a;
    public static final /* synthetic */ ocq[] b;

    static {
        ocq ocqVar = new ocq("PERIOD_5", 0);
        f25039a = ocqVar;
        b = new ocq[]{ocqVar, new ocq("PERIOD_HOUR", 1)};
    }

    public static ocq valueOf(String str) {
        return (ocq) Enum.valueOf(ocq.class, str);
    }

    public static ocq[] values() {
        return (ocq[]) b.clone();
    }
}
