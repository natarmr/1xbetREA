package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uuk0 implements zuk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lik0 f36305a;

    public uuk0(lik0 lik0Var) {
        lik0Var.getClass();
        this.f36305a = lik0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uuk0) && Intrinsics.d(this.f36305a, ((uuk0) obj).f36305a);
    }

    public final int hashCode() {
        return this.f36305a.hashCode();
    }

    public final String toString() {
        return "OpenSocialNet(socialNetUiModel=" + this.f36305a + Separators.RPAREN;
    }
}
