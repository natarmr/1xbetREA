package org.xplatform.bet_history.history.domain.model.bet_history;

import a.c0o;
import a.l7n0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/bet_history/history/domain/model/bet_history/TimeTypeModel;", "Landroid/os/Parcelable;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TimeTypeModel implements Parcelable {
    public static final Parcelable.Creator<TimeTypeModel> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeTypeModel f46394a;
    public static final /* synthetic */ TimeTypeModel[] b;
    public static final /* synthetic */ c0o c;

    /* JADX INFO: Fake field, exist only in values array */
    TimeTypeModel EF0;

    static {
        TimeTypeModel timeTypeModel = new TimeTypeModel("ONE_HOUR", 0);
        TimeTypeModel timeTypeModel2 = new TimeTypeModel("TWO_HOUR", 1);
        TimeTypeModel timeTypeModel3 = new TimeTypeModel("SIX_HOUR", 2);
        TimeTypeModel timeTypeModel4 = new TimeTypeModel("TWELVE_HOUR", 3);
        TimeTypeModel timeTypeModel5 = new TimeTypeModel("ONE_DAY", 4);
        TimeTypeModel timeTypeModel6 = new TimeTypeModel("WEEK", 5);
        f46394a = timeTypeModel6;
        TimeTypeModel[] timeTypeModelArr = {timeTypeModel, timeTypeModel2, timeTypeModel3, timeTypeModel4, timeTypeModel5, timeTypeModel6, new TimeTypeModel("ALWAYS", 6)};
        b = timeTypeModelArr;
        c = new c0o(timeTypeModelArr);
        CREATOR = new l7n0((byte) 19);
    }

    public static TimeTypeModel valueOf(String str) {
        return (TimeTypeModel) Enum.valueOf(TimeTypeModel.class, str);
    }

    public static TimeTypeModel[] values() {
        return (TimeTypeModel[]) b.clone();
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
