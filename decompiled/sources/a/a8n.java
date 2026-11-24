package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a8n implements b8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f434a;
    public final d4d b;

    public a8n() {
        d4d d4dVar = d4d.TEXT_PRIMARY;
        d4d d4dVar2 = d4d.BACKGROUND_LIGHT60;
        this.f434a = d4dVar;
        this.b = d4dVar2;
    }

    @Override // a.b8n
    public final d4d a() {
        return this.b;
    }

    @Override // a.b8n
    public final d4d b() {
        return this.f434a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8n)) {
            return false;
        }
        a8n a8nVar = (a8n) obj;
        return this.f434a == a8nVar.f434a && this.b == a8nVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f434a.hashCode() * 31);
    }

    public final String toString() {
        return "Theme(timerTextColorKey=" + this.f434a + ", timerBackgroundColorKey=" + this.b + Separators.RPAREN;
    }
}
