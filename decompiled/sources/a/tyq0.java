package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tyq0 implements uyq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34769a;
    public final String b;

    public tyq0(int i, String str) {
        this.f34769a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyq0)) {
            return false;
        }
        tyq0 tyq0Var = (tyq0) obj;
        return this.f34769a == tyq0Var.f34769a && Intrinsics.d(this.b, tyq0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f34769a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return defpackage.c.b(this.f34769a, "BannerClick(id=", ", loadedImageUrl=", this.b, Separators.RPAREN);
    }
}
