package org.xplatform.statistic.rating.api.di;

import a.brm0;
import a.f140;
import a.kng0;
import a.twn;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;", "Landroid/os/Parcelable;", "GameParamsStatistic", "EventParamsStatistic", "Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$EventParamsStatistic;", "Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$GameParamsStatistic;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface RatingStatisticScreenParams extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$EventParamsStatistic;", "Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class EventParamsStatistic implements RatingStatisticScreenParams {
        public static final Parcelable.Creator<EventParamsStatistic> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47060a;
        public final int b;
        public final long c;

        public EventParamsStatistic(String str, int i, long j) {
            str.getClass();
            this.f47060a = str;
            this.b = i;
            this.c = j;
        }

        @Override // org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams
        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getB() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventParamsStatistic)) {
                return false;
            }
            EventParamsStatistic eventParamsStatistic = (EventParamsStatistic) obj;
            return Intrinsics.d(this.f47060a, eventParamsStatistic.f47060a) && this.b == eventParamsStatistic.b && this.c == eventParamsStatistic.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + twn.a(this.b, this.f47060a.hashCode() * 31, 31);
        }

        public final String toString() {
            return brm0.k(this.c, Separators.RPAREN, kng0.p(this.b, "EventParamsStatistic(eventId=", this.f47060a, ", globalChampId=", ", sportId="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f47060a);
            parcel.writeInt(this.b);
            parcel.writeLong(this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$GameParamsStatistic;", "Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class GameParamsStatistic implements RatingStatisticScreenParams {
        public static final Parcelable.Creator<GameParamsStatistic> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47061a;
        public final long b;

        public GameParamsStatistic(String str, long j) {
            str.getClass();
            this.f47061a = str;
            this.b = j;
        }

        @Override // org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams
        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getB() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GameParamsStatistic)) {
                return false;
            }
            GameParamsStatistic gameParamsStatistic = (GameParamsStatistic) obj;
            return Intrinsics.d(this.f47061a, gameParamsStatistic.f47061a) && this.b == gameParamsStatistic.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.f47061a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sbO = f140.o(this.b, "GameParamsStatistic(gameId=", this.f47061a, ", sportId=");
            sbO.append(Separators.RPAREN);
            return sbO.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f47061a);
            parcel.writeLong(this.b);
        }
    }

    /* JADX INFO: renamed from: c */
    long getB();
}
