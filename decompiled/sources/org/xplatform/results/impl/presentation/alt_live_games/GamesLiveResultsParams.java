package org.xplatform.results.impl.presentation.alt_live_games;

import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/results/impl/presentation/alt_live_games/GamesLiveResultsParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GamesLiveResultsParams implements Parcelable {
    public static final Parcelable.Creator<GamesLiveResultsParams> CREATOR = new yoo((byte) 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f46900a;

    public GamesLiveResultsParams(Set set) {
        this.f46900a = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GamesLiveResultsParams) && this.f46900a.equals(((GamesLiveResultsParams) obj).f46900a);
    }

    public final int hashCode() {
        return this.f46900a.hashCode();
    }

    public final String toString() {
        return "GamesLiveResultsParams(sportsId=" + this.f46900a + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Set set = this.f46900a;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeLong(((Number) it.next()).longValue());
        }
    }
}
