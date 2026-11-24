package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hw0 implements iw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13748a;

    public hw0(String str) {
        str.getClass();
        this.f13748a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hw0) && Intrinsics.d(this.f13748a, ((hw0) obj).f13748a);
    }

    public final int hashCode() {
        return this.f13748a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowWebViewUnavailable(message=", this.f13748a, Separators.RPAREN);
    }
}
