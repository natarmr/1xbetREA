package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mcj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21555a;

    public mcj0(String str) {
        str.getClass();
        this.f21555a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mcj0) && Intrinsics.d(this.f21555a, ((mcj0) obj).f21555a);
    }

    public final int hashCode() {
        return this.f21555a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowQrError(message=", this.f21555a, Separators.RPAREN);
    }
}
