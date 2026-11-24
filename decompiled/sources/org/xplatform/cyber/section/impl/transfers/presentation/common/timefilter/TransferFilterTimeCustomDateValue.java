package org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005Ê\u0001\u0002\b\u0007¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue;", "Landroid/os/Parcelable;", "Selected", "Unselected", "Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;", "Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Unselected;", "impl", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface TransferFilterTimeCustomDateValue extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;", "Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Selected implements TransferFilterTimeCustomDateValue {
        public static final Parcelable.Creator<Selected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SimpleDate f46616a;

        public Selected(SimpleDate simpleDate) {
            simpleDate.getClass();
            this.f46616a = simpleDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Selected) && Intrinsics.d(this.f46616a, ((Selected) obj).f46616a);
        }

        public final int hashCode() {
            return this.f46616a.hashCode();
        }

        public final String toString() {
            return "Selected(time=" + this.f46616a + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f46616a, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Unselected;", "Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Unselected implements TransferFilterTimeCustomDateValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unselected f46617a = new Unselected();
        public static final Parcelable.Creator<Unselected> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unselected);
        }

        public final int hashCode() {
            return -1975622959;
        }

        public final String toString() {
            return "Unselected";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
