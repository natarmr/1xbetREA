package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iaq implements naq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14451a;

    public iaq(String str) {
        str.getClass();
        this.f14451a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iaq) && Intrinsics.d(this.f14451a, ((iaq) obj).f14451a);
    }

    public final int hashCode() {
        return this.f14451a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsDialog(exception=", this.f14451a, Separators.RPAREN);
    }
}
