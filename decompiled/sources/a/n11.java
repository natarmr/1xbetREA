package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n11 implements p11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22725a;

    public n11(String str) {
        str.getClass();
        this.f22725a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n11) && Intrinsics.d(this.f22725a, ((n11) obj).f22725a);
    }

    public final int hashCode() {
        return this.f22725a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(message=", this.f22725a, Separators.RPAREN);
    }
}
