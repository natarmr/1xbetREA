package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class eml implements gml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8051a;
    public final String b;
    public final String c;
    public final n0x d;
    public final m0x e;
    public final boolean f;
    public final m0x g;
    public final m0x h;
    public final boolean i;
    public final String j;
    public final boolean k;

    public eml(long j, String str, String str2, n0x n0xVar, m0x m0xVar, boolean z, m0x m0xVar2, m0x m0xVar3, boolean z2, String str3, boolean z3) {
        str3.getClass();
        this.f8051a = j;
        this.b = str;
        this.c = str2;
        this.d = n0xVar;
        this.e = m0xVar;
        this.f = z;
        this.g = m0xVar2;
        this.h = m0xVar3;
        this.i = z2;
        this.j = str3;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eml)) {
            return false;
        }
        eml emlVar = (eml) obj;
        return this.f8051a == emlVar.f8051a && this.b.equals(emlVar.b) && Intrinsics.d(this.c, emlVar.c) && this.d.equals(emlVar.d) && this.e.equals(emlVar.e) && this.f == emlVar.f && this.g.equals(emlVar.g) && this.h.equals(emlVar.h) && this.i == emlVar.i && Intrinsics.d(this.j, emlVar.j) && this.k == emlVar.k;
    }

    public final int hashCode() {
        int iB = ua80.b(Long.hashCode(this.f8051a) * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.k) + ua80.b(brm0.e(cs0.a(this.h, cs0.a(this.g, brm0.e(cs0.a(this.e, f140.f(this.d, (iB + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f), 31), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f8051a, "Content(id=", ", title=", this.b);
        sbO.append(", subtitle=");
        sbO.append(this.c);
        sbO.append(", backgroundImageLink=");
        sbO.append(this.d);
        sbO.append(", placeholderLink=");
        sbO.append(this.e);
        sbO.append(", hasFavoriteButton=");
        sbO.append(this.f);
        sbO.append(", favoriteIconCheckedLink=");
        sbO.append(this.g);
        sbO.append(", favoriteIconUncheckedLink=");
        sbO.append(this.h);
        hne.u(", isFavorite=", ", buttonText=", this.j, sbO, this.i);
        return f140.n(sbO, ", hasBottomGradient=", this.k, Separators.RPAREN);
    }
}
