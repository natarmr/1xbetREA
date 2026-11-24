package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jg30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16461a;
    public final String b;
    public final String c;
    public final String d;

    public jg30(String str, String str2, String str3, String str4) {
        str.getClass();
        this.f16461a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg30)) {
            return false;
        }
        jg30 jg30Var = (jg30) obj;
        return Intrinsics.d(this.f16461a, jg30Var.f16461a) && Intrinsics.d(this.b, jg30Var.b) && Intrinsics.d(this.c, jg30Var.c) && Intrinsics.d(this.d, jg30Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f16461a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(b1j.n("MatchTimerUiModel(timerInfo=", this.f16461a, ", hours=", this.b, ", minutes="), this.c, ", seconds=", this.d, Separators.RPAREN);
    }
}
