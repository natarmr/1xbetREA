package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class cu10 {
    public static final bu10 Companion = new bu10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f4967a;
    public final String b;

    public /* synthetic */ cu10(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f4967a = null;
        } else {
            this.f4967a = l;
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
        if (!(obj instanceof cu10)) {
            return false;
        }
        cu10 cu10Var = (cu10) obj;
        return Intrinsics.d(this.f4967a, cu10Var.f4967a) && Intrinsics.d(this.b, cu10Var.b);
    }

    public final int hashCode() {
        Long l = this.f4967a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f4967a, "SportResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
