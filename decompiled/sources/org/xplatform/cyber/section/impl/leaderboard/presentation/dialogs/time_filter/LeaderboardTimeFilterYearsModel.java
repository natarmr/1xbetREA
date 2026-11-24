package org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.time_filter;

import a.imw;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LeaderboardTimeFilterYearsModel implements Parcelable {
    public static final Parcelable.Creator<LeaderboardTimeFilterYearsModel> CREATOR = new imw(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46582a;
    public final String b;

    public LeaderboardTimeFilterYearsModel(int i, String str) {
        str.getClass();
        this.f46582a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardTimeFilterYearsModel)) {
            return false;
        }
        LeaderboardTimeFilterYearsModel leaderboardTimeFilterYearsModel = (LeaderboardTimeFilterYearsModel) obj;
        return this.f46582a == leaderboardTimeFilterYearsModel.f46582a && Intrinsics.d(this.b, leaderboardTimeFilterYearsModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f46582a) * 31);
    }

    public final String toString() {
        return c.b(this.f46582a, "LeaderboardTimeFilterYearsModel(id=", ", year=", this.b, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46582a);
        parcel.writeString(this.b);
    }
}
