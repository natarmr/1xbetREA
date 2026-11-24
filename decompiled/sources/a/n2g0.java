package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22799a;
    public final a4x b;

    public n2g0(a4x a4xVar, String str) {
        a4xVar.getClass();
        this.f22799a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2g0)) {
            return false;
        }
        n2g0 n2g0Var = (n2g0) obj;
        return this.f22799a.equals(n2g0Var.f22799a) && Intrinsics.d(this.b, n2g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22799a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("ResultGroup(title=", this.f22799a, ", values=", this.b, Separators.RPAREN);
    }
}
