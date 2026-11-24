package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v9c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f37028a;
    public final d4d b;
    public final boolean c;
    public final d4d d;

    public v9c(d4d d4dVar, d4d d4dVar2, boolean z, d4d d4dVar3) {
        this.f37028a = d4dVar;
        this.b = d4dVar2;
        this.c = z;
        this.d = d4dVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9c)) {
            return false;
        }
        v9c v9cVar = (v9c) obj;
        return this.f37028a == v9cVar.f37028a && this.b == v9cVar.b && this.c == v9cVar.c && this.d == v9cVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(dw9.b(this.b, this.f37028a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "ChessboardUiState(oddColor=" + this.f37028a + ", evenColor=" + this.b + ", contrast=" + this.c + ", textColor=" + this.d + Separators.RPAREN;
    }
}
