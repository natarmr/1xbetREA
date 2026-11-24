package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pyu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27816a;
    public final String b;

    public pyu0(String str, String str2) {
        this.f27816a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyu0)) {
            return false;
        }
        pyu0 pyu0Var = (pyu0) obj;
        return this.f27816a.equals(pyu0Var.f27816a) && this.b.equals(pyu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27816a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("WalletSendSmsResultModel(guid=", this.f27816a, ", message=", this.b, Separators.RPAREN);
    }
}
