package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vxr0 implements zxr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38216a;

    public vxr0(String str) {
        str.getClass();
        this.f38216a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxr0) && Intrinsics.d(this.f38216a, ((vxr0) obj).f38216a);
    }

    public final int hashCode() {
        return this.f38216a.hashCode();
    }

    public final String toString() {
        return kng0.l("Line(versusText=", this.f38216a, Separators.RPAREN);
    }
}
