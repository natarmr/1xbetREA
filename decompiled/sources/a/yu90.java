package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yu90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43258a;

    public /* synthetic */ yu90(String str) {
        this.f43258a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yu90) {
            return Intrinsics.d(this.f43258a, ((yu90) obj).f43258a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43258a.hashCode();
    }

    public final String toString() {
        return kng0.l("Custom(value=", this.f43258a, Separators.RPAREN);
    }
}
