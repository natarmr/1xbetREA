package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class yps {
    public static final xps Companion = new xps();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f43046a;
    public final String b;
    public final String c;

    public /* synthetic */ yps(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f43046a = null;
        } else {
            this.f43046a = l;
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
        if (!(obj instanceof yps)) {
            return false;
        }
        yps ypsVar = (yps) obj;
        return Intrinsics.d(this.f43046a, ypsVar.f43046a) && Intrinsics.d(this.b, ypsVar.b) && Intrinsics.d(this.c, ypsVar.c);
    }

    public final int hashCode() {
        Long l = this.f43046a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f43046a, "OppsResponse(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
