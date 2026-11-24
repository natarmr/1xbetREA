package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class hdf {
    public static final gdf Companion = new gdf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12866a;
    public final String b;

    public /* synthetic */ hdf(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f12866a = null;
        } else {
            this.f12866a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdf)) {
            return false;
        }
        hdf hdfVar = (hdf) obj;
        return Intrinsics.d(this.f12866a, hdfVar.f12866a) && Intrinsics.d(this.b, hdfVar.b);
    }

    public final int hashCode() {
        String str = this.f12866a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("CricketPointsResponse(runs=", this.f12866a, ", points=", this.b, Separators.RPAREN);
    }
}
