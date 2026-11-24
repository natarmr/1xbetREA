package org.xplatform.results.impl.presentation.alt_champs;

import a.cs0;
import a.dw9;
import a.qo7;
import a.rw2;
import a.twn;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ChampsResultsParams implements Parcelable {
    public static final Parcelable.Creator<ChampsResultsParams> CREATOR = new qo7((byte) 22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46898a;
    public final long b;
    public final int c;
    public final boolean d;

    public ChampsResultsParams(int i, long j, List list, boolean z) {
        list.getClass();
        this.f46898a = list;
        this.b = j;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChampsResultsParams)) {
            return false;
        }
        ChampsResultsParams champsResultsParams = (ChampsResultsParams) obj;
        return Intrinsics.d(this.f46898a, champsResultsParams.f46898a) && this.b == champsResultsParams.b && this.c == champsResultsParams.c && this.d == champsResultsParams.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, rw2.b(this.f46898a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampsResultsParams(sportIds=");
        sb.append(this.f46898a);
        sb.append(", subSportId=");
        sb.append(this.b);
        dw9.v(this.c, ", cyberType=", ", openedFromCybers=", sb, this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator itT = cs0.t(this.f46898a, parcel);
        while (itT.hasNext()) {
            parcel.writeLong(((Number) itT.next()).longValue());
        }
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
