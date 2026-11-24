package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zck0 implements bdk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44171a;
    public final String b;
    public final String c;

    public zck0(boolean z, String str, String str2) {
        this.f44171a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zck0)) {
            return false;
        }
        zck0 zck0Var = (zck0) obj;
        return this.f44171a == zck0Var.f44171a && this.b.equals(zck0Var.b) && this.c.equals(zck0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f44171a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("SendResultAndDismiss(isCodeConfirmed=", ", codeConfirmedMessage=", this.b, this.f44171a, ", codeConfirmationErrorMessage="), this.c, Separators.RPAREN);
    }
}
