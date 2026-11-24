package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yfw f44319a;
    public final String b;
    public final String c;

    public zfw(yfw yfwVar, String str, String str2) {
        this.f44319a = yfwVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfw)) {
            return false;
        }
        zfw zfwVar = (zfw) obj;
        return this.f44319a == zfwVar.f44319a && this.b.equals(zfwVar.b) && this.c.equals(zfwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f44319a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HolidayEventModel(event=");
        sb.append(this.f44319a);
        sb.append(", startAt=");
        sb.append(this.b);
        sb.append(", endAt=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
