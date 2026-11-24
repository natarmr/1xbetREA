package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z7n implements b8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f43926a;
    public final d4d b;

    public z7n() {
        d4d d4dVar = d4d.STATIC_WHITE;
        d4d d4dVar2 = d4d.STATIC_WHITE10;
        this.f43926a = d4dVar;
        this.b = d4dVar2;
    }

    @Override // a.b8n
    public final d4d a() {
        return this.b;
    }

    @Override // a.b8n
    public final d4d b() {
        return this.f43926a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7n)) {
            return false;
        }
        z7n z7nVar = (z7n) obj;
        return this.f43926a == z7nVar.f43926a && this.b == z7nVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43926a.hashCode() * 31);
    }

    public final String toString() {
        return "StaticLight(timerTextColorKey=" + this.f43926a + ", timerBackgroundColorKey=" + this.b + Separators.RPAREN;
    }
}
