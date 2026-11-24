package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ja4 implements pa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ghk0 f16171a;

    public ja4(ghk0 ghk0Var) {
        ghk0Var.getClass();
        this.f16171a = ghk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja4) && Intrinsics.d(this.f16171a, ((ja4) obj).f16171a);
    }

    public final int hashCode() {
        return this.f16171a.hashCode();
    }

    public final String toString() {
        return "OnLoginSuccessesBySocial(socialData=" + this.f16171a + Separators.RPAREN;
    }
}
