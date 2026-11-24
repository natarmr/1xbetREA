package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gmp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vhp f11551a;

    public gmp(vhp vhpVar) {
        vhpVar.getClass();
        this.f11551a = vhpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gmp) && Intrinsics.d(this.f11551a, ((gmp) obj).f11551a);
    }

    public final int hashCode() {
        return this.f11551a.hashCode();
    }

    public final String toString() {
        return "OnGameClick(item=" + this.f11551a + Separators.RPAREN;
    }
}
