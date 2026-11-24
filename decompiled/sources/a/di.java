package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class di {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final di f6116a;
    public static final di b;
    public static final di c;
    public static final di d;
    public static final /* synthetic */ di[] e;

    static {
        di diVar = new di("SAVE_COUPON", 0);
        f6116a = diVar;
        di diVar2 = new di("DOWNLOAD_COUPON", 1);
        b = diVar2;
        di diVar3 = new di("GENERATE_COUPON", 2);
        c = diVar3;
        di diVar4 = new di("SHARE_COUPON", 3);
        d = diVar4;
        e = new di[]{diVar, diVar2, diVar3, diVar4};
    }

    public static di valueOf(String str) {
        return (di) Enum.valueOf(di.class, str);
    }

    public static di[] values() {
        return (di[]) e.clone();
    }
}
