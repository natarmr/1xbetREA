package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ibf0 implements lbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14484a;

    public ibf0(String str) {
        str.getClass();
        this.f14484a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibf0) && Intrinsics.d(this.f14484a, ((ibf0) obj).f14484a);
    }

    public final int hashCode() {
        return this.f14484a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBar(message=", this.f14484a, Separators.RPAREN);
    }
}
