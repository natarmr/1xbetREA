package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class rkl0 {
    public static final hkl0 Companion = new hkl0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f30654a;
    public final String b;

    public /* synthetic */ rkl0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f30654a = null;
        } else {
            this.f30654a = l;
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
        if (!(obj instanceof rkl0)) {
            return false;
        }
        rkl0 rkl0Var = (rkl0) obj;
        return Intrinsics.d(this.f30654a, rkl0Var.f30654a) && Intrinsics.d(this.b, rkl0Var.b);
    }

    public final int hashCode() {
        Long l = this.f30654a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f30654a, "SportResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
