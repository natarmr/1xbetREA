package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kr6 implements nr6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18750a;

    public kr6(String str) {
        str.getClass();
        this.f18750a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kr6) && Intrinsics.d(this.f18750a, ((kr6) obj).f18750a);
    }

    public final int hashCode() {
        return this.f18750a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f18750a, Separators.RPAREN);
    }
}
