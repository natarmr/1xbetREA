package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class a280 {
    public static final z180 Companion = new z180();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f113a;
    public final String b;
    public final String c;

    public /* synthetic */ a280(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f113a = null;
        } else {
            this.f113a = l;
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
        if (!(obj instanceof a280)) {
            return false;
        }
        a280 a280Var = (a280) obj;
        return Intrinsics.d(this.f113a, a280Var.f113a) && Intrinsics.d(this.b, a280Var.b) && Intrinsics.d(this.c, a280Var.c);
    }

    public final int hashCode() {
        Long l = this.f113a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f113a, "OpponentElementResponse(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
