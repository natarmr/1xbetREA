package org.xplatform.results.impl.presentation.alt_history;

import a.brm0;
import a.cs0;
import a.dw9;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GamesHistoryResultsParams implements Parcelable {
    public static final Parcelable.Creator<GamesHistoryResultsParams> CREATOR = new yoo((byte) 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46899a;
    public final List b;
    public final boolean c;
    public final int d;

    public GamesHistoryResultsParams(int i, String str, List list, boolean z) {
        str.getClass();
        list.getClass();
        this.f46899a = str;
        this.b = list;
        this.c = z;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesHistoryResultsParams)) {
            return false;
        }
        GamesHistoryResultsParams gamesHistoryResultsParams = (GamesHistoryResultsParams) obj;
        return Intrinsics.d(this.f46899a, gamesHistoryResultsParams.f46899a) && Intrinsics.d(this.b, gamesHistoryResultsParams.b) && this.c == gamesHistoryResultsParams.c && this.d == gamesHistoryResultsParams.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.e(dw9.a(this.f46899a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbF = c.f("GamesHistoryResultsParams(title=", this.f46899a, ", champIds=", this.b, ", isCyber=");
        sbF.append(this.c);
        sbF.append(", cyberType=");
        sbF.append(this.d);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46899a);
        Iterator itT = cs0.t(this.b, parcel);
        while (itT.hasNext()) {
            parcel.writeLong(((Number) itT.next()).longValue());
        }
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
    }
}
