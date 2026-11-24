package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yn1 implements ao1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42917a;

    public yn1(String str) {
        str.getClass();
        this.f42917a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yn1) && Intrinsics.d(this.f42917a, ((yn1) obj).f42917a);
    }

    public final int hashCode() {
        return this.f42917a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(message=", this.f42917a, Separators.RPAREN);
    }
}
