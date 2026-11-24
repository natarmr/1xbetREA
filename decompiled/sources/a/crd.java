package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class crd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final crd f4840a;
    public static final crd b;
    public static final crd c;
    public static final crd d;
    public static final /* synthetic */ crd[] e;

    static {
        crd crdVar = new crd("ALWAYS_OVERRIDE", 0);
        f4840a = crdVar;
        crd crdVar2 = new crd("HIGH_PRIORITY_REQUIRED", 1);
        b = crdVar2;
        crd crdVar3 = new crd("REQUIRED", 2);
        c = crdVar3;
        crd crdVar4 = new crd("OPTIONAL", 3);
        d = crdVar4;
        e = new crd[]{crdVar, crdVar2, crdVar3, crdVar4};
    }

    public static crd valueOf(String str) {
        return (crd) Enum.valueOf(crd.class, str);
    }

    public static crd[] values() {
        return (crd[]) e.clone();
    }
}
