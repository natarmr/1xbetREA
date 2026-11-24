package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gha0 implements hha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f11288a;

    public gha0(a4x a4xVar) {
        a4xVar.getClass();
        this.f11288a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gha0) && Intrinsics.d(this.f11288a, ((gha0) obj).f11288a);
    }

    public final int hashCode() {
        return this.f11288a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f11288a, "Success(menuList=", Separators.RPAREN);
    }
}
