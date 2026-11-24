package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rb70 implements vb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5v0 f30170a;

    public rb70(c5v0 c5v0Var) {
        this.f30170a = c5v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb70) && Intrinsics.d(this.f30170a, ((rb70) obj).f30170a);
    }

    public final int hashCode() {
        c5v0 c5v0Var = this.f30170a;
        if (c5v0Var == null) {
            return 0;
        }
        return c5v0Var.hashCode();
    }

    public final String toString() {
        return "ClearHistory(webViewHolder=" + this.f30170a + Separators.RPAREN;
    }
}
