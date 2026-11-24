package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class r95 {
    public static final l95 Companion = new l95();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f30061a;
    public final String b;
    public final String c;

    public /* synthetic */ r95(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f30061a = null;
        } else {
            this.f30061a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r95)) {
            return false;
        }
        r95 r95Var = (r95) obj;
        return Intrinsics.d(this.f30061a, r95Var.f30061a) && Intrinsics.d(this.b, r95Var.b) && Intrinsics.d(this.c, r95Var.c);
    }

    public final int hashCode() {
        Integer num = this.f30061a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(h97.n(this.f30061a, "AvailableValueResponse(value=", ", measure=", this.b, ", valueView="), this.c, Separators.RPAREN);
    }
}
