package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class trf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34421a;
    public final String b;
    public final String c;

    public trf0(boolean z, String str, String str2) {
        str2.getClass();
        this.f34421a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trf0)) {
            return false;
        }
        trf0 trf0Var = (trf0) obj;
        return this.f34421a == trf0Var.f34421a && this.b.equals(trf0Var.b) && Intrinsics.d(this.c, trf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f34421a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("ResidentSecondLifeModel(secondLifeAvailable=", ", secondLifePrice=", this.b, this.f34421a, ", secondLifeCurrency="), this.c, Separators.RPAREN);
    }
}
