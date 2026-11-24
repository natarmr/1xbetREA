package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o3o implements p3o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24594a;
    public final mdm b;

    public o3o(long j, mdm mdmVar) {
        this.f24594a = j;
        this.b = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3o)) {
            return false;
        }
        o3o o3oVar = (o3o) obj;
        return this.f24594a == o3oVar.f24594a && this.b.equals(o3oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f24594a) * 31);
    }

    public final String toString() {
        return "Error(subSportId=" + this.f24594a + ", errorConfig=" + this.b + Separators.RPAREN;
    }
}
