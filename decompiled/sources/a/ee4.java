package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ee4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7651a;

    public ee4(String str) {
        str.getClass();
        this.f7651a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee4) && Intrinsics.d(this.f7651a, ((ee4) obj).f7651a);
    }

    public final int hashCode() {
        return this.f7651a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnLoginSuccessesByQr(contents=", this.f7651a, Separators.RPAREN);
    }
}
