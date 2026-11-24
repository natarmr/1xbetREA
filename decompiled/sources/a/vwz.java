package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vwz implements wwz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrz f38177a;
    public final String b;
    public final String c;
    public final wui0 d;
    public final boolean e;

    public vwz(xrz xrzVar, String str, String str2, wui0 wui0Var, boolean z) {
        str.getClass();
        str2.getClass();
        this.f38177a = xrzVar;
        this.b = str;
        this.c = str2;
        this.d = wui0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwz)) {
            return false;
        }
        vwz vwzVar = (vwz) obj;
        return this.f38177a.equals(vwzVar.f38177a) && Intrinsics.d(this.b, vwzVar.b) && Intrinsics.d(this.c, vwzVar.c) && this.d == vwzVar.d && this.e == vwzVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.c(this.d, ua80.b(ua80.b(this.f38177a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsIeTimeLimitUiModel(limitType=");
        sb.append(this.f38177a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", limit=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", enabled=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
