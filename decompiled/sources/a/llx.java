package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class llx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final llx f20269a;
    public static final llx b;
    public static final llx c;
    public static final llx d;
    public static final /* synthetic */ llx[] e;

    static {
        llx llxVar = new llx("NONE", 0);
        f20269a = llxVar;
        llx llxVar2 = new llx("UPDATE_COUPON_TYPE", 1);
        b = llxVar2;
        llx llxVar3 = new llx("CREATE_BLOCKS_LIST", 2);
        c = llxVar3;
        llx llxVar4 = new llx("UPDATE_BLOCKS_LIST", 3);
        d = llxVar4;
        e = new llx[]{llxVar, llxVar2, llxVar3, llxVar4};
    }

    public static llx valueOf(String str) {
        return (llx) Enum.valueOf(llx.class, str);
    }

    public static llx[] values() {
        return (llx[]) e.clone();
    }
}
