package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sb70 implements vb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5v0 f31918a;
    public final String b;

    public sb70(c5v0 c5v0Var, String str) {
        str.getClass();
        this.f31918a = c5v0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb70)) {
            return false;
        }
        sb70 sb70Var = (sb70) obj;
        return Intrinsics.d(this.f31918a, sb70Var.f31918a) && Intrinsics.d(this.b, sb70Var.b);
    }

    public final int hashCode() {
        c5v0 c5v0Var = this.f31918a;
        return this.b.hashCode() + ((c5v0Var == null ? 0 : c5v0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "EvaluateJavaScript(webViewHolder=" + this.f31918a + ", script=" + this.b + Separators.RPAREN;
    }
}
