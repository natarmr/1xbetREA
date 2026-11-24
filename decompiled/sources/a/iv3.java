package a;

import com.appsflyer.share.deeplink.DeepLinkResult;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class iv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15425a;

    static {
        int[] iArr = new int[DeepLinkResult.Status.values().length];
        try {
            iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeepLinkResult.Status.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f15425a = iArr;
    }
}
