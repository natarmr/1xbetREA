package org.xplatform.game_broadcasting.api.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005Ê\u0001\u0002\b\u0007¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;", "Landroid/os/Parcelable;", "Static", "Theme", "Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Static;", "Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Theme;", "api", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface GameVideoPlayerColorScheme extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Static;", "Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Static implements GameVideoPlayerColorScheme {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Static f46687a = new Static();
        public static final Parcelable.Creator<Static> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Static);
        }

        public final int hashCode() {
            return -1172891413;
        }

        public final String toString() {
            return "Static";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Theme;", "Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Theme implements GameVideoPlayerColorScheme {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Theme f46688a = new Theme();
        public static final Parcelable.Creator<Theme> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Theme);
        }

        public final int hashCode() {
            return -2115475540;
        }

        public final String toString() {
            return "Theme";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
