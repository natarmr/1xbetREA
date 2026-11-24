package org.xplatform.special_event.impl.results.presentation.model;

import a.rw2;
import a.sne0;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ResultsScreenParams implements Parcelable {
    public static final Parcelable.Creator<ResultsScreenParams> CREATOR = new sne0((byte) 15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46971a;
    public final long b;
    public final Long c;

    public ResultsScreenParams(int i, long j, Long l) {
        this.f46971a = i;
        this.b = j;
        this.c = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultsScreenParams)) {
            return false;
        }
        ResultsScreenParams resultsScreenParams = (ResultsScreenParams) obj;
        return this.f46971a == resultsScreenParams.f46971a && this.b == resultsScreenParams.b && Intrinsics.d(this.c, resultsScreenParams.c);
    }

    public final int hashCode() {
        int iB = rw2.b(Integer.hashCode(this.f46971a) * 31, 31, this.b);
        Long l = this.c;
        return iB + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f46971a, this.b, "ResultsScreenParams(eventId=", ", selectedSportFilterId=");
        sbQ.append(", dateTime=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46971a);
        parcel.writeLong(this.b);
        Long l = this.c;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }
}
