package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class avd implements evd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1519a;

    public avd(String str) {
        str.getClass();
        this.f1519a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avd) && Intrinsics.d(this.f1519a, ((avd) obj).f1519a);
    }

    public final int hashCode() {
        return this.f1519a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f1519a, Separators.RPAREN);
    }
}
