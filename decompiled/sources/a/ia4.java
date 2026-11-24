package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ia4 implements pa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14418a;

    public ia4(String str) {
        str.getClass();
        this.f14418a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia4) && Intrinsics.d(this.f14418a, ((ia4) obj).f14418a);
    }

    public final int hashCode() {
        return this.f14418a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnLoginSuccessesByQr(contents=", this.f14418a, Separators.RPAREN);
    }
}
