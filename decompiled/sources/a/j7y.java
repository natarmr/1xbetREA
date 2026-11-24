package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class j7y {
    public static final i7y Companion = new i7y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16061a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ j7y(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f16061a = null;
        } else {
            this.f16061a = str;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7y)) {
            return false;
        }
        j7y j7yVar = (j7y) obj;
        return Intrinsics.d(this.f16061a, j7yVar.f16061a) && Intrinsics.d(this.b, j7yVar.b) && Intrinsics.d(this.c, j7yVar.c) && Intrinsics.d(this.d, j7yVar.d);
    }

    public final int hashCode() {
        String str = this.f16061a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(b1j.n("JackpotSum(hour=", this.f16061a, ", day=", this.b, ", week="), this.c, ", month=", this.d, Separators.RPAREN);
    }
}
