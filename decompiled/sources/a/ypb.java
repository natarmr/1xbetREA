package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ypb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43024a;
    public final String b;
    public final String c;

    public ypb(boolean z, String str, String str2) {
        this.f43024a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypb)) {
            return false;
        }
        ypb ypbVar = (ypb) obj;
        return this.f43024a == ypbVar.f43024a && this.b.equals(ypbVar.b) && this.c.equals(ypbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f43024a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("ChangeLoginModel(success=", ", errorMessage=", this.b, this.f43024a, ", errorKey="), this.c, Separators.RPAREN);
    }
}
