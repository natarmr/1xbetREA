package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hg10 implements jg10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yh10 f12997a;

    public hg10(yh10 yh10Var) {
        yh10Var.getClass();
        this.f12997a = yh10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hg10) && Intrinsics.d(this.f12997a, ((hg10) obj).f12997a);
    }

    public final int hashCode() {
        return this.f12997a.hashCode();
    }

    public final String toString() {
        return "Loaded(model=" + this.f12997a + Separators.RPAREN;
    }
}
