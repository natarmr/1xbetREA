package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f20948a;
    public final String b;
    public final double c;
    public final String d;
    public final azc e;
    public final azc f;
    public final o0d g;

    public m0d(double d, String str, double d2, String str2, azc azcVar, azc azcVar2, o0d o0dVar) {
        str.getClass();
        str2.getClass();
        azcVar.getClass();
        azcVar2.getClass();
        o0dVar.getClass();
        this.f20948a = d;
        this.b = str;
        this.c = d2;
        this.d = str2;
        this.e = azcVar;
        this.f = azcVar2;
        this.g = o0dVar;
    }

    public static m0d a(m0d m0dVar, azc azcVar, o0d o0dVar, int i) {
        azc azcVar2 = azc.f1709a;
        double d = m0dVar.f20948a;
        String str = m0dVar.b;
        double d2 = (i & 4) != 0 ? m0dVar.c : 0.0d;
        String str2 = (i & 8) != 0 ? m0dVar.d : "";
        if ((i & 16) != 0) {
            azcVar = m0dVar.e;
        }
        azc azcVar3 = azcVar;
        if ((i & 32) != 0) {
            azcVar2 = m0dVar.f;
        }
        azc azcVar4 = azcVar2;
        if ((i & 64) != 0) {
            o0dVar = m0dVar.g;
        }
        o0d o0dVar2 = o0dVar;
        str.getClass();
        str2.getClass();
        azcVar3.getClass();
        azcVar4.getClass();
        o0dVar2.getClass();
        return new m0d(d, str, d2, str2, azcVar3, azcVar4, o0dVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0d)) {
            return false;
        }
        m0d m0dVar = (m0d) obj;
        return Double.compare(this.f20948a, m0dVar.f20948a) == 0 && Intrinsics.d(this.b, m0dVar.b) && Double.compare(this.c, m0dVar.c) == 0 && Intrinsics.d(this.d, m0dVar.d) && this.e == m0dVar.e && this.f == m0dVar.f && this.g == m0dVar.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b(brm0.d(this.c, ua80.b(Double.hashCode(this.f20948a) * 31, 31, this.b), 31), 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("CoefficientStateModel(curCoefficientValue=", this.f20948a, ", curCoefficientString=", this.b);
        ohs0.A(sbS, this.c, ", oldCoefficientValue=", ", oldCoefficientString=");
        sbS.append(this.d);
        sbS.append(", coefficientChangeTypeModel=");
        sbS.append(this.e);
        sbS.append(", prevCoefficientChangeTypeModel=");
        sbS.append(this.f);
        sbS.append(", coefficientVisibilityState=");
        sbS.append(this.g);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
