package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jj00 implements kj00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f16599a;

    public jj00(a4x a4xVar) {
        a4xVar.getClass();
        this.f16599a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jj00) {
            return ycl.b(12.0f, 12.0f) && Intrinsics.d(this.f16599a, ((jj00) obj).f16599a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16599a.hashCode() + (Float.hashCode(12.0f) * 31);
    }

    public final String toString() {
        return f140.m("Loading(paddingTop=", ycl.c(12.0f), ", shimmerList=", this.f16599a, Separators.RPAREN);
    }
}
