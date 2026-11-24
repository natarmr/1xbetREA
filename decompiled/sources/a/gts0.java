package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gts0 implements its0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vss0 f11897a;

    public gts0(vss0 vss0Var) {
        vss0Var.getClass();
        this.f11897a = vss0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gts0) && Intrinsics.d(this.f11897a, ((gts0) obj).f11897a);
    }

    public final int hashCode() {
        return this.f11897a.hashCode();
    }

    public final String toString() {
        return "Content(jackpot=" + this.f11897a + Separators.RPAREN;
    }
}
