package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class d9c implements f9c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5692a;
    public final Long b;

    public d9c(String str, Long l) {
        this.f5692a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9c)) {
            return false;
        }
        d9c d9cVar = (d9c) obj;
        return this.f5692a.equals(d9cVar.f5692a) && this.b.equals(d9cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5692a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoFactoryApplied(message=" + this.f5692a + ", messageId=" + this.b + Separators.RPAREN;
    }
}
