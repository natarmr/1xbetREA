package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pu60 implements qu60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27600a;

    public pu60(String str) {
        str.getClass();
        this.f27600a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu60) && Intrinsics.d(this.f27600a, ((pu60) obj).f27600a);
    }

    public final int hashCode() {
        return this.f27600a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(title=", this.f27600a, Separators.RPAREN);
    }
}
