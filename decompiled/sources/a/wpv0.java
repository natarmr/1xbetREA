package a;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class wpv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f39562a;

    static {
        int[] iArr = new int[uo60.values().length];
        try {
            iArr[uo60.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uo60.UNDER_MAINTENANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[uo60.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f39562a = iArr;
    }
}
