package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fcm implements hcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9319a;
    public final ecm b;
    public final pbm c;
    public final dcm d;

    public fcm(long j, ecm ecmVar, pbm pbmVar, dcm dcmVar) {
        this.f9319a = j;
        this.b = ecmVar;
        this.c = pbmVar;
        this.d = dcmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcm)) {
            return false;
        }
        fcm fcmVar = (fcm) obj;
        return this.f9319a == fcmVar.f9319a && this.b.equals(fcmVar.b) && this.c.equals(fcmVar.c) && this.d.equals(fcmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(Long.hashCode(this.f9319a) * 31, 31, this.b.f7573a)) * 31);
    }

    public final String toString() {
        return "Content(id=" + this.f9319a + ", infoTitle=" + this.b + ", cellContainer=" + this.c + ", progressContainer=" + this.d + Separators.RPAREN;
    }
}
