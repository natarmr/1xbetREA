package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hfq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hfq f12983a;
    public static final hfq b;
    public static final /* synthetic */ hfq[] c;

    static {
        hfq hfqVar = new hfq("GRANTED", 0);
        f12983a = hfqVar;
        hfq hfqVar2 = new hfq("DENIED", 1);
        b = hfqVar2;
        c = new hfq[]{hfqVar, hfqVar2};
    }

    public static hfq valueOf(String str) {
        return (hfq) Enum.valueOf(hfq.class, str);
    }

    public static hfq[] values() {
        return (hfq[]) c.clone();
    }
}
