package org.xplatform.game_broadcasting.api.presentation.models.events;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent;", "Landroid/os/Parcelable;", "Stop", "Windowed", "Fullscreen", "Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Fullscreen;", "Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Stop;", "Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Windowed;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface BroadcastingLandscapeZoneEvent extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Fullscreen;", "Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Fullscreen implements BroadcastingLandscapeZoneEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Fullscreen f46696a = new Fullscreen();
        public static final Parcelable.Creator<Fullscreen> CREATOR = new d();

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

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Stop;", "Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Stop implements BroadcastingLandscapeZoneEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Stop f46697a = new Stop();
        public static final Parcelable.Creator<Stop> CREATOR = new e();

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

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Windowed;", "Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Windowed implements BroadcastingLandscapeZoneEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Windowed f46698a = new Windowed();
        public static final Parcelable.Creator<Windowed> CREATOR = new f();

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
}
