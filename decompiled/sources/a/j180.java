package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class j180 {
    public static final h180 Companion = new h180();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f15721a;
    public final String b;
    public final String c;

    public /* synthetic */ j180(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f15721a = null;
        } else {
            this.f15721a = l;
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
        if (!(obj instanceof j180)) {
            return false;
        }
        j180 j180Var = (j180) obj;
        return Intrinsics.d(this.f15721a, j180Var.f15721a) && Intrinsics.d(this.b, j180Var.b) && Intrinsics.d(this.c, j180Var.c);
    }

    public final int hashCode() {
        Long l = this.f15721a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f15721a, "OppResponse(id=", ", image=", this.b, ", name="), this.c, Separators.RPAREN);
    }
}
