package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mi50 {
    public static final li50 Companion = new li50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21827a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ mi50(int i, Long l, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f21827a = null;
        } else {
            this.f21827a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi50)) {
            return false;
        }
        mi50 mi50Var = (mi50) obj;
        return Intrinsics.d(this.f21827a, mi50Var.f21827a) && Intrinsics.d(this.b, mi50Var.b) && Intrinsics.d(this.c, mi50Var.c) && Intrinsics.d(this.d, mi50Var.d);
    }

    public final int hashCode() {
        Long l = this.f21827a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(cs0.s(this.f21827a, "NearestGameDetailsTableStatItemResponse(id=", ", s1=", this.b, ", s2="), this.c, ", name=", this.d, Separators.RPAREN);
    }
}
