package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class exf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final exf f8574a;
    public static final exf b;
    public static final exf c;
    public static final exf d;
    public static final /* synthetic */ exf[] e;

    static {
        exf exfVar = new exf("CHAMPS", 0);
        f8574a = exfVar;
        exf exfVar2 = new exf("PROMO", 1);
        b = exfVar2;
        exf exfVar3 = new exf("CALENDAR", 2);
        c = exfVar3;
        exf exfVar4 = new exf("CATEGORIES", 3);
        d = exfVar4;
        e = new exf[]{exfVar, exfVar2, exfVar3, exfVar4};
    }

    public static exf valueOf(String str) {
        return (exf) Enum.valueOf(exf.class, str);
    }

    public static exf[] values() {
        return (exf[]) e.clone();
    }
}
