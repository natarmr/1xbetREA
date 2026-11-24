package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class le00 extends ne00 {
    public final String b;

    public le00(String str) {
        super(pek0.f26859a);
        this.b = str;
    }

    @Override // a.ne00
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le00) && this.b.equals(((le00) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return kng0.l("Info(message=", this.b, Separators.RPAREN);
    }
}
