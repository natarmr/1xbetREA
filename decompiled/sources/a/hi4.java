package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hi4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ghk0 f13095a;

    public hi4(ghk0 ghk0Var) {
        ghk0Var.getClass();
        this.f13095a = ghk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hi4) && Intrinsics.d(this.f13095a, ((hi4) obj).f13095a);
    }

    public final int hashCode() {
        return this.f13095a.hashCode();
    }

    public final String toString() {
        return "OnLoginSuccessesBySocial(socialData=" + this.f13095a + Separators.RPAREN;
    }
}
