package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class gq1 implements rq1 {
    public static final fq1 Companion = new fq1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f11709a;
    public final String b;

    public /* synthetic */ gq1(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f11709a = null;
        } else {
            this.f11709a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq1)) {
            return false;
        }
        gq1 gq1Var = (gq1) obj;
        return Intrinsics.d(this.f11709a, gq1Var.f11709a) && Intrinsics.d(this.b, gq1Var.b);
    }

    public final int hashCode() {
        Long l = this.f11709a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f11709a, "Brand(brandId=", ", nameForUrl=", this.b, Separators.RPAREN);
    }
}
