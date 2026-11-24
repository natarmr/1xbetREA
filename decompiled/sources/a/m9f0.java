package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m9f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ghk0 f21408a;

    public m9f0(ghk0 ghk0Var) {
        ghk0Var.getClass();
        this.f21408a = ghk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9f0) && Intrinsics.d(this.f21408a, ((m9f0) obj).f21408a);
    }

    public final int hashCode() {
        return this.f21408a.hashCode();
    }

    public final String toString() {
        return "OnSocialLogIn(socialData=" + this.f21408a + Separators.RPAREN;
    }
}
