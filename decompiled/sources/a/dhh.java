package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dhh implements fhh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f6090a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final i4m f;
    public final boolean g;
    public final lam h;

    public dhh(n0x n0xVar, String str, String str2, String str3, boolean z, i4m i4mVar, boolean z2, lam lamVar) {
        brm0.B(str, str2, str3);
        this.f6090a = n0xVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i4mVar;
        this.g = z2;
        this.h = lamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhh)) {
            return false;
        }
        dhh dhhVar = (dhh) obj;
        return this.f6090a.equals(dhhVar.f6090a) && Intrinsics.d(this.b, dhhVar.b) && Intrinsics.d(this.c, dhhVar.c) && Intrinsics.d(this.d, dhhVar.d) && this.e == dhhVar.e && this.f.equals(dhhVar.f) && this.g == dhhVar.g && this.h.equals(dhhVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e((this.f.hashCode() + brm0.e(ua80.b(ua80.b(ua80.b(this.f6090a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(imageLink=");
        sb.append(this.f6090a);
        sb.append(", nickname=");
        sb.append(this.b);
        sb.append(", fullName=");
        f140.v(sb, this.c, ", tagLabel=", this.d, ", chipsAvailable=");
        sb.append(this.e);
        sb.append(", chips=");
        sb.append(this.f);
        sb.append(", ratingTableAvailable=");
        sb.append(this.g);
        sb.append(", ratingTable=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
