package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6041a;

    public dgg(String str) {
        str.getClass();
        this.f6041a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgg) && Intrinsics.d(this.f6041a, ((dgg) obj).f6041a);
    }

    public final int hashCode() {
        return this.f6041a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f6041a, Separators.RPAREN);
    }
}
