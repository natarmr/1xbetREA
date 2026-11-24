package org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005Ê\u0001\u0002\b\u0007¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;", "Landroid/os/Parcelable;", "SingleDate", "Interval", "Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$Interval;", "Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$SingleDate;", "impl", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ChoosenDate extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$Interval;", "Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Interval implements ChoosenDate {
        public static final Parcelable.Creator<Interval> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Date f46659a;
        public final Date b;

        public Interval(Date date, Date date2) {
            date.getClass();
            date2.getClass();
            this.f46659a = date;
            this.b = date2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return Intrinsics.d(this.f46659a, interval.f46659a) && Intrinsics.d(this.b, interval.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f46659a.hashCode() * 31);
        }

        public final String toString() {
            return "Interval(start=" + this.f46659a + ", end=" + this.b + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.f46659a);
            parcel.writeSerializable(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$SingleDate;", "Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SingleDate implements ChoosenDate {
        public static final Parcelable.Creator<SingleDate> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Date f46660a;

        public SingleDate(Date date) {
            date.getClass();
            this.f46660a = date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SingleDate) && Intrinsics.d(this.f46660a, ((SingleDate) obj).f46660a);
        }

        public final int hashCode() {
            return this.f46660a.hashCode();
        }

        public final String toString() {
            return "SingleDate(date=" + this.f46660a + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.f46660a);
        }
    }
}
