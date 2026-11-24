package org.xplatform.special_event.impl.main.presentation.model;

import a.lbi0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;", "Landroid/os/Parcelable;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum SpecialEventTabs implements Parcelable {
    SCHEDULE("top_champ_schedule"),
    MY_GAMES("top_champ_my_matches"),
    STATISTIC("top_champ_statistics"),
    TOURNAMENT("top_champ_tournament");

    public static final Parcelable.Creator<SpecialEventTabs> CREATOR = new lbi0(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46968a;

    SpecialEventTabs(String str) {
        this.f46968a = str;
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
