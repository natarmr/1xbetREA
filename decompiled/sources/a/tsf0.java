package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tsf0 {
    public static final ssf0 Companion = new ssf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final acu0 f34459a;
    public final acu0 b;

    public /* synthetic */ tsf0(int i, acu0 acu0Var, acu0 acu0Var2) {
        if ((i & 1) == 0) {
            this.f34459a = null;
        } else {
            this.f34459a = acu0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = acu0Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsf0)) {
            return false;
        }
        tsf0 tsf0Var = (tsf0) obj;
        return Intrinsics.d(this.f34459a, tsf0Var.f34459a) && Intrinsics.d(this.b, tsf0Var.b);
    }

    public final int hashCode() {
        acu0 acu0Var = this.f34459a;
        int iHashCode = (acu0Var == null ? 0 : acu0Var.hashCode()) * 31;
        acu0 acu0Var2 = this.b;
        return iHashCode + (acu0Var2 != null ? acu0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ResolveVersionResponse(versionV3Response=" + this.f34459a + ", versionV4Response=" + this.b + Separators.RPAREN;
    }
}
