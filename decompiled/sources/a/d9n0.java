package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class d9n0 {
    public static final c9n0 Companion = new c9n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f5710a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ d9n0(int i, Boolean bool, Long l, String str) {
        if ((i & 1) == 0) {
            this.f5710a = null;
        } else {
            this.f5710a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
        if (!(obj instanceof d9n0)) {
            return false;
        }
        d9n0 d9n0Var = (d9n0) obj;
        return Intrinsics.d(this.f5710a, d9n0Var.f5710a) && Intrinsics.d(this.b, d9n0Var.b) && Intrinsics.d(this.c, d9n0Var.c);
    }

    public final int hashCode() {
        Long l = this.f5710a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(cs0.s(this.f5710a, "SubscriptionSportResponse(id=", ", name=", this.b, ", isCyber="), this.c, Separators.RPAREN);
    }
}
