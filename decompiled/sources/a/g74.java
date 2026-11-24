package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g74 implements k74 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10796a;
    public final String b;

    public g74(String str, boolean z) {
        str.getClass();
        this.f10796a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g74)) {
            return false;
        }
        g74 g74Var = (g74) obj;
        return this.f10796a == g74Var.f10796a && Intrinsics.d(this.b, g74Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f10796a) * 31);
    }

    public final String toString() {
        return ua80.k("OnSessionCloseClick(sameSession=", this.f10796a, ", appGuid=", this.b, Separators.RPAREN);
    }
}
