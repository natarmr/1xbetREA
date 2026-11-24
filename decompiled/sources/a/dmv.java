package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dmv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dmv f6336a;
    public static final dmv b;
    public static final dmv c;
    public static final /* synthetic */ dmv[] d;

    static {
        dmv dmvVar = new dmv("None", 0);
        f6336a = dmvVar;
        dmv dmvVar2 = new dmv("Selection", 1);
        b = dmvVar2;
        dmv dmvVar3 = new dmv("Cursor", 2);
        c = dmvVar3;
        d = new dmv[]{dmvVar, dmvVar2, dmvVar3};
    }

    public static dmv valueOf(String str) {
        return (dmv) Enum.valueOf(dmv.class, str);
    }

    public static dmv[] values() {
        return (dmv[]) d.clone();
    }
}
