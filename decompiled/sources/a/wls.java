package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wls implements yls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp20 f39372a;
    public final fp20 b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final Integer g;
    public final boolean h;

    public wls(fp20 fp20Var, fp20 fp20Var2, String str, String str2, String str3, boolean z, Integer num, boolean z2) {
        str.getClass();
        str3.getClass();
        this.f39372a = fp20Var;
        this.b = fp20Var2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = num;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wls)) {
            return false;
        }
        wls wlsVar = (wls) obj;
        return this.f39372a.equals(wlsVar.f39372a) && this.b.equals(wlsVar.b) && Intrinsics.d(this.c, wlsVar.c) && this.d.equals(wlsVar.d) && Intrinsics.d(this.e, wlsVar.e) && this.f == wlsVar.f && Intrinsics.d(this.g, wlsVar.g) && this.h == wlsVar.h;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f39372a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, true);
        Integer num = this.g;
        return Boolean.hashCode(this.h) + ((iE + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapInSeriesUiModel(firstTeam=");
        sb.append(this.f39372a);
        sb.append(", secondTeam=");
        sb.append(this.b);
        sb.append(", mapName=");
        f140.v(sb, this.c, ", mapImage=", this.d, ", mapStatus=");
        brm0.C(this.e, ", badgeVisible=", ", scoreVisible=true, placeholder=", sb, this.f);
        sb.append(this.g);
        sb.append(", supportRtl=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
