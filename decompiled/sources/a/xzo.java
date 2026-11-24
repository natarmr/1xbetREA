package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xzo extends b0p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41762a;

    public xzo(String str) {
        str.getClass();
        this.f41762a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzo) && Intrinsics.d(this.f41762a, ((xzo) obj).f41762a);
    }

    public final int hashCode() {
        return this.f41762a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenUrl(url=", this.f41762a, Separators.RPAREN);
    }
}
