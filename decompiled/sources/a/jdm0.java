package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jdm0 implements odm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16336a;
    public final vfp0 b;
    public final vfp0 c;
    public final zdx d;
    public final bom0 e;

    public jdm0(String str, vfp0 vfp0Var, vfp0 vfp0Var2, zdx zdxVar, bom0 bom0Var) {
        str.getClass();
        bom0Var.getClass();
        this.f16336a = str;
        this.b = vfp0Var;
        this.c = vfp0Var2;
        this.d = zdxVar;
        this.e = bom0Var;
    }

    @Override // a.odm0
    public final bom0 a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdm0)) {
            return false;
        }
        jdm0 jdm0Var = (jdm0) obj;
        return Intrinsics.d(this.f16336a, jdm0Var.f16336a) && this.b.equals(jdm0Var.b) && this.c.equals(jdm0Var.c) && this.d.equals(jdm0Var.d) && Intrinsics.d(this.e, jdm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f16336a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Cricket(eventTitle=" + this.f16336a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", scoreModel=" + this.d + ", gameStatusModel=" + this.e + Separators.RPAREN;
    }
}
