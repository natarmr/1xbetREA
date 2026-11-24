package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class l8r {
    public static final k8r Companion = new k8r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f19619a;
    public final String b;

    public /* synthetic */ l8r(int i, Double d, String str) {
        if ((i & 1) == 0) {
            this.f19619a = null;
        } else {
            this.f19619a = d;
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
        if (!(obj instanceof l8r)) {
            return false;
        }
        l8r l8rVar = (l8r) obj;
        return Intrinsics.d(this.f19619a, l8rVar.f19619a) && Intrinsics.d(this.b, l8rVar.b);
    }

    public final int hashCode() {
        Double d = this.f19619a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FreeValueConfigurationMoneyMinMaxResponse(value=" + this.f19619a + ", currency=" + this.b + Separators.RPAREN;
    }
}
