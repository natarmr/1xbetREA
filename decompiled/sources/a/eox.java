package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eox f8158a;
    public static final eox b;
    public static final eox c;
    public static final eox d;
    public static final /* synthetic */ eox[] e;

    static {
        eox eoxVar = new eox("LookaheadMeasurement", 0);
        f8158a = eoxVar;
        eox eoxVar2 = new eox("LookaheadPlacement", 1);
        b = eoxVar2;
        eox eoxVar3 = new eox("Measurement", 2);
        c = eoxVar3;
        eox eoxVar4 = new eox("Placement", 3);
        d = eoxVar4;
        e = new eox[]{eoxVar, eoxVar2, eoxVar3, eoxVar4};
    }

    public static eox valueOf(String str) {
        return (eox) Enum.valueOf(eox.class, str);
    }

    public static eox[] values() {
        return (eox[]) e.clone();
    }
}
