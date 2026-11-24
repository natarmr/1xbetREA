package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class crp {
    public static final brp Companion = new brp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4855a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ crp(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.f4855a = null;
        } else {
            this.f4855a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crp)) {
            return false;
        }
        crp crpVar = (crp) obj;
        return Intrinsics.d(this.f4855a, crpVar.f4855a) && Intrinsics.d(this.b, crpVar.b) && Intrinsics.d(this.c, crpVar.c);
    }

    public final int hashCode() {
        String str = this.f4855a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(b1j.n("FieldResponse(key=", this.f4855a, ", label=", this.b, ", required="), this.c, Separators.RPAREN);
    }
}
