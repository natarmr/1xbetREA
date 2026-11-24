package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q4f0 implements t4f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28095a;

    public q4f0(String str) {
        str.getClass();
        this.f28095a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4f0) && Intrinsics.d(this.f28095a, ((q4f0) obj).f28095a);
    }

    public final int hashCode() {
        return this.f28095a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBar(message=", this.f28095a, Separators.RPAREN);
    }
}
