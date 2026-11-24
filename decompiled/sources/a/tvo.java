package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tvo implements wvo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvo f34609a;
    public final mdm b;
    public final boolean c;

    public tvo(jvo jvoVar, mdm mdmVar, boolean z) {
        this.f34609a = jvoVar;
        this.b = mdmVar;
        this.c = z;
    }

    @Override // a.wvo
    public final boolean a() {
        return this.c;
    }

    @Override // a.wvo
    public final jvo b() {
        return this.f34609a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvo)) {
            return false;
        }
        tvo tvoVar = (tvo) obj;
        return this.f34609a.equals(tvoVar.f34609a) && this.b.equals(tvoVar.b) && this.c == tvoVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f140.d(this.b, this.f34609a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f34609a);
        sb.append(", lottieConfig=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
