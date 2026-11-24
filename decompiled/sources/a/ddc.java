package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ddc implements fdc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5889a;

    public ddc(String str) {
        str.getClass();
        this.f5889a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ddc) && Intrinsics.d(this.f5889a, ((ddc) obj).f5889a);
    }

    public final int hashCode() {
        return this.f5889a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnLimitValueEntered(value=", this.f5889a, Separators.RPAREN);
    }
}
