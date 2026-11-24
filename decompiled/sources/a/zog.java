package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zog implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44719a;
    public final m5m b;
    public final long c;
    public final String d;

    public zog(String str, m5m m5mVar, long j, String str2) {
        this.f44719a = str;
        this.b = m5mVar;
        this.c = j;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zog)) {
            return false;
        }
        zog zogVar = (zog) obj;
        return this.f44719a.equals(zogVar.f44719a) && this.b.equals(zogVar.b) && this.c == zogVar.c && this.d.equals(zogVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f44719a;
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b((this.b.f21226a.hashCode() + (this.f44719a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberGameHeaderUiModel(key=");
        sb.append(this.f44719a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", champId=");
        kng0.z(sb, this.c, ", champName=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
