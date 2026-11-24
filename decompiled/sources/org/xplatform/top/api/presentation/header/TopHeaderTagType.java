package org.xplatform.top.api.presentation.header;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;", "Landroid/os/Parcelable;", "SportTag", "OneXGamesTag", "AggregatorTag", "CyberTag", "Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;", "Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$CyberTag;", "Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$OneXGamesTag;", "Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$SportTag;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface TopHeaderTagType extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;", "Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class AggregatorTag implements TopHeaderTagType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AggregatorTag f47118a = new AggregatorTag();
        public static final Parcelable.Creator<AggregatorTag> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AggregatorTag);
        }

        public final int hashCode() {
            return 1570871772;
        }

        public final String toString() {
            return "AggregatorTag";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$CyberTag;", "Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CyberTag implements TopHeaderTagType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CyberTag f47119a = new CyberTag();
        public static final Parcelable.Creator<CyberTag> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CyberTag);
        }

        public final int hashCode() {
            return 734185174;
        }

        public final String toString() {
            return "CyberTag";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$OneXGamesTag;", "Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class OneXGamesTag implements TopHeaderTagType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OneXGamesTag f47120a = new OneXGamesTag();
        public static final Parcelable.Creator<OneXGamesTag> CREATOR = new c();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OneXGamesTag);
        }

        public final int hashCode() {
            return 168570304;
        }

        public final String toString() {
            return "OneXGamesTag";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$SportTag;", "Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SportTag implements TopHeaderTagType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SportTag f47121a = new SportTag();
        public static final Parcelable.Creator<SportTag> CREATOR = new d();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SportTag);
        }

        public final int hashCode() {
            return -458974757;
        }

        public final String toString() {
            return "SportTag";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
