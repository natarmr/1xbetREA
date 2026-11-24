package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vrv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vrv f37920a;
    public static final vrv b;
    public static final /* synthetic */ vrv[] c;

    static {
        vrv vrvVar = new vrv("LARGE", 0);
        f37920a = vrvVar;
        vrv vrvVar2 = new vrv("SMALL", 1);
        b = vrvVar2;
        c = new vrv[]{vrvVar, vrvVar2};
    }

    public static vrv valueOf(String str) {
        return (vrv) Enum.valueOf(vrv.class, str);
    }

    public static vrv[] values() {
        return (vrv[]) c.clone();
    }
}
