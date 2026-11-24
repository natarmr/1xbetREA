package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class mw80 {
    public static final kw80 Companion = new kw80();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f22492a;
    public final String b;

    public /* synthetic */ mw80(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f22492a = null;
        } else {
            this.f22492a = l;
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
        if (!(obj instanceof mw80)) {
            return false;
        }
        mw80 mw80Var = (mw80) obj;
        return Intrinsics.d(this.f22492a, mw80Var.f22492a) && Intrinsics.d(this.b, mw80Var.b);
    }

    public final int hashCode() {
        Long l = this.f22492a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f22492a, "PartitionBrandResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
