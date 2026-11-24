package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vhs implements zhs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f37446a;
    public final a4x b;
    public final boolean c;

    public vhs(float f, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f37446a = f;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhs)) {
            return false;
        }
        vhs vhsVar = (vhs) obj;
        return ycl.b(this.f37446a, vhsVar.f37446a) && Intrinsics.d(this.b, vhsVar.b) && this.c == vhsVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, Float.hashCode(this.f37446a) * 31, 31);
    }

    public final String toString() {
        return rw2.p(kng0.u("Content(paddingTop=", ycl.c(this.f37446a), ", eventCardList=", this.b, ", supportRtl="), this.c, Separators.RPAREN);
    }
}
