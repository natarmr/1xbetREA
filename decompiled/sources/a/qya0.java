package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qya0 implements aza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29523a;
    public final String b;

    public qya0(int i, String str) {
        this.f29523a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qya0)) {
            return false;
        }
        qya0 qya0Var = (qya0) obj;
        return this.f29523a == qya0Var.f29523a && Intrinsics.d(this.b, qya0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f29523a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return defpackage.c.b(this.f29523a, "OnBannerClick(bannerId=", ", loadedImageUrl=", this.b, Separators.RPAREN);
    }
}
