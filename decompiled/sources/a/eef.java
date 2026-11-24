package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eef extends wvb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yx7 f7670a;

    public eef(yx7 yx7Var) {
        this.f7670a = yx7Var;
    }

    @Override // a.wvb
    public final int K(int i, int i2, k6z k6zVar, pu90 pu90Var, int i3) {
        return this.f7670a.a(i2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eef) && Intrinsics.d(this.f7670a, ((eef) obj).f7670a);
    }

    public final int hashCode() {
        return this.f7670a.hashCode();
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f7670a + Separators.RPAREN;
    }
}
