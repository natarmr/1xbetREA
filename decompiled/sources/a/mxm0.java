package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mxm0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22563a;
    public final String b;
    public final boolean c;

    public mxm0(String str, long j, boolean z) {
        str.getClass();
        this.f22563a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxm0)) {
            return false;
        }
        mxm0 mxm0Var = (mxm0) obj;
        return this.f22563a == mxm0Var.f22563a && Intrinsics.d(this.b, mxm0Var.b) && this.c == mxm0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f22563a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(axq.o(this.f22563a, "SubGamesFilterItemUiModel(id=", ", name=", this.b), ", selected=", this.c, Separators.RPAREN);
    }
}
