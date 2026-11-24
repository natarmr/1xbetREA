package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tnm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tnm f34243a;
    public static final tnm b;
    public static final /* synthetic */ tnm[] c;

    static {
        tnm tnmVar = new tnm("LINEAR", 0);
        f34243a = tnmVar;
        tnm tnmVar2 = new tnm("RADIAL", 1);
        b = tnmVar2;
        c = new tnm[]{tnmVar, tnmVar2};
    }

    public static tnm valueOf(String str) {
        return (tnm) Enum.valueOf(tnm.class, str);
    }

    public static tnm[] values() {
        return (tnm[]) c.clone();
    }
}
