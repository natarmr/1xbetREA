package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gi4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11326a;

    public gi4(String str) {
        str.getClass();
        this.f11326a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi4) && Intrinsics.d(this.f11326a, ((gi4) obj).f11326a);
    }

    public final int hashCode() {
        return this.f11326a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnLoginSuccessesByQr(contents=", this.f11326a, Separators.RPAREN);
    }
}
