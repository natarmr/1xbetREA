package org.xplatform.results.impl.presentation.dialogs.results.params;

import a.sne0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SelectDateScreenParams implements Parcelable {
    public static final Parcelable.Creator<SelectDateScreenParams> CREATOR = new sne0((byte) 25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f46901a;
    public final String b;

    public SelectDateScreenParams(Date date, String str) {
        str.getClass();
        this.f46901a = date;
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
        if (!(obj instanceof SelectDateScreenParams)) {
            return false;
        }
        SelectDateScreenParams selectDateScreenParams = (SelectDateScreenParams) obj;
        return Intrinsics.d(this.f46901a, selectDateScreenParams.f46901a) && Intrinsics.d(this.b, selectDateScreenParams.b);
    }

    public final int hashCode() {
        Date date = this.f46901a;
        return this.b.hashCode() + ((date == null ? 0 : date.hashCode()) * 31);
    }

    public final String toString() {
        return "SelectDateScreenParams(chosenDate=" + this.f46901a + ", requestKey=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.f46901a);
        parcel.writeString(this.b);
    }
}
