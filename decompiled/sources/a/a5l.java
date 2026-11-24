package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a5l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275a;
    public final String b;
    public final String c;
    public final a4l d;

    public a5l(String str, String str2, String str3, a4l a4lVar) {
        str3.getClass();
        this.f275a = str;
        this.b = str2;
        this.c = str3;
        this.d = a4lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5l)) {
            return false;
        }
        a5l a5lVar = (a5l) obj;
        return this.f275a.equals(a5lVar.f275a) && this.b.equals(a5lVar.b) && Intrinsics.d(this.c, a5lVar.c) && this.d.equals(a5lVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f275a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f275a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DotaIndicatorUiModel(key=", this.f275a, ", teamImage=", this.b, ", heroImage=");
        sbN.append(this.c);
        sbN.append(", indicatorValue=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
