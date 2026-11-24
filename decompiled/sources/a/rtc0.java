package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rtc0 implements vtc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f31072a;

    public rtc0(a4x a4xVar) {
        a4xVar.getClass();
        this.f31072a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rtc0) && Intrinsics.d(this.f31072a, ((rtc0) obj).f31072a);
    }

    public final int hashCode() {
        return this.f31072a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f31072a, "Content(socials=", Separators.RPAREN);
    }
}
