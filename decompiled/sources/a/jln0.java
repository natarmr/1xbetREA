package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jln0 implements rln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16725a;

    public jln0(String str) {
        str.getClass();
        this.f16725a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jln0) && Intrinsics.d(this.f16725a, ((jln0) obj).f16725a);
    }

    public final int hashCode() {
        return this.f16725a.hashCode();
    }

    public final String toString() {
        return kng0.l("CoefLabel(label=", this.f16725a, Separators.RPAREN);
    }
}
