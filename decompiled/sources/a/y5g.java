package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y5g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y5g f42044a;
    public static final y5g b;
    public static final /* synthetic */ y5g[] c;

    static {
        y5g y5gVar = new y5g("TITLE_DAYS", 0);
        f42044a = y5gVar;
        y5g y5gVar2 = new y5g("NUMBER_DAYS", 1);
        b = y5gVar2;
        c = new y5g[]{y5gVar, y5gVar2};
    }

    public static y5g valueOf(String str) {
        return (y5g) Enum.valueOf(y5g.class, str);
    }

    public static y5g[] values() {
        return (y5g[]) c.clone();
    }
}
