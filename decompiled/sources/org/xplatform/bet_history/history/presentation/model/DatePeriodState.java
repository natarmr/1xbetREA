package org.xplatform.bet_history.history.presentation.model;

import a.axq;
import a.brm0;
import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007Ê\u0001\u0002\b\t¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/bet_history/history/presentation/model/DatePeriodState;", "Landroid/os/Parcelable;", "Day", "Full", "Period", "Lorg/xplatform/bet_history/history/presentation/model/DatePeriodState$Day;", "Lorg/xplatform/bet_history/history/presentation/model/DatePeriodState$Full;", "Lorg/xplatform/bet_history/history/presentation/model/DatePeriodState$Period;", "impl", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface DatePeriodState extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/history/presentation/model/DatePeriodState$Day;", "Lorg/xplatform/bet_history/history/presentation/model/DatePeriodState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Day implements DatePeriodState {
        public static final Parcelable.Creator<Day> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46400a;

        public Day(long j) {
            this.f46400a = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Day) && this.f46400a == ((Day) obj).f46400a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f46400a);
        }

        public final String toString() {
            return axq.h(this.f46400a, "Day(startDate=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f46400a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/history/presentation/model/DatePeriodState$Full;", "Lorg/xplatform/bet_history/history/presentation/model/DatePeriodState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Full implements DatePeriodState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Full f46401a = new Full();
        public static final Parcelable.Creator<Full> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Full);
        }

        public final int hashCode() {
            return 1574603525;
        }

        public final String toString() {
            return "Full";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/history/presentation/model/DatePeriodState$Period;", "Lorg/xplatform/bet_history/history/presentation/model/DatePeriodState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Period implements DatePeriodState {
        public static final Parcelable.Creator<Period> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46402a;
        public final long b;

        public Period(long j, long j2) {
            this.f46402a = j;
            this.b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Period)) {
                return false;
            }
            Period period = (Period) obj;
            return this.f46402a == period.f46402a && this.b == period.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.f46402a) * 31);
        }

        public final String toString() {
            return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f46402a, "Period(startDate=", ", endDate="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f46402a);
            parcel.writeLong(this.b);
        }
    }
}
