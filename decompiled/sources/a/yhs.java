package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yhs implements zhs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42653a;
    public final a4x b;

    public yhs(float f, a4x a4xVar) {
        a4xVar.getClass();
        this.f42653a = f;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhs)) {
            return false;
        }
        yhs yhsVar = (yhs) obj;
        return ycl.b(this.f42653a, yhsVar.f42653a) && Intrinsics.d(this.b, yhsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.f42653a) * 31);
    }

    public final String toString() {
        return f140.m("Loading(paddingTop=", ycl.c(this.f42653a), ", shimmerList=", this.b, Separators.RPAREN);
    }
}
