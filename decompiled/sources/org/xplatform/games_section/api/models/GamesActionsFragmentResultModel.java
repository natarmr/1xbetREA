package org.xplatform.games_section.api.models;

import a.axq;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007Ê\u0001\u0002\b\t¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;", "Landroid/os/Parcelable;", "OneXGamesGameUnderMaintenance", "PreviewActionGamesUnderMaintenance", "PreviewActionBonusGamesUnderMaintenance", "Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;", "Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionBonusGamesUnderMaintenance;", "Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;", "api", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface GamesActionsFragmentResultModel extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;", "Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class OneXGamesGameUnderMaintenance implements GamesActionsFragmentResultModel {
        public static final Parcelable.Creator<OneXGamesGameUnderMaintenance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46721a;

        public OneXGamesGameUnderMaintenance(long j) {
            this.f46721a = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OneXGamesGameUnderMaintenance) && this.f46721a == ((OneXGamesGameUnderMaintenance) obj).f46721a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f46721a);
        }

        public final String toString() {
            return axq.h(this.f46721a, "OneXGamesGameUnderMaintenance(gameId=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f46721a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionBonusGamesUnderMaintenance;", "Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PreviewActionBonusGamesUnderMaintenance implements GamesActionsFragmentResultModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PreviewActionBonusGamesUnderMaintenance f46722a = new PreviewActionBonusGamesUnderMaintenance();
        public static final Parcelable.Creator<PreviewActionBonusGamesUnderMaintenance> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PreviewActionBonusGamesUnderMaintenance);
        }

        public final int hashCode() {
            return -1330266031;
        }

        public final String toString() {
            return "PreviewActionBonusGamesUnderMaintenance";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;", "Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PreviewActionGamesUnderMaintenance implements GamesActionsFragmentResultModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PreviewActionGamesUnderMaintenance f46723a = new PreviewActionGamesUnderMaintenance();
        public static final Parcelable.Creator<PreviewActionGamesUnderMaintenance> CREATOR = new c();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PreviewActionGamesUnderMaintenance);
        }

        public final int hashCode() {
            return 1782187080;
        }

        public final String toString() {
            return "PreviewActionGamesUnderMaintenance";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
