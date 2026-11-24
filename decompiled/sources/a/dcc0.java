package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dcc0 {
    public static final ccc0 Companion = new ccc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f5844a;
    public final Long b;

    public /* synthetic */ dcc0(int i, Boolean bool, Long l) {
        if ((i & 1) == 0) {
            this.f5844a = null;
        } else {
            this.f5844a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcc0)) {
            return false;
        }
        dcc0 dcc0Var = (dcc0) obj;
        return Intrinsics.d(this.f5844a, dcc0Var.f5844a) && Intrinsics.d(this.b, dcc0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.f5844a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "PromoCmsGetPromotionUserDataResponse(isConfirmed=" + this.f5844a + ", confirmationDate=" + this.b + Separators.RPAREN;
    }
}
