package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jbp0 implements lbp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16247a;

    public jbp0(String str) {
        str.getClass();
        this.f16247a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbp0) && Intrinsics.d(this.f16247a, ((jbp0) obj).f16247a);
    }

    public final int hashCode() {
        return this.f16247a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f16247a, Separators.RPAREN);
    }
}
