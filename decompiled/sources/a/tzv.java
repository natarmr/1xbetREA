package a;

import android.os.Parcelable;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class tzv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f34822a;

    static {
        int[] iArr = new int[HistoryTypeModel.values().length];
        try {
            Parcelable.Creator<HistoryTypeModel> creator = HistoryTypeModel.CREATOR;
            iArr[5] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f34822a = iArr;
    }
}
