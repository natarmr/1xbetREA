package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jom0 implements mom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16866a;

    public jom0(String str) {
        str.getClass();
        this.f16866a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jom0) && Intrinsics.d(this.f16866a, ((jom0) obj).f16866a);
    }

    public final int hashCode() {
        return this.f16866a.hashCode();
    }

    public final String toString() {
        return kng0.l("Line(eventDate=", this.f16866a, Separators.RPAREN);
    }
}
