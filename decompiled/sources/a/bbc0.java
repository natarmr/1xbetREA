package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class bbc0 {
    public static final abc0 Companion = new abc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f2302a;
    public final Long b;
    public final String c;

    public /* synthetic */ bbc0(int i, Boolean bool, Long l, String str) {
        if ((i & 1) == 0) {
            this.f2302a = null;
        } else {
            this.f2302a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbc0)) {
            return false;
        }
        bbc0 bbc0Var = (bbc0) obj;
        return Intrinsics.d(this.f2302a, bbc0Var.f2302a) && Intrinsics.d(this.b, bbc0Var.b) && Intrinsics.d(this.c, bbc0Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.f2302a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCmsConfirmResponse(isConfirmed=");
        sb.append(this.f2302a);
        sb.append(", confirmationDate=");
        sb.append(this.b);
        sb.append(", info=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
