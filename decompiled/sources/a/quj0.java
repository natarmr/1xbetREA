package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class quj0 implements xuj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29349a;

    public quj0(String str) {
        str.getClass();
        this.f29349a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof quj0) && Intrinsics.d(this.f29349a, ((quj0) obj).f29349a);
    }

    public final int hashCode() {
        return this.f29349a.hashCode();
    }

    public final String toString() {
        return kng0.l("InsufficientFundsError(errorMessage=", this.f29349a, Separators.RPAREN);
    }
}
