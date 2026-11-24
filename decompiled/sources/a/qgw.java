package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qgw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28706a;
    public final String b;

    public qgw(int i, String str) {
        this.f28706a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgw)) {
            return false;
        }
        qgw qgwVar = (qgw) obj;
        return this.f28706a == qgwVar.f28706a && Intrinsics.d(this.b, qgwVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f28706a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return defpackage.c.b(this.f28706a, "OnBannerClick(bannerId=", ", loadedImageUrl=", this.b, Separators.RPAREN);
    }
}
