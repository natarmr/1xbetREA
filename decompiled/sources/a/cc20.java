package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cc20 implements zc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4090a;

    public cc20(String str) {
        str.getClass();
        this.f4090a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc20) && Intrinsics.d(this.f4090a, ((cc20) obj).f4090a);
    }

    public final int hashCode() {
        return this.f4090a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsErrorDialog(errorMessage=", this.f4090a, Separators.RPAREN);
    }
}
