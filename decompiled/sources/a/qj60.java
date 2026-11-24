package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class qj60 implements sj60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28821a;
    public final float b;

    public qj60(String str, float f) {
        this.f28821a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj60)) {
            return false;
        }
        qj60 qj60Var = (qj60) obj;
        return this.f28821a.equals(qj60Var.f28821a) && ycl.b(16.0f, 16.0f) && ycl.b(this.b, qj60Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + defpackage.c.a(this.f28821a.hashCode() * 31, 16.0f, 31);
    }

    public final String toString() {
        String strC = ycl.c(16.0f);
        return axq.n(b1j.n("Image(link=", this.f28821a, ", paddingTop=", strC, ", paddingBottom="), ycl.c(this.b), Separators.RPAREN);
    }
}
