package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q2b0 implements t2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27994a;

    public q2b0(String str) {
        str.getClass();
        this.f27994a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2b0) && Intrinsics.d(this.f27994a, ((q2b0) obj).f27994a);
    }

    public final int hashCode() {
        return this.f27994a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(message=", this.f27994a, Separators.RPAREN);
    }
}
