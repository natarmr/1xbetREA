package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29905a;

    public r5t0(String str) {
        str.getClass();
        this.f29905a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5t0) && Intrinsics.d(this.f29905a, ((r5t0) obj).f29905a);
    }

    public final int hashCode() {
        return this.f29905a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f29905a, Separators.RPAREN);
    }
}
