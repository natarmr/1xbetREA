package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k0e implements q0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17461a;

    public k0e(String str) {
        str.getClass();
        this.f17461a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0e) && Intrinsics.d(this.f17461a, ((k0e) obj).f17461a);
    }

    public final int hashCode() {
        return this.f17461a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowLimitErrorDialog(message=", this.f17461a, Separators.RPAREN);
    }
}
