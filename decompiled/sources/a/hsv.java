package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hsv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13602a;
    public final jjm b;

    public hsv(String str, jjm jjmVar) {
        this.f13602a = str;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsv)) {
            return false;
        }
        hsv hsvVar = (hsv) obj;
        return this.f13602a.equals(hsvVar.f13602a) && this.b.equals(hsvVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f13602a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13602a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderUiItem(key=" + this.f13602a + ", model=" + this.b + Separators.RPAREN;
    }
}
