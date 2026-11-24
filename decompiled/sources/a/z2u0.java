package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class z2u0 {
    public static final x2u0 Companion = new x2u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f43689a;
    public final String b;
    public final String c;

    public /* synthetic */ z2u0(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f43689a = null;
        } else {
            this.f43689a = l;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2u0)) {
            return false;
        }
        z2u0 z2u0Var = (z2u0) obj;
        return Intrinsics.d(this.f43689a, z2u0Var.f43689a) && Intrinsics.d(this.b, z2u0Var.b) && Intrinsics.d(this.c, z2u0Var.c);
    }

    public final int hashCode() {
        Long l = this.f43689a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f43689a, "ValueColTitleResponse(id=", ", title=", this.b, ", prompt="), this.c, Separators.RPAREN);
    }
}
