package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f1h implements h1h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8764a;

    public f1h(String str) {
        str.getClass();
        this.f8764a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1h) && Intrinsics.d(this.f8764a, ((f1h) obj).f8764a);
    }

    public final int hashCode() {
        return this.f8764a.hashCode();
    }

    public final String toString() {
        return kng0.l("SimpleDescription(description=", this.f8764a, Separators.RPAREN);
    }
}
