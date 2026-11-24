package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29412a;
    public final boolean b;
    public final String c;

    public qw(String str, boolean z, String str2) {
        this.f29412a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw)) {
            return false;
        }
        qw qwVar = (qw) obj;
        return this.f29412a.equals(qwVar.f29412a) && this.b == qwVar.b && this.c.equals(qwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f29412a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(brm0.u("TextFieldState(value=", this.f29412a, ", hasError=", this.b, ", errorMessage="), this.c, Separators.RPAREN);
    }
}
