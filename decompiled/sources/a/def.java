package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class def extends wvb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xx7 f5949a;

    public def(xx7 xx7Var) {
        this.f5949a = xx7Var;
    }

    @Override // a.wvb
    public final int K(int i, int i2, k6z k6zVar, pu90 pu90Var, int i3) {
        return this.f5949a.a(i2, i, k6zVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof def) && Intrinsics.d(this.f5949a, ((def) obj).f5949a);
    }

    public final int hashCode() {
        return this.f5949a.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f5949a + Separators.RPAREN;
    }
}
