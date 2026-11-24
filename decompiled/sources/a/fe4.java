package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fe4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ghk0 f9386a;

    public fe4(ghk0 ghk0Var) {
        ghk0Var.getClass();
        this.f9386a = ghk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe4) && Intrinsics.d(this.f9386a, ((fe4) obj).f9386a);
    }

    public final int hashCode() {
        return this.f9386a.hashCode();
    }

    public final String toString() {
        return "OnLoginSuccessesBySocial(socialData=" + this.f9386a + Separators.RPAREN;
    }
}
