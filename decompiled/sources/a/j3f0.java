package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j3f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ghk0 f15830a;

    public j3f0(ghk0 ghk0Var) {
        ghk0Var.getClass();
        this.f15830a = ghk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3f0) && Intrinsics.d(this.f15830a, ((j3f0) obj).f15830a);
    }

    public final int hashCode() {
        return this.f15830a.hashCode();
    }

    public final String toString() {
        return "OnSocialLogIn(socialData=" + this.f15830a + Separators.RPAREN;
    }
}
