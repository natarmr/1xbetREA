package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rse f31027a;
    public static final rse b;
    public static final rse c;
    public static final /* synthetic */ rse[] d;

    static {
        rse rseVar = new rse("OFFSET", 0);
        f31027a = rseVar;
        rse rseVar2 = new rse("LINE", 1);
        b = rseVar2;
        rse rseVar3 = new rse("DASH", 2);
        c = rseVar3;
        d = new rse[]{rseVar, rseVar2, rseVar3};
    }

    public static rse valueOf(String str) {
        return (rse) Enum.valueOf(rse.class, str);
    }

    public static rse[] values() {
        return (rse[]) d.clone();
    }
}
