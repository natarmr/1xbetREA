package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class c680 {
    public static final a680 Companion = new a680();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f3806a;
    public final String b;
    public final String c;

    public /* synthetic */ c680(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f3806a = null;
        } else {
            this.f3806a = l;
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
        if (!(obj instanceof c680)) {
            return false;
        }
        c680 c680Var = (c680) obj;
        return Intrinsics.d(this.f3806a, c680Var.f3806a) && Intrinsics.d(this.b, c680Var.b) && Intrinsics.d(this.c, c680Var.c);
    }

    public final int hashCode() {
        Long l = this.f3806a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f3806a, "OppsResponse(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
