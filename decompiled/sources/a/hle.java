package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hle extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f13255a;
    public final boolean b;

    public hle(ql5 ql5Var, boolean z) {
        ql5Var.getClass();
        this.f13255a = ql5Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hle)) {
            return false;
        }
        hle hleVar = (hle) obj;
        return Intrinsics.d(this.f13255a, hleVar.f13255a) && this.b == hleVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f13255a.hashCode() * 31);
    }

    public final String toString() {
        return "ChangeAccountCommand(balance=" + this.f13255a + ", accountSelectedByUser=" + this.b + Separators.RPAREN;
    }
}
