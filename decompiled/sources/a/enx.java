package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class enx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final enx f8115a;
    public static final enx b;
    public static final /* synthetic */ enx[] c;

    static {
        enx enxVar = new enx("Min", 0);
        f8115a = enxVar;
        enx enxVar2 = new enx("Max", 1);
        b = enxVar2;
        c = new enx[]{enxVar, enxVar2};
    }

    public static enx valueOf(String str) {
        return (enx) Enum.valueOf(enx.class, str);
    }

    public static enx[] values() {
        return (enx[]) c.clone();
    }
}
