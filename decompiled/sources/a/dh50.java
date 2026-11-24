package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dh50 {
    public static final ch50 Companion = new ch50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f6077a;
    public final String b;
    public final String c;

    public /* synthetic */ dh50(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f6077a = null;
        } else {
            this.f6077a = l;
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
        if (!(obj instanceof dh50)) {
            return false;
        }
        dh50 dh50Var = (dh50) obj;
        return Intrinsics.d(this.f6077a, dh50Var.f6077a) && Intrinsics.d(this.b, dh50Var.b) && Intrinsics.d(this.c, dh50Var.c);
    }

    public final int hashCode() {
        Long l = this.f6077a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f6077a, "NearestGameDetailsOppResponse(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
