package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bwe0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ghk0 f3320a;

    public bwe0(ghk0 ghk0Var) {
        ghk0Var.getClass();
        this.f3320a = ghk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwe0) && Intrinsics.d(this.f3320a, ((bwe0) obj).f3320a);
    }

    public final int hashCode() {
        return this.f3320a.hashCode();
    }

    public final String toString() {
        return "OnSocialLogIn(socialData=" + this.f3320a + Separators.RPAREN;
    }
}
