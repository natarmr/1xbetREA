package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fn70 extends hn70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km60 f9820a;

    public fn70(km60 km60Var) {
        this.f9820a = km60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fn70) && Intrinsics.d(this.f9820a, ((fn70) obj).f9820a);
    }

    public final int hashCode() {
        km60 km60Var = this.f9820a;
        if (km60Var == null) {
            return 0;
        }
        return Boolean.hashCode(km60Var.f18524a);
    }

    public final String toString() {
        return "LoadBackground(bgConfig=" + this.f9820a + Separators.RPAREN;
    }
}
