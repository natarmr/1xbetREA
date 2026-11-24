package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s7q0 implements t7q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31763a;

    public s7q0(String str) {
        str.getClass();
        this.f31763a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7q0) && Intrinsics.d(this.f31763a, ((s7q0) obj).f31763a);
    }

    public final int hashCode() {
        return this.f31763a.hashCode();
    }

    public final String toString() {
        return kng0.l("WithoutIcon(supportingText=", this.f31763a, Separators.RPAREN);
    }
}
