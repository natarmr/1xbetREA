package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ac20 implements xc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f609a;

    public ac20(String str) {
        str.getClass();
        this.f609a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac20) && Intrinsics.d(this.f609a, ((ac20) obj).f609a);
    }

    public final int hashCode() {
        return this.f609a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsErrorDialog(errorMessage=", this.f609a, Separators.RPAREN);
    }
}
