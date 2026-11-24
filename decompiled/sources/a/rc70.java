package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rc70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wul f30224a;
    public final wul b;
    public final wul c;

    public rc70(wul wulVar, wul wulVar2, wul wulVar3) {
        vul vulVar = vul.f38053a;
        this.f30224a = wulVar;
        this.b = wulVar2;
        this.c = wulVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc70)) {
            return false;
        }
        rc70 rc70Var = (rc70) obj;
        vul vulVar = vul.f38053a;
        return this.f30224a.equals(rc70Var.f30224a) && this.b.equals(rc70Var.b) && this.c.equals(rc70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + i8i.a(this.b, i8i.a(this.f30224a, vul.b.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Bottom(arrangement=" + vul.b + ", registrationButtonModel=" + this.f30224a + ", authButtonModel=" + this.b + ", exitButtonModel=" + this.c + Separators.RPAREN;
    }
}
