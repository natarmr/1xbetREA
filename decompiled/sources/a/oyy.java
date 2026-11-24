package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oyy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26080a;

    public oyy(String str) {
        str.getClass();
        this.f26080a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oyy) && Intrinsics.d(this.f26080a, ((oyy) obj).f26080a);
    }

    public final int hashCode() {
        return this.f26080a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f26080a, Separators.RPAREN);
    }
}
