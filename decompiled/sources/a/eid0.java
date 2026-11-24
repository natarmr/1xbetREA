package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class eid0 implements hid0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7855a;

    public eid0(String str) {
        str.getClass();
        this.f7855a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eid0) && Intrinsics.d(this.f7855a, ((eid0) obj).f7855a);
    }

    public final int hashCode() {
        return this.f7855a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowExpiredTokenError(errorMessage=", this.f7855a, Separators.RPAREN);
    }
}
