package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sfb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32110a;
    public final ofb b;

    public sfb(long j, ofb ofbVar) {
        this.f32110a = j;
        this.b = ofbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfb)) {
            return false;
        }
        sfb sfbVar = (sfb) obj;
        return this.f32110a == sfbVar.f32110a && this.b.equals(sfbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f32110a) * 31);
    }

    public final String toString() {
        return "ChampStatisticModel(sportId=" + this.f32110a + ", info=" + this.b + Separators.RPAREN;
    }
}
