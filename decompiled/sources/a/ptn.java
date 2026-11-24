package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ptn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ptn f27573a;
    public static final ptn b;
    public static final ptn c;
    public static final /* synthetic */ ptn[] d;

    static {
        ptn ptnVar = new ptn("DAY_EXPRESS", 0);
        f27573a = ptnVar;
        ptn ptnVar2 = new ptn("DOWNLOAD_COUPON", 1);
        b = ptnVar2;
        ptn ptnVar3 = new ptn("GENERATE_COUPON", 2);
        c = ptnVar3;
        d = new ptn[]{ptnVar, ptnVar2, ptnVar3};
    }

    public static ptn valueOf(String str) {
        return (ptn) Enum.valueOf(ptn.class, str);
    }

    public static ptn[] values() {
        return (ptn[]) d.clone();
    }
}
