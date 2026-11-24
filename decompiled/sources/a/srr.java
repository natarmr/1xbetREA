package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class srr implements asr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vqr f32693a;
    public final String b;
    public final String c;
    public final mpm d;
    public final j83 e;

    public srr(vqr vqrVar, String str, String str2, mpm mpmVar, j83 j83Var) {
        this.f32693a = vqrVar;
        this.b = str;
        this.c = str2;
        this.d = mpmVar;
        this.e = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srr)) {
            return false;
        }
        srr srrVar = (srr) obj;
        return this.f32693a.equals(srrVar.f32693a) && this.b.equals(srrVar.b) && this.c.equals(srrVar.c) && this.d.equals(srrVar.d) && this.e.equals(srrVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ohs0.e(this.d, ua80.b(ua80.b(this.f32693a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "MultiTeam(labels=" + this.f32693a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", score=" + this.d + ", bottomInfo=" + ((Object) this.e) + Separators.RPAREN;
    }
}
