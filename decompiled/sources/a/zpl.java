package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zpl implements bql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44764a;
    public final String b;
    public final a4x c;

    public zpl(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f44764a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpl)) {
            return false;
        }
        zpl zplVar = (zpl) obj;
        return Intrinsics.d(this.f44764a, zplVar.f44764a) && Intrinsics.d(this.b, zplVar.b) && Intrinsics.d(this.c, zplVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f44764a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("Content(headerTitle=", this.f44764a, ", buttonLabel=", this.b, ", cards="), this.c, Separators.RPAREN);
    }
}
