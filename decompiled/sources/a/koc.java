package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class koc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final koc f18625a;
    public static final koc b;
    public static final koc c;
    public static final /* synthetic */ koc[] d;

    static {
        koc kocVar = new koc("DAY_EXPRESS", 0);
        f18625a = kocVar;
        koc kocVar2 = new koc("DOWNLOAD_COUPON", 1);
        b = kocVar2;
        koc kocVar3 = new koc("GENERATE_COUPON", 2);
        c = kocVar3;
        d = new koc[]{kocVar, kocVar2, kocVar3};
    }

    public static koc valueOf(String str) {
        return (koc) Enum.valueOf(koc.class, str);
    }

    public static koc[] values() {
        return (koc[]) d.clone();
    }
}
