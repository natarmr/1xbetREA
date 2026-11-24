package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class blv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final blv f2811a;
    public static final blv b;
    public static final blv c;
    public static final /* synthetic */ blv[] d;

    static {
        blv blvVar = new blv("Cursor", 0);
        f2811a = blvVar;
        blv blvVar2 = new blv("SelectionStart", 1);
        b = blvVar2;
        blv blvVar3 = new blv("SelectionEnd", 2);
        c = blvVar3;
        d = new blv[]{blvVar, blvVar2, blvVar3};
    }

    public static blv valueOf(String str) {
        return (blv) Enum.valueOf(blv.class, str);
    }

    public static blv[] values() {
        return (blv[]) d.clone();
    }
}
