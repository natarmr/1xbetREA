package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hc f12794a;
    public static final hc b;
    public static final /* synthetic */ hc[] c;

    static {
        hc hcVar = new hc("MAKE_ACTIVE", 0);
        f12794a = hcVar;
        hc hcVar2 = new hc("DELETE", 1);
        b = hcVar2;
        c = new hc[]{hcVar, hcVar2};
    }

    public static hc valueOf(String str) {
        return (hc) Enum.valueOf(hc.class, str);
    }

    public static hc[] values() {
        return (hc[]) c.clone();
    }
}
