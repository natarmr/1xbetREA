package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class utq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36266a;
    public final int b;

    public utq(String str, int i) {
        this.f36266a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utq)) {
            return false;
        }
        utq utqVar = (utq) obj;
        return this.f36266a.equals(utqVar.f36266a) && this.b == utqVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f36266a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "FooterUiModel(title=", this.f36266a, ", color=", Separators.RPAREN);
    }
}
