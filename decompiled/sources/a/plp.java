package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class plp implements qlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27196a;
    public final String b;
    public final long c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;

    public plp(boolean z, String str, long j, int i, String str2, boolean z2, String str3) {
        str.getClass();
        str3.getClass();
        this.f27196a = z;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = str2;
        this.f = z2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plp)) {
            return false;
        }
        plp plpVar = (plp) obj;
        return this.f27196a == plpVar.f27196a && Intrinsics.d(this.b, plpVar.b) && this.c == plpVar.c && this.d == plpVar.d && this.e.equals(plpVar.e) && this.f == plpVar.f && Intrinsics.d(this.g, plpVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(ua80.b(twn.a(this.d, rw2.b(ua80.b(Boolean.hashCode(this.f27196a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("FeedsChampTitleItem(live=", ", title=", this.b, this.f27196a, ", sportId=");
        ua80.v(sbQ, this.c, ", subSportId=", this.d);
        w6x.z(", iconUrl=", this.e, ", showIconTint=", sbQ, this.f);
        return rw2.o(sbQ, ", cyberSportIcon=", this.g, Separators.RPAREN);
    }
}
