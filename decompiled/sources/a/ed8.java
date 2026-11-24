package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ed8 implements gd8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7603a;

    public ed8(String str) {
        str.getClass();
        this.f7603a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed8) && Intrinsics.d(this.f7603a, ((ed8) obj).f7603a);
    }

    public final int hashCode() {
        return this.f7603a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSelectedBonusErrorSnackbar(message=", this.f7603a, Separators.RPAREN);
    }
}
