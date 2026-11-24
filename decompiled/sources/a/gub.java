package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gub implements eub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11920a;
    public final long b;
    public final boolean c;
    public final uty d;

    public gub(long j, long j2, boolean z, uty utyVar) {
        x0x.A(j == -9223372036854775807L || j2 == -9223372036854775807L || j <= j2);
        this.f11920a = j;
        this.b = j2;
        this.c = z;
        this.d = utyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gub.class == obj.getClass()) {
            gub gubVar = (gub) obj;
            if (this.f11920a == gubVar.f11920a && this.b == gubVar.b && this.c == gubVar.c && Objects.equals(this.d, gubVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = (rw2.b(rw2.b(527, 31, this.f11920a), 31, this.b) + (this.c ? 1 : 0)) * 31;
        uty utyVar = this.d;
        return iB + (utyVar != null ? utyVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Chapter: startTimeMs=");
        long j = this.f11920a;
        sb.append(j == -9223372036854775807L ? "UNSET" : Long.valueOf(j));
        long j2 = this.b;
        String str2 = "";
        if (j2 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", endTimeMs=" + j2;
        }
        sb.append(str);
        sb.append(this.c ? ", hidden" : "");
        uty utyVar = this.d;
        if (utyVar != null) {
            str2 = ", title=" + utyVar;
        }
        sb.append(str2);
        return sb.toString();
    }
}
