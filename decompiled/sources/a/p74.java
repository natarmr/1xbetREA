package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class p74 implements s74 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f26488a;
    public final boolean b;

    public p74(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f26488a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p74)) {
            return false;
        }
        p74 p74Var = (p74) obj;
        return Intrinsics.d(this.f26488a, p74Var.f26488a) && this.b == p74Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f26488a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(historyItems=" + this.f26488a + ", showLoader=" + this.b + Separators.RPAREN;
    }
}
