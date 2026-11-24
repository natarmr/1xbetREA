package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class evc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final evc f8460a;
    public static final evc b;
    public static final evc c;
    public static final evc d;
    public static final evc e;
    public static final evc f;
    public static final /* synthetic */ evc[] g;

    static {
        evc evcVar = new evc("APP_CLOSED", 0);
        f8460a = evcVar;
        evc evcVar2 = new evc("APP_DISCONNECTED", 1);
        b = evcVar2;
        evc evcVar3 = new evc("CAMERA2_CLOSED", 2);
        c = evcVar3;
        evc evcVar4 = new evc("CAMERA2_DISCONNECTED", 3);
        d = evcVar4;
        evc evcVar5 = new evc("CAMERA2_ERROR", 4);
        e = evcVar5;
        evc evcVar6 = new evc("CAMERA2_EXCEPTION", 5);
        f = evcVar6;
        g = new evc[]{evcVar, evcVar2, evcVar3, evcVar4, evcVar5, evcVar6};
    }

    public static evc valueOf(String str) {
        return (evc) Enum.valueOf(evc.class, str);
    }

    public static evc[] values() {
        return (evc[]) g.clone();
    }
}
