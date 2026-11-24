package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sxe0 implements zxe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32974a;

    public sxe0(String str) {
        str.getClass();
        this.f32974a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxe0) && Intrinsics.d(this.f32974a, ((sxe0) obj).f32974a);
    }

    public final int hashCode() {
        return this.f32974a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowDataFillingError(message=", this.f32974a, Separators.RPAREN);
    }
}
