package a;

import android.os.Parcelable;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d47 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5442a;

    static {
        int[] iArr = new int[HistoryTypeModel.values().length];
        try {
            Parcelable.Creator<HistoryTypeModel> creator = HistoryTypeModel.CREATOR;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            Parcelable.Creator<HistoryTypeModel> creator2 = HistoryTypeModel.CREATOR;
            iArr[6] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            Parcelable.Creator<HistoryTypeModel> creator3 = HistoryTypeModel.CREATOR;
            iArr[7] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            Parcelable.Creator<HistoryTypeModel> creator4 = HistoryTypeModel.CREATOR;
            iArr[5] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f5442a = iArr;
    }
}
