package org.xplatform.statistic.tennis.impl.summary.presentation.chose_filter;

import a.b1j;
import a.qo7;
import a.rz4;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ChoseFilterScreenParams implements Parcelable {
    public static final Parcelable.Creator<ChoseFilterScreenParams> CREATOR = new qo7((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47099a;
    public final String b;
    public final ArrayList c;

    public ChoseFilterScreenParams(String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.f47099a = str;
        this.b = str2;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChoseFilterScreenParams)) {
            return false;
        }
        ChoseFilterScreenParams choseFilterScreenParams = (ChoseFilterScreenParams) obj;
        return Intrinsics.d(this.f47099a, choseFilterScreenParams.f47099a) && Intrinsics.d(this.b, choseFilterScreenParams.b) && this.c.equals(choseFilterScreenParams.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f47099a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.n(b1j.n("ChoseFilterScreenParams(requestKey=", this.f47099a, ", title=", this.b, ", filters="), this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47099a);
        parcel.writeString(this.b);
        ArrayList arrayList = this.c;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ChoseFilterUiModel) it.next()).writeToParcel(parcel, i);
        }
    }
}
