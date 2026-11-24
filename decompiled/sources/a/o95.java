package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class o95 {
    public static final i95 Companion = new i95();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f24863a;
    public final String b;
    public final String c;

    public /* synthetic */ o95(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f24863a = null;
        } else {
            this.f24863a = l;
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
        if (!(obj instanceof o95)) {
            return false;
        }
        o95 o95Var = (o95) obj;
        return Intrinsics.d(this.f24863a, o95Var.f24863a) && Intrinsics.d(this.b, o95Var.b) && Intrinsics.d(this.c, o95Var.c);
    }

    public final int hashCode() {
        Long l = this.f24863a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f24863a, "AvailableValueResponse(value=", ", measure=", this.b, ", valueView="), this.c, Separators.RPAREN);
    }
}
