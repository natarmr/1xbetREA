package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qdb0 implements zdb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv70 f28528a;
    public final String b;

    public qdb0(nv70 nv70Var, String str) {
        this.f28528a = nv70Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdb0)) {
            return false;
        }
        qdb0 qdb0Var = (qdb0) obj;
        return this.f28528a.equals(qdb0Var.f28528a) && Intrinsics.d(this.b, qdb0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f28528a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OnBannerCollectionItemClick(delegateAction=" + this.f28528a + ", loadedImageUrl=" + this.b + Separators.RPAREN;
    }
}
