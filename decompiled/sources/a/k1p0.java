package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k1p0 implements m1p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17539a;
    public final a4x b;

    public k1p0(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f17539a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1p0)) {
            return false;
        }
        k1p0 k1p0Var = (k1p0) obj;
        return Intrinsics.d(this.f17539a, k1p0Var.f17539a) && Intrinsics.d(this.b, k1p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17539a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("Data(label=", this.f17539a, ", views=", this.b, Separators.RPAREN);
    }
}
