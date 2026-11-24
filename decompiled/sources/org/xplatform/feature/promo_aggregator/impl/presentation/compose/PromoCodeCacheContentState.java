package org.xplatform.feature.promo_aggregator.impl.presentation.compose;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;", "Landroid/os/Parcelable;", "Empty", "Error", "DetailsPromo", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface PromoCodeCacheContentState extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState$DetailsPromo;", "Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class DetailsPromo implements PromoCodeCacheContentState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DetailsPromo f46656a = new DetailsPromo();
        public static final Parcelable.Creator<DetailsPromo> CREATOR = new c();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DetailsPromo);
        }

        public final int hashCode() {
            return -543132757;
        }

        public final String toString() {
            return "DetailsPromo";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState$Empty;", "Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Empty implements PromoCodeCacheContentState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Empty f46657a = new Empty();
        public static final Parcelable.Creator<Empty> CREATOR = new d();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 771271503;
        }

        public final String toString() {
            return "Empty";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState$Error;", "Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Error implements PromoCodeCacheContentState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Error f46658a = new Error();
        public static final Parcelable.Creator<Error> CREATOR = new e();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 771422218;
        }

        public final String toString() {
            return "Error";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
