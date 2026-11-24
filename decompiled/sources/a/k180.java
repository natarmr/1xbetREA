package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class k180 {
    public static final i180 Companion = new i180();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f17509a;
    public final String b;
    public final String c;

    public /* synthetic */ k180(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f17509a = null;
        } else {
            this.f17509a = l;
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
        if (!(obj instanceof k180)) {
            return false;
        }
        k180 k180Var = (k180) obj;
        return Intrinsics.d(this.f17509a, k180Var.f17509a) && Intrinsics.d(this.b, k180Var.b) && Intrinsics.d(this.c, k180Var.c);
    }

    public final int hashCode() {
        Long l = this.f17509a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f17509a, "OppResponse(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
