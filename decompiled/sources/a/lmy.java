package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lmy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lmy f20319a;
    public static final lmy b;
    public static final /* synthetic */ lmy[] c;

    static {
        lmy lmyVar = new lmy("PROD", 0);
        f20319a = lmyVar;
        lmy lmyVar2 = new lmy("STAGE", 1);
        b = lmyVar2;
        c = new lmy[]{lmyVar, lmyVar2};
    }

    public static lmy valueOf(String str) {
        return (lmy) Enum.valueOf(lmy.class, str);
    }

    public static lmy[] values() {
        return (lmy[]) c.clone();
    }
}
