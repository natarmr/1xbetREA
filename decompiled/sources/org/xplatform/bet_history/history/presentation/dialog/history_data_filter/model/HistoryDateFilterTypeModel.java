package org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model;

import a.yoo;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;", "Landroid/os/Parcelable;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HistoryDateFilterTypeModel implements Parcelable {
    public static final Parcelable.Creator<HistoryDateFilterTypeModel> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HistoryDateFilterTypeModel f46397a;
    public static final HistoryDateFilterTypeModel b;
    public static final HistoryDateFilterTypeModel c;
    public static final HistoryDateFilterTypeModel d;
    public static final /* synthetic */ HistoryDateFilterTypeModel[] e;

    static {
        HistoryDateFilterTypeModel historyDateFilterTypeModel = new HistoryDateFilterTypeModel("DAY", 0);
        f46397a = historyDateFilterTypeModel;
        HistoryDateFilterTypeModel historyDateFilterTypeModel2 = new HistoryDateFilterTypeModel("FULL", 1);
        b = historyDateFilterTypeModel2;
        HistoryDateFilterTypeModel historyDateFilterTypeModel3 = new HistoryDateFilterTypeModel("PERIOD", 2);
        c = historyDateFilterTypeModel3;
        HistoryDateFilterTypeModel historyDateFilterTypeModel4 = new HistoryDateFilterTypeModel("SEND_HISTORY", 3);
        d = historyDateFilterTypeModel4;
        e = new HistoryDateFilterTypeModel[]{historyDateFilterTypeModel, historyDateFilterTypeModel2, historyDateFilterTypeModel3, historyDateFilterTypeModel4};
        CREATOR = new yoo((byte) 25);
    }

    public static HistoryDateFilterTypeModel valueOf(String str) {
        return (HistoryDateFilterTypeModel) Enum.valueOf(HistoryDateFilterTypeModel.class, str);
    }

    public static HistoryDateFilterTypeModel[] values() {
        return (HistoryDateFilterTypeModel[]) e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
