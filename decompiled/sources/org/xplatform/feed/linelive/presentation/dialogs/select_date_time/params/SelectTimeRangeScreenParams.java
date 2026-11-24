package org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params;

import a.sne0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SelectTimeRangeScreenParams implements Parcelable {
    public static final Parcelable.Creator<SelectTimeRangeScreenParams> CREATOR = new sne0((byte) 28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChoosenDate f46662a;
    public final String b;

    public SelectTimeRangeScreenParams(ChoosenDate choosenDate, String str) {
        choosenDate.getClass();
        str.getClass();
        this.f46662a = choosenDate;
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
        if (!(obj instanceof SelectTimeRangeScreenParams)) {
            return false;
        }
        SelectTimeRangeScreenParams selectTimeRangeScreenParams = (SelectTimeRangeScreenParams) obj;
        return Intrinsics.d(this.f46662a, selectTimeRangeScreenParams.f46662a) && Intrinsics.d(this.b, selectTimeRangeScreenParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46662a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectTimeRangeScreenParams(chosenDate=" + this.f46662a + ", requestKey=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46662a, i);
        parcel.writeString(this.b);
    }
}
