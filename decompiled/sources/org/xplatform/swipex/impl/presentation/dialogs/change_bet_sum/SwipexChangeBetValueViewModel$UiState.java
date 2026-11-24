package org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum;

import a.brm0;
import a.hne;
import a.l7n0;
import a.ohs0;
import a.rz4;
import a.ua80;
import a.w6x;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SwipexChangeBetValueViewModel$UiState implements Parcelable {
    public static final Parcelable.Creator<SwipexChangeBetValueViewModel$UiState> CREATOR = new l7n0((byte) 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47115a;
    public final SwipexChangeBetValueViewModel$BetValue b;
    public final boolean c;
    public final double d;
    public final double e;
    public final double f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final CharSequence m;

    public SwipexChangeBetValueViewModel$UiState(long j, SwipexChangeBetValueViewModel$BetValue swipexChangeBetValueViewModel$BetValue, boolean z, double d, double d2, double d3, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CharSequence charSequence) {
        swipexChangeBetValueViewModel$BetValue.getClass();
        str.getClass();
        charSequence.getClass();
        this.f47115a = j;
        this.b = swipexChangeBetValueViewModel$BetValue;
        this.c = z;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = str;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = charSequence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipexChangeBetValueViewModel$UiState)) {
            return false;
        }
        SwipexChangeBetValueViewModel$UiState swipexChangeBetValueViewModel$UiState = (SwipexChangeBetValueViewModel$UiState) obj;
        return this.f47115a == swipexChangeBetValueViewModel$UiState.f47115a && Intrinsics.d(this.b, swipexChangeBetValueViewModel$UiState.b) && this.c == swipexChangeBetValueViewModel$UiState.c && Double.compare(this.d, swipexChangeBetValueViewModel$UiState.d) == 0 && Double.compare(this.e, swipexChangeBetValueViewModel$UiState.e) == 0 && Double.compare(this.f, swipexChangeBetValueViewModel$UiState.f) == 0 && Intrinsics.d(this.g, swipexChangeBetValueViewModel$UiState.g) && this.h == swipexChangeBetValueViewModel$UiState.h && this.i == swipexChangeBetValueViewModel$UiState.i && this.j == swipexChangeBetValueViewModel$UiState.j && this.k == swipexChangeBetValueViewModel$UiState.k && this.l == swipexChangeBetValueViewModel$UiState.l && Intrinsics.d(this.m, swipexChangeBetValueViewModel$UiState.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.d(this.f, brm0.d(this.e, brm0.d(this.d, brm0.e((this.b.hashCode() + (Long.hashCode(this.f47115a) * 31)) * 31, 31, this.c), 31), 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(balanceId=");
        sb.append(this.f47115a);
        sb.append(", betValue=");
        sb.append(this.b);
        rz4.A(sb, ", fromUser=", this.c, ", initialBet=");
        sb.append(this.d);
        ohs0.A(sb, this.e, ", betStep=", ", minBetSum=");
        hne.w(sb, this.f, ", currencySymbol=", this.g);
        w6x.A(", decreaseAvailable=", ", increaseAvailable=", sb, this.h, this.i);
        w6x.A(", betStepEnabled=", ", applyEnabled=", sb, this.j, this.k);
        sb.append(", hasInitialBet=");
        sb.append(this.l);
        sb.append(", minBetValue=");
        sb.append((Object) this.m);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f47115a);
        SwipexChangeBetValueViewModel$BetValue swipexChangeBetValueViewModel$BetValue = this.b;
        swipexChangeBetValueViewModel$BetValue.getClass();
        parcel.writeString(swipexChangeBetValueViewModel$BetValue.f47114a);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        TextUtils.writeToParcel(this.m, parcel, i);
    }
}
