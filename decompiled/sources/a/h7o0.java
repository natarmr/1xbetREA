package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h7o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12586a;

    public h7o0(String str) {
        str.getClass();
        this.f12586a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7o0) && Intrinsics.d(this.f12586a, ((h7o0) obj).f12586a);
    }

    public final int hashCode() {
        return this.f12586a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f12586a, Separators.RPAREN);
    }
}
