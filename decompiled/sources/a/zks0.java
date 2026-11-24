package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zks0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44550a;
    public final boolean b;
    public final String c;
    public final String d;
    public final hyl e;

    public zks0(String str, boolean z, String str2, String str3, hyl hylVar) {
        str.getClass();
        str3.getClass();
        this.f44550a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = hylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zks0)) {
            return false;
        }
        zks0 zks0Var = (zks0) obj;
        return Intrinsics.d(this.f44550a, zks0Var.f44550a) && this.b == zks0Var.b && this.c.equals(zks0Var.c) && Intrinsics.d(this.d, zks0Var.d) && this.e.equals(zks0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(brm0.e(this.f44550a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("TransfersToolbarUiModel(title=", this.f44550a, ", searchEnabled=", this.b, ", searchQuery=");
        f140.v(sbU, this.c, ", searchHint=", this.d, ", chips=");
        sbU.append(this.e);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
