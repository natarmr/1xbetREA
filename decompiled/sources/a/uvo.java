package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uvo implements wvo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvo f36360a;
    public final boolean b;

    public uvo(jvo jvoVar, boolean z) {
        this.f36360a = jvoVar;
        this.b = z;
    }

    @Override // a.wvo
    public final boolean a() {
        return this.b;
    }

    @Override // a.wvo
    public final jvo b() {
        return this.f36360a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvo)) {
            return false;
        }
        uvo uvoVar = (uvo) obj;
        return this.f36360a.equals(uvoVar.f36360a) && this.b == uvoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f36360a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f36360a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
