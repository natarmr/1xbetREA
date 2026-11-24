package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class mf {
    public static final lf Companion = new lf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f21672a;
    public final pf b;

    public /* synthetic */ mf(int i, Boolean bool, pf pfVar) {
        if ((i & 1) == 0) {
            this.f21672a = null;
        } else {
            this.f21672a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = pfVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf)) {
            return false;
        }
        mf mfVar = (mf) obj;
        return Intrinsics.d(this.f21672a, mfVar.f21672a) && Intrinsics.d(this.b, mfVar.b);
    }

    public final int hashCode() {
        Boolean bool = this.f21672a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        pf pfVar = this.b;
        return iHashCode + (pfVar != null ? pfVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccountNumberUrlResponse(success=" + this.f21672a + ", value=" + this.b + Separators.RPAREN;
    }
}
