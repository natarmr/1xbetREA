package org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum;

import a.kng0;
import a.l7n0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SwipexChangeBetValueViewModel$BetValue implements Parcelable {
    public static final Parcelable.Creator<SwipexChangeBetValueViewModel$BetValue> CREATOR = new l7n0((byte) 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47114a;
    public final double b;

    public SwipexChangeBetValueViewModel$BetValue(String str) {
        Double dI;
        this.f47114a = str;
        this.b = (str == null || (dI = b.i(str)) == null) ? 0.0d : dI.doubleValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SwipexChangeBetValueViewModel$BetValue) && Intrinsics.d(this.f47114a, ((SwipexChangeBetValueViewModel$BetValue) obj).f47114a);
    }

    public final int hashCode() {
        String str = this.f47114a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("BetValue(rawValue=", this.f47114a, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47114a);
    }
}
