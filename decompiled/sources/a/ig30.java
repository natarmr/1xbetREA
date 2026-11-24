package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ig30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14718a;
    public final String b;
    public final String c;
    public final String d;

    public ig30(String str, String str2, String str3, String str4) {
        str.getClass();
        this.f14718a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig30)) {
            return false;
        }
        ig30 ig30Var = (ig30) obj;
        return Intrinsics.d(this.f14718a, ig30Var.f14718a) && Intrinsics.d(this.b, ig30Var.b) && Intrinsics.d(this.c, ig30Var.c) && Intrinsics.d(this.d, ig30Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f14718a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(b1j.n("MatchTimerUiModel(timerInfo=", this.f14718a, ", hours=", this.b, ", minutes="), this.c, ", seconds=", this.d, Separators.RPAREN);
    }
}
