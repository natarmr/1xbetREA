package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yzm0 implements d0n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0n0 f43521a;

    public yzm0(r0n0 r0n0Var) {
        r0n0Var.getClass();
        this.f43521a = r0n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yzm0) && Intrinsics.d(this.f43521a, ((yzm0) obj).f43521a);
    }

    public final int hashCode() {
        return this.f43521a.hashCode();
    }

    public final String toString() {
        return "OnMenuItemClick(subSectionMenuItem=" + this.f43521a + Separators.RPAREN;
    }
}
