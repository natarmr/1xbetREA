package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ikp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ikp f14938a;
    public static final ikp b;
    public static final /* synthetic */ ikp[] c;

    static {
        ikp ikpVar = new ikp("SPORT", 0);
        f14938a = ikpVar;
        ikp ikpVar2 = new ikp("SPORT_BY_COUNTRY", 1);
        b = ikpVar2;
        c = new ikp[]{ikpVar, ikpVar2};
    }

    public static ikp valueOf(String str) {
        return (ikp) Enum.valueOf(ikp.class, str);
    }

    public static ikp[] values() {
        return (ikp[]) c.clone();
    }
}
