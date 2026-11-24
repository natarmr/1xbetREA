package a;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ykz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f42815a;

    static {
        int[] iArr = new int[kkz.values().length];
        try {
            iArr[kkz.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kkz.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kkz.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[kkz.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f42815a = iArr;
    }
}
