package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fzs implements hzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10424a;
    public final boolean b;

    public fzs(String str, boolean z) {
        this.f10424a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzs)) {
            return false;
        }
        fzs fzsVar = (fzs) obj;
        return this.f10424a.equals(fzsVar.f10424a) && this.b == fzsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f10424a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("InitUrl(url=", this.f10424a, ", isControlPanelVisible=", this.b, Separators.RPAREN);
    }
}
