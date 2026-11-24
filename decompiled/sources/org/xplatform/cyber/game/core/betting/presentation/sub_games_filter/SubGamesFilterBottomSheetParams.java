package org.xplatform.cyber.game.core.betting.presentation.sub_games_filter;

import a.axq;
import a.lbi0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SubGamesFilterBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<SubGamesFilterBottomSheetParams> CREATOR = new lbi0((byte) 27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46505a;
    public final String b;

    public SubGamesFilterBottomSheetParams(long j, String str) {
        str.getClass();
        this.f46505a = j;
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
        if (!(obj instanceof SubGamesFilterBottomSheetParams)) {
            return false;
        }
        SubGamesFilterBottomSheetParams subGamesFilterBottomSheetParams = (SubGamesFilterBottomSheetParams) obj;
        return this.f46505a == subGamesFilterBottomSheetParams.f46505a && Intrinsics.d(this.b, subGamesFilterBottomSheetParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f46505a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46505a, "SubGamesFilterBottomSheetParams(selectedSubSportId=", ", resultKey=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46505a);
        parcel.writeString(this.b);
    }
}
