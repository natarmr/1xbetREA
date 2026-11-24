package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jx80 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17292a;
    public final String b;
    public final sx80 c;
    public final rx80 d;
    public final dx80 e;

    public jx80(String str, String str2, sx80 sx80Var, rx80 rx80Var, dx80 dx80Var) {
        str.getClass();
        str2.getClass();
        this.f17292a = str;
        this.b = str2;
        this.c = sx80Var;
        this.d = rx80Var;
        this.e = dx80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx80)) {
            return false;
        }
        jx80 jx80Var = (jx80) obj;
        return Intrinsics.d(this.f17292a, jx80Var.f17292a) && Intrinsics.d(this.b, jx80Var.b) && this.c.equals(jx80Var.c) && this.d.equals(jx80Var.d) && this.e == jx80Var.e;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f17292a;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f17292a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PartnerInfoUiModel(key=", this.f17292a, ", teamName=", this.b, ", top=");
        sbN.append(this.c);
        sbN.append(", bottom=");
        sbN.append(this.d);
        sbN.append(", partnerCardState=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
