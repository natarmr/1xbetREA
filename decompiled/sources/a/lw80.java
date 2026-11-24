package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lw80 {
    public static final jw80 Companion = new jw80();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f20753a;
    public final String b;

    public /* synthetic */ lw80(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f20753a = null;
        } else {
            this.f20753a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw80)) {
            return false;
        }
        lw80 lw80Var = (lw80) obj;
        return Intrinsics.d(this.f20753a, lw80Var.f20753a) && Intrinsics.d(this.b, lw80Var.b);
    }

    public final int hashCode() {
        Long l = this.f20753a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f20753a, "PartitionBrandResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
