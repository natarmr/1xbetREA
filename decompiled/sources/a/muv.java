package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class muv implements ouv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ytv f22429a;
    public final boolean b;

    public muv(ytv ytvVar, boolean z) {
        this.f22429a = ytvVar;
        this.b = z;
    }

    @Override // a.ouv
    public final boolean a() {
        return this.b;
    }

    @Override // a.ouv
    public final ytv b() {
        return this.f22429a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muv)) {
            return false;
        }
        muv muvVar = (muv) obj;
        return this.f22429a.equals(muvVar.f22429a) && this.b == muvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f22429a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f22429a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
