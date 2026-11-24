package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe9 f19878a;
    public final sul b;
    public final boolean c;

    public le(xe9 xe9Var, sul sulVar, boolean z) {
        this.f19878a = xe9Var;
        this.b = sulVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le)) {
            return false;
        }
        le leVar = (le) obj;
        return this.f19878a.equals(leVar.f19878a) && this.b.equals(leVar.b) && this.c == leVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e((this.b.hashCode() + (this.f19878a.hashCode() * 31)) * 31, 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoButtonModel(buttonStyle=");
        sb.append(this.f19878a);
        sb.append(", buttonColorType=");
        sb.append(this.b);
        sb.append(", enabled=true, loading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
