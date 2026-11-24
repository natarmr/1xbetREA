package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nfj f23439a;
    public static final /* synthetic */ nfj[] b;

    /* JADX INFO: Fake field, exist only in values array */
    nfj EF0;

    static {
        nfj nfjVar = new nfj("DAY_MONTH_YEAR", 0);
        nfj nfjVar2 = new nfj("MONTH_YEAR", 1);
        f23439a = nfjVar2;
        b = new nfj[]{nfjVar, nfjVar2, new nfj("YEAR", 2)};
    }

    public static nfj valueOf(String str) {
        return (nfj) Enum.valueOf(nfj.class, str);
    }

    public static nfj[] values() {
        return (nfj[]) b.clone();
    }
}
