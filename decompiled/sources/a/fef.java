package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fef f9404a;
    public static final fef b;
    public static final fef c;
    public static final /* synthetic */ fef[] d;

    static {
        fef fefVar = new fef("CROSSED", 0);
        f9404a = fefVar;
        fef fefVar2 = new fef("NOT_CROSSED", 1);
        b = fefVar2;
        fef fefVar3 = new fef("COLLAPSED", 2);
        c = fefVar3;
        d = new fef[]{fefVar, fefVar2, fefVar3};
    }

    public static fef valueOf(String str) {
        return (fef) Enum.valueOf(fef.class, str);
    }

    public static fef[] values() {
        return (fef[]) d.clone();
    }
}
