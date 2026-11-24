package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y7n implements b8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f42160a;
    public final d4d b;
    public final d4d c;

    public y7n() {
        d4d d4dVar = d4d.SECONDARY;
        d4d d4dVar2 = d4d.TEXT_PRIMARY;
        d4d d4dVar3 = d4d.BACKGROUND_LIGHT60;
        this.f42160a = d4dVar;
        this.b = d4dVar2;
        this.c = d4dVar3;
    }

    @Override // a.b8n
    public final d4d a() {
        return this.c;
    }

    @Override // a.b8n
    public final d4d b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7n)) {
            return false;
        }
        y7n y7nVar = (y7n) obj;
        return this.f42160a == y7nVar.f42160a && this.b == y7nVar.b && this.c == y7nVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.b(this.b, this.f42160a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Theme(captionTextColorKey=" + this.f42160a + ", timerTextColorKey=" + this.b + ", timerBackgroundColorKey=" + this.c + Separators.RPAREN;
    }
}
