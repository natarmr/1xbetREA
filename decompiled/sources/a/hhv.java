package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hhv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hhv f13084a;
    public static final hhv b;
    public static final hhv c;
    public static final hhv d;
    public static final /* synthetic */ hhv[] e;

    static {
        hhv hhvVar = new hhv("FIRST", 0);
        f13084a = hhvVar;
        hhv hhvVar2 = new hhv("MIDDLE", 1);
        b = hhvVar2;
        hhv hhvVar3 = new hhv("LAST", 2);
        c = hhvVar3;
        hhv hhvVar4 = new hhv("SINGLE", 3);
        d = hhvVar4;
        e = new hhv[]{hhvVar, hhvVar2, hhvVar3, hhvVar4};
    }

    public static hhv valueOf(String str) {
        return (hhv) Enum.valueOf(hhv.class, str);
    }

    public static hhv[] values() {
        return (hhv[]) e.clone();
    }
}
