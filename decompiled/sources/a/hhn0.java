package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hhn0 implements u1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dyw f13073a;
    public final o1x b;
    public final ibj c;
    public final jr30 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public hhn0(dyw dywVar, o1x o1xVar, ibj ibjVar, jr30 jr30Var, String str, boolean z, boolean z2) {
        this.f13073a = dywVar;
        this.b = o1xVar;
        this.c = ibjVar;
        this.d = jr30Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // a.u1x
    public final dyw b() {
        return this.f13073a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhn0)) {
            return false;
        }
        hhn0 hhn0Var = (hhn0) obj;
        return Intrinsics.d(this.f13073a, hhn0Var.f13073a) && Intrinsics.d(this.b, hhn0Var.b) && this.c == hhn0Var.c && Intrinsics.d(this.d, hhn0Var.d) && Intrinsics.d(this.e, hhn0Var.e) && this.f == hhn0Var.f && this.g == hhn0Var.g;
    }

    @Override // a.u1x
    public final o1x getRequest() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f13073a.hashCode() * 31)) * 31)) * 31;
        jr30 jr30Var = this.d;
        int iHashCode2 = (iHashCode + (jr30Var == null ? 0 : jr30Var.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + brm0.e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.f13073a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        brm0.C(this.e, ", isSampled=", ", isPlaceholderCached=", sb, this.f);
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
