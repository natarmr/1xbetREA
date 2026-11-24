package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bfd0 extends zhi0 {
    public final String g;

    public bfd0(String str) {
        super(str);
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfd0) && this.g.equals(((bfd0) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return kng0.l("QrAuthWrongSecretQuestionException(errorMessage=", this.g, Separators.RPAREN);
    }
}
