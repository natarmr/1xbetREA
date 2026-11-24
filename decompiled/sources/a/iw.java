package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class iw implements kw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15465a;
    public final boolean b;

    public iw(String str, boolean z) {
        str.getClass();
        this.f15465a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw)) {
            return false;
        }
        iw iwVar = (iw) obj;
        return Intrinsics.d(this.f15465a, iwVar.f15465a) && this.b == iwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f15465a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("ShowAddWalletInfoMessage(message=", this.f15465a, ", isError=", this.b, Separators.RPAREN);
    }
}
