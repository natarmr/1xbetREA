package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class sf90 {
    public static final rf90 Companion = new rf90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32107a;
    public final String b;
    public final String c;

    public /* synthetic */ sf90(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f32107a = null;
        } else {
            this.f32107a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf90)) {
            return false;
        }
        sf90 sf90Var = (sf90) obj;
        return Intrinsics.d(this.f32107a, sf90Var.f32107a) && Intrinsics.d(this.b, sf90Var.b) && Intrinsics.d(this.c, sf90Var.c);
    }

    public final int hashCode() {
        String str = this.f32107a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("PeriodStatisticResponse(title=", this.f32107a, ", score1=", this.b, ", score2="), this.c, Separators.RPAREN);
    }
}
