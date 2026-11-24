package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class s3n0 {
    public static final m3n0 Companion = new m3n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f31567a;
    public final String b;

    public /* synthetic */ s3n0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f31567a = null;
        } else {
            this.f31567a = l;
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
        if (!(obj instanceof s3n0)) {
            return false;
        }
        s3n0 s3n0Var = (s3n0) obj;
        return Intrinsics.d(this.f31567a, s3n0Var.f31567a) && Intrinsics.d(this.b, s3n0Var.b);
    }

    public final int hashCode() {
        Long l = this.f31567a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f31567a, "SubSportResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
