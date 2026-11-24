package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o110 implements f210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ox f24456a;
    public final int b;

    public o110(ox oxVar, int i) {
        this.f24456a = oxVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o110)) {
            return false;
        }
        o110 o110Var = (o110) obj;
        return this.f24456a.equals(o110Var.f24456a) && this.b == o110Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f24456a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalInfo(action=" + this.f24456a + ", screenWidth=" + this.b + Separators.RPAREN;
    }
}
