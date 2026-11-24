package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rb20 implements xc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30163a;

    public rb20(String str) {
        str.getClass();
        this.f30163a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb20) && Intrinsics.d(this.f30163a, ((rb20) obj).f30163a);
    }

    public final int hashCode() {
        return this.f30163a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBetExistsErrorDialog(errorMessage=", this.f30163a, Separators.RPAREN);
    }
}
