package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cdd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cdd f4157a;
    public static final cdd b;
    public static final /* synthetic */ cdd[] c;

    static {
        cdd cddVar = new cdd("HIGHER", 0);
        f4157a = cddVar;
        cdd cddVar2 = new cdd("LOWER", 1);
        b = cddVar2;
        c = new cdd[]{cddVar, cddVar2};
    }

    public static cdd valueOf(String str) {
        return (cdd) Enum.valueOf(cdd.class, str);
    }

    public static cdd[] values() {
        return (cdd[]) c.clone();
    }
}
