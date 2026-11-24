package org.xplatform.swipex.impl.presentation.dialogs.confirmation.models;

import a.b1j;
import a.l7n0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SwipeActionConfirmationParams implements Parcelable {
    public static final Parcelable.Creator<SwipeActionConfirmationParams> CREATOR = new l7n0((byte) 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47116a;
    public final String b;

    public SwipeActionConfirmationParams(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f47116a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeActionConfirmationParams)) {
            return false;
        }
        SwipeActionConfirmationParams swipeActionConfirmationParams = (SwipeActionConfirmationParams) obj;
        return Intrinsics.d(this.f47116a, swipeActionConfirmationParams.f47116a) && Intrinsics.d(this.b, swipeActionConfirmationParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f47116a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SwipeActionConfirmationParams(requestKey=", this.f47116a, ", confirmedResultKey=", this.b, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47116a);
        parcel.writeString(this.b);
    }
}
