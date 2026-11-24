package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h9n implements j9n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12686a;

    public h9n(String str) {
        str.getClass();
        this.f12686a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9n) && Intrinsics.d(this.f12686a, ((h9n) obj).f12686a);
    }

    public final int hashCode() {
        return this.f12686a.hashCode();
    }

    public final String toString() {
        return kng0.l("Label(label=", this.f12686a, Separators.RPAREN);
    }
}
