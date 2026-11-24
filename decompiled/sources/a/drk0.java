package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class drk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lik0 f6564a;

    public drk0(lik0 lik0Var) {
        lik0Var.getClass();
        this.f6564a = lik0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drk0) && Intrinsics.d(this.f6564a, ((drk0) obj).f6564a);
    }

    public final int hashCode() {
        return this.f6564a.hashCode();
    }

    public final String toString() {
        return "OnSocialNetClick(uiModel=" + this.f6564a + Separators.RPAREN;
    }
}
