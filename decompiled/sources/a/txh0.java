package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class txh0 implements vxh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34700a;

    public txh0(String str) {
        str.getClass();
        this.f34700a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txh0) && Intrinsics.d(this.f34700a, ((txh0) obj).f34700a);
    }

    public final int hashCode() {
        return this.f34700a.hashCode();
    }

    public final String toString() {
        return kng0.l("StatusText(text=", this.f34700a, Separators.RPAREN);
    }
}
