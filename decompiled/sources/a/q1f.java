package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q1f implements y1f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27949a;

    public q1f(String str) {
        str.getClass();
        this.f27949a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1f) && Intrinsics.d(this.f27949a, ((q1f) obj).f27949a);
    }

    public final int hashCode() {
        return this.f27949a.hashCode();
    }

    public final String toString() {
        return kng0.l("HandleError(message=", this.f27949a, Separators.RPAREN);
    }
}
