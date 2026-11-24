package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ptq {
    public static final ntq Companion = new ntq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27577a;
    public final stq b;

    static {
        rtq rtqVar = stq.Companion;
    }

    public /* synthetic */ ptq(int i, String str, stq stqVar) {
        if ((i & 1) == 0) {
            this.f27577a = null;
        } else {
            this.f27577a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = stqVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptq)) {
            return false;
        }
        ptq ptqVar = (ptq) obj;
        return Intrinsics.d(this.f27577a, ptqVar.f27577a) && Intrinsics.d(this.b, ptqVar.b);
    }

    public final int hashCode() {
        String str = this.f27577a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        stq stqVar = this.b;
        return iHashCode + (stqVar != null ? stqVar.hashCode() : 0);
    }

    public final String toString() {
        return "FooterResponse(title=" + this.f27577a + ", table=" + this.b + Separators.RPAREN;
    }
}
