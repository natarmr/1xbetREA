package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29078a;
    public final String b;
    public final String c;
    public final String d;

    public qol(String str, String str2, String str3, String str4) {
        this.f29078a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qol)) {
            return false;
        }
        qol qolVar = (qol) obj;
        return Intrinsics.d(this.f29078a, qolVar.f29078a) && Intrinsics.d(this.b, qolVar.b) && Intrinsics.d(this.c, qolVar.c) && Intrinsics.d(this.d, qolVar.d);
    }

    public final int hashCode() {
        String str = this.f29078a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(b1j.n("DsAggregatorSmallTimerLabels(days=", this.f29078a, ", hours=", this.b, ", minutes="), this.c, ", seconds=", this.d, Separators.RPAREN);
    }

    public /* synthetic */ qol(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null, null);
    }
}
