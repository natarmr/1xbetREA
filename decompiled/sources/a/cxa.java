package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cxa implements dxa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cza f5114a;
    public final String b;
    public final boolean c;
    public final String d;

    public cxa(cza czaVar, String str, boolean z, String str2) {
        czaVar.getClass();
        str.getClass();
        this.f5114a = czaVar;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxa)) {
            return false;
        }
        cxa cxaVar = (cxa) obj;
        return this.f5114a == cxaVar.f5114a && Intrinsics.d(this.b, cxaVar.b) && this.c == cxaVar.c && this.d.equals(cxaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(this.f5114a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(slot=");
        sb.append(this.f5114a);
        sb.append(", percentBadge=");
        sb.append(this.b);
        sb.append(", isUpperCashBack=");
        return twn.q(", title=", this.d, Separators.RPAREN, sb, this.c);
    }
}
