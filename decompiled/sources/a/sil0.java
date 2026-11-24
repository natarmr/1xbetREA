package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class sil0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32269a;
    public final String b;

    public sil0(long j, String str) {
        this.f32269a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sil0)) {
            return false;
        }
        sil0 sil0Var = (sil0) obj;
        return this.f32269a == sil0Var.f32269a && this.b.equals(sil0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f32269a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f32269a, "SportModel(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
