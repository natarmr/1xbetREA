package org.xplatform.game_broadcasting.api.presentation.models.events;

import a.qo7;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingVideoEvent$Fullscreen", "", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BroadcastingVideoEvent$Fullscreen implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BroadcastingVideoEvent$Fullscreen f46699a = new BroadcastingVideoEvent$Fullscreen();
    public static final Parcelable.Creator<BroadcastingVideoEvent$Fullscreen> CREATOR = new qo7((byte) 13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
