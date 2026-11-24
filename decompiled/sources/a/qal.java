package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class qal {
    public static final pal Companion = new pal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28400a;
    public final Double b;
    public final r5l c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ qal(int i, String str, Double d, r5l r5lVar, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f28400a = null;
        } else {
            this.f28400a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = r5lVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qal)) {
            return false;
        }
        qal qalVar = (qal) obj;
        return Intrinsics.d(this.f28400a, qalVar.f28400a) && Intrinsics.d(this.b, qalVar.b) && Intrinsics.d(this.c, qalVar.c) && Intrinsics.d(this.d, qalVar.d) && Intrinsics.d(this.e, qalVar.e) && Intrinsics.d(this.f, qalVar.f) && Intrinsics.d(this.g, qalVar.g);
    }

    public final int hashCode() {
        String str = this.f28400a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        r5l r5lVar = this.c;
        int iHashCode3 = (iHashCode2 + (r5lVar == null ? 0 : r5lVar.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DotaTopPlayerResponse(id=");
        sb.append(this.f28400a);
        sb.append(", kda=");
        sb.append(this.b);
        sb.append(", matches=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", icon=");
        f140.v(sb, this.e, ", iconS3=", this.f, ", team=");
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
