package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class myn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dyw f22610a;
    public final boolean b;
    public final ibj c;
    public final String d;

    public myn(dyw dywVar, boolean z, ibj ibjVar, String str) {
        this.f22610a = dywVar;
        this.b = z;
        this.c = ibjVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myn)) {
            return false;
        }
        myn mynVar = (myn) obj;
        return Intrinsics.d(this.f22610a, mynVar.f22610a) && this.b == mynVar.b && this.c == mynVar.c && Intrinsics.d(this.d, mynVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + brm0.e(this.f22610a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.f22610a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + Separators.RPAREN;
    }
}
