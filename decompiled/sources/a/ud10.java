package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ud10 implements xd10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35457a;
    public final boolean b;

    public ud10(String str, boolean z) {
        this.f35457a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud10)) {
            return false;
        }
        ud10 ud10Var = (ud10) obj;
        return this.f35457a.equals(ud10Var.f35457a) && this.b == ud10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f35457a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("Content(gameUrl=", this.f35457a, ", debugAllowed=", this.b, Separators.RPAREN);
    }
}
