package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ixp implements jxp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15553a;

    public ixp(String str) {
        str.getClass();
        this.f15553a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixp) && Intrinsics.d(this.f15553a, ((ixp) obj).f15553a);
    }

    public final int hashCode() {
        return this.f15553a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f15553a, Separators.RPAREN);
    }
}
