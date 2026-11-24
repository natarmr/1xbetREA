package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x7n implements b8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f40420a;
    public final d4d b;
    public final d4d c;

    public x7n() {
        d4d d4dVar = d4d.STATIC_WHITE80;
        d4d d4dVar2 = d4d.STATIC_WHITE;
        d4d d4dVar3 = d4d.STATIC_WHITE10;
        this.f40420a = d4dVar;
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
        if (!(obj instanceof x7n)) {
            return false;
        }
        x7n x7nVar = (x7n) obj;
        return this.f40420a == x7nVar.f40420a && this.b == x7nVar.b && this.c == x7nVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.b(this.b, this.f40420a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "StaticLight(captionTextColorKey=" + this.f40420a + ", timerTextColorKey=" + this.b + ", timerBackgroundColorKey=" + this.c + Separators.RPAREN;
    }
}
