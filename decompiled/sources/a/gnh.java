package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gnh implements inh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11586a;
    public final String b;
    public final n0x c;
    public final String d;
    public final String e;
    public final onh f;
    public final String g;
    public final boolean h;

    public gnh(String str, String str2, n0x n0xVar, String str3, String str4, onh onhVar, String str5, boolean z) {
        brm0.B(str, str2, str4);
        this.f11586a = str;
        this.b = str2;
        this.c = n0xVar;
        this.d = str3;
        this.e = str4;
        this.f = onhVar;
        this.g = str5;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnh)) {
            return false;
        }
        gnh gnhVar = (gnh) obj;
        return Intrinsics.d(this.f11586a, gnhVar.f11586a) && Intrinsics.d(this.b, gnhVar.b) && this.c.equals(gnhVar.c) && this.d.equals(gnhVar.d) && Intrinsics.d(this.e, gnhVar.e) && this.f.equals(gnhVar.f) && this.g.equals(gnhVar.g) && this.h == gnhVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ua80.b((this.f.hashCode() + ua80.b(ua80.b(f140.f(this.c, ua80.b(this.f11586a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(tierTitle=", this.f11586a, ", tierSubtitle=", this.b, ", location=");
        sbN.append(this.c);
        sbN.append(", winTitle=");
        sbN.append(this.d);
        sbN.append(", winSubtitle=");
        sbN.append(this.e);
        sbN.append(", progress=");
        sbN.append(this.f);
        sbN.append(", description=");
        return defpackage.c.c(this.g, ", showDescription=", Separators.RPAREN, sbN, this.h);
    }
}
