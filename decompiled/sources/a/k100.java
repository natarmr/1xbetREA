package a;

import android.os.Parcelable;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class k100 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17495a;

    static {
        int[] iArr = new int[LimitNeGroupEnum.values().length];
        try {
            Parcelable.Creator<LimitNeGroupEnum> creator = LimitNeGroupEnum.CREATOR;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            Parcelable.Creator<LimitNeGroupEnum> creator2 = LimitNeGroupEnum.CREATOR;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            Parcelable.Creator<LimitNeGroupEnum> creator3 = LimitNeGroupEnum.CREATOR;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f17495a = iArr;
    }
}
