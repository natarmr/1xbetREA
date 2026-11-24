package org.xplatform.consultantchat.presentation.dialogs.rate.model;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel;", "Landroid/os/Parcelable;", "NoValue", "Value", "Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel$NoValue;", "Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel$Value;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface RatingModel extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel$NoValue;", "Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NoValue implements RatingModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoValue f46450a = new NoValue();
        public static final Parcelable.Creator<NoValue> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoValue);
        }

        public final int hashCode() {
            return -1675967036;
        }

        public final String toString() {
            return "NoValue";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel$Value;", "Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Value implements RatingModel {
        public static final Parcelable.Creator<Value> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f46451a;
        public final int b;

        public Value(boolean z, int i) {
            this.f46451a = z;
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return this.f46451a == value.f46451a && this.b == value.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Boolean.hashCode(this.f46451a) * 31);
        }

        public final String toString() {
            return "Value(resolved=" + this.f46451a + ", rating=" + this.b + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f46451a ? 1 : 0);
            parcel.writeInt(this.b);
        }
    }
}
