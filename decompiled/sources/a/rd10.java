package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rd10 implements sd10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30269a;

    public rd10(String str) {
        str.getClass();
        this.f30269a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd10) && Intrinsics.d(this.f30269a, ((rd10) obj).f30269a);
    }

    public final int hashCode() {
        return this.f30269a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowWebViewUnavailable(message=", this.f30269a, Separators.RPAREN);
    }
}
