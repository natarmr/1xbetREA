package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tol f34290a;
    public static final tol b;
    public static final tol c;
    public static final tol d;
    public static final /* synthetic */ tol[] e;

    static {
        tol tolVar = new tol("EXTRA_SMALL", 0);
        f34290a = tolVar;
        tol tolVar2 = new tol("SMALL", 1);
        b = tolVar2;
        tol tolVar3 = new tol("MEDIUM", 2);
        c = tolVar3;
        tol tolVar4 = new tol("LARGE", 3);
        d = tolVar4;
        e = new tol[]{tolVar, tolVar2, tolVar3, tolVar4};
    }

    public static tol valueOf(String str) {
        return (tol) Enum.valueOf(tol.class, str);
    }

    public static tol[] values() {
        return (tol[]) e.clone();
    }
}
