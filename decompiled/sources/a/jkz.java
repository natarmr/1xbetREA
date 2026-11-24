package a;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class jkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16692a;

    static {
        int[] iArr = new int[kkz.values().length];
        try {
            iArr[kkz.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kkz.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kkz.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[kkz.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[kkz.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[kkz.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[kkz.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f16692a = iArr;
    }
}
