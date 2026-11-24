package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cne0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4650a;
    public final String b;
    public final String c;
    public final String d;

    public cne0(String str, String str2, String str3, String str4) {
        str3.getClass();
        this.f4650a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cne0)) {
            return false;
        }
        cne0 cne0Var = (cne0) obj;
        return this.f4650a.equals(cne0Var.f4650a) && this.b.equals(cne0Var.b) && Intrinsics.d(this.c, cne0Var.c) && this.d.equals(cne0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f4650a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("ReferralInformationModel(referralTag=", this.f4650a, ", postBack=", this.b, ", qTag="), this.c, ", mediaSourceId=", this.d, Separators.RPAREN);
    }
}
