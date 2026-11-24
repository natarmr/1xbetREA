package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class saa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final saa f31882a;
    public static final saa b;
    public static final /* synthetic */ saa[] c;

    static {
        saa saaVar = new saa("DEFAULT", 0);
        f31882a = saaVar;
        saa saaVar2 = new saa("MAX", 1);
        b = saaVar2;
        c = new saa[]{saaVar, saaVar2};
    }

    public static saa valueOf(String str) {
        return (saa) Enum.valueOf(saa.class, str);
    }

    public static saa[] values() {
        return (saa[]) c.clone();
    }
}
