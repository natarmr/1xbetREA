package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class luv implements ouv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ytv f20694a;
    public final mdm b;
    public final boolean c;

    public luv(ytv ytvVar, mdm mdmVar, boolean z) {
        this.f20694a = ytvVar;
        this.b = mdmVar;
        this.c = z;
    }

    @Override // a.ouv
    public final boolean a() {
        return this.c;
    }

    @Override // a.ouv
    public final ytv b() {
        return this.f20694a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luv)) {
            return false;
        }
        luv luvVar = (luv) obj;
        return this.f20694a.equals(luvVar.f20694a) && this.b.equals(luvVar.b) && this.c == luvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f140.d(this.b, this.f20694a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f20694a);
        sb.append(", lottieConfig=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
