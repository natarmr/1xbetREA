package org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter;

import a.xhs0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005Ê\u0001\u0002\b\u0007¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;", "Landroid/os/Parcelable;", "SimpleTime", "CustomTime", "Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;", "Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;", "impl", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface TransferTimeFilterUiModel extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;", "Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CustomTime implements TransferTimeFilterUiModel {
        public static final Parcelable.Creator<CustomTime> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferFilterTimeCustomDateValue f46618a;
        public final TransferFilterTimeCustomDateValue b;

        public CustomTime(TransferFilterTimeCustomDateValue transferFilterTimeCustomDateValue, TransferFilterTimeCustomDateValue transferFilterTimeCustomDateValue2) {
            transferFilterTimeCustomDateValue.getClass();
            transferFilterTimeCustomDateValue2.getClass();
            this.f46618a = transferFilterTimeCustomDateValue;
            this.b = transferFilterTimeCustomDateValue2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTime)) {
                return false;
            }
            CustomTime customTime = (CustomTime) obj;
            return Intrinsics.d(this.f46618a, customTime.f46618a) && Intrinsics.d(this.b, customTime.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f46618a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTime(start=" + this.f46618a + ", end=" + this.b + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f46618a, i);
            parcel.writeParcelable(this.b, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;", "Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SimpleTime implements TransferTimeFilterUiModel {
        public static final Parcelable.Creator<SimpleTime> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xhs0 f46619a;

        public SimpleTime(xhs0 xhs0Var) {
            xhs0Var.getClass();
            this.f46619a = xhs0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SimpleTime) && this.f46619a == ((SimpleTime) obj).f46619a;
        }

        public final int hashCode() {
            return this.f46619a.hashCode();
        }

        public final String toString() {
            return "SimpleTime(transferTimeFilter=" + this.f46619a + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46619a.name());
        }
    }
}
