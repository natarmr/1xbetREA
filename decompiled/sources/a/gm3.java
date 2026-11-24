package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gm3 implements im3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11523a;
    public final boolean b;
    public final String c;

    public gm3(String str, boolean z, String str2) {
        str.getClass();
        this.f11523a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm3)) {
            return false;
        }
        gm3 gm3Var = (gm3) obj;
        return Intrinsics.d(this.f11523a, gm3Var.f11523a) && this.b == gm3Var.b && this.c.equals(gm3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f11523a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(brm0.u("AppInternalUpdateModel(updateUrl=", this.f11523a, ", force=", this.b, ", version="), this.c, Separators.RPAREN);
    }
}
